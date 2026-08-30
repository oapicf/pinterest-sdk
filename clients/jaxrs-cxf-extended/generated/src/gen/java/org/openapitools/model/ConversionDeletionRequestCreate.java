package org.openapitools.model;

import org.openapitools.model.ConversionDeletionRequestTargets;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class ConversionDeletionRequestCreate  {
  
 /**
  * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
  */
  @ApiModelProperty(required = true, value = "Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.")
  @Valid
  private ConversionDeletionRequestTargets deletionTargets;
 /**
  * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
  * @return deletionTargets
  */
  @JsonProperty("deletion_targets")
  @NotNull
  public ConversionDeletionRequestTargets getDeletionTargets() {
    return deletionTargets;
  }

  /**
   * Sets the <code>deletionTargets</code> property.
   */
 public void setDeletionTargets(ConversionDeletionRequestTargets deletionTargets) {
    this.deletionTargets = deletionTargets;
  }

  /**
   * Sets the <code>deletionTargets</code> property.
   */
  public ConversionDeletionRequestCreate deletionTargets(ConversionDeletionRequestTargets deletionTargets) {
    this.deletionTargets = deletionTargets;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

