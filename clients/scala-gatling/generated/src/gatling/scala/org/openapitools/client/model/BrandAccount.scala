
package org.openapitools.client.model


case class BrandAccount (
    _brandAccountId: String
)
object BrandAccount {
    def toStringBody(var_brandAccountId: Object) =
        s"""
        | {
        | "brandAccountId":$var_brandAccountId
        | }
        """.stripMargin
}
