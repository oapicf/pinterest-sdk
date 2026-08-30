package apimodels;

import apimodels.ConversionEventsDataItems;
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
 * Conversion events.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventsCreate   {
  @JsonProperty("data")
  @NotNull
@Size(min=1,max=1000)
@Valid

  private List<@Valid ConversionEventsDataItems> data = new ArrayList<>();

  public ConversionEventsCreate data(List<@Valid ConversionEventsDataItems> data) {
    this.data = data;
    return this;
  }

  public ConversionEventsCreate addDataItem(ConversionEventsDataItems dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * A list of events (one or more) encapsulated by a data object.
   * @return data
  **/
  public List<@Valid ConversionEventsDataItems> getData() {
    return data;
  }

  public void setData(List<@Valid ConversionEventsDataItems> data) {
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
    ConversionEventsCreate conversionEventsCreate = (ConversionEventsCreate) o;
    return Objects.equals(data, conversionEventsCreate.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsCreate {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

