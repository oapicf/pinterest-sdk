package apimodels;

import apimodels.Country;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdAccountCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdAccountCreateRequest   {
  @JsonProperty("country")
  @Valid

  private Country country;

  @JsonProperty("name")
  @Size(max=256)

  private String name;

  @JsonProperty("owner_user_id")
  @Pattern(regexp="^\\d+$")

  private String ownerUserId;

  public AdAccountCreateRequest country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

