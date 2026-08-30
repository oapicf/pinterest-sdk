package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MetricsResponseDataItems;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricsResponse   {
  
  private List<MetricsResponseDataItems> data = new ArrayList<>();

  public MetricsResponse () {

  }

  public MetricsResponse (List<MetricsResponseDataItems> data) {
    this.data = data;
  }

    
  @JsonProperty("data")
  public List<MetricsResponseDataItems> getData() {
    return data;
  }
  public void setData(List<MetricsResponseDataItems> data) {
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
    MetricsResponse metricsResponse = (MetricsResponse) o;
    return Objects.equals(data, metricsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsResponse {\n");
    
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
