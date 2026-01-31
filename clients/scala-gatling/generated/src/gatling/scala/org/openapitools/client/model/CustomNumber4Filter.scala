
package org.openapitools.client.model


case class CustomNumber4Filter (
    _CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria
)
object CustomNumber4Filter {
    def toStringBody(var_CUSTOM_NUMBER_4: Object) =
        s"""
        | {
        | "CUSTOM_NUMBER_4":$var_CUSTOM_NUMBER_4
        | }
        """.stripMargin
}
