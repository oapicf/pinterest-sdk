package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Demographic detail for a single audience demographic
 */
public class AudienceDemographicValue implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique key for demographic item
   */
  @JsonProperty("key")
  private String key;

  /**
   * Display name for demographic
   */
  @JsonProperty("name")
  private String name;

  /**
   * Value of demographic item as a percent of total audience
   */
  @JsonProperty("ratio")
  private BigDecimal ratio;

  /**
   * Unique key for demographic item
   * @return key
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Display name for demographic
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Value of demographic item as a percent of total audience
   * @return ratio
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
