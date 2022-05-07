
package org.openapitools.client.model


case class GoogleProductCategory4Filter (
    _GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria
)
object GoogleProductCategory4Filter {
    def toStringBody(var_GOOGLE_PRODUCT_CATEGORY_4: Object) =
        s"""
        | {
        | "GOOGLE_PRODUCT_CATEGORY_4":$var_GOOGLE_PRODUCT_CATEGORY_4
        | }
        """.stripMargin
}
