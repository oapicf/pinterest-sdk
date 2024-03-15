
package org.openapitools.client.model


case class TemplateResponse (
    /* Template ID */
    _id: Option[String],
    /* ID of the Ad Account that owns the template */
    _adAccountId: Option[String],
    /* IDs of the Ad Accounts that have access to this template */
    _adAccountIds: Option[List[String]],
    /* ID of the user who created the template */
    _userId: Option[String],
    /* Template Name */
    _name: Option[String],
    /* The number of days prior to the day the report will be delivered at which the report will start */
    _reportStartRelativeDaysInPast: Option[Number],
    /* The number of days prior to the day the report will be delivered at which the report will end */
    _reportEndRelativeDaysInPast: Option[Number],
    _dateRange: Option[TemplateResponseDateRange],
    _reportLevel: Option[MetricsReportingLevel],
    _reportFormat: Option[DataOutputFormat],
    /* A list of columns to be included in the report */
    _columns: Option[List[String]],
    _granularity: Option[Granularity],
    /* The length of the sliding window over which view conversions will be attributed */
    _viewWindowDays: Option[Number],
    /* The length of the sliding window over which click conversions will be attributed */
    _clickWindowDays: Option[Number],
    /* The length of the sliding window over which engagement conversions will be attributed */
    _engagementWindowDays: Option[Number],
    /* Conversion report time type */
    _conversionReportTimeType: Option[String],
    /* A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values */
    _filtersJson: Option[String],
    /* A boolean value that indicates if the user owns the template */
    _isOwnedByUser: Option[Boolean],
    /* A boolean value that indicates if this template has been used to create a scheduled report */
    _isScheduled: Option[Boolean],
    /* The surface used to create this template */
    _creationSource: Option[String],
    /* A boolean that indicates if the template has been deleted */
    _isDeleted: Option[Boolean],
    /* Time of last update in seconds since Unix epoch */
    _updatedTime: Option[Number],
    /* A list of custom column IDs */
    _customColumnIds: Option[List[String]],
    /* Reporting template type */
    _type: Option[String],
    /* The filter on the conversion ingestion source method for conversion metrics */
    _ingestionSources: Option[List[String]]
)
object TemplateResponse {
    def toStringBody(var_id: Object, var_adAccountId: Object, var_adAccountIds: Object, var_userId: Object, var_name: Object, var_reportStartRelativeDaysInPast: Object, var_reportEndRelativeDaysInPast: Object, var_dateRange: Object, var_reportLevel: Object, var_reportFormat: Object, var_columns: Object, var_granularity: Object, var_viewWindowDays: Object, var_clickWindowDays: Object, var_engagementWindowDays: Object, var_conversionReportTimeType: Object, var_filtersJson: Object, var_isOwnedByUser: Object, var_isScheduled: Object, var_creationSource: Object, var_isDeleted: Object, var_updatedTime: Object, var_customColumnIds: Object, var_type: Object, var_ingestionSources: Object) =
        s"""
        | {
        | "id":$var_id,"adAccountId":$var_adAccountId,"adAccountIds":$var_adAccountIds,"userId":$var_userId,"name":$var_name,"reportStartRelativeDaysInPast":$var_reportStartRelativeDaysInPast,"reportEndRelativeDaysInPast":$var_reportEndRelativeDaysInPast,"dateRange":$var_dateRange,"reportLevel":$var_reportLevel,"reportFormat":$var_reportFormat,"columns":$var_columns,"granularity":$var_granularity,"viewWindowDays":$var_viewWindowDays,"clickWindowDays":$var_clickWindowDays,"engagementWindowDays":$var_engagementWindowDays,"conversionReportTimeType":$var_conversionReportTimeType,"filtersJson":$var_filtersJson,"isOwnedByUser":$var_isOwnedByUser,"isScheduled":$var_isScheduled,"creationSource":$var_creationSource,"isDeleted":$var_isDeleted,"updatedTime":$var_updatedTime,"customColumnIds":$var_customColumnIds,"type":$var_type,"ingestionSources":$var_ingestionSources
        | }
        """.stripMargin
}
