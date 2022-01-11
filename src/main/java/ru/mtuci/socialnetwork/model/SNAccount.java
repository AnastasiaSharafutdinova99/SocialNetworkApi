package ru.mtuci.socialnetwork.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SNAccount extends AbstractBaseEntity {

    @NotNull
    private String surname;
    @NotNull
    private String name;
    @NotNull
    private String nickname;
    @NotNull
    private String birthday;
    @NotNull
    private int age;
    @NotNull
    private String email;
    @NotNull
    private String pet;
}