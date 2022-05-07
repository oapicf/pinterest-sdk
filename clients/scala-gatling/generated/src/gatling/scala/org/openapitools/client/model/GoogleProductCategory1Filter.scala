
package org.openapitools.client.model


case class GoogleProductCategory1Filter (
    _GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria
)
object GoogleProductCategory1Filter {
    def toStringBody(var_GOOGLE_PRODUCT_CATEGORY_1: Object) =
        s"""
        | {
        | "GOOGLE_PRODUCT_CATEGORY_1":$var_GOOGLE_PRODUCT_CATEGORY_1
        | }
        """.stripMargin
}
