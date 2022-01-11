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

    @NotBlank
//    @SafeHtml
    private String name;
    @NotBlank
//    @SafeHtml
    private String publisher;
    @NotNull
    private String release;
    @NotNull
    private String mode;
}