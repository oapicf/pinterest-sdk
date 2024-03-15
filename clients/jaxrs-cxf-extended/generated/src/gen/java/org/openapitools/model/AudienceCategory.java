package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceSubcategory;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceCategory  {
  
 /**
  * Interest unique key (same as ID).
  */
  @ApiModelProperty(example = "1234567", value = "Interest unique key (same as ID).")
  private String key;

 /**
  * Interest name.
  */
  @ApiModelProperty(example = "travel", value = "Interest name.")
  private String name;

 /**
  * Interest's percent of category's total audience.
  */
  @ApiModelProperty(example = "0.551", value = "Interest's percent of category's total audience.")
  @Valid
  private BigDecimal ratio;

 /**
  * Interest affinity index.
  */
  @ApiModelProperty(example = "1.2", value = "Interest affinity index.")
  @Valid
  private BigDecimal index;

 /**
  * Interest ID.
  */
  @ApiModelProperty(example = "1234567", value = "Interest ID.")
  private String id;

 /**
  * Subcategory interest distribution
  */
  @ApiModelProperty(value = "Subcategory interest distribution")
  @Valid
  private List<@Valid AudienceSubcategory> subcategories;
 /**
  * Interest unique key (same as ID).
  * @return key
  */
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  /**
   * Sets the <code>key</code> property.
   */
 public void setKey(String key) {
    this.key = key;
  }

  /**
   * Sets the <code>key</code> property.
   */
  public AudienceCategory key(String key) {
    this.key = key;
    return this;
  }

 /**
  * Interest name.
  * @return name
  */
  @JsonProperty("name")
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
  public AudienceCategory name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Interest&#39;s percent of category&#39;s total audience.
  * @return ratio
  */
  @JsonProperty("ratio")
  public BigDecimal getRatio() {
    return ratio;
  }

  /**
   * Sets the <code>ratio</code> property.
   */
 public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  /**
   * Sets the <code>ratio</code> property.
   */
  public AudienceCategory ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

 /**
  * Interest affinity index.
  * @return index
  */
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(BigDecimal index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
  public AudienceCategory index(BigDecimal index) {
    this.index = index;
    return this;
  }

 /**
  * Interest ID.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
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
  public AudienceCategory id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Subcategory interest distribution
  * @return subcategories
  */
  @JsonProperty("subcategories")
  public List<@Valid AudienceSubcategory> getSubcategories() {
    return subcategories;
  }

  /**
   * Sets the <code>subcategories</code> property.
   */
 public void setSubcategories(List<@Valid AudienceSubcategory> subcategories) {
    this.subcategories = subcategories;
  }

  /**
   * Sets the <code>subcategories</code> property.
   */
  public AudienceCategory subcategories(List<@Valid AudienceSubcategory> subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  /**
   * Adds a new item to the <code>subcategories</code> list.
   */
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

