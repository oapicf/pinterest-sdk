package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestEPIKTargets   {
  @JsonProperty("epiks")
  private List<String> epiks = new ArrayList<>();

  /**
   * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
   **/
  public ConversionDeletionRequestEPIKTargets epiks(List<String> epiks) {
    this.epiks = epiks;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).")
  @JsonProperty("epiks")
  public List<String> getEpiks() {
    return epiks;
  }
  public void setEpiks(List<String> epiks) {
    this.epiks = epiks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionDeletionRequestEPIKTargets conversionDeletionRequestEPIKTargets = (ConversionDeletionRequestEPIKTargets) o;
    return Objects.equals(epiks, conversionDeletionRequestEPIKTargets.epiks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epiks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDeletionRequestEPIKTargets {\n");
    
    sb.append("    epiks: ").append(toIndentedString(epiks)).append("\n");
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

