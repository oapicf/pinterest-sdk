package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AttributionWindows   {
  @JsonProperty("click_window_days")
  private Integer clickWindowDays;

  @JsonProperty("engagement_window_days")
  private Integer engagementWindowDays;

  @JsonProperty("view_window_days")
  private Integer viewWindowDays;

  /**
   **/
  public AttributionWindows clickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  
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
  public AttributionWindows engagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  
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
  public AttributionWindows viewWindowDays(Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  
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
    return Objects.equals(clickWindowDays, attributionWindows.clickWindowDays) &&
        Objects.equals(engagementWindowDays, attributionWindows.engagementWindowDays) &&
        Objects.equals(viewWindowDays, attributionWindows.viewWindowDays);
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

