/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Resource create operation model.
 */

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerSegmentCreate   {
  
  private List<String> audienceIds = new ArrayList<>();
  private String name;

  /**
   * Audience IDs included in the customer segment.
   */
  public CustomerSegmentCreate audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Audience IDs included in the customer segment.")
  @JsonProperty("audience_ids")
  public List<String> getAudienceIds() {
    return audienceIds;
  }
  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  /**
   * Customer segment name.
   */
  public CustomerSegmentCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Customer segment name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
    return Objects.equals(audienceIds, customerSegmentCreate.audienceIds) &&
        Objects.equals(name, customerSegmentCreate.name);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

