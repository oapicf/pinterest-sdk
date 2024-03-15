
package org.openapitools.client.model


case class GoogleProductCategory2Filter (
    _GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria
)
object GoogleProductCategory2Filter {
    def toStringBody(var_GOOGLE_PRODUCT_CATEGORY_2: Object) =
        s"""
        | {
        | "GOOGLE_PRODUCT_CATEGORY_2":$var_GOOGLE_PRODUCT_CATEGORY_2
        | }
        """.stripMargin
}
