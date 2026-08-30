
package org.openapitools.client.model


case class AdvertiserDefinedEventProcessingRecord (
    /* List of exception messages if the operation failed */
    _exceptions: Option[List[String]],
    /* Name of the advertiser defined event */
    _name: String,
    /* Processing status (success or failure) */
    _status: String
)
object AdvertiserDefinedEventProcessingRecord {
    def toStringBody(var_exceptions: Object, var_name: Object, var_status: Object) =
        s"""
        | {
        | "exceptions":$var_exceptions,"name":$var_name,"status":$var_status
        | }
        """.stripMargin
}
