package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.SSIOAccountItem
import org.openapitools.model.SSIOAccountPMPName
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
 * Salesforce account details including bill-to information.
 * @param billtoInfos An array of Salesforce account information that includes address, io terms, etc.
 * @param canEdit Advertiser eligible to update order lines
 * @param currency 
 * @param eligible Advertiser eligible to create order lines
 * @param error Error indicator from Salesforce which could be \"No Error\"
 * @param pmpNames 
 */
data class SSIOAccount(

    @field:Valid
    @Schema(description = "An array of Salesforce account information that includes address, io terms, etc.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("billto_infos")
    @get:JsonProperty("billto_infos") val billtoInfos: kotlin.collections.List<SSIOAccountItem>? = null,

    @Schema(example = "true", description = "Advertiser eligible to update order lines")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("can_edit")
    @get:JsonProperty("can_edit") val canEdit: kotlin.Boolean? = null,

    @Schema(example = "USD", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("currency")
    @get:JsonProperty("currency") val currency: kotlin.String? = null,

    @Schema(example = "true", description = "Advertiser eligible to create order lines")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("eligible")
    @get:JsonProperty("eligible") val eligible: kotlin.Boolean? = null,

    @Schema(example = "No Error", description = "Error indicator from Salesforce which could be \"No Error\"")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("error")
    @get:JsonProperty("error") val error: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pmp_names")
    @get:JsonProperty("pmp_names") val pmpNames: kotlin.collections.List<SSIOAccountPMPName>? = null
) {

}

