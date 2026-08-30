
package org.openapitools.client.model


case class MMMReportCreate (
    /* Advertiser IDs for multi-advertiser report */
    _advertiserIds: Option[List[String]],
    /* Metric and entity columns */
    _columns: List[MMMReportingColumn],
    /* A List of countries for filtering */
    _countries: Option[List[TargetingAdvertiserCountry]],
    /* List of custom column IDs */
    _customColumnIds: Option[List[String]],
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    _endDate: String,
    /*   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. */
    _granularity: MMMReportGranularity,
    /* Level of the report */
    _level: MMMReportLevel,
    /* Name of the Marketing Mix Modeling (MMM) report */
    _reportName: String,
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    _startDate: String,
    /* List of targeting types */
    _targetingTypes: List[MMMReportingTargetingType]
)
object MMMReportCreate {
    def toStringBody(var_advertiserIds: Object, var_columns: Object, var_countries: Object, var_customColumnIds: Object, var_endDate: Object, var_granularity: Object, var_level: Object, var_reportName: Object, var_startDate: Object, var_targetingTypes: Object) =
        s"""
        | {
        | "advertiserIds":$var_advertiserIds,"columns":$var_columns,"countries":$var_countries,"customColumnIds":$var_customColumnIds,"endDate":$var_endDate,"granularity":$var_granularity,"level":$var_level,"reportName":$var_reportName,"startDate":$var_startDate,"targetingTypes":$var_targetingTypes
        | }
        """.stripMargin
}
