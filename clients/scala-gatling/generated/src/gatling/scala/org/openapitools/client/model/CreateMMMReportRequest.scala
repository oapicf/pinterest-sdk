
package org.openapitools.client.model


case class CreateMMMReportRequest (
    /* Name of the Marketing Mix Modeling (MMM) report */
    _reportName: String,
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    _startDate: String,
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    _endDate: String,
    /* DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. */
    _granularity: String,
    /* Level of the report */
    _level: String,
    /* List of targeting types */
    _targetingTypes: List[MMMReportingTargetingType],
    /* Metric and entity columns */
    _columns: List[MMMReportingColumn],
    /* A List of countries for filtering */
    _countries: Option[List[TargetingAdvertiserCountry]]
)
object CreateMMMReportRequest {
    def toStringBody(var_reportName: Object, var_startDate: Object, var_endDate: Object, var_granularity: Object, var_level: Object, var_targetingTypes: Object, var_columns: Object, var_countries: Object) =
        s"""
        | {
        | "reportName":$var_reportName,"startDate":$var_startDate,"endDate":$var_endDate,"granularity":$var_granularity,"level":$var_level,"targetingTypes":$var_targetingTypes,"columns":$var_columns,"countries":$var_countries
        | }
        """.stripMargin
}
