package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SingleInterestTargetingOption
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SingleInterestTargetingOption   {
  @JsonProperty("child_interests")
  
  private List<String> childInterests = new ArrayList<>();

  @JsonProperty("id")
  private String id;

  @JsonProperty("level")
  private Integer level;

  @JsonProperty("name")
  private String name;

  public SingleInterestTargetingOption childInterests(List<String> childInterests) {
    this.childInterests = childInterests;
    return this;
  }

  public SingleInterestTargetingOption addChildInterestsItem(String childInterestsItem) {
    if (this.childInterests == null) {
      this.childInterests = new ArrayList<>();
    }
    this.childInterests.add(childInterestsItem);
    return this;
  }

  /**
   * Get childInterests
   * @return childInterests
   */
  @ApiModelProperty(required = true, value = "")
  public List<String> getChildInterests() {
    return childInterests;
  }

  public void setChildInterests(List<String> childInterests) {
    this.childInterests = childInterests;
  }

  public SingleInterestTargetingOption id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(example = "945391946569", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SingleInterestTargetingOption level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
   */
  @ApiModelProperty(example = "2", required = true, value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public SingleInterestTargetingOption name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(example = "Dress", required = true, value = "")
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

