package com.example.android.autotest;

import java.util.Objects;

public class PersonData {
    private final long id;
    private final String name;
    private final int status;
    private final String email;
    private final String profileUrl;
    private final String pictureImageUrl;

    public PersonData(long id, String name, int status, String email, String profileUrl, String pictureImageUrl) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.email = email;
        this.profileUrl = profileUrl;
        this.pictureImageUrl = pictureImageUrl;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public String getPictureImageUrl() {
        return pictureImageUrl;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", eMail='" + email + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                ", pictureImageUrl='" + pictureImageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PersonData that = (PersonData) obj;
        if (id != that.id) return false;
        if (status != that.status) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(email, that.email)) return false;
        if (!Objects.equals(profileUrl, that.profileUrl))
            return false;
        return Objects.equals(pictureImageUrl, that.pictureImageUrl);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (profileUrl != null ? profileUrl.hashCode() : 0);
        result = 31 * result + (pictureImageUrl != null ? pictureImageUrl.hashCode() : 0);
        return result;
    }

}
