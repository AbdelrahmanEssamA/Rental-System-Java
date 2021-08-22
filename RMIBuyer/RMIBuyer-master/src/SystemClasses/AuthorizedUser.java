package SystemClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public abstract class  AuthorizedUser implements Serializable {
    
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private String addres;
    private String profilePicture;
    private String password;
    private boolean status;

    public AuthorizedUser(int id, String fullName, String email, String phone, String addres, String profilePicture, String password, boolean status) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.addres = addres;
        this.profilePicture = profilePicture;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AuthorizedUser other = (AuthorizedUser) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.addres, other.addres)) {
            return false;
        }
        if (!Objects.equals(this.profilePicture, other.profilePicture)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AuthorizedUser{" + "id=" + id + ", fullName=" + fullName + ", email=" + email + ", phone=" + phone + ", addres=" + addres + ", profilePicture=" + profilePicture + ", password=" + password + ", status=" + status + '}';
    }
    
    
    
}
