
package org.openapitools.client.model


case class AvailabilityFilter (
    _AVAILABILITY: CatalogsProductGroupMultipleStringCriteria
)
object AvailabilityFilter {
    def toStringBody(var_AVAILABILITY: Object) =
        s"""
        | {
        | "AVAILABILITY":$var_AVAILABILITY
        | }
        """.stripMargin
}
