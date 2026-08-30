package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Schedule;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SchedulesList200Response  {
  
  @ApiModelProperty(value = "")

  private String bookmark;

  @ApiModelProperty(required = true, value = "")

  private List<Schedule> items = new ArrayList<>();
 /**
   * Get bookmark
   * @return bookmark
  **/
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  public SchedulesList200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<Schedule> getItems() {
    return items;
  }

  public void setItems(List<Schedule> items) {
    this.items = items;
  }

  public SchedulesList200Response items(List<Schedule> items) {
    this.items = items;
    return this;
  }

  public SchedulesList200Response addItemsItem(Schedule itemsItem) {
    this.items.add(itemsItem);
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
    SchedulesList200Response schedulesList200Response = (SchedulesList200Response) o;
    return Objects.equals(this.bookmark, schedulesList200Response.bookmark) &&
        Objects.equals(this.items, schedulesList200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulesList200Response {\n");
    
    sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

