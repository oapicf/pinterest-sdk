
package org.openapitools.client.model


case class DynamicTitlesGetStatus (
    /* The count of generated titles. */
    _generatedCount: Option[Integer],
    /* Whether dynamic titles have been generated and are ready to be reviewed for the ad group. */
    _isReady: Option[Boolean],
    /* The count of advertiser reviewed titles. */
    _reviewedCount: Option[Integer]
)
object DynamicTitlesGetStatus {
    def toStringBody(var_generatedCount: Object, var_isReady: Object, var_reviewedCount: Object) =
        s"""
        | {
        | "generatedCount":$var_generatedCount,"isReady":$var_isReady,"reviewedCount":$var_reviewedCount
        | }
        """.stripMargin
}
