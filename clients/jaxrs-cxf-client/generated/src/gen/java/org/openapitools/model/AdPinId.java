package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdPinId  {
  
  @ApiModelProperty(example = "394205773611545468", value = "Pin ID.")
 /**
   * Pin ID.
  **/
  private String pinId;
 /**
   * Pin ID.
   * @return pinId
  **/
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public AdPinId pinId(String pinId) {
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
    AdPinId adPinId = (AdPinId) o;
    return Objects.equals(this.pinId, adPinId.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPinId {\n");
    
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

