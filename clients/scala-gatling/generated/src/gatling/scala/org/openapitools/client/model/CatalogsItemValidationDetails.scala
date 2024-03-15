
package org.openapitools.client.model


case class CatalogsItemValidationDetails (
    _attributeName: NullableCatalogsItemFieldType,
    /* Provided value that caused the validation issue. */
    _providedValue: String
)
object CatalogsItemValidationDetails {
    def toStringBody(var_attributeName: Object, var_providedValue: Object) =
        s"""
        | {
        | "attributeName":$var_attributeName,"providedValue":$var_providedValue
        | }
        """.stripMargin
}
