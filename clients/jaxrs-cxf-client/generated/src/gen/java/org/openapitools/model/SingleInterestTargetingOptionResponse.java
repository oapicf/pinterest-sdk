package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SingleInterestTargetingOptionResponse  {
  
  @ApiModelProperty(example = "945391946569", value = "")
  private String id;

  @ApiModelProperty(example = "Dress", value = "")
  private String name;

  @ApiModelProperty(value = "")
  private List<String> childInterests;

  @ApiModelProperty(example = "2", value = "")
  private Integer level;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SingleInterestTargetingOptionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SingleInterestTargetingOptionResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get childInterests
   * @return childInterests
  **/
  @JsonProperty("child_interests")
  public List<String> getChildInterests() {
    return childInterests;
  }

  public void setChildInterests(List<String> childInterests) {
    this.childInterests = childInterests;
  }

  public SingleInterestTargetingOptionResponse childInterests(List<String> childInterests) {
    this.childInterests = childInterests;
    return this;
  }

  public SingleInterestTargetingOptionResponse addChildInterestsItem(String childInterestsItem) {
    this.childInterests.add(childInterestsItem);
    return this;
  }

 /**
   * Get level
   * @return level
  **/
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public SingleInterestTargetingOptionResponse level(Integer level) {
    this.level = level;
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
    SingleInterestTargetingOptionResponse singleInterestTargetingOptionResponse = (SingleInterestTargetingOptionResponse) o;
    return Objects.equals(this.id, singleInterestTargetingOptionResponse.id) &&
        Objects.equals(this.name, singleInterestTargetingOptionResponse.name) &&
        Objects.equals(this.childInterests, singleInterestTargetingOptionResponse.childInterests) &&
        Objects.equals(this.level, singleInterestTargetingOptionResponse.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, childInterests, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleInterestTargetingOptionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    childInterests: ").append(toIndentedString(childInterests)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

