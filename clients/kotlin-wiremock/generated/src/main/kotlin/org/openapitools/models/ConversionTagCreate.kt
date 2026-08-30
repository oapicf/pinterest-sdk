@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionTagCreate(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("aem_db_enabled")
    val aemDbEnabled: kotlin.Boolean? = false,

    @field:JsonProperty("aem_enabled")
    val aemEnabled: kotlin.Boolean? = false,

    @field:JsonProperty("aem_external_id_enabled")
    val aemExternalIdEnabled: kotlin.Boolean? = false,

    @field:JsonProperty("aem_fnln_enabled")
    val aemFnlnEnabled: kotlin.Boolean? = false,

    @field:JsonProperty("aem_ge_enabled")
    val aemGeEnabled: kotlin.Boolean? = false,

    @field:JsonProperty("aem_loc_enabled")
    val aemLocEnabled: kotlin.Boolean? = false,

    @field:JsonProperty("aem_ph_enabled")
    val aemPhEnabled: kotlin.Boolean? = false,

    @field:JsonProperty("md_frequency")
    val mdFrequency: java.math.BigDecimal? = 1,

)
