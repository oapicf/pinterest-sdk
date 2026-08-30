package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The resource was successfully deleted.
 */

@Schema(name = "Pinterest.Lib.Status204", description = "The resource was successfully deleted.")
@JsonTypeName("Pinterest.Lib.Status204")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinterestLibStatus204 implements CampaignAdPreviewDelete200ResponseInnerStatus {

  /**
   * Gets or Sets statusCode
   */
  public enum StatusCodeEnum {
    NUMBER_204(new BigDecimal("204"));

    private final BigDecimal value;

    StatusCodeEnum(BigDecimal value) {
      this.value = value;
    }

    @JsonValue
    public BigDecimal getValue() {
      return value;
    }

    @Override
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

  private StatusCodeEnum statusCode;

  public PinterestLibStatus204() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinterestLibStatus204(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  public PinterestLibStatus204 statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
   */
  @NotNull @Valid 
  @Schema(name = "statusCode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statusCode")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinterestLibStatus204 pinterestLibStatus204 = (PinterestLibStatus204) o;
    return Objects.equals(this.statusCode, pinterestLibStatus204.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinterestLibStatus204 {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

