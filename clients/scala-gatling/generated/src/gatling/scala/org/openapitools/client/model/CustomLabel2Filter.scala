
package org.openapitools.client.model


case class CustomLabel2Filter (
    _CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria
)
object CustomLabel2Filter {
    def toStringBody(var_CUSTOM_LABEL_2: Object) =
        s"""
        | {
        | "CUSTOM_LABEL_2":$var_CUSTOM_LABEL_2
        | }
        """.stripMargin
}
