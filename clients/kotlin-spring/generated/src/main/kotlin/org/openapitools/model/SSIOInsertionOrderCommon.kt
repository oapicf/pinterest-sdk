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
 * 
 * @param startDate Starting date of time period. Format: YYYY-MM-DD
 * @param endDate End date of time period. Format: YYYY-MM-DD
 * @param poNumber The po number
 * @param budgetAmount If Budget order line, the budget amount.
 * @param billingContactFirstname The billing contact first name
 * @param billingContactLastname The billing contact last name
 * @param billingContactEmail The billing contact email
 * @param mediaContactFirstname The media contact first name
 * @param mediaContactLastname The media contact last name
 * @param mediaContactEmail The media contact email
 * @param agencyLink URL link for agency
 * @param userEmail The email of user submitting the insertion order
 */
data class SSIOInsertionOrderCommon(

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", description = "Starting date of time period. Format: YYYY-MM-DD")
    @get:JsonProperty("start_date") val startDate: kotlin.String? = null,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", description = "End date of time period. Format: YYYY-MM-DD")
    @get:JsonProperty("end_date") val endDate: kotlin.String? = null,

    @Schema(example = "null", description = "The po number")
    @get:JsonProperty("po_number") val poNumber: kotlin.String? = null,

    @Schema(example = "5000000", description = "If Budget order line, the budget amount.")
    @get:JsonProperty("budget_amount") val budgetAmount: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "The billing contact first name")
    @get:JsonProperty("billing_contact_firstname") val billingContactFirstname: kotlin.String? = null,

    @Schema(example = "null", description = "The billing contact last name")
    @get:JsonProperty("billing_contact_lastname") val billingContactLastname: kotlin.String? = null,

    @Schema(example = "test@example", description = "The billing contact email")
    @get:JsonProperty("billing_contact_email") val billingContactEmail: kotlin.String? = null,

    @Schema(example = "null", description = "The media contact first name")
    @get:JsonProperty("media_contact_firstname") val mediaContactFirstname: kotlin.String? = null,

    @Schema(example = "null", description = "The media contact last name")
    @get:JsonProperty("media_contact_lastname") val mediaContactLastname: kotlin.String? = null,

    @Schema(example = "test@example", description = "The media contact email")
    @get:JsonProperty("media_contact_email") val mediaContactEmail: kotlin.String? = null,

    @Schema(example = "null", description = "URL link for agency")
    @get:JsonProperty("agency_link") val agencyLink: kotlin.String? = null,

    @Schema(example = "test@example", description = "The email of user submitting the insertion order")
    @get:JsonProperty("user_email") val userEmail: kotlin.String? = null
    ) {

}

