package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleInterestTargetingOptionResponse   {
  
  private String id;
  private String name;
  private List<String> childInterests;
  private Integer level;

  public SingleInterestTargetingOptionResponse () {

  }

  public SingleInterestTargetingOptionResponse (String id, String name, List<String> childInterests, Integer level) {
    this.id = id;
    this.name = name;
    this.childInterests = childInterests;
    this.level = level;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("child_interests")
  public List<String> getChildInterests() {
    return childInterests;
  }
  public void setChildInterests(List<String> childInterests) {
    this.childInterests = childInterests;
  }

    
  @JsonProperty("level")
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
    return Objects.equals(id, singleInterestTargetingOptionResponse.id) &&
        Objects.equals(name, singleInterestTargetingOptionResponse.name) &&
        Objects.equals(childInterests, singleInterestTargetingOptionResponse.childInterests) &&
        Objects.equals(level, singleInterestTargetingOptionResponse.level);
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
