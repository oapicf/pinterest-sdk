
package org.openapitools.client.model


case class AudienceDemographics (
    /* Ages distribution. */
    _ages: Option[List[AudienceDemographicValue]],
    /* Country area distribution. */
    _countries: Option[List[AudienceDemographicValue]],
    /* Device usage distribution. */
    _devices: Option[List[AudienceDemographicValue]],
    /* Gender distribution. */
    _genders: Option[List[AudienceDemographicValue]],
    /* Geographic metro area distribution. */
    _metros: Option[List[AudienceDemographicValue]]
)
object AudienceDemographics {
    def toStringBody(var_ages: Object, var_countries: Object, var_devices: Object, var_genders: Object, var_metros: Object) =
        s"""
        | {
        | "ages":$var_ages,"countries":$var_countries,"devices":$var_devices,"genders":$var_genders,"metros":$var_metros
        | }
        """.stripMargin
}
