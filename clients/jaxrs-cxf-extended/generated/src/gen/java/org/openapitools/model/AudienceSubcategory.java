package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceSubcategory  {
  
 /**
  * Interest unique key (same as ID).
  */
  @ApiModelProperty(example = "958862518888", value = "Interest unique key (same as ID).")
  private String key;

 /**
  * Subinterest name.
  */
  @ApiModelProperty(example = "travel destinations", value = "Subinterest name.")
  private String name;

 /**
  * Subinterest's percent of category's total audience.
  */
  @ApiModelProperty(example = "0.482", value = "Subinterest's percent of category's total audience.")
  @Valid
  private BigDecimal ratio;

 /**
  * Subinterest affinity index.
  */
  @ApiModelProperty(example = "1.2", value = "Subinterest affinity index.")
  @Valid
  private BigDecimal index;

 /**
  * Subinterest ID.
  */
  @ApiModelProperty(example = "958862518888", value = "Subinterest ID.")
  private String id;
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
  public AudienceSubcategory key(String key) {
    this.key = key;
    return this;
  }

 /**
  * Subinterest name.
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
  public AudienceSubcategory name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Subinterest&#39;s percent of category&#39;s total audience.
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
  public AudienceSubcategory ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

 /**
  * Subinterest affinity index.
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
  public AudienceSubcategory index(BigDecimal index) {
    this.index = index;
    return this;
  }

 /**
  * Subinterest ID.
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
  public AudienceSubcategory id(String id) {
    this.id = id;
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
    AudienceSubcategory audienceSubcategory = (AudienceSubcategory) o;
    return Objects.equals(this.key, audienceSubcategory.key) &&
        Objects.equals(this.name, audienceSubcategory.name) &&
        Objects.equals(this.ratio, audienceSubcategory.ratio) &&
        Objects.equals(this.index, audienceSubcategory.index) &&
        Objects.equals(this.id, audienceSubcategory.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, ratio, index, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceSubcategory {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

