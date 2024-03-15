package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceInsightCategoryCommon  {
  
  @ApiModelProperty(example = "549755885175", value = "")
  private String key;

  @ApiModelProperty(example = "travel", value = "")
  private String name;

  @ApiModelProperty(example = "0.551", value = "")
  @Valid
  private BigDecimal ratio;

  @ApiModelProperty(example = "1.2", value = "")
  @Valid
  private BigDecimal index;

  @ApiModelProperty(example = "549755885175", value = "")
  private String id;
 /**
  * Get key
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
  public AudienceInsightCategoryCommon key(String key) {
    this.key = key;
    return this;
  }

 /**
  * Get name
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
  public AudienceInsightCategoryCommon name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get ratio
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
  public AudienceInsightCategoryCommon ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

 /**
  * Get index
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
  public AudienceInsightCategoryCommon index(BigDecimal index) {
    this.index = index;
    return this;
  }

 /**
  * Get id
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
  public AudienceInsightCategoryCommon id(String id) {
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
    AudienceInsightCategoryCommon audienceInsightCategoryCommon = (AudienceInsightCategoryCommon) o;
    return Objects.equals(this.key, audienceInsightCategoryCommon.key) &&
        Objects.equals(this.name, audienceInsightCategoryCommon.name) &&
        Objects.equals(this.ratio, audienceInsightCategoryCommon.ratio) &&
        Objects.equals(this.index, audienceInsightCategoryCommon.index) &&
        Objects.equals(this.id, audienceInsightCategoryCommon.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, ratio, index, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsightCategoryCommon {\n");
    
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

