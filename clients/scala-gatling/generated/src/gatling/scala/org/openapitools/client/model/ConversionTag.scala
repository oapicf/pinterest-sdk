
package org.openapitools.client.model


case class ConversionTag (
    /* Tag code snippet. */
    _codeSnippet: Option[String],
    _configs: Option[ConversionTagConfigs],
    /* The enhanced match status of the tag */
    _enhancedMatchStatus: Option[EnhancedMatchStatusType],
    /* Tag ID. */
    _id: Option[String],
    /* Time for the last event fired. */
    _lastFiredTimeMs: Option[Number],
    /* Conversion tag name. */
    _name: String,
    /* Version number. */
    _version: Option[String],
    /* Ad account ID. */
    _adAccountId: String,
    _status: Option[EntityStatus]
)
object ConversionTag {
    def toStringBody(var_codeSnippet: Object, var_configs: Object, var_enhancedMatchStatus: Object, var_id: Object, var_lastFiredTimeMs: Object, var_name: Object, var_version: Object, var_adAccountId: Object, var_status: Object) =
        s"""
        | {
        | "codeSnippet":$var_codeSnippet,"configs":$var_configs,"enhancedMatchStatus":$var_enhancedMatchStatus,"id":$var_id,"lastFiredTimeMs":$var_lastFiredTimeMs,"name":$var_name,"version":$var_version,"adAccountId":$var_adAccountId,"status":$var_status
        | }
        """.stripMargin
}
