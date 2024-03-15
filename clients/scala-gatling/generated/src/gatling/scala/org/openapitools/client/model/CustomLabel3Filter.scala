
package org.openapitools.client.model


case class CustomLabel3Filter (
    _CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria
)
object CustomLabel3Filter {
    def toStringBody(var_CUSTOM_LABEL_3: Object) =
        s"""
        | {
        | "CUSTOM_LABEL_3":$var_CUSTOM_LABEL_3
        | }
        """.stripMargin
}
