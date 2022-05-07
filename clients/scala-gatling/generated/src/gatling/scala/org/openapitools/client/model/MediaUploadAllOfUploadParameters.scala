
package org.openapitools.client.model


case class MediaUploadAllOfUploadParameters (
    _xAmzDate: Option[String],
    _xAmzSignature: Option[String],
    _xAmzSecurityToken: Option[String],
    _xAmzAlgorithm: Option[String],
    _key: Option[String],
    _policy: Option[String],
    _xAmzCredential: Option[String],
    _contentType: Option[String]
)
object MediaUploadAllOfUploadParameters {
    def toStringBody(var_xAmzDate: Object, var_xAmzSignature: Object, var_xAmzSecurityToken: Object, var_xAmzAlgorithm: Object, var_key: Object, var_policy: Object, var_xAmzCredential: Object, var_contentType: Object) =
        s"""
        | {
        | "xAmzDate":$var_xAmzDate,"xAmzSignature":$var_xAmzSignature,"xAmzSecurityToken":$var_xAmzSecurityToken,"xAmzAlgorithm":$var_xAmzAlgorithm,"key":$var_key,"policy":$var_policy,"xAmzCredential":$var_xAmzCredential,"contentType":$var_contentType
        | }
        """.stripMargin
}
