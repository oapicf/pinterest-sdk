
package org.openapitools.client.model


case class IntegrationLog (
    /* Timestamp in milliseconds of when the log was executed at the client. */
    _clientTimestamp: Integer,
    /* Log event type */
    _eventType: String,
    /* Log level type */
    _logLevel: String,
    _externalBusinessId: Option[String],
    _advertiserId: Option[String],
    _merchantId: Option[String],
    _tagId: Option[String],
    _feedProfileId: Option[String],
    /* Explanation of the event that occured. */
    _message: Option[String],
    /* Version number of the integration application. */
    _appVersionNumber: Option[String],
    /* Version number of the platform the integration application is running on. */
    _platformVersionNumber: Option[String],
    _error: Option[IntegrationLogClientError],
    _request: Option[IntegrationLogClientRequest]
)
object IntegrationLog {
    def toStringBody(var_clientTimestamp: Object, var_eventType: Object, var_logLevel: Object, var_externalBusinessId: Object, var_advertiserId: Object, var_merchantId: Object, var_tagId: Object, var_feedProfileId: Object, var_message: Object, var_appVersionNumber: Object, var_platformVersionNumber: Object, var_error: Object, var_request: Object) =
        s"""
        | {
        | "clientTimestamp":$var_clientTimestamp,"eventType":$var_eventType,"logLevel":$var_logLevel,"externalBusinessId":$var_externalBusinessId,"advertiserId":$var_advertiserId,"merchantId":$var_merchantId,"tagId":$var_tagId,"feedProfileId":$var_feedProfileId,"message":$var_message,"appVersionNumber":$var_appVersionNumber,"platformVersionNumber":$var_platformVersionNumber,"error":$var_error,"request":$var_request
        | }
        """.stripMargin
}
