package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountOwner;
import org.openapitools.model.BusinessAccessRole;
import org.openapitools.model.Country;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccount  {
  
  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private AdAccountOwner owner;

  @ApiModelProperty(value = "")
  @Valid
  private Country country;

  @ApiModelProperty(value = "")
  @Valid
  private Currency currency;

  @ApiModelProperty(value = "")
  @Valid
  private List<BusinessAccessRole> permissions = new ArrayList<>();

 /**
  * Creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1451431341", value = "Creation time. Unix timestamp in seconds.")
  private Integer createdTime;

 /**
  * Last update time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
  private Integer updatedTime;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AdAccount id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public AdAccount name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get owner
  * @return owner
  */
  @JsonProperty("owner")
  public AdAccountOwner getOwner() {
    return owner;
  }

  /**
   * Sets the <code>owner</code> property.
   */
 public void setOwner(AdAccountOwner owner) {
    this.owner = owner;
  }

  /**
   * Sets the <code>owner</code> property.
   */
  public AdAccount owner(AdAccountOwner owner) {
    this.owner = owner;
    return this;
  }

 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public AdAccount country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public AdAccount currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
  * Get permissions
  * @return permissions
  */
  @JsonProperty("permissions")
  public List<BusinessAccessRole> getPermissions() {
    return permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
 public void setPermissions(List<BusinessAccessRole> permissions) {
    this.permissions = permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
  public AdAccount permissions(List<BusinessAccessRole> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   */
  public AdAccount addPermissionsItem(BusinessAccessRole permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

 /**
  * Creation time. Unix timestamp in seconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public AdAccount createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Last update time. Unix timestamp in seconds.
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
  public AdAccount updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccount adAccount = (AdAccount) o;
    return Objects.equals(this.id, adAccount.id) &&
        Objects.equals(this.name, adAccount.name) &&
        Objects.equals(this.owner, adAccount.owner) &&
        Objects.equals(this.country, adAccount.country) &&
        Objects.equals(this.currency, adAccount.currency) &&
        Objects.equals(this.permissions, adAccount.permissions) &&
        Objects.equals(this.createdTime, adAccount.createdTime) &&
        Objects.equals(this.updatedTime, adAccount.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, country, currency, permissions, createdTime, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

