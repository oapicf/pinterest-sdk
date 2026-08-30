
package org.openapitools.client.model


case class BrandAccountProfileImage (
    _contentType: String,
    _data: String
)
object BrandAccountProfileImage {
    def toStringBody(var_contentType: Object, var_data: Object) =
        s"""
        | {
        | "contentType":$var_contentType,"data":$var_data
        | }
        """.stripMargin
}
