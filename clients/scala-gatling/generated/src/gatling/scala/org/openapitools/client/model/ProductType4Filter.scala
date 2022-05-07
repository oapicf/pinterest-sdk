
package org.openapitools.client.model


case class ProductType4Filter (
    _PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria
)
object ProductType4Filter {
    def toStringBody(var_PRODUCT_TYPE_4: Object) =
        s"""
        | {
        | "PRODUCT_TYPE_4":$var_PRODUCT_TYPE_4
        | }
        """.stripMargin
}
