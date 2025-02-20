/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.model.CatalogsHotelReportParametersReport;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Parameters for retail report
 */
@JsonPropertyOrder({
  CatalogsRetailReportParameters.JSON_PROPERTY_CATALOG_TYPE,
  CatalogsRetailReportParameters.JSON_PROPERTY_REPORT
})
@JsonTypeName("CatalogsRetailReportParameters")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsRetailReportParameters {
    /**
     * Gets or Sets catalogType
     */
    public enum CatalogTypeEnum {
        RETAIL("RETAIL");

        private String value;

        CatalogTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CatalogTypeEnum fromValue(String value) {
            for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_CATALOG_TYPE = "catalog_type";
    private CatalogTypeEnum catalogType;

    public static final String JSON_PROPERTY_REPORT = "report";
    private CatalogsHotelReportParametersReport report;

    public CatalogsRetailReportParameters(CatalogTypeEnum catalogType, CatalogsHotelReportParametersReport report) {
        this.catalogType = catalogType;
        this.report = report;
    }

    public CatalogsRetailReportParameters catalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
        return this;
    }

    /**
     * Get catalogType
     * @return catalogType
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogTypeEnum getCatalogType() {
        return catalogType;
    }

    @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCatalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
    }

    public CatalogsRetailReportParameters report(CatalogsHotelReportParametersReport report) {
        this.report = report;
        return this;
    }

    /**
     * Get report
     * @return report
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_REPORT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsHotelReportParametersReport getReport() {
        return report;
    }

    @JsonProperty(JSON_PROPERTY_REPORT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setReport(CatalogsHotelReportParametersReport report) {
        this.report = report;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsRetailReportParameters catalogsRetailReportParameters = (CatalogsRetailReportParameters) o;
        return Objects.equals(this.catalogType, catalogsRetailReportParameters.catalogType) &&
            Objects.equals(this.report, catalogsRetailReportParameters.report);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogType, report);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsRetailReportParameters {\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    report: ").append(toIndentedString(report)).append("\n");
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

