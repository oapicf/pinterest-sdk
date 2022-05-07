package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
* Catalog product group type
* Values: mERCHANTCREATED,aLLPRODUCTS,bESTDEALS,pINNERFAVORITES,tOPSELLERS,bACKINSTOCK,nEWARRIVALS
*/
enum class CatalogsProductGroupType(val value: kotlin.String) {

    @JsonProperty("MERCHANT_CREATED") mERCHANTCREATED("MERCHANT_CREATED"),

    @JsonProperty("ALL_PRODUCTS") aLLPRODUCTS("ALL_PRODUCTS"),

    @JsonProperty("BEST_DEALS") bESTDEALS("BEST_DEALS"),

    @JsonProperty("PINNER_FAVORITES") pINNERFAVORITES("PINNER_FAVORITES"),

    @JsonProperty("TOP_SELLERS") tOPSELLERS("TOP_SELLERS"),

    @JsonProperty("BACK_IN_STOCK") bACKINSTOCK("BACK_IN_STOCK"),

    @JsonProperty("NEW_ARRIVALS") nEWARRIVALS("NEW_ARRIVALS");

}

