
package org.openapitools.client.model


case class CustomLabel1Filter (
    _CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria
)
object CustomLabel1Filter {
    def toStringBody(var_CUSTOM_LABEL_1: Object) =
        s"""
        | {
        | "CUSTOM_LABEL_1":$var_CUSTOM_LABEL_1
        | }
        """.stripMargin
}
