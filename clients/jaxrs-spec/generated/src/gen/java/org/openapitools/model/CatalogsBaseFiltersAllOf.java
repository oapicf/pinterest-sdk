package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsBaseFilterKeys;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CatalogsBaseFiltersAllOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsBaseFiltersAllOf   {
  private @Valid List<CatalogsBaseFilterKeys> allOf = new ArrayList<>();

  public CatalogsBaseFiltersAllOf() {
  }

  @JsonCreator
  public CatalogsBaseFiltersAllOf(
    @JsonProperty(required = true, value = "all_of") List<@Valid CatalogsBaseFilterKeys> allOf
  ) {
    this.allOf = allOf;
  }

  /**
   **/
  public CatalogsBaseFiltersAllOf allOf(List<CatalogsBaseFilterKeys> allOf) {
    this.allOf = allOf;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "all_of")
  @NotNull @Valid  @Size(min=1)public List<@Valid CatalogsBaseFilterKeys> getAllOf() {
    return allOf;
  }

  @JsonProperty(required = true, value = "all_of")
  public void setAllOf(List<CatalogsBaseFilterKeys> allOf) {
    this.allOf = allOf;
  }

  public CatalogsBaseFiltersAllOf addAllOfItem(CatalogsBaseFilterKeys allOfItem) {
    if (this.allOf == null) {
      this.allOf = new ArrayList<>();
    }

    this.allOf.add(allOfItem);
    return this;
  }

  public CatalogsBaseFiltersAllOf removeAllOfItem(CatalogsBaseFilterKeys allOfItem) {
    if (allOfItem != null && this.allOf != null) {
      this.allOf.remove(allOfItem);
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
    CatalogsBaseFiltersAllOf catalogsBaseFiltersAllOf = (CatalogsBaseFiltersAllOf) o;
    return Objects.equals(this.allOf, catalogsBaseFiltersAllOf.allOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsBaseFiltersAllOf {\n");
    
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
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
