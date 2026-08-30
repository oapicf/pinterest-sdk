package apimodels;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProductGroupAnalyticsItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProductGroupAnalyticsItems   {
  @JsonProperty("DATE")
  @Valid

  private LocalDate DATE;

  @JsonProperty("PRODUCT_GROUP_ID")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String PRODUCT_GROUP_ID;

  public ProductGroupAnalyticsItems DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

   /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
  **/
  public LocalDate getDATE() {
    return DATE;
  }

  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  public ProductGroupAnalyticsItems PRODUCT_GROUP_ID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
    return this;
  }

   /**
   * The ID of the product group that this metrics belongs to.
   * @return PRODUCT_GROUP_ID
  **/
  public String getPRODUCTGROUPID() {
    return PRODUCT_GROUP_ID;
  }

  public void setPRODUCTGROUPID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroupAnalyticsItems productGroupAnalyticsItems = (ProductGroupAnalyticsItems) o;
    return Objects.equals(DATE, productGroupAnalyticsItems.DATE) &&
        Objects.equals(PRODUCT_GROUP_ID, productGroupAnalyticsItems.PRODUCT_GROUP_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE, PRODUCT_GROUP_ID);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupAnalyticsItems {\n");
    
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("    PRODUCT_GROUP_ID: ").append(toIndentedString(PRODUCT_GROUP_ID)).append("\n");
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

