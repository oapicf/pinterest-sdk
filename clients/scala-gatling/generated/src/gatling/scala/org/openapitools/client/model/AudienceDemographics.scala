
package org.openapitools.client.model


case class AudienceDemographics (
    /* Ages distribution. */
    _ages: Option[List[AudienceDemographicValue]],
    /* Gender distribution. */
    _genders: Option[List[AudienceDemographicValue]],
    /* Device usage distribution. */
    _devices: Option[List[AudienceDemographicValue]],
    /* Geographic metro area distribution. */
    _metros: Option[List[AudienceDemographicValue]],
    /* Country area distribution. */
    _countries: Option[List[AudienceDemographicValue]]
)
object AudienceDemographics {
    def toStringBody(var_ages: Object, var_genders: Object, var_devices: Object, var_metros: Object, var_countries: Object) =
        s"""
        | {
        | "ages":$var_ages,"genders":$var_genders,"devices":$var_devices,"metros":$var_metros,"countries":$var_countries
        | }
        """.stripMargin
}
