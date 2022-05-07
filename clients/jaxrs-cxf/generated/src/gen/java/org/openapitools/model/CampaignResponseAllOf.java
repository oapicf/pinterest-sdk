package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CampaignResponseAllOf  {
  
  @ApiModelProperty(example = "549755885175", required = true, value = "Campaign ID.")
 /**
   * Campaign ID.
  **/
  private String id;
 /**
   * Campaign ID.
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

  public CampaignResponseAllOf id(String id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignResponseAllOf {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

