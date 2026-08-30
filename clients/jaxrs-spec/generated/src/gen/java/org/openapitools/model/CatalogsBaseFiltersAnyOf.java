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



@JsonTypeName("CatalogsBaseFiltersAnyOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsBaseFiltersAnyOf   {
  private @Valid List<CatalogsBaseFilterKeys> anyOf = new ArrayList<>();

  public CatalogsBaseFiltersAnyOf() {
  }

  @JsonCreator
  public CatalogsBaseFiltersAnyOf(
    @JsonProperty(required = true, value = "any_of") List<@Valid CatalogsBaseFilterKeys> anyOf
  ) {
    this.anyOf = anyOf;
  }

  /**
   **/
  public CatalogsBaseFiltersAnyOf anyOf(List<CatalogsBaseFilterKeys> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "any_of")
  @NotNull @Valid  @Size(min=1)public List<@Valid CatalogsBaseFilterKeys> getAnyOf() {
    return anyOf;
  }

  @JsonProperty(required = true, value = "any_of")
  public void setAnyOf(List<CatalogsBaseFilterKeys> anyOf) {
    this.anyOf = anyOf;
  }

  public CatalogsBaseFiltersAnyOf addAnyOfItem(CatalogsBaseFilterKeys anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<>();
    }

    this.anyOf.add(anyOfItem);
    return this;
  }

  public CatalogsBaseFiltersAnyOf removeAnyOfItem(CatalogsBaseFilterKeys anyOfItem) {
    if (anyOfItem != null && this.anyOf != null) {
      this.anyOf.remove(anyOfItem);
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
    CatalogsBaseFiltersAnyOf catalogsBaseFiltersAnyOf = (CatalogsBaseFiltersAnyOf) o;
    return Objects.equals(this.anyOf, catalogsBaseFiltersAnyOf.anyOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsBaseFiltersAnyOf {\n");
    
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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
