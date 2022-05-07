
package org.openapitools.client.model


case class GoogleProductCategory6Filter (
    _GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria
)
object GoogleProductCategory6Filter {
    def toStringBody(var_GOOGLE_PRODUCT_CATEGORY_6: Object) =
        s"""
        | {
        | "GOOGLE_PRODUCT_CATEGORY_6":$var_GOOGLE_PRODUCT_CATEGORY_6
        | }
        """.stripMargin
}
