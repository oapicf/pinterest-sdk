
package org.openapitools.client.model


case class ProductType0Filter (
    _PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria
)
object ProductType0Filter {
    def toStringBody(var_PRODUCT_TYPE_0: Object) =
        s"""
        | {
        | "PRODUCT_TYPE_0":$var_PRODUCT_TYPE_0
        | }
        """.stripMargin
}
