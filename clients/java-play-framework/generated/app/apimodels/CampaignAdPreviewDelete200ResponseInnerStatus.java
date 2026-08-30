package apimodels;

import apimodels.PinterestLibError;
import apimodels.PinterestLibStatus204;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CampaignAdPreviewDelete200ResponseInnerStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignAdPreviewDelete200ResponseInnerStatus   {
  /**
   * Gets or Sets statusCode
   */
  public enum StatusCodeEnum {
    NUMBER_204(new BigDecimal("204"));

    private final BigDecimal value;

    StatusCodeEnum(BigDecimal value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusCodeEnum fromValue(BigDecimal value) {
      for (StatusCodeEnum b : StatusCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("statusCode")
  @NotNull
@Valid

  private StatusCodeEnum statusCode;

  @JsonProperty("code")
  @NotNull

  private Integer code;

  @JsonProperty("message")
  @NotNull

  private String message;

  public CampaignAdPreviewDelete200ResponseInnerStatus statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  public CampaignAdPreviewDelete200ResponseInnerStatus code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CampaignAdPreviewDelete200ResponseInnerStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
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
    CampaignAdPreviewDelete200ResponseInnerStatus campaignAdPreviewDelete200ResponseInnerStatus = (CampaignAdPreviewDelete200ResponseInnerStatus) o;
    return Objects.equals(statusCode, campaignAdPreviewDelete200ResponseInnerStatus.statusCode) &&
        Objects.equals(code, campaignAdPreviewDelete200ResponseInnerStatus.code) &&
        Objects.equals(message, campaignAdPreviewDelete200ResponseInnerStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, code, message);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewDelete200ResponseInnerStatus {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

