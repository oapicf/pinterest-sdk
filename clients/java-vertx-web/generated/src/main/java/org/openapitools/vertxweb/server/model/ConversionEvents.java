package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ConversionEventsDataInner;

/**
 * A list of events (one or more) encapsulated by a data object.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEvents   {
  
  private List<ConversionEventsDataInner> data = new ArrayList<>();

  public ConversionEvents () {

  }

  public ConversionEvents (List<ConversionEventsDataInner> data) {
    this.data = data;
  }

    
  @JsonProperty("data")
  public List<ConversionEventsDataInner> getData() {
    return data;
  }
  public void setData(List<ConversionEventsDataInner> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEvents conversionEvents = (ConversionEvents) o;
    return Objects.equals(data, conversionEvents.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEvents {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
