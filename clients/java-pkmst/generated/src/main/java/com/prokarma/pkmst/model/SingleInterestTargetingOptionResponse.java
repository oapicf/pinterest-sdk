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
 * SingleInterestTargetingOptionResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SingleInterestTargetingOptionResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("child_interests")
  
  private List<String> childInterests = null;

  @JsonProperty("level")
  private Integer level;

  public SingleInterestTargetingOptionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "945391946569", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SingleInterestTargetingOptionResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Dress", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SingleInterestTargetingOptionResponse childInterests(List<String> childInterests) {
    this.childInterests = childInterests;
    return this;
  }

  public SingleInterestTargetingOptionResponse addChildInterestsItem(String childInterestsItem) {
    if (this.childInterests == null) {
      this.childInterests = new ArrayList<>();
    }
    this.childInterests.add(childInterestsItem);
    return this;
  }

   /**
   * Get childInterests
   * @return childInterests
  **/
  @ApiModelProperty(value = "")
  public List<String> getChildInterests() {
    return childInterests;
  }

  public void setChildInterests(List<String> childInterests) {
    this.childInterests = childInterests;
  }

  public SingleInterestTargetingOptionResponse level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

