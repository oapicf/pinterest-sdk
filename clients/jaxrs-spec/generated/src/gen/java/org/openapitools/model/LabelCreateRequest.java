package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelCreateItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LabelCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelCreateRequest   {
  private @Valid List<@Valid LabelCreateItem> labels = new ArrayList<>();

  public LabelCreateRequest() {
  }

  @JsonCreator
  public LabelCreateRequest(
    @JsonProperty(required = true, value = "labels") List<@Valid LabelCreateItem> labels
  ) {
    this.labels = labels;
  }

  /**
   * Labels that you are applying to the campaign.
   **/
  public LabelCreateRequest labels(List<@Valid LabelCreateItem> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")
  @JsonProperty(required = true, value = "labels")
  @NotNull @Valid public List<@Valid LabelCreateItem> getLabels() {
    return labels;
  }

  @JsonProperty(required = true, value = "labels")
  public void setLabels(List<@Valid LabelCreateItem> labels) {
    this.labels = labels;
  }

  public LabelCreateRequest addLabelsItem(LabelCreateItem labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }

    this.labels.add(labelsItem);
    return this;
  }

  public LabelCreateRequest removeLabelsItem(LabelCreateItem labelsItem) {
    if (labelsItem != null && this.labels != null) {
      this.labels.remove(labelsItem);
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
    LabelCreateRequest labelCreateRequest = (LabelCreateRequest) o;
    return Objects.equals(this.labels, labelCreateRequest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelCreateRequest {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
