
package org.openapitools.client.model


case class GoogleProductCategory0Filter (
    _GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria
)
object GoogleProductCategory0Filter {
    def toStringBody(var_GOOGLE_PRODUCT_CATEGORY_0: Object) =
        s"""
        | {
        | "GOOGLE_PRODUCT_CATEGORY_0":$var_GOOGLE_PRODUCT_CATEGORY_0
        | }
        """.stripMargin
}
