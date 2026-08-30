package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsRetailReportStatsParametersReport;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Parameters for retail report
 */
public class CatalogsRetailReportStatsParameters   {


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
        public static CatalogTypeEnum fromValue(String text) {
            for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private CatalogTypeEnum catalogType;
    private CatalogsRetailReportStatsParametersReport report;

    /**
     * Default constructor.
     */
    public CatalogsRetailReportStatsParameters() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsRetailReportStatsParameters.
     *
     * @param catalogType catalogType
     * @param report report
     */
    public CatalogsRetailReportStatsParameters(
        CatalogTypeEnum catalogType, 
        CatalogsRetailReportStatsParametersReport report
    ) {
        this.catalogType = catalogType;
        this.report = report;
    }



    /**
     * Get catalogType
     * @return catalogType
     */
    public CatalogTypeEnum getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
    }

    /**
     * Get report
     * @return report
     */
    public CatalogsRetailReportStatsParametersReport getReport() {
        return report;
    }

    public void setReport(CatalogsRetailReportStatsParametersReport report) {
        this.report = report;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsRetailReportStatsParameters {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    report: ").append(toIndentedString(report)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

