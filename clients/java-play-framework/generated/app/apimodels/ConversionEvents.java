package apimodels;

import apimodels.ConversionEventsDataInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A list of events (one or more) encapsulated by a data object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEvents   {
  @JsonProperty("data")
  @NotNull
@Size(min=1,max=1000)
@Valid

  private List<@Valid ConversionEventsDataInner> data = new ArrayList<>();

  public ConversionEvents data(List<@Valid ConversionEventsDataInner> data) {
    this.data = data;
    return this;
  }

  public ConversionEvents addDataItem(ConversionEventsDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<@Valid ConversionEventsDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid ConversionEventsDataInner> data) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

