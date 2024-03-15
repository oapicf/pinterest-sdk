
package org.openapitools.client.model


case class QuizPinResult (
    _organicPinId: Option[String],
    _androidDeepLink: Option[String],
    _iosDeepLink: Option[String],
    _destinationUrl: Option[String],
    _resultId: Option[Number]
)
object QuizPinResult {
    def toStringBody(var_organicPinId: Object, var_androidDeepLink: Object, var_iosDeepLink: Object, var_destinationUrl: Object, var_resultId: Object) =
        s"""
        | {
        | "organicPinId":$var_organicPinId,"androidDeepLink":$var_androidDeepLink,"iosDeepLink":$var_iosDeepLink,"destinationUrl":$var_destinationUrl,"resultId":$var_resultId
        | }
        """.stripMargin
}
