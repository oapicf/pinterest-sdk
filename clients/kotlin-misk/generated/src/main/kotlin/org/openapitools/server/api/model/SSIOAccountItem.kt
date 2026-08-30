package org.openapitools.server.api.model

import org.openapitools.server.api.model.SSIOAccountAddress
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SSIOAccountItem(
    /** Address information that is associated with this account. */
    val addresses: kotlin.collections.List<SSIOAccountAddress>? = null,
    /** Salesforce id for billto_info */
    val id: kotlin.String? = null,
    /** Salesforce text for IO Terms and Conditions */
    val ioTerms: kotlin.String? = null,
    /** Salesforce id for IO Terms and Conditions */
    val ioTermsId: kotlin.String? = null,
    /** Insertion Order Type - Pinterest Paper or Agency Paper */
    val ioType: kotlin.String? = null,
    /** Salesforce text for Rest of the World Terms and Conditions */
    val rowTerms: kotlin.String? = null,
    /** Salesforce id for Rest of the World Terms and Conditions */
    val rowTermsId: kotlin.String? = null,
    /** Salesforce text for US Terms and Conditions */
    val usTerms: kotlin.String? = null,
    /** Salesforce id for US Terms and Conditions */
    val usTermsId: kotlin.String? = null
)
