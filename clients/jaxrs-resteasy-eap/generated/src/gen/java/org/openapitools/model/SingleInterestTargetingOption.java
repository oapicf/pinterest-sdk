package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SingleInterestTargetingOption   {
  
  private List<String> childInterests = new ArrayList<>();
  private String id;
  private Integer level;
  private String name;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("child_interests")
  @NotNull
  public List<String> getChildInterests() {
    return childInterests;
  }
  public void setChildInterests(List<String> childInterests) {
    this.childInterests = childInterests;
  }

  /**
   **/
  
  @ApiModelProperty(example = "945391946569", required = true, value = "")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(example = "2", required = true, value = "")
  @JsonProperty("level")
  @NotNull
  public Integer getLevel() {
    return level;
  }
  public void setLevel(Integer level) {
    this.level = level;
  }

  /**
   **/
  
  @ApiModelProperty(example = "Dress", required = true, value = "")
  @JsonProperty("name")
  @NotNull
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

