package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Related Keyword information of the editorial article
 */

@Schema(name = "KeywordInfo", description = "Related Keyword information of the editorial article")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordInfo {

  private String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal pctGrowthMom;

  public KeywordInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public KeywordInfo(String name) {
    this.name = name;
  }

  public KeywordInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Keyword Name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Keyword Name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public KeywordInfo pctGrowthMom(@Nullable BigDecimal pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
    return this;
  }

  /**
   * MoM growth as a percentage, if there is no growth rate, this field is not present
   * @return pctGrowthMom
   */
  @Valid 
  @Schema(name = "pct_growth_mom", description = "MoM growth as a percentage, if there is no growth rate, this field is not present", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pct_growth_mom")
  public @Nullable BigDecimal getPctGrowthMom() {
    return pctGrowthMom;
  }

  @JsonProperty("pct_growth_mom")
  public void setPctGrowthMom(@Nullable BigDecimal pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordInfo keywordInfo = (KeywordInfo) o;
    return Objects.equals(this.name, keywordInfo.name) &&
        Objects.equals(this.pctGrowthMom, keywordInfo.pctGrowthMom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pctGrowthMom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pctGrowthMom: ").append(toIndentedString(pctGrowthMom)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

