package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Demographic detail for a single audience demographic
 **/
@ApiModel(description="Demographic detail for a single audience demographic")

public class AudienceDemographicValue  {
  
  @ApiModelProperty(example = "us", value = "Unique key for demographic item")
 /**
   * Unique key for demographic item
  **/
  private String key;

  @ApiModelProperty(example = "United States", value = "Display name for demographic")
 /**
   * Display name for demographic
  **/
  private String name;

  @ApiModelProperty(example = "0.551", value = "Value of demographic item as a percent of total audience")
  @Valid
 /**
   * Value of demographic item as a percent of total audience
  **/
  private BigDecimal ratio;
 /**
   * Unique key for demographic item
   * @return key
  **/
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AudienceDemographicValue key(String key) {
    this.key = key;
    return this;
  }

 /**
   * Display name for demographic
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceDemographicValue name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Value of demographic item as a percent of total audience
   * @return ratio
  **/
  @JsonProperty("ratio")
  public BigDecimal getRatio() {
    return ratio;
  }

  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  public AudienceDemographicValue ratio(BigDecimal ratio) {
    this.ratio = ratio;
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
    AudienceDemographicValue audienceDemographicValue = (AudienceDemographicValue) o;
    return Objects.equals(this.key, audienceDemographicValue.key) &&
        Objects.equals(this.name, audienceDemographicValue.name) &&
        Objects.equals(this.ratio, audienceDemographicValue.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDemographicValue {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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

