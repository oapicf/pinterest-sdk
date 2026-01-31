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



@JsonTypeName("SingleInterestTargetingOptionResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SingleInterestTargetingOptionResponse   {
  private @Valid List<String> childInterests = new ArrayList<>();
  private String id;
  private Integer level;
  private String name;

  public SingleInterestTargetingOptionResponse() {
  }

  /**
   **/
  public SingleInterestTargetingOptionResponse childInterests(List<String> childInterests) {
    this.childInterests = childInterests;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("child_interests")
  public List<String> getChildInterests() {
    return childInterests;
  }

  @JsonProperty("child_interests")
  public void setChildInterests(List<String> childInterests) {
    this.childInterests = childInterests;
  }

  public SingleInterestTargetingOptionResponse addChildInterestsItem(String childInterestsItem) {
    if (this.childInterests == null) {
      this.childInterests = new ArrayList<>();
    }

    this.childInterests.add(childInterestsItem);
    return this;
  }

  public SingleInterestTargetingOptionResponse removeChildInterestsItem(String childInterestsItem) {
    if (childInterestsItem != null && this.childInterests != null) {
      this.childInterests.remove(childInterestsItem);
    }

    return this;
  }
  /**
   **/
  public SingleInterestTargetingOptionResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "945391946569", value = "")
  @JsonProperty("id")
   @Pattern(regexp="\\d+")public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public SingleInterestTargetingOptionResponse level(Integer level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(example = "2", value = "")
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(Integer level) {
    this.level = level;
  }

  /**
   **/
  public SingleInterestTargetingOptionResponse name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Dress", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
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
    SingleInterestTargetingOptionResponse singleInterestTargetingOptionResponse = (SingleInterestTargetingOptionResponse) o;
    return Objects.equals(this.childInterests, singleInterestTargetingOptionResponse.childInterests) &&
        Objects.equals(this.id, singleInterestTargetingOptionResponse.id) &&
        Objects.equals(this.level, singleInterestTargetingOptionResponse.level) &&
        Objects.equals(this.name, singleInterestTargetingOptionResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childInterests, id, level, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleInterestTargetingOptionResponse {\n");
    
    sb.append("    childInterests: ").append(toIndentedString(childInterests)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

