
package org.openapitools.client.model


case class CustomLabel4Filter (
    _CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria
)
object CustomLabel4Filter {
    def toStringBody(var_CUSTOM_LABEL_4: Object) =
        s"""
        | {
        | "CUSTOM_LABEL_4":$var_CUSTOM_LABEL_4
        | }
        """.stripMargin
}
