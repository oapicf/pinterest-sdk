package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionDeletionRequestEPIKTargets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionDeletionRequestEPIKTargets   {
  @JsonProperty("epiks")
  @NotNull
@Size(min=1)

  private List<String> epiks = new ArrayList<>();

  public ConversionDeletionRequestEPIKTargets epiks(List<String> epiks) {
    this.epiks = epiks;
    return this;
  }

  public ConversionDeletionRequestEPIKTargets addEpiksItem(String epiksItem) {
    if (this.epiks == null) {
      this.epiks = new ArrayList<>();
    }
    this.epiks.add(epiksItem);
    return this;
  }

   /**
   * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
   * @return epiks
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

