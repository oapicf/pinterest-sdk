
package org.openapitools.client.model


case class ProductType3Filter (
    _PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria
)
object ProductType3Filter {
    def toStringBody(var_PRODUCT_TYPE_3: Object) =
        s"""
        | {
        | "PRODUCT_TYPE_3":$var_PRODUCT_TYPE_3
        | }
        """.stripMargin
}
