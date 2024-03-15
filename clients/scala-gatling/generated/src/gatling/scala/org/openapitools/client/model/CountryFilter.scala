
package org.openapitools.client.model


case class CountryFilter (
    _COUNTRY: CatalogsProductGroupMultipleCountriesCriteria
)
object CountryFilter {
    def toStringBody(var_COUNTRY: Object) =
        s"""
        | {
        | "COUNTRY":$var_COUNTRY
        | }
        """.stripMargin
}
