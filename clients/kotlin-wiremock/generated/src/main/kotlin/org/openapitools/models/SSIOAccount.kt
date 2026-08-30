@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SSIOAccount(
    @field:JsonProperty("billto_infos")
    val billtoInfos: kotlin.collections.List<SSIOAccountItem>? = null,

    @field:JsonProperty("can_edit")
    val canEdit: kotlin.Boolean? = null,

    @field:JsonProperty("currency")
    val currency: kotlin.String? = null,

    @field:JsonProperty("eligible")
    val eligible: kotlin.Boolean? = null,

    @field:JsonProperty("error")
    val error: kotlin.String? = null,

    @field:JsonProperty("pmp_names")
    val pmpNames: kotlin.collections.List<SSIOAccountPMPName>? = null,

)
