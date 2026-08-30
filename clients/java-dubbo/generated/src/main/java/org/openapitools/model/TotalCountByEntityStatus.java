package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Breakdown of asset counts by entity status.
 */
public class TotalCountByEntityStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Count of ACTIVE assets
   */
  @JsonProperty("ACTIVE")
  private Integer ACTIVE;

  /**
   * Count of ARCHIVED assets
   */
  @JsonProperty("ARCHIVED")
  private Integer ARCHIVED;

  /**
   * Count of PAUSED assets
   */
  @JsonProperty("PAUSED")
  private Integer PAUSED;

  /**
   * Count of ACTIVE assets
   * @return ACTIVE
   */
  public Integer getACTIVE() {
    return ACTIVE;
  }

  public void setACTIVE(Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  /**
   * Count of ARCHIVED assets
   * @return ARCHIVED
   */
  public Integer getARCHIVED() {
    return ARCHIVED;
  }

  public void setARCHIVED(Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
  }

  /**
   * Count of PAUSED assets
   * @return PAUSED
   */
  public Integer getPAUSED() {
    return PAUSED;
  }

  public void setPAUSED(Integer PAUSED) {
    this.PAUSED = PAUSED;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalCountByEntityStatus totalCountByEntityStatus = (TotalCountByEntityStatus) o;
    return Objects.equals(this.ACTIVE, totalCountByEntityStatus.ACTIVE) &&
        Objects.equals(this.ARCHIVED, totalCountByEntityStatus.ARCHIVED) &&
        Objects.equals(this.PAUSED, totalCountByEntityStatus.PAUSED);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACTIVE, ARCHIVED, PAUSED);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalCountByEntityStatus {\n");
    
    sb.append("    ACTIVE: ").append(toIndentedString(ACTIVE)).append("\n");
    sb.append("    ARCHIVED: ").append(toIndentedString(ARCHIVED)).append("\n");
    sb.append("    PAUSED: ").append(toIndentedString(PAUSED)).append("\n");
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
