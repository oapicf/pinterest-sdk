package api

import play.api.libs.json._
import model.AdAccountCountriesGet200Response
import model.BookClosed
import model.DeliveryMetricsGet200Response
import model.Error
import model.JsObject
import model.PublicTargetingType
import model.ReportType
import model.SingleInterestTargetingOption

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait ResourcesApi {
  /**
    * Get ad accounts countries
    * Get Ad Accounts countries
    */
  def adAccountCountriesGet(): AdAccountCountriesGet200Response

  /**
    * Get available metrics&#39; definitions
    * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
    * @param reportType Report type.
    */
  def deliveryMetricsGet(reportType: Option[ReportType]): DeliveryMetricsGet200Response

  /**
    * Get interest details
    * Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.
    * @param interestId Unique identifier of an interest.
    */
  def interestTargetingOptionsGet(interestId: String): SingleInterestTargetingOption

  /**
    * Get lead form questions
    * Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    */
  def leadFormQuestionsGet(): Unit

  /**
    * Get metrics ready state
    * Learn whether conversion or non-conversion metrics are finalized and ready to query.
    * @param date Analytics reports request date (UTC). Format: YYYY-MM-DD
    */
  def metricsReadyStateGet(date: String): BookClosed

  /**
    * Get targeting options
    *     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;
    * @param targetingType Public targeting type
    * @param adAccountId Unique identifier of an ad account.
    * @param clientId Client ID
    * @param oauthSignature Oauth signature
    * @param timestamp Timestamp.
    */
  def targetingOptionsGet(targetingType: PublicTargetingType, adAccountId: Option[String], clientId: Option[String], oauthSignature: Option[String], timestamp: Option[String]): List[JsObject]
}
