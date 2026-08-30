package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AttributionWindows   {
  
  private Integer clickWindowDays;
  private Integer engagementWindowDays;
  private Integer viewWindowDays;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("click_window_days")
  public Integer getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("engagement_window_days")
  public Integer getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("view_window_days")
  public Integer getViewWindowDays() {
    return viewWindowDays;
  }
  public void setViewWindowDays(Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributionWindows attributionWindows = (AttributionWindows) o;
    return Objects.equals(this.clickWindowDays, attributionWindows.clickWindowDays) &&
        Objects.equals(this.engagementWindowDays, attributionWindows.engagementWindowDays) &&
        Objects.equals(this.viewWindowDays, attributionWindows.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickWindowDays, engagementWindowDays, viewWindowDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributionWindows {\n");
    
    sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
    sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
    sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
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

