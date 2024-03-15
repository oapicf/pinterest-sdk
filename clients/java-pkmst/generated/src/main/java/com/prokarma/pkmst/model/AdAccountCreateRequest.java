package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.Country;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdAccountCreateRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountCreateRequest   {
  @JsonProperty("country")
  private Country country;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner_user_id")
  private String ownerUserId;

  public AdAccountCreateRequest country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public AdAccountCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Ad Account name.
   * @return name
  **/
  @ApiModelProperty(example = "ACME Tools", value = "Ad Account name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccountCreateRequest ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

   /**
   * Advertiser's owning user ID.
   * @return ownerUserId
  **/
  @ApiModelProperty(example = "383791336903426391", value = "Advertiser's owning user ID.")
  public String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

