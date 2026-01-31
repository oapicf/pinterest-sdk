
package org.openapitools.client.model


case class MediaUploadParameters (
    _contentType: Option[String],
    _key: Option[String],
    _policy: Option[String],
    _xAmzAlgorithm: Option[String],
    _xAmzCredential: Option[String],
    _xAmzDate: Option[String],
    _xAmzSecurityToken: Option[String],
    _xAmzSignature: Option[String]
)
object MediaUploadParameters {
    def toStringBody(var_contentType: Object, var_key: Object, var_policy: Object, var_xAmzAlgorithm: Object, var_xAmzCredential: Object, var_xAmzDate: Object, var_xAmzSecurityToken: Object, var_xAmzSignature: Object) =
        s"""
        | {
        | "contentType":$var_contentType,"key":$var_key,"policy":$var_policy,"xAmzAlgorithm":$var_xAmzAlgorithm,"xAmzCredential":$var_xAmzCredential,"xAmzDate":$var_xAmzDate,"xAmzSecurityToken":$var_xAmzSecurityToken,"xAmzSignature":$var_xAmzSignature
        | }
        """.stripMargin
}
