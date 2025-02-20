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
* Possible status for a bulk reporting job
* Values: DOES_NOT_EXIST,FINISHED,IN_PROGRESS,EXPIRED,FAILED,CANCELLED
*/
enum class BulkReportingJobStatus(val value: kotlin.String){

    DOES_NOT_EXIST("DOES_NOT_EXIST"),

    FINISHED("FINISHED"),

    IN_PROGRESS("IN_PROGRESS"),

    EXPIRED("EXPIRED"),

    FAILED("FAILED"),

    CANCELLED("CANCELLED");

}

