package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceSubcategory;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceCategory  {
  
  @ApiModelProperty(example = "1234567", value = "Interest unique key (same as ID).")
 /**
   * Interest unique key (same as ID).
  **/
  private String key;

  @ApiModelProperty(example = "travel", value = "Interest name.")
 /**
   * Interest name.
  **/
  private String name;

  @ApiModelProperty(example = "0.551", value = "Interest's percent of category's total audience.")
  @Valid
 /**
   * Interest's percent of category's total audience.
  **/
  private BigDecimal ratio;

  @ApiModelProperty(example = "1.2", value = "Interest affinity index.")
  @Valid
 /**
   * Interest affinity index.
  **/
  private BigDecimal index;

  @ApiModelProperty(example = "1234567", value = "Interest ID.")
 /**
   * Interest ID.
  **/
  private String id;

  @ApiModelProperty(value = "Subcategory interest distribution")
  @Valid
 /**
   * Subcategory interest distribution
  **/
  private List<@Valid AudienceSubcategory> subcategories = new ArrayList<>();
 /**
   * Interest unique key (same as ID).
   * @return key
  **/
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AudienceCategory key(String key) {
    this.key = key;
    return this;
  }

 /**
   * Interest name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceCategory name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Interest&#39;s percent of category&#39;s total audience.
   * @return ratio
  **/
  @JsonProperty("ratio")
  public BigDecimal getRatio() {
    return ratio;
  }

  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  public AudienceCategory ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

 /**
   * Interest affinity index.
   * @return index
  **/
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public AudienceCategory index(BigDecimal index) {
    this.index = index;
    return this;
  }

 /**
   * Interest ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AudienceCategory id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Subcategory interest distribution
   * @return subcategories
  **/
  @JsonProperty("subcategories")
  public List<@Valid AudienceSubcategory> getSubcategories() {
    return subcategories;
  }

  public void setSubcategories(List<@Valid AudienceSubcategory> subcategories) {
    this.subcategories = subcategories;
  }

  public AudienceCategory subcategories(List<@Valid AudienceSubcategory> subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  public AudienceCategory addSubcategoriesItem(AudienceSubcategory subcategoriesItem) {
    this.subcategories.add(subcategoriesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

