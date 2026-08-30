package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Breakdown of asset counts by entity status.
 */
@ApiModel(description="Breakdown of asset counts by entity status.")

public class TotalCountByEntityStatus  {
  
 /**
  * Count of ACTIVE assets
  */
  @ApiModelProperty(value = "Count of ACTIVE assets")
  private Integer ACTIVE;

 /**
  * Count of ARCHIVED assets
  */
  @ApiModelProperty(value = "Count of ARCHIVED assets")
  private Integer ARCHIVED;

 /**
  * Count of PAUSED assets
  */
  @ApiModelProperty(value = "Count of PAUSED assets")
  private Integer PAUSED;
 /**
  * Count of ACTIVE assets
  * @return ACTIVE
  */
  @JsonProperty("ACTIVE")
  public Integer getACTIVE() {
    return ACTIVE;
  }

  /**
   * Sets the <code>ACTIVE</code> property.
   */
 public void setACTIVE(Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  /**
   * Sets the <code>ACTIVE</code> property.
   */
  public TotalCountByEntityStatus ACTIVE(Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
    return this;
  }

 /**
  * Count of ARCHIVED assets
  * @return ARCHIVED
  */
  @JsonProperty("ARCHIVED")
  public Integer getARCHIVED() {
    return ARCHIVED;
  }

  /**
   * Sets the <code>ARCHIVED</code> property.
   */
 public void setARCHIVED(Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
  }

  /**
   * Sets the <code>ARCHIVED</code> property.
   */
  public TotalCountByEntityStatus ARCHIVED(Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
    return this;
  }

 /**
  * Count of PAUSED assets
  * @return PAUSED
  */
  @JsonProperty("PAUSED")
  public Integer getPAUSED() {
    return PAUSED;
  }

  /**
   * Sets the <code>PAUSED</code> property.
   */
 public void setPAUSED(Integer PAUSED) {
    this.PAUSED = PAUSED;
  }

  /**
   * Sets the <code>PAUSED</code> property.
   */
  public TotalCountByEntityStatus PAUSED(Integer PAUSED) {
    this.PAUSED = PAUSED;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

