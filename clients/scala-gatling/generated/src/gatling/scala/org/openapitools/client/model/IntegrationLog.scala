
package org.openapitools.client.model


case class IntegrationLog (
    _advertiserId: Option[String],
    /* Version number of the integration application. */
    _appVersionNumber: Option[String],
    /* Timestamp in milliseconds of when the log was executed at the client. */
    _clientTimestamp: Integer,
    _error: Option[IntegrationLogClientError],
    /* Log event type */
    _eventType: IntegrationLogEventType,
    _externalBusinessId: Option[String],
    _feedProfileId: Option[String],
    /* Log level type */
    _logLevel: IntegrationLogLevel,
    _merchantId: Option[String],
    /* Explanation of the event that occured. */
    _message: Option[String],
    /* Version number of the platform the integration application is running on. */
    _platformVersionNumber: Option[String],
    _request: Option[IntegrationLogClientRequest],
    _tagId: Option[String]
)
object IntegrationLog {
    def toStringBody(var_advertiserId: Object, var_appVersionNumber: Object, var_clientTimestamp: Object, var_error: Object, var_eventType: Object, var_externalBusinessId: Object, var_feedProfileId: Object, var_logLevel: Object, var_merchantId: Object, var_message: Object, var_platformVersionNumber: Object, var_request: Object, var_tagId: Object) =
        s"""
        | {
        | "advertiserId":$var_advertiserId,"appVersionNumber":$var_appVersionNumber,"clientTimestamp":$var_clientTimestamp,"error":$var_error,"eventType":$var_eventType,"externalBusinessId":$var_externalBusinessId,"feedProfileId":$var_feedProfileId,"logLevel":$var_logLevel,"merchantId":$var_merchantId,"message":$var_message,"platformVersionNumber":$var_platformVersionNumber,"request":$var_request,"tagId":$var_tagId
        | }
        """.stripMargin
}
