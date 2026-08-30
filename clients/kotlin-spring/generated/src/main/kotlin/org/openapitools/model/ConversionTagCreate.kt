package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Resource create operation model.
 * @param name Conversion tag name.
 * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemExternalIdEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param mdFrequency Metadata ingestion frequency.
 */
data class ConversionTagCreate(

    @Schema(example = "download_picture", required = true, description = "Conversion tag name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(description = "Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
    @param:JsonProperty("aem_db_enabled")
    @get:JsonProperty("aem_db_enabled") val aemDbEnabled: kotlin.Boolean? = false,

    @Schema(description = "Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
    @param:JsonProperty("aem_enabled")
    @get:JsonProperty("aem_enabled") val aemEnabled: kotlin.Boolean? = false,

    @Schema(description = "Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
    @param:JsonProperty("aem_external_id_enabled")
    @get:JsonProperty("aem_external_id_enabled") val aemExternalIdEnabled: kotlin.Boolean? = false,

    @Schema(description = "Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
    @param:JsonProperty("aem_fnln_enabled")
    @get:JsonProperty("aem_fnln_enabled") val aemFnlnEnabled: kotlin.Boolean? = false,

    @Schema(description = "Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
    @param:JsonProperty("aem_ge_enabled")
    @get:JsonProperty("aem_ge_enabled") val aemGeEnabled: kotlin.Boolean? = false,

    @Schema(description = "Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
    @param:JsonProperty("aem_loc_enabled")
    @get:JsonProperty("aem_loc_enabled") val aemLocEnabled: kotlin.Boolean? = false,

    @Schema(description = "Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
    @param:JsonProperty("aem_ph_enabled")
    @get:JsonProperty("aem_ph_enabled") val aemPhEnabled: kotlin.Boolean? = false,

    @Schema(example = "0.6", description = "Metadata ingestion frequency.")
    @param:JsonProperty("md_frequency")
    @get:JsonProperty("md_frequency") val mdFrequency: java.math.BigDecimal? = java.math.BigDecimal("1")
) {

}

