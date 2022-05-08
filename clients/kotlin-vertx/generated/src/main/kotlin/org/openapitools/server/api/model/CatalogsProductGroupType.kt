/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model


        /**
* Catalog product group type
* Values: mERCHANTCREATED,aLLPRODUCTS,bESTDEALS,pINNERFAVORITES,tOPSELLERS,bACKINSTOCK,nEWARRIVALS
*/
enum class CatalogsProductGroupType(val value: kotlin.String){

    mERCHANTCREATED("MERCHANT_CREATED"),

    aLLPRODUCTS("ALL_PRODUCTS"),

    bESTDEALS("BEST_DEALS"),

    pINNERFAVORITES("PINNER_FAVORITES"),

    tOPSELLERS("TOP_SELLERS"),

    bACKINSTOCK("BACK_IN_STOCK"),

    nEWARRIVALS("NEW_ARRIVALS");

}
