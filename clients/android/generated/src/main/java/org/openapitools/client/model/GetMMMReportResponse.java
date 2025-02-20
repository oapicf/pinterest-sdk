/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import org.openapitools.client.model.GetMMMReportResponseData;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetMMMReportResponse {
  
  @SerializedName("code")
  private BigDecimal code = null;
  @SerializedName("data")
  private GetMMMReportResponseData data = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("status")
  private String status = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCode() {
    return code;
  }
  public void setCode(BigDecimal code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public GetMMMReportResponseData getData() {
    return data;
  }
  public void setData(GetMMMReportResponseData data) {
    this.data = data;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMMMReportResponse getMMMReportResponse = (GetMMMReportResponse) o;
    return (this.code == null ? getMMMReportResponse.code == null : this.code.equals(getMMMReportResponse.code)) &&
        (this.data == null ? getMMMReportResponse.data == null : this.data.equals(getMMMReportResponse.data)) &&
        (this.message == null ? getMMMReportResponse.message == null : this.message.equals(getMMMReportResponse.message)) &&
        (this.status == null ? getMMMReportResponse.status == null : this.status.equals(getMMMReportResponse.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMMMReportResponse {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
