package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.KeywordMetricsResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordsMetricsArrayResponse   {
  
  private List<KeywordMetricsResponse> data = new ArrayList<>();

  public KeywordsMetricsArrayResponse () {

  }

  public KeywordsMetricsArrayResponse (List<KeywordMetricsResponse> data) {
    this.data = data;
  }

    
  @JsonProperty("data")
  public List<KeywordMetricsResponse> getData() {
    return data;
  }
  public void setData(List<KeywordMetricsResponse> data) {
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
    KeywordsMetricsArrayResponse keywordsMetricsArrayResponse = (KeywordsMetricsArrayResponse) o;
    return Objects.equals(data, keywordsMetricsArrayResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsMetricsArrayResponse {\n");
    
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
