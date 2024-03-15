package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * 
 * @param eligible Advertiser eligible to create order lines
 * @param canEdit Advertiser eligible to update order lines
 * @param billtoInfos An array of Salesforce account information that includes address, io terms, etc.
 * @param currency 
 * @param pmpNames 
 * @param error Error indicator from Salesforce which could be \"No Error\"
 */
data class SSIOAccountResponse(

    @Schema(example = "true", description = "Advertiser eligible to create order lines")
    @get:JsonProperty("eligible") val eligible: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Advertiser eligible to update order lines")
    @get:JsonProperty("can_edit") val canEdit: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "An array of Salesforce account information that includes address, io terms, etc.")
    @get:JsonProperty("billto_infos") val billtoInfos: kotlin.collections.List<SSIOAccountItem>? = null,

    @Schema(example = "USD", description = "")
    @get:JsonProperty("currency") val currency: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pmp_names") val pmpNames: kotlin.collections.List<SSIOAccountPMPName>? = null,

    @Schema(example = "No Error", description = "Error indicator from Salesforce which could be \"No Error\"")
    @get:JsonProperty("error") val error: kotlin.String? = null
) {

}

