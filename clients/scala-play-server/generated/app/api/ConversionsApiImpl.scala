package api

import model.AdvertiserDefinedEventsResponse
import model.Error

/**
  * Provides a default implementation for [[ConversionsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ConversionsApiImpl extends ConversionsApi {
  /**
    * @inheritdoc
    */
  override def advertiserDefinedEventsGet(adAccountId: String): AdvertiserDefinedEventsResponse = {
    // TODO: Implement better logic

    AdvertiserDefinedEventsResponse(None)
  }
}
