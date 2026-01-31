#tag Class
Protected Class AdAccountsApi
	#tag Method, Flags = &h0
		Sub AdAccountAnalytics(, adAccountId As String, startDate As Date, endDate As Date, columns() As ColumnsEnum_AdAccountAnalytics, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_AdAccountAnalytics, engagementWindowDays As Engagement_window_daysEnum_AdAccountAnalytics, viewWindowDays As View_window_daysEnum_AdAccountAnalytics, conversionReportTime As Conversion_report_timeEnum_AdAccountAnalytics, reportingTimezone As OpenAPIClient.Models.ReportingTimeZoneOptional)
		  // Operation ad_account/analytics
		  // Get ad account analytics
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned 
		  // - parameter granularity: (query) TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  // - parameter reportingTimezone: (query) Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional, default to Nil)
		  //
		  // Invokes AdAccountsApiCallbackHandler.AdAccountAnalyticsCallback(AdAccountAnalyticsResponseInner) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/analytics
		  // - Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: client_credentials
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_date") + "=" + EncodeURLComponent(startDate.ToRFC3339)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_date") + "=" + EncodeURLComponent(endDate.ToRFC3339)
		  
		  
		  Dim localVarQueryStringscolumns() As String
		  For Each localVarItemcolumns As ColumnsEnum_AdAccountAnalytics in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_AdAccountAnalyticsToString(localVarItemcolumns))
		    localVarQueryStringscolumns.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringcolumns As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringcolumns = "columns=" + Join(localVarQueryStringscolumns, ",")
		    Case "spaceDelimited"
		      localVarQueryStringcolumns = "columns=" + Join(localVarQueryStringscolumns, " ")
		    Case "pipeDelimited"
		      localVarQueryStringcolumns = "columns=" + Join(localVarQueryStringscolumns, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringscolumns.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("columns") + "=" + EncodeURLComponent(localVarQueryStringcolumns)
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("granularity") + "=" + EncodeURLComponent(Xoson.toJSON(granularity))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_AdAccountAnalyticsToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_AdAccountAnalyticsToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_AdAccountAnalyticsToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_AdAccountAnalyticsToString(conversionReportTime))
		  
		  If reportingTimezone <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("reporting_timezone") + "=" + EncodeURLComponent(Xoson.toJSON(reportingTimezone))
		  

		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdAccountAnalytics_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdAccountAnalytics_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdAccountAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As AdAccountAnalyticsResponseInner) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
		      Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountAnalytics_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data() As AdAccountAnalyticsResponseInner
		  CallbackHandler.AdAccountAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As AdAccountAnalyticsResponseInner
		  Call AdAccountAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdAccountAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_AdAccountAnalyticsToString(value As ColumnsEnum_AdAccountAnalytics) As String
		  Select Case value
		    
		    Case ColumnsEnum_AdAccountAnalytics.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_AdAccountAnalytics.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.Ctr
		      Return "CTR"
		    Case ColumnsEnum_AdAccountAnalytics.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_AdAccountAnalytics.OutboundCtr1
		      Return "OUTBOUND_CTR_1"
		    Case ColumnsEnum_AdAccountAnalytics.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_AdAccountAnalytics.CampaignBrandLabel
		      Return "CAMPAIGN_BRAND_LABEL"
		    Case ColumnsEnum_AdAccountAnalytics.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_AdAccountAnalytics.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_AdAccountAnalytics.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_AdAccountAnalytics.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_AdAccountAnalytics.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_AdAccountAnalytics.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_AdAccountAnalytics.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_AdAccountAnalytics.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_AdAccountAnalytics.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_AdAccountAnalytics.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_AdAccountAnalytics.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_AdAccountAnalytics.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_AdAccountAnalytics.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_AdAccountAnalytics.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ColumnsEnum_AdAccountAnalytics.AdGroupBudgetType
		      Return "AD_GROUP_BUDGET_TYPE"
		    Case ColumnsEnum_AdAccountAnalytics.AdGroupBudgetInLocalCurrency
		      Return "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum_AdAccountAnalytics.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_AdAccountAnalytics.AdGroupBidMultiplier
		      Return "AD_GROUP_BID_MULTIPLIER"
		    Case ColumnsEnum_AdAccountAnalytics.PromoId
		      Return "PROMO_ID"
		    Case ColumnsEnum_AdAccountAnalytics.PromoName
		      Return "PROMO_NAME"
		    Case ColumnsEnum_AdAccountAnalytics.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_AdAccountAnalytics.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_AdAccountAnalytics.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_AdAccountAnalytics.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_AdAccountAnalytics.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_AdAccountAnalytics.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_AdAccountAnalytics.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_AdAccountAnalytics.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_AdAccountAnalytics.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_AdAccountAnalytics.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_AdAccountAnalytics.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_AdAccountAnalytics.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_AdAccountAnalytics.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_AdAccountAnalytics.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_AdAccountAnalytics.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_AdAccountAnalytics.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_AdAccountAnalytics.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.CostPerOutboundClickInDollar1
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1"
		    Case ColumnsEnum_AdAccountAnalytics.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_AdAccountAnalytics.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_AdAccountAnalytics.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_AdAccountAnalytics.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_AdAccountAnalytics.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_AdAccountAnalytics.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_AdAccountAnalytics.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_AdAccountAnalytics.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_AdAccountAnalytics.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_AdAccountAnalytics.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_AdAccountAnalytics.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_AdAccountAnalytics.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_AdAccountAnalytics.AdName
		      Return "AD_NAME"
		    Case ColumnsEnum_AdAccountAnalytics.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_AdAccountAnalytics.AdGroupOptimization
		      Return "AD_GROUP_OPTIMIZATION"
		    Case ColumnsEnum_AdAccountAnalytics.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_AdAccountAnalytics.CampaignBudgetOptimization
		      Return "CAMPAIGN_BUDGET_OPTIMIZATION"
		    Case ColumnsEnum_AdAccountAnalytics.IsPremiereCampaign
		      Return "IS_PREMIERE_CAMPAIGN"
		    Case ColumnsEnum_AdAccountAnalytics.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_AdAccountAnalytics.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_AdAccountAnalytics.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_AdAccountAnalytics.TotalAddToWishlist
		      Return "TOTAL_ADD_TO_WISHLIST"
		    Case ColumnsEnum_AdAccountAnalytics.TotalSubscribe
		      Return "TOTAL_SUBSCRIBE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_AdAccountAnalytics.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_AdAccountAnalytics.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_AdAccountAnalytics.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_AdAccountAnalytics.ProductGroupAdImageTag
		      Return "PRODUCT_GROUP_AD_IMAGE_TAG"
		    Case ColumnsEnum_AdAccountAnalytics.ProductGroupAdVideoTag
		      Return "PRODUCT_GROUP_AD_VIDEO_TAG"
		    Case ColumnsEnum_AdAccountAnalytics.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
		    Case ColumnsEnum_AdAccountAnalytics.Video15secUniqueViews1
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_1"
		    Case ColumnsEnum_AdAccountAnalytics.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_AdAccountAnalytics.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_AdAccountAnalytics.Video15secUniqueViews2
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_2"
		    Case ColumnsEnum_AdAccountAnalytics.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_AdAccountAnalytics.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_AdAccountAnalytics.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_AdAccountAnalytics.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_AdAccountAnalytics.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_AdAccountAnalytics.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_AdAccountAnalytics.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_AdAccountAnalytics.PaidVideoViewableRate
		      Return "PAID_VIDEO_VIEWABLE_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_AdAccountAnalytics.VideoSpendInDollar
		      Return "VIDEO_SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideo15secUniqueViews
		      Return "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_AdAccountAnalytics.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_AdAccountAnalytics.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdAccountAnalytics.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountAnalytics.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdAccountAnalytics.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_AdAccountAnalytics.TotalAppInstallConversionRate
		      Return "TOTAL_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalInappAppInstallConversionRate
		      Return "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_AdAccountAnalytics.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_AdAccountAnalytics.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_AdAccountAnalytics.Leads
		      Return "LEADS"
		    Case ColumnsEnum_AdAccountAnalytics.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_AdAccountAnalytics.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_AdAccountAnalytics.QuizPinResultOpen
		      Return "QUIZ_PIN_RESULT_OPEN"
		    Case ColumnsEnum_AdAccountAnalytics.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_AdAccountAnalytics.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_AdAccountAnalytics.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountAnalytics.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_AdAccountAnalyticsToString(value As Conversion_report_timeEnum_AdAccountAnalytics) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_AdAccountAnalytics.TimeOfAdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_AdAccountAnalytics.TimeOfConversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdAccountTargetingAnalyticsGet(, adAccountId As String, startDate As Date, endDate As Date, targetingTypes() As AdsAnalyticsTargetingType, columns() As ColumnsEnum_AdAccountTargetingAnalyticsGet, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_AdAccountTargetingAnalyticsGet, engagementWindowDays As Engagement_window_daysEnum_AdAccountTargetingAnalyticsGet, viewWindowDays As View_window_daysEnum_AdAccountTargetingAnalyticsGet, conversionReportTime As Conversion_report_timeEnum_AdAccountTargetingAnalyticsGet, attributionTypes() As ConversionReportAttributionType, reportingTimezone As OpenAPIClient.Models.ReportingTimeZoneOptional)
		  // Operation ad_account_targeting_analytics/get
		  // Get targeting analytics for an ad account
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter targetingTypes: (query) Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [&quot;AGE_BUCKET_AND_GENDER&quot;] is in BETA and not yet available to all users. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned 
		  // - parameter granularity: (query) TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  // - parameter attributionTypes: (query) List of types of attribution for the conversion report (optional, default to Nil)
		  // - parameter reportingTimezone: (query) Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional, default to Nil)
		  //
		  // Invokes AdAccountsApiCallbackHandler.AdAccountTargetingAnalyticsGetCallback(MetricsResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/targeting_analytics
		  // - Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: client_credentials
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_date") + "=" + EncodeURLComponent(startDate.ToRFC3339)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_date") + "=" + EncodeURLComponent(endDate.ToRFC3339)
		  
		  
		  Dim localVarQueryStringstargetingTypes() As String
		  For Each localVarItemtargetingTypes As AdsAnalyticsTargetingType in targetingTypes
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemtargetingTypes))
		    localVarQueryStringstargetingTypes.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringtargetingTypes As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringtargetingTypes = "inner=" + Join(localVarQueryStringstargetingTypes, ",")
		    Case "spaceDelimited"
		      localVarQueryStringtargetingTypes = "inner=" + Join(localVarQueryStringstargetingTypes, " ")
		    Case "pipeDelimited"
		      localVarQueryStringtargetingTypes = "inner=" + Join(localVarQueryStringstargetingTypes, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringstargetingTypes.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringtargetingTypes)
		  
		  Dim localVarQueryStringscolumns() As String
		  For Each localVarItemcolumns As ColumnsEnum_AdAccountTargetingAnalyticsGet in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_AdAccountTargetingAnalyticsGetToString(localVarItemcolumns))
		    localVarQueryStringscolumns.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringcolumns As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringcolumns = "columns=" + Join(localVarQueryStringscolumns, ",")
		    Case "spaceDelimited"
		      localVarQueryStringcolumns = "columns=" + Join(localVarQueryStringscolumns, " ")
		    Case "pipeDelimited"
		      localVarQueryStringcolumns = "columns=" + Join(localVarQueryStringscolumns, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringscolumns.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("columns") + "=" + EncodeURLComponent(localVarQueryStringcolumns)
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("granularity") + "=" + EncodeURLComponent(Xoson.toJSON(granularity))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_AdAccountTargetingAnalyticsGetToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_AdAccountTargetingAnalyticsGetToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_AdAccountTargetingAnalyticsGetToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_AdAccountTargetingAnalyticsGetToString(conversionReportTime))
		  
		  
		  Dim localVarQueryStringsattributionTypes() As String
		  For Each localVarItemattributionTypes As ConversionReportAttributionType in attributionTypes
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemattributionTypes))
		    localVarQueryStringsattributionTypes.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringattributionTypes As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringattributionTypes = "inner=" + Join(localVarQueryStringsattributionTypes, ",")
		    Case "spaceDelimited"
		      localVarQueryStringattributionTypes = "inner=" + Join(localVarQueryStringsattributionTypes, " ")
		    Case "pipeDelimited"
		      localVarQueryStringattributionTypes = "inner=" + Join(localVarQueryStringsattributionTypes, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringsattributionTypes.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringattributionTypes)
		  If reportingTimezone <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("reporting_timezone") + "=" + EncodeURLComponent(Xoson.toJSON(reportingTimezone))
		  

		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/targeting_analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdAccountTargetingAnalyticsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdAccountTargetingAnalyticsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdAccountTargetingAnalyticsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MetricsResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.MetricsResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountTargetingAnalyticsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MetricsResponse
		  CallbackHandler.AdAccountTargetingAnalyticsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountTargetingAnalyticsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MetricsResponse
		  Call AdAccountTargetingAnalyticsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdAccountTargetingAnalyticsGetCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_AdAccountTargetingAnalyticsGetToString(value As ColumnsEnum_AdAccountTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Ctr
		      Return "CTR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.OutboundCtr1
		      Return "OUTBOUND_CTR_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CampaignBrandLabel
		      Return "CAMPAIGN_BRAND_LABEL"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdGroupBudgetType
		      Return "AD_GROUP_BUDGET_TYPE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdGroupBudgetInLocalCurrency
		      Return "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdGroupBidMultiplier
		      Return "AD_GROUP_BID_MULTIPLIER"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.PromoId
		      Return "PROMO_ID"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.PromoName
		      Return "PROMO_NAME"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CostPerOutboundClickInDollar1
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdName
		      Return "AD_NAME"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.AdGroupOptimization
		      Return "AD_GROUP_OPTIMIZATION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CampaignBudgetOptimization
		      Return "CAMPAIGN_BUDGET_OPTIMIZATION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.IsPremiereCampaign
		      Return "IS_PREMIERE_CAMPAIGN"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalAddToWishlist
		      Return "TOTAL_ADD_TO_WISHLIST"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalSubscribe
		      Return "TOTAL_SUBSCRIBE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ProductGroupAdImageTag
		      Return "PRODUCT_GROUP_AD_IMAGE_TAG"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ProductGroupAdVideoTag
		      Return "PRODUCT_GROUP_AD_VIDEO_TAG"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Video15secUniqueViews1
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Video15secUniqueViews2
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.PaidVideoViewableRate
		      Return "PAID_VIDEO_VIEWABLE_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.VideoSpendInDollar
		      Return "VIDEO_SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideo15secUniqueViews
		      Return "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalAppInstallConversionRate
		      Return "TOTAL_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalInappAppInstallConversionRate
		      Return "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.Leads
		      Return "LEADS"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.QuizPinResultOpen
		      Return "QUIZ_PIN_RESULT_OPEN"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_AdAccountTargetingAnalyticsGet.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_AdAccountTargetingAnalyticsGetToString(value As Conversion_report_timeEnum_AdAccountTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_AdAccountTargetingAnalyticsGet.TimeOfAdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_AdAccountTargetingAnalyticsGet.TimeOfConversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdAccountsCreate(, adAccountCreate As OpenAPIClient.Models.AdAccountCreate)
		  // Operation ad_accounts/create
		  // Create ad account
		  // - 
		  // - parameter adAccountCreate: (body)  
		  //
		  // Invokes AdAccountsApiCallbackHandler.AdAccountsCreateCallback(AdAccount) on completion. 
		  //
		  // - POST /ad_accounts
		  // - Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adAccountCreate), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdAccountsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdAccountsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdAccountsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdAccount) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdAccount
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdAccount
		  CallbackHandler.AdAccountsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdAccount
		  Call AdAccountsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdAccountsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdAccountsGet(, adAccountId As String)
		  // Operation ad_accounts/get
		  // Get ad account
		  // - 
		  // - parameter adAccountId: (path)  
		  //
		  // Invokes AdAccountsApiCallbackHandler.AdAccountsGetCallback(AdAccount) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}
		  // - Get an ad account
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: client_credentials
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdAccountsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdAccountsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdAccountsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdAccount) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdAccount
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdAccount
		  CallbackHandler.AdAccountsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdAccount
		  Call AdAccountsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdAccountsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdAccountsList(, Optional includeSharedAccounts As Xoson.O.OptionalBoolean, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation ad_accounts/list
		  // List ad accounts
		  // - 
		  // - parameter includeSharedAccounts: (query) Include shared ad accounts (optional, default to true)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  //
		  // Invokes AdAccountsApiCallbackHandler.AdAccountsListCallback(AdAccountsList200Response) on completion. 
		  //
		  // - GET /ad_accounts
		  // - Get a list of the ad_accounts that the "operation user_account" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: client_credentials
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If includeSharedAccounts <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("include_shared_accounts") + "=" + EncodeURLComponent(includeSharedAccounts.ToString)
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  

		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdAccountsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdAccountsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdAccountsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdAccountsList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdAccountsList200Response
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdAccountsList200Response
		  CallbackHandler.AdAccountsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdAccountsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdAccountsList200Response
		  Call AdAccountsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdAccountsListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AnalyticsCreateConversionProductReport(, adAccountId As String, conversionProductReportRequest As OpenAPIClient.Models.ConversionProductReportRequest)
		  // Operation analytics/create_conversion_product_report
		  // Create a request for a brand, category, SKU report
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter conversionProductReportRequest: (body)  
		  //
		  // Invokes AdAccountsApiCallbackHandler.AnalyticsCreateConversionProductReportCallback(AdsAnalyticsCreateAsyncResponse) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/reports/brand_category_sku
		  // - <a href="/docs/getting-started/using-beta-and-restricted-features/" target="blank" target="blank">Restricted</a> This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(conversionProductReportRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/reports/brand_category_sku"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AnalyticsCreateConversionProductReport_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AnalyticsCreateConversionProductReport_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AnalyticsCreateConversionProductReportPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsCreateConversionProductReport_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse
		  CallbackHandler.AnalyticsCreateConversionProductReportCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsCreateConversionProductReport_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse
		  Call AnalyticsCreateConversionProductReportPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AnalyticsCreateConversionProductReportCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AnalyticsCreateMmmReport(, adAccountId As String, createMMMReportRequest As OpenAPIClient.Models.CreateMMMReportRequest)
		  // Operation analytics/create_mmm_report
		  // Create a request for a Marketing Mix Modeling (MMM) report
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter createMMMReportRequest: (body)  
		  //
		  // Invokes AdAccountsApiCallbackHandler.AnalyticsCreateMmmReportCallback(CreateMMMReportResponse) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/mmm_reports
		  // - This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(createMMMReportRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/mmm_reports"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AnalyticsCreateMmmReport_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AnalyticsCreateMmmReport_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AnalyticsCreateMmmReportPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CreateMMMReportResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CreateMMMReportResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsCreateMmmReport_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CreateMMMReportResponse
		  CallbackHandler.AnalyticsCreateMmmReportCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsCreateMmmReport_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CreateMMMReportResponse
		  Call AnalyticsCreateMmmReportPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AnalyticsCreateMmmReportCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AnalyticsCreateReport(, adAccountId As String, adsAnalyticsCreateAsyncRequest As OpenAPIClient.Models.AdsAnalyticsCreateAsyncRequest)
		  // Operation analytics/create_report
		  // Create async request for an account analytics report
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adsAnalyticsCreateAsyncRequest: (body)  
		  //
		  // Invokes AdAccountsApiCallbackHandler.AnalyticsCreateReportCallback(AdsAnalyticsCreateAsyncResponse) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/reports
		  // - This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adsAnalyticsCreateAsyncRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/reports"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AnalyticsCreateReport_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AnalyticsCreateReport_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AnalyticsCreateReportPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsCreateReport_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse
		  CallbackHandler.AnalyticsCreateReportCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsCreateReport_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse
		  Call AnalyticsCreateReportPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AnalyticsCreateReportCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AnalyticsCreateTemplateReport(, adAccountId As String, templateId As String, Optional startDate As Date, Optional endDate As Date, granularity As OpenAPIClient.Models.GranularityOptional)
		  // Operation analytics/create_template_report
		  // Create async request for an analytics report using a template
		  // - 
		  // - parameter adAccountId: (path)  
		  // - parameter templateId: (path) Unique identifier of a template. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional, default to Nil)
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional, default to Nil)
		  // - parameter granularity: (query)    TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEKLY - metrics are broken down weekly.    MONTHLY - metrics are broken down monthly (optional, default to Nil)
		  //
		  // Invokes AdAccountsApiCallbackHandler.AnalyticsCreateTemplateReportCallback(TemplateBasedReport) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/templates/{template_id}/reports
		  // -    This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If startDate <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_date") + "=" + EncodeURLComponent(startDate.ToRFC3339)
		  
		  If endDate <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_date") + "=" + EncodeURLComponent(endDate.ToRFC3339)
		  
		  If granularity <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("granularity") + "=" + EncodeURLComponent(Xoson.toJSON(granularity))
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/templates/{template_id}/reports"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  Dim localVarPathStringtemplateId As String = templateId
		  
		  localVarPath = localVarPath.ReplaceAllB("{template_id}", localVarPathStringtemplateId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AnalyticsCreateTemplateReport_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AnalyticsCreateTemplateReport_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AnalyticsCreateTemplateReportPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.TemplateBasedReport) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.TemplateBasedReport
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsCreateTemplateReport_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.TemplateBasedReport
		  CallbackHandler.AnalyticsCreateTemplateReportCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsCreateTemplateReport_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.TemplateBasedReport
		  Call AnalyticsCreateTemplateReportPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AnalyticsCreateTemplateReportCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AnalyticsGetConversionProductReport(, adAccountId As String, token As String)
		  // Operation analytics/get_conversion_product_report
		  // Get advertiser brand, category, SKU report
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter token: (query) Token returned from the post request creation call 
		  //
		  // Invokes AdAccountsApiCallbackHandler.AnalyticsGetConversionProductReportCallback(AdsAnalyticsGetAsyncResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/reports/brand_category_sku
		  // - <a href="/docs/getting-started/using-beta-and-restricted-features/" target="blank" target="blank">Restricted</a> Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("token") + "=" + EncodeURLComponent(token)
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/reports/brand_category_sku"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AnalyticsGetConversionProductReport_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AnalyticsGetConversionProductReport_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AnalyticsGetConversionProductReportPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdsAnalyticsGetAsyncResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdsAnalyticsGetAsyncResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsGetConversionProductReport_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdsAnalyticsGetAsyncResponse
		  CallbackHandler.AnalyticsGetConversionProductReportCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsGetConversionProductReport_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdsAnalyticsGetAsyncResponse
		  Call AnalyticsGetConversionProductReportPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AnalyticsGetConversionProductReportCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AnalyticsGetMmmReport(, adAccountId As String, token As String)
		  // Operation analytics/get_mmm_report
		  // Get advertiser Marketing Mix Modeling (MMM) report.
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter token: (query) Token returned from the post request creation call 
		  //
		  // Invokes AdAccountsApiCallbackHandler.AnalyticsGetMmmReportCallback(GetMMMReportResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/mmm_reports
		  // - Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("token") + "=" + EncodeURLComponent(token)
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/mmm_reports"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AnalyticsGetMmmReport_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AnalyticsGetMmmReport_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AnalyticsGetMmmReportPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.GetMMMReportResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.GetMMMReportResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsGetMmmReport_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.GetMMMReportResponse
		  CallbackHandler.AnalyticsGetMmmReportCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsGetMmmReport_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.GetMMMReportResponse
		  Call AnalyticsGetMmmReportPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AnalyticsGetMmmReportCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AnalyticsGetReport(, adAccountId As String, token As String)
		  // Operation analytics/get_report
		  // Get the account analytics report created by the async call
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter token: (query) Token returned from the post request creation call 
		  //
		  // Invokes AdAccountsApiCallbackHandler.AnalyticsGetReportCallback(AdsAnalyticsGetAsyncResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/reports
		  // - This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("token") + "=" + EncodeURLComponent(token)
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/reports"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AnalyticsGetReport_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AnalyticsGetReport_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AnalyticsGetReportPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdsAnalyticsGetAsyncResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdsAnalyticsGetAsyncResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsGetReport_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdsAnalyticsGetAsyncResponse
		  CallbackHandler.AnalyticsGetReportCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AnalyticsGetReport_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdsAnalyticsGetAsyncResponse
		  Call AnalyticsGetReportPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AnalyticsGetReportCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub SandboxDelete(, adAccountId As String)
		  // Operation sandbox/delete
		  // Delete ads data for ad account in API Sandbox
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  //
		  // Invokes AdAccountsApiCallbackHandler.SandboxDeleteCallback(String) on completion. 
		  //
		  // - DELETE /ad_accounts/{ad_account_id}/sandbox
		  // - Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/sandbox"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.SandboxDelete_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.SandboxDelete_error
		  
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function SandboxDeletePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      outData = Content
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub SandboxDelete_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.SandboxDeleteCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub SandboxDelete_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call SandboxDeletePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.SandboxDeleteCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub TemplatesList(, adAccountId As String, Optional pageSize As Xoson.O.OptionalInteger, order As OrderEnum_TemplatesList, Optional bookmark As Xoson.O.OptionalString)
		  // Operation templates/list
		  // List templates
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter order: (query) The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to Sample)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  //
		  // Invokes AdAccountsApiCallbackHandler.TemplatesListCallback(TemplatesList200Response) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/templates
		  // - Gets all Templates associated with an ad account ID.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(OrderEnum_TemplatesListToString(order))
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/templates"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.TemplatesList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.TemplatesList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function TemplatesListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.TemplatesList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.TemplatesList200Response
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub TemplatesList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.TemplatesList200Response
		  CallbackHandler.TemplatesListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub TemplatesList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.TemplatesList200Response
		  Call TemplatesListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.TemplatesListCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function OrderEnum_TemplatesListToString(value As OrderEnum_TemplatesList) As String
		  Select Case value
		    
		    Case OrderEnum_TemplatesList.Ascending
		      Return "ASCENDING"
		    Case OrderEnum_TemplatesList.Descending
		      Return "DESCENDING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function AuthenticationRequired(Realm As String, Headers As InternetHeaders, ByRef Name As String, ByRef Password As String) As Boolean
		  #Pragma Unused Realm
		  #Pragma Unused Headers
		  Name = Me.BasicAuthUser
		  Password = Me.BasicAuthPassword
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PrivateFuncPrepareSocket(socket As HTTPSecureSocket)
		  socket.Secure = Me.useHTTPS
		  socket.ConnectionType = SSLSocket.TLSv12
		  socket.Port = Me.Port
		  socket.RequestHeaders.Delete("Accept")
		  socket.RequestHeaders.AppendHeader("Accept", "text/plain")
		  socket.RequestHeaders.AppendHeader("Accept", "application/json")
		  socket.RequestHeaders.AppendHeader("Content-Type", "application/json")

		  If Me.AdditionalHeaders <> Nil Then
		    For Each HeaderName As Variant In Me.AdditionalHeaders.Keys
		      Dim headerValueS As Variant = additionalHeaders.Value(HeaderName)
		      If headerValueS.IsArray Then
		        If headerValueS.ArrayElementType = Variant.TypeString Then
		          Dim values() As String = headerValueS
		          For Each value As String In values
		            socket.RequestHeaders.AppendHeader(HeaderName, value)
		          Next
		        Else
		          Raise New OpenAPIClient.OpenAPIClientException(kErrorInternal, "AdditionalHeaders only support Strings and String arrays as values.")
		        End If
		      Else
		        socket.RequestHeaders.AppendHeader(HeaderName, headerValueS.StringValue)
		      End If
		    Next
		  End If
		End Sub
	#tag EndMethod



	#tag Property, Flags = &h0
		AdditionalHeaders As Dictionary
	#tag EndProperty

	#tag Property, Flags = &h0
		BasePath As String = "https://api.pinterest.com/v5"
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthPassword As String
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthUser As String
	#tag EndProperty

	#tag Property, Flags = &h0
		CallbackHandler As OpenAPIClient.APIs.AdAccountsApiCallbackHandler
	#tag EndProperty

	#tag Property, Flags = &h0
		Host As String = ""
	#tag EndProperty

	#tag Property, Flags = &h0
		Port As Integer
	#tag EndProperty

	#tag Property, Flags = &h0
		UseHTTPS As Boolean = true
	#tag EndProperty

	#tag Enum, Name = ColumnsEnum_AdAccountAnalytics, Type = Integer, Flags = &h0
		
        SpendInMicroDollar
        PaidImpression
        SpendInDollar
        CpcInMicroDollar
        EcpcInMicroDollar
        EcpcInDollar
        Ctr
        Ectr
        OutboundCtr1
        CampaignName
        CampaignBrandLabel
        PinId
        TotalEngagement
        Engagement1
        Engagement2
        EcpeInDollar
        EngagementRate
        EengagementRate
        EcpmInMicroDollar
        RepinRate
        Ctr2
        CampaignId
        AdvertiserId
        AdAccountId
        PinPromotionId
        AdId
        AdGroupId
        CampaignEntityStatus
        CampaignObjectiveType
        CpmInMicroDollar
        CpmInDollar
        AdGroupName
        AdGroupBudgetType
        AdGroupBudgetInLocalCurrency
        AdGroupEntityStatus
        AdGroupBidMultiplier
        PromoId
        PromoName
        OrderLineId
        OrderLineName
        Clickthrough1
        Repin1
        Impression1
        Impression1Gross
        Clickthrough1Gross
        OutboundClick1
        Clickthrough2
        Repin2
        Impression2
        OutboundClick2
        TotalClickthrough
        TotalImpression
        TotalImpressionUser
        TotalImpressionFrequency
        CostPerOutboundClickInDollar
        CostPerOutboundClickInDollar1
        TotalEngagementSignup
        TotalEngagementCheckout
        TotalEngagementLead
        TotalClickSignup
        TotalClickCheckout
        TotalClickAddToCart
        TotalClickLead
        TotalViewSignup
        TotalViewCheckout
        TotalViewAddToCart
        TotalViewLead
        TotalConversions
        TotalEngagementSignupValueInMicroDollar
        TotalEngagementCheckoutValueInMicroDollar
        TotalClickSignupValueInMicroDollar
        TotalClickCheckoutValueInMicroDollar
        TotalViewSignupValueInMicroDollar
        TotalViewCheckoutValueInMicroDollar
        TotalWebSessions
        WebSessions1
        WebSessions2
        AdName
        CampaignLifetimeSpendCap
        AdGroupOptimization
        CampaignDailySpendCap
        CampaignBudgetOptimization
        IsPremiereCampaign
        TotalPageVisit
        TotalSignup
        TotalCheckout
        TotalCustom
        TotalLead
        TotalAddToWishlist
        TotalSubscribe
        TotalSignupValueInMicroDollar
        TotalCheckoutValueInMicroDollar
        TotalCustomValueInMicroDollar
        PageVisitCostPerAction
        PageVisitRoas
        CheckoutRoas
        CustomRoas
        ProductGroupAdImageTag
        ProductGroupAdVideoTag
        Video3secViews1
        Video15secUniqueViews1
        VideoMrcViews1
        Video3secViews2
        Video15secUniqueViews2
        VideoP100Complete2
        VideoP0Combined2
        VideoP25Combined2
        VideoP50Combined2
        VideoP75Combined2
        VideoP95Combined2
        VideoMrcViews2
        PaidVideoViewableRate
        VideoLength
        VideoSpendInDollar
        EcpvInDollar
        EcpcvInDollar
        EcpcvP95InDollar
        TotalVideo3secViews
        TotalVideo15secUniqueViews
        TotalVideoP100Complete
        TotalVideoP0Combined
        TotalVideoP25Combined
        TotalVideoP50Combined
        TotalVideoP75Combined
        TotalVideoP95Combined
        TotalVideoMrcViews
        TotalVideoAvgWatchtimeInSecond
        TotalRepinRate
        WebCheckoutCostPerAction
        WebCheckoutRoas
        TotalWebCheckout
        TotalWebCheckoutValueInMicroDollar
        TotalWebClickCheckout
        TotalWebClickCheckoutValueInMicroDollar
        TotalWebEngagementCheckout
        TotalWebEngagementCheckoutValueInMicroDollar
        TotalWebViewCheckout
        TotalWebViewCheckoutValueInMicroDollar
        InappCheckoutCostPerAction
        TotalOfflineCheckout
        TotalAppInstallConversionRate
        TotalInappAppInstallConversionRate
        IdeaPinProductTagVisit1
        IdeaPinProductTagVisit2
        TotalIdeaPinProductTagVisit
        Leads
        CostPerLead
        QuizCompleted
        QuizPinResultOpen
        QuizCompletionRate
        ShowcasePinClickthrough
        ShowcaseSubpageClickthrough
        ShowcaseSubpinClickthrough
        ShowcaseSubpageImpression
        ShowcaseSubpinImpression
        ShowcaseSubpageSwipeLeft
        ShowcaseSubpageSwipeRight
        ShowcaseSubpinSwipeLeft
        ShowcaseSubpinSwipeRight
        ShowcaseSubpageRepin
        ShowcaseSubpinRepin
        ShowcaseSubpageCloseup
        ShowcaseCardThumbnailSwipeForward
        ShowcaseCardThumbnailSwipeBackward
        ShowcaseAverageSubpageCloseupPerSession
        TotalCheckoutConversionRate
        TotalViewCategoryConversionRate
        TotalAddToCartConversionRate
        TotalSignupConversionRate
        TotalPageVisitConversionRate
        TotalLeadConversionRate
        TotalSearchConversionRate
        TotalWatchVideoConversionRate
        TotalUnknownConversionRate
        TotalCustomConversionRate
		
	#tag EndEnum

	#tag Enum, Name = Click_window_daysEnum_AdAccountAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdAccountAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdAccountAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdAccountAnalytics, Type = Integer, Flags = &h0
		
        TimeOfAdAction
        TimeOfConversion
		
	#tag EndEnum

	#tag Enum, Name = ColumnsEnum_AdAccountTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        SpendInMicroDollar
        PaidImpression
        SpendInDollar
        CpcInMicroDollar
        EcpcInMicroDollar
        EcpcInDollar
        Ctr
        Ectr
        OutboundCtr1
        CampaignName
        CampaignBrandLabel
        PinId
        TotalEngagement
        Engagement1
        Engagement2
        EcpeInDollar
        EngagementRate
        EengagementRate
        EcpmInMicroDollar
        RepinRate
        Ctr2
        CampaignId
        AdvertiserId
        AdAccountId
        PinPromotionId
        AdId
        AdGroupId
        CampaignEntityStatus
        CampaignObjectiveType
        CpmInMicroDollar
        CpmInDollar
        AdGroupName
        AdGroupBudgetType
        AdGroupBudgetInLocalCurrency
        AdGroupEntityStatus
        AdGroupBidMultiplier
        PromoId
        PromoName
        OrderLineId
        OrderLineName
        Clickthrough1
        Repin1
        Impression1
        Impression1Gross
        Clickthrough1Gross
        OutboundClick1
        Clickthrough2
        Repin2
        Impression2
        OutboundClick2
        TotalClickthrough
        TotalImpression
        TotalImpressionUser
        TotalImpressionFrequency
        CostPerOutboundClickInDollar
        CostPerOutboundClickInDollar1
        TotalEngagementSignup
        TotalEngagementCheckout
        TotalEngagementLead
        TotalClickSignup
        TotalClickCheckout
        TotalClickAddToCart
        TotalClickLead
        TotalViewSignup
        TotalViewCheckout
        TotalViewAddToCart
        TotalViewLead
        TotalConversions
        TotalEngagementSignupValueInMicroDollar
        TotalEngagementCheckoutValueInMicroDollar
        TotalClickSignupValueInMicroDollar
        TotalClickCheckoutValueInMicroDollar
        TotalViewSignupValueInMicroDollar
        TotalViewCheckoutValueInMicroDollar
        TotalWebSessions
        WebSessions1
        WebSessions2
        AdName
        CampaignLifetimeSpendCap
        AdGroupOptimization
        CampaignDailySpendCap
        CampaignBudgetOptimization
        IsPremiereCampaign
        TotalPageVisit
        TotalSignup
        TotalCheckout
        TotalCustom
        TotalLead
        TotalAddToWishlist
        TotalSubscribe
        TotalSignupValueInMicroDollar
        TotalCheckoutValueInMicroDollar
        TotalCustomValueInMicroDollar
        PageVisitCostPerAction
        PageVisitRoas
        CheckoutRoas
        CustomRoas
        ProductGroupAdImageTag
        ProductGroupAdVideoTag
        Video3secViews1
        Video15secUniqueViews1
        VideoMrcViews1
        Video3secViews2
        Video15secUniqueViews2
        VideoP100Complete2
        VideoP0Combined2
        VideoP25Combined2
        VideoP50Combined2
        VideoP75Combined2
        VideoP95Combined2
        VideoMrcViews2
        PaidVideoViewableRate
        VideoLength
        VideoSpendInDollar
        EcpvInDollar
        EcpcvInDollar
        EcpcvP95InDollar
        TotalVideo3secViews
        TotalVideo15secUniqueViews
        TotalVideoP100Complete
        TotalVideoP0Combined
        TotalVideoP25Combined
        TotalVideoP50Combined
        TotalVideoP75Combined
        TotalVideoP95Combined
        TotalVideoMrcViews
        TotalVideoAvgWatchtimeInSecond
        TotalRepinRate
        WebCheckoutCostPerAction
        WebCheckoutRoas
        TotalWebCheckout
        TotalWebCheckoutValueInMicroDollar
        TotalWebClickCheckout
        TotalWebClickCheckoutValueInMicroDollar
        TotalWebEngagementCheckout
        TotalWebEngagementCheckoutValueInMicroDollar
        TotalWebViewCheckout
        TotalWebViewCheckoutValueInMicroDollar
        InappCheckoutCostPerAction
        TotalOfflineCheckout
        TotalAppInstallConversionRate
        TotalInappAppInstallConversionRate
        IdeaPinProductTagVisit1
        IdeaPinProductTagVisit2
        TotalIdeaPinProductTagVisit
        Leads
        CostPerLead
        QuizCompleted
        QuizPinResultOpen
        QuizCompletionRate
        ShowcasePinClickthrough
        ShowcaseSubpageClickthrough
        ShowcaseSubpinClickthrough
        ShowcaseSubpageImpression
        ShowcaseSubpinImpression
        ShowcaseSubpageSwipeLeft
        ShowcaseSubpageSwipeRight
        ShowcaseSubpinSwipeLeft
        ShowcaseSubpinSwipeRight
        ShowcaseSubpageRepin
        ShowcaseSubpinRepin
        ShowcaseSubpageCloseup
        ShowcaseCardThumbnailSwipeForward
        ShowcaseCardThumbnailSwipeBackward
        ShowcaseAverageSubpageCloseupPerSession
        TotalCheckoutConversionRate
        TotalViewCategoryConversionRate
        TotalAddToCartConversionRate
        TotalSignupConversionRate
        TotalPageVisitConversionRate
        TotalLeadConversionRate
        TotalSearchConversionRate
        TotalWatchVideoConversionRate
        TotalUnknownConversionRate
        TotalCustomConversionRate
		
	#tag EndEnum

	#tag Enum, Name = Click_window_daysEnum_AdAccountTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdAccountTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdAccountTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdAccountTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        TimeOfAdAction
        TimeOfConversion
		
	#tag EndEnum

	#tag Enum, Name = OrderEnum_TemplatesList, Type = Integer, Flags = &h0
		
        Ascending
        Descending
		
	#tag EndEnum


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasePath"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthUser"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthPassword"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="UseHTTPS"
			Visible=false
			Group="Behavior"
			InitialValue="true"
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Port"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass
