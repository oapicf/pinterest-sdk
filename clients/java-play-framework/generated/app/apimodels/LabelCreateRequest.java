package apimodels;

import apimodels.LabelCreateRequestLabelsInner;
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
 * LabelCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LabelCreateRequest   {
  @JsonProperty("labels")
  @NotNull
@Valid

  private List<@Valid LabelCreateRequestLabelsInner> labels = new ArrayList<>();

  @JsonProperty("parent_id")
  @NotNull
@Pattern(regexp="^[C]?\\d+$")

  private String parentId;

  public LabelCreateRequest labels(List<@Valid LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
    return this;
  }

  public LabelCreateRequest addLabelsItem(LabelCreateRequestLabelsInner labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels that you are applying to the campaign.
   * @return labels
  **/
  public List<@Valid LabelCreateRequestLabelsInner> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
  }

  public LabelCreateRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   * @return parentId
  **/
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelCreateRequest labelCreateRequest = (LabelCreateRequest) o;
    return Objects.equals(labels, labelCreateRequest.labels) &&
        Objects.equals(parentId, labelCreateRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, parentId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelCreateRequest {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

