package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConversionDeletionRequestTargets;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Resource create operation model.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestCreate   {
  
  private ConversionDeletionRequestTargets deletionTargets;

  /**
   * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
   **/
  
  @ApiModelProperty(required = true, value = "Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.")
  @JsonProperty("deletion_targets")
  @NotNull
  @Valid
  public ConversionDeletionRequestTargets getDeletionTargets() {
    return deletionTargets;
  }
  public void setDeletionTargets(ConversionDeletionRequestTargets deletionTargets) {
    this.deletionTargets = deletionTargets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionDeletionRequestCreate conversionDeletionRequestCreate = (ConversionDeletionRequestCreate) o;
    return Objects.equals(this.deletionTargets, conversionDeletionRequestCreate.deletionTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletionTargets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDeletionRequestCreate {\n");
    
    sb.append("    deletionTargets: ").append(toIndentedString(deletionTargets)).append("\n");
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

