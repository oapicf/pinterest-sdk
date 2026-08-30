package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.NullableLabelStatus;
import org.openapitools.vertxweb.server.model.NullableLabelType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabelErrorData   {
  
  private String id;
  private NullableLabelType labelType;
  private NullableLabelStatus status;
  private String value;

  public LabelErrorData () {

  }

  public LabelErrorData (String id, NullableLabelType labelType, NullableLabelStatus status, String value) {
    this.id = id;
    this.labelType = labelType;
    this.status = status;
    this.value = value;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("label_type")
  public NullableLabelType getLabelType() {
    return labelType;
  }
  public void setLabelType(NullableLabelType labelType) {
    this.labelType = labelType;
  }

    
  @JsonProperty("status")
  public NullableLabelStatus getStatus() {
    return status;
  }
  public void setStatus(NullableLabelStatus status) {
    this.status = status;
  }

    
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelErrorData labelErrorData = (LabelErrorData) o;
    return Objects.equals(id, labelErrorData.id) &&
        Objects.equals(labelType, labelErrorData.labelType) &&
        Objects.equals(status, labelErrorData.status) &&
        Objects.equals(value, labelErrorData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labelType, status, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelErrorData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
