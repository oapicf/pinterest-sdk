package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssetGroupDeleteError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetGroupDeleteError   {
  @JsonProperty("asset_group_id")
  
  private String assetGroupId;

  @JsonProperty("code")
  
  private Integer code;

  @JsonProperty("message")
  
  private String message;

  public AssetGroupDeleteError assetGroupId(String assetGroupId) {
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

  public AssetGroupDeleteError code(Integer code) {
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

  public AssetGroupDeleteError message(String message) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupDeleteError assetGroupDeleteError = (AssetGroupDeleteError) o;
    return Objects.equals(assetGroupId, assetGroupDeleteError.assetGroupId) &&
        Objects.equals(code, assetGroupDeleteError.code) &&
        Objects.equals(message, assetGroupDeleteError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupId, code, message);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupDeleteError {\n");
    
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

