
package org.openapitools.client.model


case class AccountTemplate (
    /* ID of the Ad Account that owns the template */
    _adAccountId: Option[String],
    /* IDs of the Ad Accounts that have access to this template */
    _adAccountIds: Option[List[String]],
    /* A list of ADE columns */
    _adeColumns: Option[List[String]],
    /* Attribution type for Brand/Category/SKU reports */
    _attributionType: Option[AnyType],
    /* The length of the sliding window over which click conversions will be attributed */
    _clickWindowDays: Option[Number],
    /* A list of columns to be included in the report */
    _columns: Option[List[ReportingColumn]],
    /* Conversion report time type */
    _conversionReportTimeType: Option[ConversionReportTimeType],
    /* The surface used to create this template */
    _creationSource: Option[CreationSource],
    /* A list of custom column IDs */
    _customColumnIds: Option[List[String]],
    /* Additional metadata about this reporting template */
    _displayMetadata: Option[String],
    /* The length of the sliding window over which engagement conversions will be attributed */
    _engagementWindowDays: Option[Number],
    /* A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values */
    _filtersJson: Option[String],
    _granularity: Option[Granularity],
    /* Template ID */
    _id: String,
    /* The filter on the conversion ingestion source method for conversion metrics */
    _ingestionSources: Option[List[IngestionSource]],
    /* A boolean representing if this is the default view that loads for this template type */
    _isDefault: Option[Boolean],
    /* A boolean that indicates if the template has been deleted */
    _isDeleted: Option[Boolean],
    /* A boolean value that indicates if the user owns the template */
    _isOwnedByUser: Option[Boolean],
    /* A boolean value that indicates if this template has been used to create a scheduled report */
    _isScheduled: Option[Boolean],
    /* Template Name */
    _name: Option[String],
    /* The number of days prior to the day the report will be delivered at which the report will end */
    _reportEndRelativeDaysInPast: Option[Number],
    _reportFormat: Option[DataOutputFormat],
    _reportLevel: Option[MetricsReportingLevel],
    /* The number of days prior to the day the report will be delivered at which the report will start */
    _reportStartRelativeDaysInPast: Option[Number],
    /* Timezone for reporting data */
    _reportingTimeZone: Option[ReportingTimeZone],
    /* Unified metric sort configuration */
    _sortBy: Option[AnyType],
    /* Type of the template */
    _type: Option[String],
    /* Time of last update in seconds since Unix epoch */
    _updatedTime: Option[Number],
    /* ID of the user who created the template */
    _userId: Option[String],
    /* The length of the sliding window over which view conversions will be attributed */
    _viewWindowDays: Option[Number]
)
object AccountTemplate {
    def toStringBody(var_adAccountId: Object, var_adAccountIds: Object, var_adeColumns: Object, var_attributionType: Object, var_clickWindowDays: Object, var_columns: Object, var_conversionReportTimeType: Object, var_creationSource: Object, var_customColumnIds: Object, var_displayMetadata: Object, var_engagementWindowDays: Object, var_filtersJson: Object, var_granularity: Object, var_id: Object, var_ingestionSources: Object, var_isDefault: Object, var_isDeleted: Object, var_isOwnedByUser: Object, var_isScheduled: Object, var_name: Object, var_reportEndRelativeDaysInPast: Object, var_reportFormat: Object, var_reportLevel: Object, var_reportStartRelativeDaysInPast: Object, var_reportingTimeZone: Object, var_sortBy: Object, var_type: Object, var_updatedTime: Object, var_userId: Object, var_viewWindowDays: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"adAccountIds":$var_adAccountIds,"adeColumns":$var_adeColumns,"attributionType":$var_attributionType,"clickWindowDays":$var_clickWindowDays,"columns":$var_columns,"conversionReportTimeType":$var_conversionReportTimeType,"creationSource":$var_creationSource,"customColumnIds":$var_customColumnIds,"displayMetadata":$var_displayMetadata,"engagementWindowDays":$var_engagementWindowDays,"filtersJson":$var_filtersJson,"granularity":$var_granularity,"id":$var_id,"ingestionSources":$var_ingestionSources,"isDefault":$var_isDefault,"isDeleted":$var_isDeleted,"isOwnedByUser":$var_isOwnedByUser,"isScheduled":$var_isScheduled,"name":$var_name,"reportEndRelativeDaysInPast":$var_reportEndRelativeDaysInPast,"reportFormat":$var_reportFormat,"reportLevel":$var_reportLevel,"reportStartRelativeDaysInPast":$var_reportStartRelativeDaysInPast,"reportingTimeZone":$var_reportingTimeZone,"sortBy":$var_sortBy,"type":$var_type,"updatedTime":$var_updatedTime,"userId":$var_userId,"viewWindowDays":$var_viewWindowDays
        | }
        """.stripMargin
}
