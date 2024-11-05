package apimodels;

import apimodels.KeywordMetricsResponse;
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
 * KeywordsMetricsArrayResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class KeywordsMetricsArrayResponse   {
  @JsonProperty("data")
  @Valid

  private List<@Valid KeywordMetricsResponse> data = null;

  public KeywordsMetricsArrayResponse data(List<@Valid KeywordMetricsResponse> data) {
    this.data = data;
    return this;
  }

  public KeywordsMetricsArrayResponse addDataItem(KeywordMetricsResponse dataItem) {
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
  public List<@Valid KeywordMetricsResponse> getData() {
    return data;
  }

  public void setData(List<@Valid KeywordMetricsResponse> data) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

