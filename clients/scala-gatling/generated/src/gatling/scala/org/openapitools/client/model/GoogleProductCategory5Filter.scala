
package org.openapitools.client.model


case class GoogleProductCategory5Filter (
    _GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria
)
object GoogleProductCategory5Filter {
    def toStringBody(var_GOOGLE_PRODUCT_CATEGORY_5: Object) =
        s"""
        | {
        | "GOOGLE_PRODUCT_CATEGORY_5":$var_GOOGLE_PRODUCT_CATEGORY_5
        | }
        """.stripMargin
}
