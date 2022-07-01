package api

import play.api.libs.json._
import model.Account
import model.AnalyticsMetricsResponse
import model.Error
import java.time.LocalDate

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
trait UserAccountApi {
  /**
    * Get user account analytics
    * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
    * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
    * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
    * @param fromClaimedContent Filter on Pins that match your claimed domain.
    * @param pinFormat Pin formats to get data for, default is all.
    * @param appTypes Apps or devices to get data for, default is all.
    * @param metricTypes Metric types to get data for, default is all. 
    * @param splitField How to split the data into groups. Not including this param means data won&#39;t be split.
    * @param adAccountId Unique identifier of an ad account.
    */
  def userAccountAnalytics(startDate: LocalDate, endDate: LocalDate, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], metricTypes: Option[List[String]], splitField: Option[String], adAccountId: Option[String]): Map[String, AnalyticsMetricsResponse]

  /**
    * Get user account
    * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
    * @param adAccountId Unique identifier of an ad account.
    */
  def userAccountGet(adAccountId: Option[String]): Account
}
