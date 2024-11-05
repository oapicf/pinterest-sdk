package api

import model.AudienceDefinitionResponse
import model.AudienceInsightType
import model.AudienceInsightsResponse
import model.Error

/**
  * Provides a default implementation for [[AudienceInsightsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class AudienceInsightsApiImpl extends AudienceInsightsApi {
  /**
    * @inheritdoc
    */
  override def audienceInsightsGet(adAccountId: String, audienceInsightType: AudienceInsightType): AudienceInsightsResponse = {
    // TODO: Implement better logic

    AudienceInsightsResponse(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def audienceInsightsScopeAndTypeGet(adAccountId: String): AudienceDefinitionResponse = {
    // TODO: Implement better logic

    AudienceDefinitionResponse(None)
  }
}
