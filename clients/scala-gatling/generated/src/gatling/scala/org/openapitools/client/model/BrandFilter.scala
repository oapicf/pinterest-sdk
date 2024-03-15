
package org.openapitools.client.model


case class BrandFilter (
    _BRAND: CatalogsProductGroupMultipleStringCriteria
)
object BrandFilter {
    def toStringBody(var_BRAND: Object) =
        s"""
        | {
        | "BRAND":$var_BRAND
        | }
        """.stripMargin
}
