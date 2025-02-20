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
package org.openapitools.server.models


/**
* The current status of the invite.
* Values: PENDING,ACCEPTED,DECLINED,CANCELLED,EXPIRED
*/
enum class InviteStatus(val value: kotlin.String) {

    PENDING("PENDING"),

    ACCEPTED("ACCEPTED"),

    DECLINED("DECLINED"),

    CANCELLED("CANCELLED"),

    EXPIRED("EXPIRED");

}

