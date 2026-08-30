package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.SSIOAccountAddress
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
 * Salesforce account item with billing and terms information.
 * @param addresses Address information that is associated with this account.
 * @param id Salesforce id for billto_info
 * @param ioTerms Salesforce text for IO Terms and Conditions
 * @param ioTermsId Salesforce id for IO Terms and Conditions
 * @param ioType Insertion Order Type - Pinterest Paper or Agency Paper
 * @param rowTerms Salesforce text for Rest of the World Terms and Conditions
 * @param rowTermsId Salesforce id for Rest of the World Terms and Conditions
 * @param usTerms Salesforce text for US Terms and Conditions
 * @param usTermsId Salesforce id for US Terms and Conditions
 */
data class SSIOAccountItem(

    @field:Valid
    @Schema(description = "Address information that is associated with this account.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addresses")
    @get:JsonProperty("addresses") val addresses: kotlin.collections.List<SSIOAccountAddress>? = null,

    @Schema(example = "0011N00001LW8kAQAT", description = "Salesforce id for billto_info")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.", description = "Salesforce text for IO Terms and Conditions")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("io_terms")
    @get:JsonProperty("io_terms") val ioTerms: kotlin.String? = null,

    @Schema(example = "a2S1N000000bKHgUAM", description = "Salesforce id for IO Terms and Conditions")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("io_terms_id")
    @get:JsonProperty("io_terms_id") val ioTermsId: kotlin.String? = null,

    @Schema(example = "Pinterest Paper", description = "Insertion Order Type - Pinterest Paper or Agency Paper")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("io_type")
    @get:JsonProperty("io_type") val ioType: kotlin.String? = null,

    @Schema(example = "  The IO is governed by the terms available athttps://business.pinterest.com/en-gb/pinterest-advertising-services-agreement", description = "Salesforce text for Rest of the World Terms and Conditions")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("row_terms")
    @get:JsonProperty("row_terms") val rowTerms: kotlin.String? = null,

    @Schema(example = "a2S1N000000bKHhUAM", description = "Salesforce id for Rest of the World Terms and Conditions")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("row_terms_id")
    @get:JsonProperty("row_terms_id") val rowTermsId: kotlin.String? = null,

    @Schema(example = "This Insertion Order (\"IO\") is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.", description = "Salesforce text for US Terms and Conditions")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("us_terms")
    @get:JsonProperty("us_terms") val usTerms: kotlin.String? = null,

    @Schema(example = "a2S1N000000bKIOUA2", description = "Salesforce id for US Terms and Conditions")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("us_terms_id")
    @get:JsonProperty("us_terms_id") val usTermsId: kotlin.String? = null
) {

}

