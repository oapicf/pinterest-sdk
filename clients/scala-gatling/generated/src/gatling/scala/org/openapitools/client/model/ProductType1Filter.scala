
package org.openapitools.client.model


case class ProductType1Filter (
    _PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria
)
object ProductType1Filter {
    def toStringBody(var_PRODUCT_TYPE_1: Object) =
        s"""
        | {
        | "PRODUCT_TYPE_1":$var_PRODUCT_TYPE_1
        | }
        """.stripMargin
}
