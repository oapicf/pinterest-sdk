package org.openapitools.server.api.model

import org.openapitools.server.api.model.SSIOAccountItem
import org.openapitools.server.api.model.SSIOAccountPMPName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SSIOAccount(
    /** An array of Salesforce account information that includes address, io terms, etc. */
    val billtoInfos: kotlin.collections.List<SSIOAccountItem>? = null,
    /** Advertiser eligible to update order lines */
    val canEdit: kotlin.Boolean? = null,
    val currency: kotlin.String? = null,
    /** Advertiser eligible to create order lines */
    val eligible: kotlin.Boolean? = null,
    /** Error indicator from Salesforce which could be \&quot;No Error\&quot; */
    val error: kotlin.String? = null,
    val pmpNames: kotlin.collections.List<SSIOAccountPMPName>? = null
)
