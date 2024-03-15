package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceSubcategory;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AudienceCategory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceCategory   {
  private @Valid String key;
  private @Valid String name;
  private @Valid BigDecimal ratio;
  private @Valid BigDecimal index;
  private @Valid String id;
  private @Valid List<@Valid AudienceSubcategory> subcategories;

  /**
   * Interest unique key (same as ID).
   **/
  public AudienceCategory key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(example = "1234567", value = "Interest unique key (same as ID).")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  @JsonProperty("key")
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Interest name.
   **/
  public AudienceCategory name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "travel", value = "Interest name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Interest&#39;s percent of category&#39;s total audience.
   **/
  public AudienceCategory ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

  
  @ApiModelProperty(example = "0.551", value = "Interest's percent of category's total audience.")
  @JsonProperty("ratio")
  public BigDecimal getRatio() {
    return ratio;
  }

  @JsonProperty("ratio")
  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  /**
   * Interest affinity index.
   **/
  public AudienceCategory index(BigDecimal index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(example = "1.2", value = "Interest affinity index.")
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }

  @JsonProperty("index")
  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  /**
   * Interest ID.
   **/
  public AudienceCategory id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1234567", value = "Interest ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Subcategory interest distribution
   **/
  public AudienceCategory subcategories(List<@Valid AudienceSubcategory> subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  
  @ApiModelProperty(value = "Subcategory interest distribution")
  @JsonProperty("subcategories")
  public List<AudienceSubcategory> getSubcategories() {
    return subcategories;
  }

  @JsonProperty("subcategories")
  public void setSubcategories(List<@Valid AudienceSubcategory> subcategories) {
    this.subcategories = subcategories;
  }

  public AudienceCategory addSubcategoriesItem(AudienceSubcategory subcategoriesItem) {
    if (this.subcategories == null) {
      this.subcategories = new ArrayList<>();
    }

    this.subcategories.add(subcategoriesItem);
    return this;
  }

  public AudienceCategory removeSubcategoriesItem(AudienceSubcategory subcategoriesItem) {
    if (subcategoriesItem != null && this.subcategories != null) {
      this.subcategories.remove(subcategoriesItem);
    }

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
    AudienceCategory audienceCategory = (AudienceCategory) o;
    return Objects.equals(this.key, audienceCategory.key) &&
        Objects.equals(this.name, audienceCategory.name) &&
        Objects.equals(this.ratio, audienceCategory.ratio) &&
        Objects.equals(this.index, audienceCategory.index) &&
        Objects.equals(this.id, audienceCategory.id) &&
        Objects.equals(this.subcategories, audienceCategory.subcategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, ratio, index, id, subcategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCategory {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
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

