@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SSIOAccountItem(
    @field:JsonProperty("addresses")
    val addresses: kotlin.collections.List<SSIOAccountAddress>? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("io_terms")
    val ioTerms: kotlin.String? = null,

    @field:JsonProperty("io_terms_id")
    val ioTermsId: kotlin.String? = null,

    @field:JsonProperty("io_type")
    val ioType: kotlin.String? = null,

    @field:JsonProperty("row_terms")
    val rowTerms: kotlin.String? = null,

    @field:JsonProperty("row_terms_id")
    val rowTermsId: kotlin.String? = null,

    @field:JsonProperty("us_terms")
    val usTerms: kotlin.String? = null,

    @field:JsonProperty("us_terms_id")
    val usTermsId: kotlin.String? = null,

)
