
package org.openapitools.client.model


case class CustomNumber2Filter (
    _CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria
)
object CustomNumber2Filter {
    def toStringBody(var_CUSTOM_NUMBER_2: Object) =
        s"""
        | {
        | "CUSTOM_NUMBER_2":$var_CUSTOM_NUMBER_2
        | }
        """.stripMargin
}
