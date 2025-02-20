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


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param reportType 
 * @param feedId ID of the feed entity.
 * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsReportFeedIngestionFilter (
    @SerializedName("reportType") private val _reportType: CatalogsReportFeedIngestionFilter.ReportType?,
    /* ID of the feed entity. */
    @SerializedName("feedId") private val _feedId: kotlin.String?,
    /* Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
    val processingResultId: kotlin.String? = null
) {

    /**
    * 
    * Values: FEED_INGESTION_ISSUES
    */
    enum class ReportType(val value: kotlin.String){
    
        FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES");
    
    }

        val reportType get() = _reportType ?: throw IllegalArgumentException("reportType is required")
                    
        val feedId get() = _feedId ?: throw IllegalArgumentException("feedId is required")
                    
}

