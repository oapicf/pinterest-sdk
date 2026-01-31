package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelUpdateRequestLabelsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LabelUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LabelUpdateRequest   {
  private @Valid List<@Valid LabelUpdateRequestLabelsInner> labels = new ArrayList<>();

  public LabelUpdateRequest() {
  }

  @JsonCreator
  public LabelUpdateRequest(
    @JsonProperty(required = true, value = "labels") List<@Valid LabelUpdateRequestLabelsInner> labels
  ) {
    this.labels = labels;
  }

  /**
   * Labels that you are applying to the campaign.
   **/
  public LabelUpdateRequest labels(List<@Valid LabelUpdateRequestLabelsInner> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")
  @JsonProperty(required = true, value = "labels")
  @NotNull @Valid public List<@Valid LabelUpdateRequestLabelsInner> getLabels() {
    return labels;
  }

  @JsonProperty(required = true, value = "labels")
  public void setLabels(List<@Valid LabelUpdateRequestLabelsInner> labels) {
    this.labels = labels;
  }

  public LabelUpdateRequest addLabelsItem(LabelUpdateRequestLabelsInner labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }

    this.labels.add(labelsItem);
    return this;
  }

  public LabelUpdateRequest removeLabelsItem(LabelUpdateRequestLabelsInner labelsItem) {
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
    LabelUpdateRequest labelUpdateRequest = (LabelUpdateRequest) o;
    return Objects.equals(this.labels, labelUpdateRequest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelUpdateRequest {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

