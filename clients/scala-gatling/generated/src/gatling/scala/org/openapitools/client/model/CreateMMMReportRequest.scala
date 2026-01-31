
package org.openapitools.client.model


case class CreateMMMReportRequest (
    /* A List of countries for filtering */
    _countries: Option[List[TargetingAdvertiserCountry]],
    /* Metric and entity columns */
    _columns: List[MMMReportingColumn],
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    _endDate: String,
    /* DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. */
    _granularity: String,
    /* Level of the report */
    _level: String,
    /* Name of the Marketing Mix Modeling (MMM) report */
    _reportName: String,
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    _startDate: String,
    /* List of targeting types */
    _targetingTypes: List[MMMReportingTargetingType]
)
object CreateMMMReportRequest {
    def toStringBody(var_countries: Object, var_columns: Object, var_endDate: Object, var_granularity: Object, var_level: Object, var_reportName: Object, var_startDate: Object, var_targetingTypes: Object) =
        s"""
        | {
        | "countries":$var_countries,"columns":$var_columns,"endDate":$var_endDate,"granularity":$var_granularity,"level":$var_level,"reportName":$var_reportName,"startDate":$var_startDate,"targetingTypes":$var_targetingTypes
        | }
        """.stripMargin
}
