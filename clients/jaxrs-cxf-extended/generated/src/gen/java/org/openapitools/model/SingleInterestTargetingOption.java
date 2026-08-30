package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SingleInterestTargetingOption  {
  
  @ApiModelProperty(required = true, value = "")
  private List<String> childInterests = new ArrayList<>();

  @ApiModelProperty(example = "945391946569", required = true, value = "")
  private String id;

  @ApiModelProperty(example = "2", required = true, value = "")
  private Integer level;

  @ApiModelProperty(example = "Dress", required = true, value = "")
  private String name;
 /**
  * Get childInterests
  * @return childInterests
  */
  @JsonProperty("child_interests")
  @NotNull
  public List<String> getChildInterests() {
    return childInterests;
  }

  /**
   * Sets the <code>childInterests</code> property.
   */
 public void setChildInterests(List<String> childInterests) {
    this.childInterests = childInterests;
  }

  /**
   * Sets the <code>childInterests</code> property.
   */
  public SingleInterestTargetingOption childInterests(List<String> childInterests) {
    this.childInterests = childInterests;
    return this;
  }

  /**
   * Adds a new item to the <code>childInterests</code> list.
   */
  public SingleInterestTargetingOption addChildInterestsItem(String childInterestsItem) {
    this.childInterests.add(childInterestsItem);
    return this;
  }

 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public SingleInterestTargetingOption id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get level
  * @return level
  */
  @JsonProperty("level")
  @NotNull
  public Integer getLevel() {
    return level;
  }

  /**
   * Sets the <code>level</code> property.
   */
 public void setLevel(Integer level) {
    this.level = level;
  }

  /**
   * Sets the <code>level</code> property.
   */
  public SingleInterestTargetingOption level(Integer level) {
    this.level = level;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public SingleInterestTargetingOption name(String name) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

