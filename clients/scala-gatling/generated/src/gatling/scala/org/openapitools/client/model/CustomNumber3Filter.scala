
package org.openapitools.client.model


case class CustomNumber3Filter (
    _CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria
)
object CustomNumber3Filter {
    def toStringBody(var_CUSTOM_NUMBER_3: Object) =
        s"""
        | {
        | "CUSTOM_NUMBER_3":$var_CUSTOM_NUMBER_3
        | }
        """.stripMargin
}
