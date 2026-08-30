
package org.openapitools.client.model


case class CatalogsItemValidationDetails (
    /* Attribute that has a validation issue. */
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
