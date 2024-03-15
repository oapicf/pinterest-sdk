
package org.openapitools.client.model


case class GenderFilter (
    _GENDER: CatalogsProductGroupMultipleGenderCriteria
)
object GenderFilter {
    def toStringBody(var_GENDER: Object) =
        s"""
        | {
        | "GENDER":$var_GENDER
        | }
        """.stripMargin
}
