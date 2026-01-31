
package org.openapitools.client.model


case class TitleKeywordsFilter (
    _TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria
)
object TitleKeywordsFilter {
    def toStringBody(var_TITLE_KEYWORDS: Object) =
        s"""
        | {
        | "TITLE_KEYWORDS":$var_TITLE_KEYWORDS
        | }
        """.stripMargin
}
