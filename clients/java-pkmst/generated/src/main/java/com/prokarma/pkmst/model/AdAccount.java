package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AdAccountOwner;
import com.prokarma.pkmst.model.BusinessAccessRole;
import com.prokarma.pkmst.model.Country;
import com.prokarma.pkmst.model.Currency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdAccount
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccount   {
  @JsonProperty("country")
  private Country country;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("currency")
  private Currency currency;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private AdAccountOwner owner;

  @JsonProperty("permissions")
  
  private List<BusinessAccessRole> permissions = null;

  @JsonProperty("time_zone")
  private String timeZone;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  public AdAccount country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @ApiModelProperty(value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public AdAccount createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   *  Creation time. Unix timestamp in seconds.
   * @return createdTime
   */
  @ApiModelProperty(readOnly = true, value = " Creation time. Unix timestamp in seconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdAccount currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @ApiModelProperty(value = "")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public AdAccount id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Ad account name.
   * @return name
   */
  @ApiModelProperty(value = "Ad account name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccount owner(AdAccountOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Ad account owner
   * @return owner
   */
  @ApiModelProperty(readOnly = true, value = "Ad account owner")
  public AdAccountOwner getOwner() {
    return owner;
  }

  public void setOwner(AdAccountOwner owner) {
    this.owner = owner;
  }

  public AdAccount permissions(List<BusinessAccessRole> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AdAccount addPermissionsItem(BusinessAccessRole permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @ApiModelProperty(readOnly = true, value = "")
  public List<BusinessAccessRole> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<BusinessAccessRole> permissions) {
    this.permissions = permissions;
  }

  public AdAccount timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
   * @return timeZone
   */
  @ApiModelProperty(example = "America/Los_Angeles", value = "The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public AdAccount updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Get updatedTime
   * @return updatedTime
   */
  @ApiModelProperty(readOnly = true, value = "")
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
    return Objects.equals(this.country, adAccount.country) &&
        Objects.equals(this.createdTime, adAccount.createdTime) &&
        Objects.equals(this.currency, adAccount.currency) &&
        Objects.equals(this.id, adAccount.id) &&
        Objects.equals(this.name, adAccount.name) &&
        Objects.equals(this.owner, adAccount.owner) &&
        Objects.equals(this.permissions, adAccount.permissions) &&
        Objects.equals(this.timeZone, adAccount.timeZone) &&
        Objects.equals(this.updatedTime, adAccount.updatedTime);
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

