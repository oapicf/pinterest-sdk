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
package org.openapitools.server.api.model


        /**
* Where a user is taken after clicking on an ad in grid. </p><strong>Note:</strong>  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.
* Values: CLOSEUP,DIRECT_TO_DESTINATION
*/
enum class GridClickType(val value: kotlin.String){

    CLOSEUP("CLOSEUP"),

    DIRECT_TO_DESTINATION("DIRECT_TO_DESTINATION");

}

