package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionEventsDataInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A list of events (one or more) encapsulated by a data object.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A list of events (one or more) encapsulated by a data object.")
public class ConversionEvents   {
  
  private List<@Valid ConversionEventsDataInner> data = new ArrayList<>();

  /**
   **/
  public ConversionEvents data(List<@Valid ConversionEventsDataInner> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid ConversionEventsDataInner> getData() {
    return data;
  }
  public void setData(List<@Valid ConversionEventsDataInner> data) {
    this.data = data;
  }

  public ConversionEvents addDataItem(ConversionEventsDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
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
    ConversionEvents conversionEvents = (ConversionEvents) o;
    return Objects.equals(this.data, conversionEvents.data);
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

