package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class CustomerSegmentCreate  {
  
 /**
  * Audience IDs included in the customer segment.
  */
  @ApiModelProperty(required = true, value = "Audience IDs included in the customer segment.")

  private List<String> audienceIds = new ArrayList<>();

 /**
  * Customer segment name.
  */
  @ApiModelProperty(required = true, value = "Customer segment name.")

  private String name;
 /**
   * Audience IDs included in the customer segment.
   * @return audienceIds
  **/
  @JsonProperty("audience_ids")
  @NotNull
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public CustomerSegmentCreate audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  public CustomerSegmentCreate addAudienceIdsItem(String audienceIdsItem) {
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

 /**
   * Customer segment name.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerSegmentCreate name(String name) {
    this.name = name;
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
    CustomerSegmentCreate customerSegmentCreate = (CustomerSegmentCreate) o;
    return Objects.equals(this.audienceIds, customerSegmentCreate.audienceIds) &&
        Objects.equals(this.name, customerSegmentCreate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceIds, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSegmentCreate {\n");
    
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

