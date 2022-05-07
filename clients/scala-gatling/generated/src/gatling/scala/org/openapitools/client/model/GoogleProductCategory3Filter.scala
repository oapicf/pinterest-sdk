
package org.openapitools.client.model


case class GoogleProductCategory3Filter (
    _GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria
)
object GoogleProductCategory3Filter {
    def toStringBody(var_GOOGLE_PRODUCT_CATEGORY_3: Object) =
        s"""
        | {
        | "GOOGLE_PRODUCT_CATEGORY_3":$var_GOOGLE_PRODUCT_CATEGORY_3
        | }
        """.stripMargin
}
