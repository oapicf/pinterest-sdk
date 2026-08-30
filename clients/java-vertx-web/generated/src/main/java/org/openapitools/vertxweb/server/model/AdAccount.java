package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdAccountOwner;
import org.openapitools.vertxweb.server.model.BusinessAccessRole;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.Currency;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccount   {
  
  private Country country;
  private Integer createdTime;
  private Currency currency;
  private String id;
  private String name;
  private AdAccountOwner owner;
  private List<BusinessAccessRole> permissions = new ArrayList<>();
  private String timeZone;
  private Integer updatedTime;

  public AdAccount () {

  }

  public AdAccount (Country country, Integer createdTime, Currency currency, String id, String name, AdAccountOwner owner, List<BusinessAccessRole> permissions, String timeZone, Integer updatedTime) {
    this.country = country;
    this.createdTime = createdTime;
    this.currency = currency;
    this.id = id;
    this.name = name;
    this.owner = owner;
    this.permissions = permissions;
    this.timeZone = timeZone;
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("owner")
  public AdAccountOwner getOwner() {
    return owner;
  }
  public void setOwner(AdAccountOwner owner) {
    this.owner = owner;
  }

    
  @JsonProperty("permissions")
  public List<BusinessAccessRole> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<BusinessAccessRole> permissions) {
    this.permissions = permissions;
  }

    
  @JsonProperty("time_zone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
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
    return Objects.equals(country, adAccount.country) &&
        Objects.equals(createdTime, adAccount.createdTime) &&
        Objects.equals(currency, adAccount.currency) &&
        Objects.equals(id, adAccount.id) &&
        Objects.equals(name, adAccount.name) &&
        Objects.equals(owner, adAccount.owner) &&
        Objects.equals(permissions, adAccount.permissions) &&
        Objects.equals(timeZone, adAccount.timeZone) &&
        Objects.equals(updatedTime, adAccount.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, createdTime, currency, id, name, owner, permissions, timeZone, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccount {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
