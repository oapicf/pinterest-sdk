package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DeleteAssetGroupResponseExceptionsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteAssetGroupResponseExceptionsInner   {
  @JsonProperty("code")
  
  private Integer code;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("asset_group_id")
  
  private String assetGroupId;

  public DeleteAssetGroupResponseExceptionsInner code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Error code associated with the error deleting asset group.
   * @return code
  **/
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public DeleteAssetGroupResponseExceptionsInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message associated with the error deleting asset group.
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DeleteAssetGroupResponseExceptionsInner assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

   /**
   * Asset group id of the exception.
   * @return assetGroupId
  **/
  public String getAssetGroupId() {
    return assetGroupId;
  }

  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAssetGroupResponseExceptionsInner deleteAssetGroupResponseExceptionsInner = (DeleteAssetGroupResponseExceptionsInner) o;
    return Objects.equals(code, deleteAssetGroupResponseExceptionsInner.code) &&
        Objects.equals(message, deleteAssetGroupResponseExceptionsInner.message) &&
        Objects.equals(assetGroupId, deleteAssetGroupResponseExceptionsInner.assetGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, assetGroupId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAssetGroupResponseExceptionsInner {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
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

