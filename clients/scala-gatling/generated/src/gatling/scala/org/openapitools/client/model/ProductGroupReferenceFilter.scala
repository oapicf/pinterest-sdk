
package org.openapitools.client.model


case class ProductGroupReferenceFilter (
    _PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria
)
object ProductGroupReferenceFilter {
    def toStringBody(var_PRODUCT_GROUP: Object) =
        s"""
        | {
        | "PRODUCT_GROUP":$var_PRODUCT_GROUP
        | }
        """.stripMargin
}
