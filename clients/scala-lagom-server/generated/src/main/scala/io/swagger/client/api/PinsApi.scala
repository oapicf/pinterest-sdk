/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.Error
import java.time.LocalDate
import io.swagger.client.model.Pin
import io.swagger.client.model.PinAnalyticsMetricsResponse
import io.swagger.client.model.PinCreate
import io.swagger.client.model.PinUpdate
import io.swagger.client.model.PinsAnalyticsMetricTypesParameterInner
import io.swagger.client.model.PinsList200Response
import io.swagger.client.model.PinsSaveRequest

trait PinsApi extends Service {


  final override def descriptor = {
    import Service._
    named("PinsApi").withCalls(
      restCall(Method.GET, "/pins/analytics?pinIds&startDate&endDate&appTypes&metricTypes&adAccountId", multiPinsAnalytics _), 
      restCall(Method.GET, "/pins/:pin_id/analytics?startDate&endDate&appTypes&metricTypes&splitField&adAccountId", pinsAnalytics _), 
      restCall(Method.POST, "/pins?adAccountId", pinsCreate _), 
      restCall(Method.DELETE, "/pins/:pin_id?adAccountId", pinsDelete _), 
      restCall(Method.GET, "/pins/:pin_id?pinMetrics&adAccountId", pinsGet _), 
      restCall(Method.GET, "/pins?bookmark&pageSize&pinFilter&includeProtectedPins&pinType&creativeTypes&adAccountId&pinMetrics", pinsList _), 
      restCall(Method.POST, "/pins/:pin_id/save?adAccountId", pinsSave _), 
      restCall(Method.PATCH, "/pins/:pin_id?adAccountId", pinsUpdate _)
    ).withAutoAcl(true)
  }

      
  // pinIds:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  // metricTypes:Seq[PinsAnalyticsMetricTypesParameterInner]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * Get multiple Pin analytics
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    *  
    * @param pinIds List of Pin IDs.  
    * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.  
    * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.  
    * @param metricTypes Pin metric types to get data for.  
    * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL) 
    * @param adAccountId Unique identifier of an ad account. (optional)
    * @return Map[String, Map[String, PinAnalyticsMetricsResponse]]
    */
  def multiPinsAnalytics(startDate:LocalDate          ,endDate:LocalDate          ,appTypes: Option[PinsApiAppTypesEnum.PinsApiAppTypesEnum]adAccountId:           Option[String] = None): ServiceCall[NotUsed ,Map[String, Map[String, PinAnalyticsMetricsResponse]]]
        
  // metricTypes:Seq[PinsAnalyticsMetricTypesParameterInner]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * Get Pin analytics
    * Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    *  
    * @param pinId Unique identifier of a Pin.  
    * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.  
    * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.  
    * @param metricTypes Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;.  
    * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL) 
    * @param splitField How to split the data into groups. Not including this param means data won&#39;t be split. (optional, default to NO_SPLIT) 
    * @param adAccountId Unique identifier of an ad account. (optional)
    * @return Map[String, PinAnalyticsMetricsResponse]
    */
  def pinsAnalytics(startDate:LocalDate          ,endDate:LocalDate          ,appTypes: Option[PinsApiAppTypesEnum.PinsApiAppTypesEnum]splitField: Option[PinsApiSplitFieldEnum.PinsApiSplitFieldEnum]adAccountId:           Option[String] = NonepinId: String): ServiceCall[NotUsed ,Map[String, PinAnalyticsMetricsResponse]]
        
  /**
    * Create Pin
    * Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/web-features/add-ons-overview/&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/api-features/content-overview/&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
    *   
    * @param adAccountId Unique identifier of an ad account. (optional)
    * @return Pin Body Parameter  Create a new Pin. 
    */
  def pinsCreate(adAccountId:           Option[String] = None): ServiceCall[PinCreate ,Pin]
        
  /**
    * Delete Pin
    * Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
    *  
    * @param pinId Unique identifier of a Pin.  
    * @param adAccountId Unique identifier of an ad account. (optional)
    * @return void
    */
  def pinsDelete(adAccountId:           Option[String] = NonepinId: String): ServiceCall[NotUsed ,Done]
        
  /**
    * Get Pin
    * Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
    *  
    * @param pinId Unique identifier of a Pin.  
    * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false) 
    * @param adAccountId Unique identifier of an ad account. (optional)
    * @return Pin
    */
  def pinsGet(pinMetrics:           Option[Boolean] /* = false*/,adAccountId:           Option[String] = NonepinId: String): ServiceCall[NotUsed ,Pin]
        
  // creativeTypes:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * List Pins
    * Get a list of the Pins owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.  Disclaimer: there are known performance issues when filtering by field &lt;code&gt;creative_type&lt;/code&gt; and including protected pins. If your request is timing out in this scenario we encourage you to use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/boards/list_pins&#39;&gt;GET List Pins on Board&lt;/a&gt;.
    *  
    * @param bookmark Cursor used to fetch the next page of items (optional) 
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25) 
    * @param pinFilter Pin filter. (optional) 
    * @param includeProtectedPins Specify if return pins from protected boards (optional, default to false) 
    * @param pinType The type of pins to return, currently only enabled for private pins (optional) 
    * @param creativeTypes Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional, default to new ListBuffer[String]() ) 
    * @param adAccountId Unique identifier of an ad account. (optional) 
    * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
    * @return PinsList200Response
    */
  def pinsList(bookmark:           Option[String] = None,pageSize:           Option[Int] /* = 25*/,pinFilter: Option[PinsApiPinFilterEnum.PinsApiPinFilterEnum]includeProtectedPins:           Option[Boolean] /* = false*/,pinType: Option[PinsApiPinTypeEnum.PinsApiPinTypeEnum]creativeTypes: Option[PinsApiCreativeTypesEnum.PinsApiCreativeTypesEnum]adAccountId:           Option[String] = None,pinMetrics:           Option[Boolean] /* = false*/): ServiceCall[NotUsed ,PinsList200Response]
        
  /**
    * Save Pin
    * Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
    *  
    * @param pinId Unique identifier of a Pin.   
    * @param adAccountId Unique identifier of an ad account. (optional)
    * @return Pin Body Parameter  Request object used to save an existing pin 
    */
  def pinsSave(adAccountId:           Option[String] = NonepinId: String): ServiceCall[PinsSaveRequest ,Pin]
        
  /**
    * Update Pin
    * Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    *  
    * @param pinId Unique identifier of a Pin.   
    * @param adAccountId Unique identifier of an ad account. (optional)
    * @return Pin Body Parameter   
    */
  def pinsUpdate(adAccountId:           Option[String] = NonepinId: String): ServiceCall[PinUpdate ,Pin]
  

        object PinsApiAppTypesEnum extends Enumeration {
        val   ALL, MOBILE, TABLET, WEB = Value     
        type PinsApiAppTypesEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PinsApiAppTypesEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[PinsApiAppTypesEnum] = PathParamSerializer.required("PinsApiAppTypesEnum")(withName)(_.toString)
        }
        object PinsApiAppTypesEnum extends Enumeration {
        val   ALL, MOBILE, TABLET, WEB = Value     
        type PinsApiAppTypesEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PinsApiAppTypesEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[PinsApiAppTypesEnum] = PathParamSerializer.required("PinsApiAppTypesEnum")(withName)(_.toString)
        }
        object PinsApiSplitFieldEnum extends Enumeration {
        val   NO_SPLIT, APP_TYPE = Value     
        type PinsApiSplitFieldEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PinsApiSplitFieldEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[PinsApiSplitFieldEnum] = PathParamSerializer.required("PinsApiSplitFieldEnum")(withName)(_.toString)
        }
        object PinsApiPinFilterEnum extends Enumeration {
        val   exclude_native, exclude_repins, has_been_promoted = Value     
        type PinsApiPinFilterEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PinsApiPinFilterEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[PinsApiPinFilterEnum] = PathParamSerializer.required("PinsApiPinFilterEnum")(withName)(_.toString)
        }
        object PinsApiPinTypeEnum extends Enumeration {
        val   PRIVATE = Value     
        type PinsApiPinTypeEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PinsApiPinTypeEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[PinsApiPinTypeEnum] = PathParamSerializer.required("PinsApiPinTypeEnum")(withName)(_.toString)
        }
        object PinsApiCreativeTypesEnum extends Enumeration {
        val   REGULAR, VIDEO, SHOPPING, CAROUSEL, MAX_VIDEO, SHOP_THE_PIN, COLLECTION, IDEA = Value     
        type PinsApiCreativeTypesEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PinsApiCreativeTypesEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[PinsApiCreativeTypesEnum] = PathParamSerializer.required("PinsApiCreativeTypesEnum")(withName)(_.toString)
        }
  }
