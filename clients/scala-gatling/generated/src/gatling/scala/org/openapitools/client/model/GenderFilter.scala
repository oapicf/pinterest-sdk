
package org.openapitools.client.model


case class GenderFilter (
    _GENDER: CatalogsProductGroupMultipleStringCriteria
)
object GenderFilter {
    def toStringBody(var_GENDER: Object) =
        s"""
        | {
        | "GENDER":$var_GENDER
        | }
        """.stripMargin
}
