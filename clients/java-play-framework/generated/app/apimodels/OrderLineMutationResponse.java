package apimodels;

import apimodels.OrderLineMutationResult;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrderLineMutationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderLineMutationResponse   {
  @JsonProperty("data")
  @Valid

  private OrderLineMutationResult data;

  public OrderLineMutationResponse data(OrderLineMutationResult data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public OrderLineMutationResult getData() {
    return data;
  }

  public void setData(OrderLineMutationResult data) {
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
    OrderLineMutationResponse orderLineMutationResponse = (OrderLineMutationResponse) o;
    return Objects.equals(data, orderLineMutationResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineMutationResponse {\n");
    
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

