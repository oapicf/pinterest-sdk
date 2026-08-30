
package org.openapitools.client.model


case class TrendingProductCategory (
    /* Engagement type */
    _engagementType: ProductCategoriesEngagementType,
    /* Month-over-month change percentage */
    _pctChangeMom: Integer,
    /* Relative volume percentage */
    _percentRelativeVolume: Integer,
    /* Pinterest Product Category Id */
    _pinterestProductCategoryId: Integer,
    /* Product Category Name */
    _productCategory: String,
    /* Vertical name associated with the product category */
    _verticals: Option[List[String]]
)
object TrendingProductCategory {
    def toStringBody(var_engagementType: Object, var_pctChangeMom: Object, var_percentRelativeVolume: Object, var_pinterestProductCategoryId: Object, var_productCategory: Object, var_verticals: Object) =
        s"""
        | {
        | "engagementType":$var_engagementType,"pctChangeMom":$var_pctChangeMom,"percentRelativeVolume":$var_percentRelativeVolume,"pinterestProductCategoryId":$var_pinterestProductCategoryId,"productCategory":$var_productCategory,"verticals":$var_verticals
        | }
        """.stripMargin
}
