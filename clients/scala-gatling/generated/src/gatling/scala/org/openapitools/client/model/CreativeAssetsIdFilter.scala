
package org.openapitools.client.model


case class CreativeAssetsIdFilter (
    _CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria
)
object CreativeAssetsIdFilter {
    def toStringBody(var_CREATIVE_ASSETS_ID: Object) =
        s"""
        | {
        | "CREATIVE_ASSETS_ID":$var_CREATIVE_ASSETS_ID
        | }
        """.stripMargin
}
