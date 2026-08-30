package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ConversionDeletionRequestEPIKTargets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestEPIKTargets   {
  private @Valid List<String> epiks = new ArrayList<>();

  public ConversionDeletionRequestEPIKTargets() {
  }

  @JsonCreator
  public ConversionDeletionRequestEPIKTargets(
    @JsonProperty(required = true, value = "epiks") List<String> epiks
  ) {
    this.epiks = epiks;
  }

  /**
   * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
   **/
  public ConversionDeletionRequestEPIKTargets epiks(List<String> epiks) {
    this.epiks = epiks;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).")
  @JsonProperty(required = true, value = "epiks")
  @NotNull  @Size(min=1)public List<String> getEpiks() {
    return epiks;
  }

  @JsonProperty(required = true, value = "epiks")
  public void setEpiks(List<String> epiks) {
    this.epiks = epiks;
  }

  public ConversionDeletionRequestEPIKTargets addEpiksItem(String epiksItem) {
    if (this.epiks == null) {
      this.epiks = new ArrayList<>();
    }

    this.epiks.add(epiksItem);
    return this;
  }

  public ConversionDeletionRequestEPIKTargets removeEpiksItem(String epiksItem) {
    if (epiksItem != null && this.epiks != null) {
      this.epiks.remove(epiksItem);
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
    ConversionDeletionRequestEPIKTargets conversionDeletionRequestEPIKTargets = (ConversionDeletionRequestEPIKTargets) o;
    return Objects.equals(this.epiks, conversionDeletionRequestEPIKTargets.epiks);
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
