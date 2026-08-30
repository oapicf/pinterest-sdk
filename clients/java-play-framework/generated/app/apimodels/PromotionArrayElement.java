package apimodels;

import apimodels.Exception;
import apimodels.Promotion;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PromotionArrayElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PromotionArrayElement   {
  @JsonProperty("data")
  @Valid

  private Promotion data;

  @JsonProperty("exception")
  @Valid

  private Exception exception;

  public PromotionArrayElement data(Promotion data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public Promotion getData() {
    return data;
  }

  public void setData(Promotion data) {
    this.data = data;
  }

  public PromotionArrayElement exception(Exception exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  public Exception getException() {
    return exception;
  }

  public void setException(Exception exception) {
    this.exception = exception;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionArrayElement promotionArrayElement = (PromotionArrayElement) o;
    return Objects.equals(data, promotionArrayElement.data) &&
        Objects.equals(exception, promotionArrayElement.exception);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exception);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionArrayElement {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
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

