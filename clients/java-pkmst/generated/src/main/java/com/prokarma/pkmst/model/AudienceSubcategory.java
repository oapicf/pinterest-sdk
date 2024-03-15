package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AudienceSubcategory
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceSubcategory   {
  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  @JsonProperty("ratio")
  private BigDecimal ratio;

  @JsonProperty("index")
  private BigDecimal index;

  @JsonProperty("id")
  private String id;

  public AudienceSubcategory key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Interest unique key (same as ID).
   * @return key
  **/
  @ApiModelProperty(example = "958862518888", value = "Interest unique key (same as ID).")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AudienceSubcategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Subinterest name.
   * @return name
  **/
  @ApiModelProperty(example = "travel destinations", value = "Subinterest name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceSubcategory ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

   /**
   * Subinterest's percent of category's total audience.
   * @return ratio
  **/
  @ApiModelProperty(example = "0.482", value = "Subinterest's percent of category's total audience.")
  public BigDecimal getRatio() {
    return ratio;
  }

  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  public AudienceSubcategory index(BigDecimal index) {
    this.index = index;
    return this;
  }

   /**
   * Subinterest affinity index.
   * @return index
  **/
  @ApiModelProperty(example = "1.2", value = "Subinterest affinity index.")
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public AudienceSubcategory id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Subinterest ID.
   * @return id
  **/
  @ApiModelProperty(example = "958862518888", value = "Subinterest ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

