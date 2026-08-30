package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("CustomerSegmentCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerSegmentCreate   {
  private @Valid List<String> audienceIds = new ArrayList<>();
  private String name;

  public CustomerSegmentCreate() {
  }

  @JsonCreator
  public CustomerSegmentCreate(
    @JsonProperty(required = true, value = "audience_ids") List<String> audienceIds,
    @JsonProperty(required = true, value = "name") String name
  ) {
    this.audienceIds = audienceIds;
    this.name = name;
  }

  /**
   * Audience IDs included in the customer segment.
   **/
  public CustomerSegmentCreate audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Audience IDs included in the customer segment.")
  @JsonProperty(required = true, value = "audience_ids")
  @NotNull public List<String> getAudienceIds() {
    return audienceIds;
  }

  @JsonProperty(required = true, value = "audience_ids")
  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public CustomerSegmentCreate addAudienceIdsItem(String audienceIdsItem) {
    if (this.audienceIds == null) {
      this.audienceIds = new ArrayList<>();
    }

    this.audienceIds.add(audienceIdsItem);
    return this;
  }

  public CustomerSegmentCreate removeAudienceIdsItem(String audienceIdsItem) {
    if (audienceIdsItem != null && this.audienceIds != null) {
      this.audienceIds.remove(audienceIdsItem);
    }

    return this;
  }
  /**
   * Customer segment name.
   **/
  public CustomerSegmentCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Customer segment name.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
