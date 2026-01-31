
package org.openapitools.client.model


case class EventQualityScore (
    _ingestionSource: IngestionSourceOptions,
    _lookbackPeriod: LookbackPeriodOptions,
    _overallStatus: OverallStatusOptions,
    _qualityComponents: QualityComponents,
    _sourcePlatform: SourcePlatformOptions
)
object EventQualityScore {
    def toStringBody(var_ingestionSource: Object, var_lookbackPeriod: Object, var_overallStatus: Object, var_qualityComponents: Object, var_sourcePlatform: Object) =
        s"""
        | {
        | "ingestionSource":$var_ingestionSource,"lookbackPeriod":$var_lookbackPeriod,"overallStatus":$var_overallStatus,"qualityComponents":$var_qualityComponents,"sourcePlatform":$var_sourcePlatform
        | }
        """.stripMargin
}
