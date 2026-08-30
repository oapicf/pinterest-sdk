
package org.openapitools.client.model


case class PinterestProductCategoriesFilter (
    _PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria
)
object PinterestProductCategoriesFilter {
    def toStringBody(var_PINTEREST_PRODUCT_CATEGORIES: Object) =
        s"""
        | {
        | "PINTEREST_PRODUCT_CATEGORIES":$var_PINTEREST_PRODUCT_CATEGORIES
        | }
        """.stripMargin
}
