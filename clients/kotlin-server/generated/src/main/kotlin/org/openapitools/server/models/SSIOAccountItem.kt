/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.SSIOAccountAddress

/**
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
data class SSIOAccountItem(
    /* Salesforce id for billto_info */
    val id: kotlin.String? = null,
    /* Salesforce id for IO Terms and Conditions */
    val ioTermsId: kotlin.String? = null,
    /* Salesforce text for IO Terms and Conditions */
    val ioTerms: kotlin.String? = null,
    /* Salesforce id for US Terms and Conditions */
    val usTermsId: kotlin.String? = null,
    /* Salesforce text for US Terms and Conditions */
    val usTerms: kotlin.String? = null,
    /* Salesforce id for Rest of the World Terms and Conditions */
    val rowTermsId: kotlin.String? = null,
    /* Salesforce text for Rest of the World Terms and Conditions */
    val rowTerms: kotlin.String? = null,
    /* Insertion Order Type - Pinterest Paper or Agency Paper */
    val ioType: kotlin.String? = null,
    /* Address information that is associated with this account. */
    val addresses: kotlin.collections.List<SSIOAccountAddress>? = null
) 
