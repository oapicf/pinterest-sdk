
package org.openapitools.client.model


case class CustomNumber1Filter (
    _CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria
)
object CustomNumber1Filter {
    def toStringBody(var_CUSTOM_NUMBER_1: Object) =
        s"""
        | {
        | "CUSTOM_NUMBER_1":$var_CUSTOM_NUMBER_1
        | }
        """.stripMargin
}
