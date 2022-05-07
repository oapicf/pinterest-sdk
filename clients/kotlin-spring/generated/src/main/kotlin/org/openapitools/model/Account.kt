package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param accountType Type of account
 * @param profileImage 
 * @param websiteUrl 
 * @param username 
 */
data class Account(

    @field:JsonProperty("account_type") val accountType: Account.AccountType? = null,

    @field:JsonProperty("profile_image") val profileImage: kotlin.String? = null,

    @field:JsonProperty("website_url") val websiteUrl: kotlin.String? = null,

    @field:JsonProperty("username") val username: kotlin.String? = null
) {

    /**
    * Type of account
    * Values: pINNER,bUSINESS
    */
    enum class AccountType(val value: kotlin.String) {
    
        @JsonProperty("PINNER") pINNER("PINNER"),
    
        @JsonProperty("BUSINESS") bUSINESS("BUSINESS");
    
    }

}

