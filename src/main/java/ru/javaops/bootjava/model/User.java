package ru.javaops.bootjava.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString(callSuper = true,exclude = {"password"})
@Table(name="users")
public class User  extends AbstractPersistable {
@Column(name="email", nullable = false,unique = true)

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private Set<Role> roles;
}