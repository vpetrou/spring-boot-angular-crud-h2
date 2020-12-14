package com.vpetrou.cs.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contacts")
@ApiModel(description = "All details about the Contact. ")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The database generated contact ID", hidden = true)
    private long id;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 1, max = 90)
    @Column(name = "name")
    @ApiModelProperty(notes = "The contact's name", required = true)
    private String name;

    @Size(min = 0, max = 90)
    @Column(name = "address")
    @ApiModelProperty(notes = "The contact's address")
    private String address;

    @NotBlank(message = "City is mandatory")
    @Size(min = 1, max = 30)
    @Column(name = "city")
    @Pattern(regexp = "^(Athens|Thessaloniki|Patra|Kavala|Serres)$")
    @ApiModelProperty(notes = "The contact's city", required = true, allowableValues = "Athens|Thessaloniki|Patra|Kavala|Serres")
    private String city;

    @Size(min = 0, max = 30)
    @Column(name = "phone")
    @ApiModelProperty(notes = "The contact's phone")
    String phone;

    @NotBlank(message = "Email is mandatory")
    @Size(min = 1, max = 90)
    @Column(name = "email")
    @ApiModelProperty(notes = "The contact's email (must be unique)", required = true, allowableValues = "mustBeUnique@mail.com")
    String email;

    @NotBlank(message = "Gender is mandatory")
    @Size(min = 1, max = 1)
    @Column(name = "gender")
    @Pattern(regexp = "^(m|f)$")
    @ApiModelProperty(notes = "The contact's gender", required = true, allowableValues = "m|f")
    String gender;

    @NotBlank(message = "Status is mandatory")
    @Size(min = 4, max = 5)
    @Column(name = "disabled")
    @Pattern(regexp = "^(false|true)$")
    @ApiModelProperty(notes = "Is contact disabled?", required = true, allowableValues = "false|true")
    String disabled;

    public Contact() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }
}
