package api

import model.AudienceDefinitionResponse
import model.AudienceInsightType
import model.AudienceInsightsResponse
import model.Error

/**
  * Provides a default implementation for [[AudienceInsightsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
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
