/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.SSIOAccountAddress

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Salesforce id for billto_info
 * @param ioTermsId Salesforce id for IO Terms and Conditions
 * @param ioTerms Salesforce text for IO Terms and Conditions
 * @param usTermsId Salesforce id for US Terms and Conditions
 * @param usTerms Salesforce text for US Terms and Conditions
 * @param rowTermsId Salesforce id for Rest of the World Terms and Conditions
 * @param rowTerms Salesforce text for Rest of the World Terms and Conditions
 * @param ioType Insertion Order Type - Pinterest Paper or Agency Paper
 * @param addresses Address information that is associated with this account.
 */


data class SSIOAccountItem (

    /* Salesforce id for billto_info */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Salesforce id for IO Terms and Conditions */
    @Json(name = "io_terms_id")
    val ioTermsId: kotlin.String? = null,

    /* Salesforce text for IO Terms and Conditions */
    @Json(name = "io_terms")
    val ioTerms: kotlin.String? = null,

    /* Salesforce id for US Terms and Conditions */
    @Json(name = "us_terms_id")
    val usTermsId: kotlin.String? = null,

    /* Salesforce text for US Terms and Conditions */
    @Json(name = "us_terms")
    val usTerms: kotlin.String? = null,

    /* Salesforce id for Rest of the World Terms and Conditions */
    @Json(name = "row_terms_id")
    val rowTermsId: kotlin.String? = null,

    /* Salesforce text for Rest of the World Terms and Conditions */
    @Json(name = "row_terms")
    val rowTerms: kotlin.String? = null,

    /* Insertion Order Type - Pinterest Paper or Agency Paper */
    @Json(name = "io_type")
    val ioType: kotlin.String? = null,

    /* Address information that is associated with this account. */
    @Json(name = "addresses")
    val addresses: kotlin.collections.List<SSIOAccountAddress>? = null

)
