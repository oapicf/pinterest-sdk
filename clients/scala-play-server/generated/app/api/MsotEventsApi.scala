package api

import play.api.libs.json._
import model.ConversionMSOTEvents
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait MsotEventsApi {
  /**
    * Send Measurement Source Of Truth (MSOT) attributed conversion events
    * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting.
    * @param adAccountId Unique identifier of an ad account.
    * @param conversionMSOTEvents Attributed MSOT conversion events
    */
  def msotEventsCreate(adAccountId: String, conversionMSOTEvents: ConversionMSOTEvents): Unit
}
