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
* Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. For update, only draft campaigns may update objective type.
* Values: AWARENESS,CONSIDERATION,VIDEO_VIEW,WEB_CONVERSION,CATALOG_SALES,WEB_SESSIONS,VIDEO_COMPLETION
*/

enum class ObjectiveType(val value: kotlin.String){


    AWARENESS("AWARENESS"),


    CONSIDERATION("CONSIDERATION"),


    VIDEO_VIEW("VIDEO_VIEW"),


    WEB_CONVERSION("WEB_CONVERSION"),


    CATALOG_SALES("CATALOG_SALES"),


    WEB_SESSIONS("WEB_SESSIONS"),


    VIDEO_COMPLETION("VIDEO_COMPLETION");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

