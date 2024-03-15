
package org.openapitools.client.model


case class Interest (
    _canonicalUrl: Option[String],
    _id: Option[String],
    _key: Option[String],
    _name: Option[String]
)
object Interest {
    def toStringBody(var_canonicalUrl: Object, var_id: Object, var_key: Object, var_name: Object) =
        s"""
        | {
        | "canonicalUrl":$var_canonicalUrl,"id":$var_id,"key":$var_key,"name":$var_name
        | }
        """.stripMargin
}
