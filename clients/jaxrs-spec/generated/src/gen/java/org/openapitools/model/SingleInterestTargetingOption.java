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



@JsonTypeName("SingleInterestTargetingOption")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SingleInterestTargetingOption   {
  private @Valid List<String> childInterests = new ArrayList<>();
  private String id;
  private Integer level;
  private String name;

  public SingleInterestTargetingOption() {
  }

  @JsonCreator
  public SingleInterestTargetingOption(
    @JsonProperty(required = true, value = "child_interests") List<String> childInterests,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "level") Integer level,
    @JsonProperty(required = true, value = "name") String name
  ) {
    this.childInterests = childInterests;
    this.id = id;
    this.level = level;
    this.name = name;
  }

  /**
   **/
  public SingleInterestTargetingOption childInterests(List<String> childInterests) {
    this.childInterests = childInterests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "child_interests")
  @NotNull public List<String> getChildInterests() {
    return childInterests;
  }

  @JsonProperty(required = true, value = "child_interests")
  public void setChildInterests(List<String> childInterests) {
    this.childInterests = childInterests;
  }

  public SingleInterestTargetingOption addChildInterestsItem(String childInterestsItem) {
    if (this.childInterests == null) {
      this.childInterests = new ArrayList<>();
    }

    this.childInterests.add(childInterestsItem);
    return this;
  }

  public SingleInterestTargetingOption removeChildInterestsItem(String childInterestsItem) {
    if (childInterestsItem != null && this.childInterests != null) {
      this.childInterests.remove(childInterestsItem);
    }

    return this;
  }
  /**
   **/
  public SingleInterestTargetingOption id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "945391946569", required = true, value = "")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public SingleInterestTargetingOption level(Integer level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(example = "2", required = true, value = "")
  @JsonProperty(required = true, value = "level")
  @NotNull public Integer getLevel() {
    return level;
  }

  @JsonProperty(required = true, value = "level")
  public void setLevel(Integer level) {
    this.level = level;
  }

  /**
   **/
  public SingleInterestTargetingOption name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Dress", required = true, value = "")
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
    SingleInterestTargetingOption singleInterestTargetingOption = (SingleInterestTargetingOption) o;
    return Objects.equals(this.childInterests, singleInterestTargetingOption.childInterests) &&
        Objects.equals(this.id, singleInterestTargetingOption.id) &&
        Objects.equals(this.level, singleInterestTargetingOption.level) &&
        Objects.equals(this.name, singleInterestTargetingOption.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childInterests, id, level, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleInterestTargetingOption {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
