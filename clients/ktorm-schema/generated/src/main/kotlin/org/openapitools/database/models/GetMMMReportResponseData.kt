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
 * 
 * @param reportStatus 
 * @param url 
 * @param propertySize 
 */
object GetMMMReportResponseDatas : BaseTable<GetMMMReportResponseData>("GetMMMReportResponseData") {
    val reportStatus = text("report_status").transform({ GetMMMReportResponseData.ReportStatus.valueOf(it ?: "DOES_NOT_EXIST") }, { it.value }) /* null */

    val url = text("url") /* null */
    val propertySize = decimal("size") /* null */

    /**
     * Create an entity of type GetMMMReportResponseData from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GetMMMReportResponseData(
        reportStatus = row[reportStatus]  /* kotlin.String? */,
        url = row[url]  /* kotlin.String? */,
        propertySize = row[propertySize]  /* java.math.BigDecimal? */
    )

    /**
    * Assign all the columns from the entity of type GetMMMReportResponseData to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GetMMMReportResponseData()
    * database.update(GetMMMReportResponseDatas, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GetMMMReportResponseData) {
        this.apply {
            set(GetMMMReportResponseDatas.reportStatus, entity.reportStatus)
            set(GetMMMReportResponseDatas.url, entity.url)
            set(GetMMMReportResponseDatas.propertySize, entity.propertySize)
        }
    }

}

