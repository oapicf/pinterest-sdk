package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Breakdown of asset counts by entity status.
 **/

@ApiModel(description = "Breakdown of asset counts by entity status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TotalCountByEntityStatus   {
  @JsonProperty("ACTIVE")
  private Integer ACTIVE;

  @JsonProperty("ARCHIVED")
  private Integer ARCHIVED;

  @JsonProperty("PAUSED")
  private Integer PAUSED;

  /**
   * Count of ACTIVE assets
   **/
  public TotalCountByEntityStatus ACTIVE(Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
    return this;
  }

  
  @ApiModelProperty(value = "Count of ACTIVE assets")
  @JsonProperty("ACTIVE")
  public Integer getACTIVE() {
    return ACTIVE;
  }
  public void setACTIVE(Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  /**
   * Count of ARCHIVED assets
   **/
  public TotalCountByEntityStatus ARCHIVED(Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
    return this;
  }

  
  @ApiModelProperty(value = "Count of ARCHIVED assets")
  @JsonProperty("ARCHIVED")
  public Integer getARCHIVED() {
    return ARCHIVED;
  }
  public void setARCHIVED(Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
  }

  /**
   * Count of PAUSED assets
   **/
  public TotalCountByEntityStatus PAUSED(Integer PAUSED) {
    this.PAUSED = PAUSED;
    return this;
  }

  
  @ApiModelProperty(value = "Count of PAUSED assets")
  @JsonProperty("PAUSED")
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
    return Objects.equals(ACTIVE, totalCountByEntityStatus.ACTIVE) &&
        Objects.equals(ARCHIVED, totalCountByEntityStatus.ARCHIVED) &&
        Objects.equals(PAUSED, totalCountByEntityStatus.PAUSED);
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

