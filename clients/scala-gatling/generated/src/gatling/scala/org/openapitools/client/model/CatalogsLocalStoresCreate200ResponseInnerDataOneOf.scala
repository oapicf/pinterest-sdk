
package org.openapitools.client.model


case class CatalogsLocalStoresCreate200ResponseInnerDataOneOf (
    /* The ID of the local store. */
    _id: String,
    _exceptions: Error
)
object CatalogsLocalStoresCreate200ResponseInnerDataOneOf {
    def toStringBody(var_id: Object, var_exceptions: Object) =
        s"""
        | {
        | "id":$var_id,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
