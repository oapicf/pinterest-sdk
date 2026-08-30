
package org.openapitools.client.model


case class BulkDownloadCampaignFilter (
    _campaignStatus: Option[List[SummaryStatus]],
    /* Unix UTC timestamp. */
    _endTime: Option[String],
    /* Campaign name */
    _name: Option[String],
    _objectiveType: Option[List[ConversionObjectiveType]],
    /* Unix UTC timestamp. */
    _startTime: Option[String]
)
object BulkDownloadCampaignFilter {
    def toStringBody(var_campaignStatus: Object, var_endTime: Object, var_name: Object, var_objectiveType: Object, var_startTime: Object) =
        s"""
        | {
        | "campaignStatus":$var_campaignStatus,"endTime":$var_endTime,"name":$var_name,"objectiveType":$var_objectiveType,"startTime":$var_startTime
        | }
        """.stripMargin
}
