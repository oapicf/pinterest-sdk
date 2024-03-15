
package org.openapitools.client.model


case class ProductType2Filter (
    _PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria
)
object ProductType2Filter {
    def toStringBody(var_PRODUCT_TYPE_2: Object) =
        s"""
        | {
        | "PRODUCT_TYPE_2":$var_PRODUCT_TYPE_2
        | }
        """.stripMargin
}
