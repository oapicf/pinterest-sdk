package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountOwner;
import org.openapitools.model.BusinessAccessRole;
import org.openapitools.model.Country;
import org.openapitools.model.Currency;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccount  {
  
  @ApiModelProperty(value = "")

  private Country country;

 /**
  *  Creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = " Creation time. Unix timestamp in seconds.")

  private Integer createdTime;

  @ApiModelProperty(value = "")

  private Currency currency;

  @ApiModelProperty(required = true, value = "")

  private String id;

 /**
  * Ad account name.
  */
  @ApiModelProperty(value = "Ad account name.")

  private String name;

 /**
  * Ad account owner
  */
  @ApiModelProperty(value = "Ad account owner")

  private AdAccountOwner owner;

  @ApiModelProperty(value = "")

  private List<BusinessAccessRole> permissions = new ArrayList<>();

 /**
  * The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
  */
  @ApiModelProperty(example = "America/Los_Angeles", value = "The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.")

  private String timeZone;

  @ApiModelProperty(value = "")

  private Integer updatedTime;
 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public AdAccount country(Country country) {
    this.country = country;
    return this;
  }

 /**
   *  Creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }


 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public AdAccount currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccount id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Ad account name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccount name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Ad account owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AdAccountOwner getOwner() {
    return owner;
  }


 /**
   * Get permissions
   * @return permissions
  **/
  @JsonProperty("permissions")
  public List<BusinessAccessRole> getPermissions() {
    return permissions;
  }


 /**
   * The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
   * @return timeZone
  **/
  @JsonProperty("time_zone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public AdAccount timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

 /**
   * Get updatedTime
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

