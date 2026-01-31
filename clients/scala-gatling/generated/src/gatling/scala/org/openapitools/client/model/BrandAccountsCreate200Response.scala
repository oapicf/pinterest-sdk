
package org.openapitools.client.model


case class BrandAccountsCreate200Response (
    /* id of the newly created brand account */
    _brandAccountId: Option[String]
)
object BrandAccountsCreate200Response {
    def toStringBody(var_brandAccountId: Object) =
        s"""
        | {
        | "brandAccountId":$var_brandAccountId
        | }
        """.stripMargin
}
