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

import org.openapitools.server.models.QuizPinQuestion
import org.openapitools.server.models.QuizPinResult

/**
 * This field includes all quiz data including questions, options, and results.
 * @param questions 
 * @param results 
 * @param tieBreakerType Quiz ad tie breaker type, default is RANDOM
 * @param tieBreakerCustomResult 
 */
data class QuizPinData(
    val questions: kotlin.collections.List<QuizPinQuestion>? = null,
    val results: kotlin.collections.List<QuizPinResult>? = null,
    /* Quiz ad tie breaker type, default is RANDOM */
    val tieBreakerType: QuizPinData.TieBreakerType? = null,
    val tieBreakerCustomResult: QuizPinResult? = null
) 
{
    /**
    * Quiz ad tie breaker type, default is RANDOM
    * Values: RANDOM,CUSTOM
    */
    enum class TieBreakerType(val value: kotlin.String){
        RANDOM("RANDOM"),
        CUSTOM("CUSTOM");
    }
}

