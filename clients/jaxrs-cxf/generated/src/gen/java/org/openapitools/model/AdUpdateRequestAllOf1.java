package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdUpdateRequestAllOf1  {
  
 /**
  * The ID of this ad.
  */
  @ApiModelProperty(required = true, value = "The ID of this ad.")

  private String id;

 /**
  * Pin ID. This field may only be updated for draft ads.
  */
  @ApiModelProperty(value = "Pin ID. This field may only be updated for draft ads.")

  private String pinId;
 /**
   * The ID of this ad.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdUpdateRequestAllOf1 id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
  **/
  @JsonProperty("pin_id")
 @Pattern(regexp="^\\d+$")  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public AdUpdateRequestAllOf1 pinId(String pinId) {
    this.pinId = pinId;
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
    AdUpdateRequestAllOf1 adUpdateRequestAllOf1 = (AdUpdateRequestAllOf1) o;
    return Objects.equals(this.id, adUpdateRequestAllOf1.id) &&
        Objects.equals(this.pinId, adUpdateRequestAllOf1.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdUpdateRequestAllOf1 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

