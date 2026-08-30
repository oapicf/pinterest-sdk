package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityLabel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("EntityLabelError")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EntityLabelError   {
  private EntityLabel data;
  private @Valid List<String> errorMessages = new ArrayList<>();

  public EntityLabelError() {
  }

  /**
   **/
  public EntityLabelError data(EntityLabel data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  @Valid public EntityLabel getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(EntityLabel data) {
    this.data = data;
  }

  /**
   **/
  public EntityLabelError errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("error_messages")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  @JsonProperty("error_messages")
  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public EntityLabelError addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<>();
    }

    this.errorMessages.add(errorMessagesItem);
    return this;
  }

  public EntityLabelError removeErrorMessagesItem(String errorMessagesItem) {
    if (errorMessagesItem != null && this.errorMessages != null) {
      this.errorMessages.remove(errorMessagesItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityLabelError entityLabelError = (EntityLabelError) o;
    return Objects.equals(this.data, entityLabelError.data) &&
        Objects.equals(this.errorMessages, entityLabelError.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityLabelError {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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
