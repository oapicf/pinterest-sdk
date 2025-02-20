/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param id Billing ID.
 * @param cardType Type of the card.
 * @param status Status of the billing.
 * @param advertiserId Advertiser ID of the billing.
 * @param paymentMethodBrand Brand of the payment method.
 */
object BillingProfilesResponses : BaseTable<BillingProfilesResponse>("BillingProfilesResponse") {
    val id = text("id") /* null */ /* Billing ID. */
    val cardType = text("card_type").transform({ BillingProfilesResponse.CardType.valueOf(it ?: "UNKNOWN") }, { it.value }) /* null */ /* Type of the card. */

    val status = text("status").transform({ BillingProfilesResponse.Status.valueOf(it ?: "UNSPECIFIED") }, { it.value }) /* null */ /* Status of the billing. */

    val advertiserId = text("advertiser_id") /* null */ /* Advertiser ID of the billing. */
    val paymentMethodBrand = text("payment_method_brand").transform({ BillingProfilesResponse.PaymentMethodBrand.valueOf(it ?: "UNKNOWN") }, { it.value }) /* null */ /* Brand of the payment method. */


    /**
     * Create an entity of type BillingProfilesResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = BillingProfilesResponse(
        id = row[id]  /* kotlin.String? */ /* Billing ID. */,
        cardType = row[cardType]  /* kotlin.String? */ /* Type of the card. */,
        status = row[status]  /* kotlin.String? */ /* Status of the billing. */,
        advertiserId = row[advertiserId]  /* kotlin.String? */ /* Advertiser ID of the billing. */,
        paymentMethodBrand = row[paymentMethodBrand]  /* kotlin.String? */ /* Brand of the payment method. */
    )

    /**
    * Assign all the columns from the entity of type BillingProfilesResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = BillingProfilesResponse()
    * database.update(BillingProfilesResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: BillingProfilesResponse) {
        this.apply {
            set(BillingProfilesResponses.id, entity.id)
            set(BillingProfilesResponses.cardType, entity.cardType)
            set(BillingProfilesResponses.status, entity.status)
            set(BillingProfilesResponses.advertiserId, entity.advertiserId)
            set(BillingProfilesResponses.paymentMethodBrand, entity.paymentMethodBrand)
        }
    }

}


