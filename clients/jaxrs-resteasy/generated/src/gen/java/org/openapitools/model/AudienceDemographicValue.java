package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="Demographic detail for a single audience demographic")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceDemographicValue   {
  
  private String key;
  private String name;
  private BigDecimal ratio;

  /**
   * Unique key for demographic item
   **/
  
  @ApiModelProperty(example = "us", value = "Unique key for demographic item")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Display name for demographic
   **/
  
  @ApiModelProperty(example = "United States", value = "Display name for demographic")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Value of demographic item as a percent of total audience
   **/
  
  @ApiModelProperty(example = "0.551", value = "Value of demographic item as a percent of total audience")
  @JsonProperty("ratio")
  @Valid
  public BigDecimal getRatio() {
    return ratio;
  }
  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

