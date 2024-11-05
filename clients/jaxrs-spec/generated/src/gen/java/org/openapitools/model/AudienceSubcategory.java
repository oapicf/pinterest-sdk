package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AudienceSubcategory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudienceSubcategory   {
  private String key;
  private String name;
  private BigDecimal ratio;
  private BigDecimal index;
  private String id;

  /**
   * Interest unique key (same as ID).
   **/
  public AudienceSubcategory key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(example = "958862518888", value = "Interest unique key (same as ID).")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  @JsonProperty("key")
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Subinterest name.
   **/
  public AudienceSubcategory name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "travel destinations", value = "Subinterest name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Subinterest&#39;s percent of category&#39;s total audience.
   **/
  public AudienceSubcategory ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

  
  @ApiModelProperty(example = "0.482", value = "Subinterest's percent of category's total audience.")
  @JsonProperty("ratio")
  @Valid public BigDecimal getRatio() {
    return ratio;
  }

  @JsonProperty("ratio")
  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  /**
   * Subinterest affinity index.
   **/
  public AudienceSubcategory index(BigDecimal index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(example = "1.2", value = "Subinterest affinity index.")
  @JsonProperty("index")
  @Valid public BigDecimal getIndex() {
    return index;
  }

  @JsonProperty("index")
  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  /**
   * Subinterest ID.
   **/
  public AudienceSubcategory id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "958862518888", value = "Subinterest ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
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

