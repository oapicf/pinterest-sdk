
package org.openapitools.client.model


case class CatalogsLocalStoresCreate200ResponseInner (
    _data: CatalogsLocalStoresCreate200ResponseInnerData
)
object CatalogsLocalStoresCreate200ResponseInner {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
