/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
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
* Advertiser's ISO two character country code.
* Values: US,GB,CA,IE,AU,NZ,FR,SE,IL,DE,AT,IT,ES,NL,BE,PT,CH,HK,JP,KR,SG,NO,DK,FI,CY,LU,MT,PL,RO,HU,CZ,GR,SK,BR,MX,AR,CL,CO
*/

enum class TargetingAdvertiserCountry(val value: kotlin.String){


    US("US"),


    GB("GB"),


    CA("CA"),


    IE("IE"),


    AU("AU"),


    NZ("NZ"),


    FR("FR"),


    SE("SE"),


    IL("IL"),


    DE("DE"),


    AT("AT"),


    IT("IT"),


    ES("ES"),


    NL("NL"),


    BE("BE"),


    PT("PT"),


    CH("CH"),


    HK("HK"),


    JP("JP"),


    KR("KR"),


    SG("SG"),


    NO("NO"),


    DK("DK"),


    FI("FI"),


    CY("CY"),


    LU("LU"),


    MT("MT"),


    PL("PL"),


    RO("RO"),


    HU("HU"),


    CZ("CZ"),


    GR("GR"),


    SK("SK"),


    BR("BR"),


    MX("MX"),


    AR("AR"),


    CL("CL"),


    CO("CO");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}
