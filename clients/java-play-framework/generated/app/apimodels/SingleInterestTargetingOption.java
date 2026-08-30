package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SingleInterestTargetingOption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SingleInterestTargetingOption   {
  @JsonProperty("child_interests")
  @NotNull

  private List<String> childInterests = new ArrayList<>();

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("level")
  @NotNull

  private Integer level;

  @JsonProperty("name")
  @NotNull

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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(childInterests, singleInterestTargetingOption.childInterests) &&
        Objects.equals(id, singleInterestTargetingOption.id) &&
        Objects.equals(level, singleInterestTargetingOption.level) &&
        Objects.equals(name, singleInterestTargetingOption.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childInterests, id, level, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

