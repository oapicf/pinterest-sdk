package org.openapitools.model;

import org.openapitools.model.ConversionDeletionRequestTargets;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class ConversionDeletionRequestCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
   */
  @JsonProperty("deletion_targets")
  private ConversionDeletionRequestTargets deletionTargets;

  /**
   * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
   * @return deletionTargets
   */
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
