package cgi.com.cafemanagementsystem.POJO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;

@NamedQuery(name = "User.findByEmailId", query = "SELECT u FROM User u WHERE u.email = :email")
@Entity
@DynamicInsert
@DynamicUpdate
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "contactNumber", nullable = false, length = 50)
    private String contactNumber;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "role", nullable = false, length = 50)
    private String role;

    @Column(name = "status", nullable = false, length = 50)
    private String status;


    public User(String name, String contactNumber, String email, String password, String role, String status) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
    }


}
