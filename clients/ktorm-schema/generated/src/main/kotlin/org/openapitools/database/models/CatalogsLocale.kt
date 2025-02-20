/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
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
* 
* Values: afMinusZA,arMinusSA,bgMinusBG,bnMinusIN,csMinusCZ,daMinusDK,de,elMinusGR,enMinusAU,enMinusCA,enMinusGB,enMinusIN,enMinusUS,esMinus419,esMinusAR,esMinusES,esMinusMX,fiMinusFI,fr,frMinusCA,heMinusIL,hiMinusIN,hrMinusHR,huMinusHU,idMinusID,it,ja,koMinusKR,msMinusMY,nbMinusNO,nl,plMinusPL,ptMinusBR,ptMinusPT,roMinusRO,ruMinusRU,skMinusSK,svMinusSE,teMinusIN,thMinusTH,tlMinusPH,tr,ukMinusUA,viMinusVN,zhMinusCN,zhMinusTW
*/

enum class CatalogsLocale(val value: kotlin.String){


    afMinusZA("af-ZA"),


    arMinusSA("ar-SA"),


    bgMinusBG("bg-BG"),


    bnMinusIN("bn-IN"),


    csMinusCZ("cs-CZ"),


    daMinusDK("da-DK"),


    de("de"),


    elMinusGR("el-GR"),


    enMinusAU("en-AU"),


    enMinusCA("en-CA"),


    enMinusGB("en-GB"),


    enMinusIN("en-IN"),


    enMinusUS("en-US"),


    esMinus419("es-419"),


    esMinusAR("es-AR"),


    esMinusES("es-ES"),


    esMinusMX("es-MX"),


    fiMinusFI("fi-FI"),


    fr("fr"),


    frMinusCA("fr-CA"),


    heMinusIL("he-IL"),


    hiMinusIN("hi-IN"),


    hrMinusHR("hr-HR"),


    huMinusHU("hu-HU"),


    idMinusID("id-ID"),


    it("it"),


    ja("ja"),


    koMinusKR("ko-KR"),


    msMinusMY("ms-MY"),


    nbMinusNO("nb-NO"),


    nl("nl"),


    plMinusPL("pl-PL"),


    ptMinusBR("pt-BR"),


    ptMinusPT("pt-PT"),


    roMinusRO("ro-RO"),


    ruMinusRU("ru-RU"),


    skMinusSK("sk-SK"),


    svMinusSE("sv-SE"),


    teMinusIN("te-IN"),


    thMinusTH("th-TH"),


    tlMinusPH("tl-PH"),


    tr("tr"),


    ukMinusUA("uk-UA"),


    viMinusVN("vi-VN"),


    zhMinusCN("zh-CN"),


    zhMinusTW("zh-TW");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

