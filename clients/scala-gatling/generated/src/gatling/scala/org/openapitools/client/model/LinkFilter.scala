
package org.openapitools.client.model


case class LinkFilter (
    _LINK: CatalogsProductGroupFilterOperatorTypeCriteria
)
object LinkFilter {
    def toStringBody(var_LINK: Object) =
        s"""
        | {
        | "LINK":$var_LINK
        | }
        """.stripMargin
}
