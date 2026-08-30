package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * Resource create or update operation model.
 * @param adsManagerOrderLineId Ads manager OrderLineId
 * @param agencyLink URL link for agency
 * @param billingContactEmail The billing contact email
 * @param billingContactFirstname The billing contact first name
 * @param billingContactLastname The billing contact last name
 * @param budgetAmount If Budget order line, the budget amount.
 * @param endDate End date of time period. Format: YYYY-MM-DD
 * @param mediaContactEmail The media contact email
 * @param mediaContactFirstname The media contact first name
 * @param mediaContactLastname The media contact last name
 * @param oracleLineId LineId in the Oracle DB
 * @param poNumber The po number
 * @param salesforceOrderId OrderId in SFDC
 * @param salesforceOrderLineId OrderLineId in SFDC
 * @param startDate Starting date of time period. Format: YYYY-MM-DD
 * @param userEmail The email of user submitting the insertion order
 */
data class SSIOInsertionOrderUpdate(

    @Schema(description = "Ads manager OrderLineId")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ads_manager_order_line_id")
    @get:JsonProperty("ads_manager_order_line_id") val adsManagerOrderLineId: kotlin.String? = null,

    @Schema(description = "URL link for agency")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("agency_link")
    @get:JsonProperty("agency_link") val agencyLink: kotlin.String? = null,

    @Schema(description = "The billing contact email")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("billing_contact_email")
    @get:JsonProperty("billing_contact_email") val billingContactEmail: kotlin.String? = null,

    @Schema(description = "The billing contact first name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("billing_contact_firstname")
    @get:JsonProperty("billing_contact_firstname") val billingContactFirstname: kotlin.String? = null,

    @Schema(description = "The billing contact last name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("billing_contact_lastname")
    @get:JsonProperty("billing_contact_lastname") val billingContactLastname: kotlin.String? = null,

    @Schema(description = "If Budget order line, the budget amount.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("budget_amount")
    @get:JsonProperty("budget_amount") val budgetAmount: kotlin.Double? = null,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(description = "End date of time period. Format: YYYY-MM-DD")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("end_date")
    @get:JsonProperty("end_date") val endDate: kotlin.String? = null,

    @Schema(description = "The media contact email")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("media_contact_email")
    @get:JsonProperty("media_contact_email") val mediaContactEmail: kotlin.String? = null,

    @Schema(description = "The media contact first name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("media_contact_firstname")
    @get:JsonProperty("media_contact_firstname") val mediaContactFirstname: kotlin.String? = null,

    @Schema(description = "The media contact last name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("media_contact_lastname")
    @get:JsonProperty("media_contact_lastname") val mediaContactLastname: kotlin.String? = null,

    @Schema(description = "LineId in the Oracle DB")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oracle_line_id")
    @get:JsonProperty("oracle_line_id") val oracleLineId: kotlin.String? = null,

    @Schema(description = "The po number")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("po_number")
    @get:JsonProperty("po_number") val poNumber: kotlin.String? = null,

    @Schema(description = "OrderId in SFDC")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("salesforce_order_id")
    @get:JsonProperty("salesforce_order_id") val salesforceOrderId: kotlin.String? = null,

    @Schema(description = "OrderLineId in SFDC")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("salesforce_order_line_id")
    @get:JsonProperty("salesforce_order_line_id") val salesforceOrderLineId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(description = "Starting date of time period. Format: YYYY-MM-DD")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("start_date")
    @get:JsonProperty("start_date") val startDate: kotlin.String? = null,

    @Schema(description = "The email of user submitting the insertion order")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user_email")
    @get:JsonProperty("user_email") val userEmail: kotlin.String? = null
) {

}

