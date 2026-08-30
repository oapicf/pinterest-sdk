
package org.openapitools.client.model


case class BrandAccountProfileImageUpdate (
    _contentType: Option[String],
    _data: Option[String]
)
object BrandAccountProfileImageUpdate {
    def toStringBody(var_contentType: Object, var_data: Object) =
        s"""
        | {
        | "contentType":$var_contentType,"data":$var_data
        | }
        """.stripMargin
}
