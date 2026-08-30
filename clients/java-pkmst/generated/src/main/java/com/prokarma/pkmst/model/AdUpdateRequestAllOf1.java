package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdUpdateRequestAllOf1
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdUpdateRequestAllOf1   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("pin_id")
  private String pinId;

  public AdUpdateRequestAllOf1 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this ad.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The ID of this ad.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdUpdateRequestAllOf1 pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
   */
  @ApiModelProperty(value = "Pin ID. This field may only be updated for draft ads.")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

