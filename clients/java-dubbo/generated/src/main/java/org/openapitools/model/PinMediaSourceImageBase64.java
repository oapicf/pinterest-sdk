package org.openapitools.model;

import org.openapitools.model.ContentType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Image Base64-based media source.
 */
public class PinMediaSourceImageBase64 implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("content_type")
  private ContentType contentType;

  @JsonProperty("data")
  private String data;

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   */
  @JsonProperty("is_standard")
  private Boolean isStandard = true;

  /**
   * The source type of the media.
   */
  @JsonProperty("source_type")
  private String sourceType;

  /**
   * 
   * @return contentType
   */
  public ContentType getContentType() {
    return contentType;
  }

  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  /**
   * 
   * @return data
   */
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   * @return isStandard
   */
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  /**
   * The source type of the media.
   * @return sourceType
   */
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourceImageBase64 pinMediaSourceImageBase64 = (PinMediaSourceImageBase64) o;
    return Objects.equals(this.contentType, pinMediaSourceImageBase64.contentType) &&
        Objects.equals(this.data, pinMediaSourceImageBase64.data) &&
        Objects.equals(this.isStandard, pinMediaSourceImageBase64.isStandard) &&
        Objects.equals(this.sourceType, pinMediaSourceImageBase64.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, data, isStandard, sourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImageBase64 {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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
