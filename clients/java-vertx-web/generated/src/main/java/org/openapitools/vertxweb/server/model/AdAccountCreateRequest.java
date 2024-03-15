package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.Country;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccountCreateRequest   {
  
  private Country country;
  private String name;
  private String ownerUserId;

  public AdAccountCreateRequest () {

  }

  public AdAccountCreateRequest (Country country, String name, String ownerUserId) {
    this.country = country;
    this.name = name;
    this.ownerUserId = ownerUserId;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("owner_user_id")
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
    return Objects.equals(country, adAccountCreateRequest.country) &&
        Objects.equals(name, adAccountCreateRequest.name) &&
        Objects.equals(ownerUserId, adAccountCreateRequest.ownerUserId);
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
