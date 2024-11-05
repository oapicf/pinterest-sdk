package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param accountId Account ID (ad account or business ID).
 * @param accountName Account name.
 * @param accountType account type
 * @param sharedOnTimestamp Epoch timestamp in seconds for the shared audience event
 */
data class SharedAudienceAccount(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", required = true, description = "Account ID (ad account or business ID).")
    @get:JsonProperty("account_id", required = true) val accountId: kotlin.String,

    @Schema(example = "Home Depot USA", required = true, description = "Account name.")
    @get:JsonProperty("account_name", required = true) val accountName: kotlin.String,

    @Schema(example = "null", required = true, description = "account type")
    @get:JsonProperty("account_type", required = true) val accountType: SharedAudienceAccount.AccountType,

    @Schema(example = "1677003860", required = true, description = "Epoch timestamp in seconds for the shared audience event")
    @get:JsonProperty("shared_on_timestamp", required = true) val sharedOnTimestamp: kotlin.Int
    ) {

    /**
    * account type
    * Values: AD_ACCOUNT,BUSINESS_ACCOUNT
    */
    enum class AccountType(@get:JsonValue val value: kotlin.String) {

        AD_ACCOUNT("AD_ACCOUNT"),
        BUSINESS_ACCOUNT("BUSINESS_ACCOUNT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AccountType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

