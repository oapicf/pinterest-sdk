
package org.openapitools.client.model


case class QuizPinResult (
    _androidDeepLink: Option[String],
    _destinationUrl: Option[String],
    _iosDeepLink: Option[String],
    _organicPinId: Option[String],
    _resultId: Option[Number]
)
object QuizPinResult {
    def toStringBody(var_androidDeepLink: Object, var_destinationUrl: Object, var_iosDeepLink: Object, var_organicPinId: Object, var_resultId: Object) =
        s"""
        | {
        | "androidDeepLink":$var_androidDeepLink,"destinationUrl":$var_destinationUrl,"iosDeepLink":$var_iosDeepLink,"organicPinId":$var_organicPinId,"resultId":$var_resultId
        | }
        """.stripMargin
}
