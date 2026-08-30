package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Breakdown of asset counts by entity status.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TotalCountByEntityStatus   {
  
  private Integer ACTIVE;
  private Integer ARCHIVED;
  private Integer PAUSED;

  public TotalCountByEntityStatus () {

  }

  public TotalCountByEntityStatus (Integer ACTIVE, Integer ARCHIVED, Integer PAUSED) {
    this.ACTIVE = ACTIVE;
    this.ARCHIVED = ARCHIVED;
    this.PAUSED = PAUSED;
  }

    
  @JsonProperty("ACTIVE")
  public Integer getACTIVE() {
    return ACTIVE;
  }
  public void setACTIVE(Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

    
  @JsonProperty("ARCHIVED")
  public Integer getARCHIVED() {
    return ARCHIVED;
  }
  public void setARCHIVED(Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
  }

    
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
