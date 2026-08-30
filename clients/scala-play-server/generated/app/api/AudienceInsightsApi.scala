package api

import play.api.libs.json._
import model.AudienceInsightType
import model.AudienceInsights
import model.AudienceInsightsScopeAndTypeGet200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait AudienceInsightsApi {
  /**
    * Get audience insights
    * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).
    * @param adAccountId Unique identifier of an ad account.
    * @param audienceInsightType Type of audience insights.
    */
  def audienceInsightsGet(adAccountId: String, audienceInsightType: AudienceInsightType): AudienceInsights

  /**
    * Get audience insights scope and type
    * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
    * @param adAccountId Unique identifier of an ad account.
    */
  def audienceInsightsScopeAndTypeGet(adAccountId: String): AudienceInsightsScopeAndTypeGet200Response
}
