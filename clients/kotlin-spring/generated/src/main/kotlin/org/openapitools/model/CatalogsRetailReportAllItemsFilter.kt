package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 * @param reportType 
 * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
 * @param productGroupId Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
 */
data class CatalogsRetailReportAllItemsFilter(

    @Schema(required = true, description = "")
    @param:JsonProperty("report_type")
    @get:JsonProperty("report_type", required = true) override val reportType: CatalogsRetailReportAllItemsFilter.ReportType = kotlin.String.ALL_ITEMS,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Unique identifier of a catalog. If not given, oldest catalog will be used")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_id")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_group_id")
    @get:JsonProperty("product_group_id") val productGroupId: kotlin.String? = null
) : CatalogsRetailReportParametersReport {

    /**
    * 
    * Values: ALL_ITEMS
    */
    enum class ReportType(@get:JsonValue val value: kotlin.String) {

        ALL_ITEMS("ALL_ITEMS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ReportType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ReportType'")
            }
        }
    }

}

