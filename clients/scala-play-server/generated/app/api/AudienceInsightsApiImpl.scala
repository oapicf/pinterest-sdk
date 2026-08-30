package api

import model.AudienceInsightType
import model.AudienceInsights
import model.AudienceInsightsScopeAndTypeGet200Response
import model.Error

/**
  * Provides a default implementation for [[AudienceInsightsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class AudienceInsightsApiImpl extends AudienceInsightsApi {
  /**
    * @inheritdoc
    */
  override def audienceInsightsGet(adAccountId: String, audienceInsightType: AudienceInsightType): AudienceInsights = {
    // TODO: Implement better logic

    AudienceInsights(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def audienceInsightsScopeAndTypeGet(adAccountId: String): AudienceInsightsScopeAndTypeGet200Response = {
    // TODO: Implement better logic

    AudienceInsightsScopeAndTypeGet200Response(List.empty[AudienceDefinition])
  }
}
