package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class UpdateAssetGroupResponseExceptionsInner   {
  
  private Integer code;

  private String message;

  private String assetGroupId;

  /**
   * Error code associated with the error editing asset group.
   **/
  public UpdateAssetGroupResponseExceptionsInner code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "29", value = "Error code associated with the error editing asset group.")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }


  /**
   * Error message associated with the error editing asset group.
   **/
  public UpdateAssetGroupResponseExceptionsInner message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "You are not permitted to access that resource.", value = "Error message associated with the error editing asset group.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Asset group id of the exception.
   **/
  public UpdateAssetGroupResponseExceptionsInner assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "666791336903426391", value = "Asset group id of the exception.")
  @JsonProperty("asset_group_id")
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
    UpdateAssetGroupResponseExceptionsInner updateAssetGroupResponseExceptionsInner = (UpdateAssetGroupResponseExceptionsInner) o;
    return Objects.equals(this.code, updateAssetGroupResponseExceptionsInner.code) &&
        Objects.equals(this.message, updateAssetGroupResponseExceptionsInner.message) &&
        Objects.equals(this.assetGroupId, updateAssetGroupResponseExceptionsInner.assetGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, assetGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetGroupResponseExceptionsInner {\n");
    
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

