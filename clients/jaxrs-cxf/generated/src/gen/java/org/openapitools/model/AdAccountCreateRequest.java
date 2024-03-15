package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountCreateRequest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Country country;

  @ApiModelProperty(example = "ACME Tools", value = "Ad Account name.")
 /**
   * Ad Account name.
  **/
  private String name;

  @ApiModelProperty(example = "383791336903426391", value = "Advertiser's owning user ID.")
 /**
   * Advertiser's owning user ID.
  **/
  private String ownerUserId;
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

  public AdAccountCreateRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
   * Ad Account name.
   * @return name
  **/
  @JsonProperty("name")
 @Size(max=256)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccountCreateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Advertiser&#39;s owning user ID.
   * @return ownerUserId
  **/
  @JsonProperty("owner_user_id")
 @Pattern(regexp="^\\d+$")  public String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public AdAccountCreateRequest ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
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
    AdAccountCreateRequest adAccountCreateRequest = (AdAccountCreateRequest) o;
    return Objects.equals(this.country, adAccountCreateRequest.country) &&
        Objects.equals(this.name, adAccountCreateRequest.name) &&
        Objects.equals(this.ownerUserId, adAccountCreateRequest.ownerUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, name, ownerUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreateRequest {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
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

