#tag Class
Protected Class AdGroupsApi
	#tag Method, Flags = &h0
		Sub AdGroupsAnalytics(, adAccountId As String, startDate As Date, endDate As Date, adGroupIds() As String, columns() As ColumnsEnum_AdGroupsAnalytics, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_AdGroupsAnalytics, engagementWindowDays As Engagement_window_daysEnum_AdGroupsAnalytics, viewWindowDays As View_window_daysEnum_AdGroupsAnalytics, conversionReportTime As Conversion_report_timeEnum_AdGroupsAnalytics)
		  // Operation ad_groups/analytics
		  // Get ad group analytics
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter adGroupIds: (query) List of Ad group Ids to use to filter the results. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned 
		  // - parameter granularity: (query) TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsAnalyticsCallback(AdGroupsAnalyticsResponseInner) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/analytics
		  // - Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_date") + "=" + EncodeURLComponent(startDate.ToRFC3339)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_date") + "=" + EncodeURLComponent(endDate.ToRFC3339)
		  
		  
		  Dim localVarQueryStringsadGroupIds() As String
		  For Each localVarItemadGroupIds As String in adGroupIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemadGroupIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsadGroupIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsadGroupIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsadGroupIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringadGroupIds As String
		  localVarQueryStringadGroupIds = Join(localVarQueryStringsadGroupIds, "&")
		  
		  Dim localVarQueryStringscolumns() As String
		  For Each localVarItemcolumns As ColumnsEnum_AdGroupsAnalytics in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_AdGroupsAnalyticsToString(localVarItemcolumns))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_AdGroupsAnalyticsToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_AdGroupsAnalyticsToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_AdGroupsAnalyticsToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_AdGroupsAnalyticsToString(conversionReportTime))
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsAnalytics_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsAnalytics_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As AdGroupsAnalyticsResponseInner) As Boolean
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
		Private Sub AdGroupsAnalytics_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data() As AdGroupsAnalyticsResponseInner
		  CallbackHandler.AdGroupsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As AdGroupsAnalyticsResponseInner
		  Call AdGroupsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_AdGroupsAnalyticsToString(value As ColumnsEnum_AdGroupsAnalytics) As String
		  Select Case value
		    
		    Case ColumnsEnum_AdGroupsAnalytics.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_AdGroupsAnalytics.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.Ctr
		      Return "CTR"
		    Case ColumnsEnum_AdGroupsAnalytics.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_AdGroupsAnalytics.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_AdGroupsAnalytics.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_AdGroupsAnalytics.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_AdGroupsAnalytics.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_AdGroupsAnalytics.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_AdGroupsAnalytics.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_AdGroupsAnalytics.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_AdGroupsAnalytics.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_AdGroupsAnalytics.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_AdGroupsAnalytics.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_AdGroupsAnalytics.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_AdGroupsAnalytics.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_AdGroupsAnalytics.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_AdGroupsAnalytics.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_AdGroupsAnalytics.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_AdGroupsAnalytics.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_AdGroupsAnalytics.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_AdGroupsAnalytics.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_AdGroupsAnalytics.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_AdGroupsAnalytics.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_AdGroupsAnalytics.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_AdGroupsAnalytics.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_AdGroupsAnalytics.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_AdGroupsAnalytics.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_AdGroupsAnalytics.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_AdGroupsAnalytics.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_AdGroupsAnalytics.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_AdGroupsAnalytics.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_AdGroupsAnalytics.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_AdGroupsAnalytics.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_AdGroupsAnalytics.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_AdGroupsAnalytics.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_AdGroupsAnalytics.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_AdGroupsAnalytics.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_AdGroupsAnalytics.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_AdGroupsAnalytics.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_AdGroupsAnalytics.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_AdGroupsAnalytics.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_AdGroupsAnalytics.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_AdGroupsAnalytics.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_AdGroupsAnalytics.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_AdGroupsAnalytics.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_AdGroupsAnalytics.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_AdGroupsAnalytics.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_AdGroupsAnalytics.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdGroupsAnalytics.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsAnalytics.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_AdGroupsAnalytics.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_AdGroupsAnalytics.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_AdGroupsAnalytics.Leads
		      Return "LEADS"
		    Case ColumnsEnum_AdGroupsAnalytics.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_AdGroupsAnalytics.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_AdGroupsAnalytics.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_AdGroupsAnalytics.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsAnalytics.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_AdGroupsAnalyticsToString(value As Conversion_report_timeEnum_AdGroupsAnalytics) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_AdGroupsAnalytics.AdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_AdGroupsAnalytics.Conversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsAudienceSizing(, adAccountId As String, Optional adGroupAudienceSizingRequest As OpenAPIClient.Models.AdGroupAudienceSizingRequest)
		  // Operation ad_groups/audience_sizing
		  // Get audience sizing
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupAudienceSizingRequest: (body)  (optional)
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsAudienceSizingCallback(AdGroupAudienceSizingResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/audience_sizing
		  // - Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adGroupAudienceSizingRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsAudienceSizing_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsAudienceSizing_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsAudienceSizingPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroupAudienceSizingResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdGroupAudienceSizingResponse
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
		Private Sub AdGroupsAudienceSizing_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdGroupAudienceSizingResponse
		  CallbackHandler.AdGroupsAudienceSizingCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsAudienceSizing_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroupAudienceSizingResponse
		  Call AdGroupsAudienceSizingPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsAudienceSizingCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsBidFloorGet(, adAccountId As String, bidFloorRequest As OpenAPIClient.Models.BidFloorRequest)
		  // Operation ad_groups_bid_floor/get
		  // Get bid floors
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter bidFloorRequest: (body) Parameters to get bid_floor info 
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsBidFloorGetCallback(BidFloor) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/bid_floor
		  // - List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class="reference external" href="https://help.pinterest.com/en/business/article/set-your-bid"> Set your bid</a>.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(bidFloorRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/bid_floor"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsBidFloorGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsBidFloorGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsBidFloorGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BidFloor) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BidFloor
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
		Private Sub AdGroupsBidFloorGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BidFloor
		  CallbackHandler.AdGroupsBidFloorGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsBidFloorGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BidFloor
		  Call AdGroupsBidFloorGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsBidFloorGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsCreate(, adAccountId As String, adGroupCreateRequest() As OpenAPIClient.Models.AdGroupCreateRequest)
		  // Operation ad_groups/create
		  // Create ad groups
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupCreateRequest: (body) List of ad groups to create, size limit [1, 30]. 
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsCreateCallback(AdGroupArrayResponse) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/ad_groups
		  // - Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href="https://help.pinterest.com/en/business/article/campaign-structure" target="_blank"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adGroupCreateRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroupArrayResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdGroupArrayResponse
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
		Private Sub AdGroupsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdGroupArrayResponse
		  CallbackHandler.AdGroupsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroupArrayResponse
		  Call AdGroupsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsGet(, adAccountId As String, adGroupId As String)
		  // Operation ad_groups/get
		  // Get ad group
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupId: (path) Unique identifier of an ad group. 
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsGetCallback(AdGroupResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}
		  // - Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href="https://www.pinterest.com/_/_/policy/advertising-guidelines/" target="_blank">Pinterest advertising standards</a>.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  Dim localVarPathStringadGroupId As String = adGroupId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_group_id}", localVarPathStringadGroupId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroupResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdGroupResponse
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
		Private Sub AdGroupsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdGroupResponse
		  CallbackHandler.AdGroupsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroupResponse
		  Call AdGroupsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsList(, adAccountId As String, campaignIds() As String, adGroupIds() As String, entityStatuses() As Entity_statusesEnum_AdGroupsList, Optional pageSize As Xoson.O.OptionalInteger, order As OrderEnum_AdGroupsList, Optional bookmark As Xoson.O.OptionalString, Optional translateInterestsToNames As Xoson.O.OptionalBoolean)
		  // Operation ad_groups/list
		  // List ad groups
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignIds: (query) List of Campaign Ids to use to filter the results. (optional, default to Nil)
		  // - parameter adGroupIds: (query) List of Ad group Ids to use to filter the results. (optional, default to Nil)
		  // - parameter entityStatuses: (query) Entity status (optional, default to ["ACTIVE","PAUSED"])
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter order: (query) The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to Sample)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter translateInterestsToNames: (query) Return interests as text names (if value is true) rather than topic IDs. (optional, default to false)
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsListCallback(AdGroupsList200Response) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups
		  // - List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  
		  Dim localVarQueryStringscampaignIds() As String
		  For Each localVarItemcampaignIds As String in campaignIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemcampaignIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringscampaignIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringscampaignIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringscampaignIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringcampaignIds As String
		  localVarQueryStringcampaignIds = Join(localVarQueryStringscampaignIds, "&")
		  
		  Dim localVarQueryStringsadGroupIds() As String
		  For Each localVarItemadGroupIds As String in adGroupIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemadGroupIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsadGroupIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsadGroupIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsadGroupIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringadGroupIds As String
		  localVarQueryStringadGroupIds = Join(localVarQueryStringsadGroupIds, "&")
		  
		  Dim localVarQueryStringsentityStatuses() As String
		  For Each localVarItementityStatuses As Entity_statusesEnum_AdGroupsList in entityStatuses
		    Dim encodedParameter As String = EncodeURLComponent(Entity_statusesEnum_AdGroupsListToString(localVarItementityStatuses))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsentityStatuses.Append("entity_statuses=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsentityStatuses.Append("entity_statuses=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsentityStatuses.Append("entity_statuses=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringentityStatuses As String
		  localVarQueryStringentityStatuses = Join(localVarQueryStringsentityStatuses, "&")
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(OrderEnum_AdGroupsListToString(order))
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If translateInterestsToNames <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("translate_interests_to_names") + "=" + EncodeURLComponent(translateInterestsToNames.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroupsList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdGroupsList200Response
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
		Private Sub AdGroupsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdGroupsList200Response
		  CallbackHandler.AdGroupsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroupsList200Response
		  Call AdGroupsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsListCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Entity_statusesEnum_AdGroupsListToString(value As Entity_statusesEnum_AdGroupsList) As String
		  Select Case value
		    
		    Case Entity_statusesEnum_AdGroupsList.Active
		      Return "ACTIVE"
		    Case Entity_statusesEnum_AdGroupsList.Paused
		      Return "PAUSED"
		    Case Entity_statusesEnum_AdGroupsList.Archived
		      Return "ARCHIVED"
		    Case Entity_statusesEnum_AdGroupsList.Draft
		      Return "DRAFT"
		    Case Entity_statusesEnum_AdGroupsList.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function OrderEnum_AdGroupsListToString(value As OrderEnum_AdGroupsList) As String
		  Select Case value
		    
		    Case OrderEnum_AdGroupsList.Ascending
		      Return "ASCENDING"
		    Case OrderEnum_AdGroupsList.Descending
		      Return "DESCENDING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsTargetingAnalyticsGet(, adAccountId As String, adGroupIds() As String, startDate As Date, endDate As Date, targetingTypes() As AdsAnalyticsTargetingType, columns() As ColumnsEnum_AdGroupsTargetingAnalyticsGet, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_AdGroupsTargetingAnalyticsGet, engagementWindowDays As Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet, viewWindowDays As View_window_daysEnum_AdGroupsTargetingAnalyticsGet, conversionReportTime As Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet, attributionTypes As OpenAPIClient.Models.ConversionReportAttributionTypeOptional)
		  // Operation ad_groups_targeting_analytics/get
		  // Get targeting analytics for ad groups
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupIds: (query) List of Ad group Ids to use to filter the results. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter targetingTypes: (query) Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned 
		  // - parameter granularity: (query) TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  // - parameter attributionTypes: (query) List of types of attribution for the conversion report (optional, default to Nil)
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsTargetingAnalyticsGetCallback(MetricsResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics
		  // - Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  
		  Dim localVarQueryStringsadGroupIds() As String
		  For Each localVarItemadGroupIds As String in adGroupIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemadGroupIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsadGroupIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsadGroupIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsadGroupIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringadGroupIds As String
		  localVarQueryStringadGroupIds = Join(localVarQueryStringsadGroupIds, "&")
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("start_date") + "=" + EncodeURLComponent(startDate.ToRFC3339)
		  
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
		  For Each localVarItemcolumns As ColumnsEnum_AdGroupsTargetingAnalyticsGet in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_AdGroupsTargetingAnalyticsGetToString(localVarItemcolumns))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_AdGroupsTargetingAnalyticsGetToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGetToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_AdGroupsTargetingAnalyticsGetToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGetToString(conversionReportTime))
		  
		  If attributionTypes <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("attribution_types") + "=" + EncodeURLComponent(Xoson.toJSON(attributionTypes))
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsTargetingAnalyticsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsTargetingAnalyticsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsTargetingAnalyticsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MetricsResponse) As Boolean
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
		Private Sub AdGroupsTargetingAnalyticsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MetricsResponse
		  CallbackHandler.AdGroupsTargetingAnalyticsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsTargetingAnalyticsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MetricsResponse
		  Call AdGroupsTargetingAnalyticsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsTargetingAnalyticsGetCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_AdGroupsTargetingAnalyticsGetToString(value As ColumnsEnum_AdGroupsTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Ctr
		      Return "CTR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.Leads
		      Return "LEADS"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_AdGroupsTargetingAnalyticsGet.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGetToString(value As Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet.AdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet.Conversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsUpdate(, adAccountId As String, adGroupUpdateRequest() As OpenAPIClient.Models.AdGroupUpdateRequest)
		  // Operation ad_groups/update
		  // Update ad groups
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupUpdateRequest: (body) List of ad groups to update, size limit [1, 30]. 
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsUpdateCallback(AdGroupArrayResponse) on completion. 
		  //
		  // - PATCH /ad_accounts/{ad_account_id}/ad_groups
		  // - Update multiple existing ad groups.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adGroupUpdateRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroupArrayResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdGroupArrayResponse
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
		Private Sub AdGroupsUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdGroupArrayResponse
		  CallbackHandler.AdGroupsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroupArrayResponse
		  Call AdGroupsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsUpdateCallback(error, data)
		End Sub
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
		CallbackHandler As OpenAPIClient.APIs.AdGroupsApiCallbackHandler
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

	#tag Enum, Name = ColumnsEnum_AdGroupsAnalytics, Type = Integer, Flags = &h0
		
        SpendInMicroDollar
        PaidImpression
        SpendInDollar
        CpcInMicroDollar
        EcpcInMicroDollar
        EcpcInDollar
        Ctr
        Ectr
        CampaignName
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
        AdGroupEntityStatus
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
        CampaignLifetimeSpendCap
        CampaignDailySpendCap
        TotalPageVisit
        TotalSignup
        TotalCheckout
        TotalCustom
        TotalLead
        TotalSignupValueInMicroDollar
        TotalCheckoutValueInMicroDollar
        TotalCustomValueInMicroDollar
        PageVisitCostPerAction
        PageVisitRoas
        CheckoutRoas
        CustomRoas
        VideoMrcViews1
        Video3secViews2
        VideoP100Complete2
        VideoP0Combined2
        VideoP25Combined2
        VideoP50Combined2
        VideoP75Combined2
        VideoP95Combined2
        VideoMrcViews2
        VideoLength
        EcpvInDollar
        EcpcvInDollar
        EcpcvP95InDollar
        TotalVideo3secViews
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
        IdeaPinProductTagVisit1
        IdeaPinProductTagVisit2
        TotalIdeaPinProductTagVisit
        Leads
        CostPerLead
        QuizCompleted
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

	#tag Enum, Name = Click_window_daysEnum_AdGroupsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdGroupsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdGroupsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdGroupsAnalytics, Type = Integer, Flags = &h0
		
        AdAction
        Conversion
		
	#tag EndEnum

	#tag Enum, Name = Entity_statusesEnum_AdGroupsList, Type = Integer, Flags = &h0
		
        Active
        Paused
        Archived
        Draft
        DeletedDraft
		
	#tag EndEnum

	#tag Enum, Name = OrderEnum_AdGroupsList, Type = Integer, Flags = &h0
		
        Ascending
        Descending
		
	#tag EndEnum

	#tag Enum, Name = ColumnsEnum_AdGroupsTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        SpendInMicroDollar
        PaidImpression
        SpendInDollar
        CpcInMicroDollar
        EcpcInMicroDollar
        EcpcInDollar
        Ctr
        Ectr
        CampaignName
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
        AdGroupEntityStatus
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
        CampaignLifetimeSpendCap
        CampaignDailySpendCap
        TotalPageVisit
        TotalSignup
        TotalCheckout
        TotalCustom
        TotalLead
        TotalSignupValueInMicroDollar
        TotalCheckoutValueInMicroDollar
        TotalCustomValueInMicroDollar
        PageVisitCostPerAction
        PageVisitRoas
        CheckoutRoas
        CustomRoas
        VideoMrcViews1
        Video3secViews2
        VideoP100Complete2
        VideoP0Combined2
        VideoP25Combined2
        VideoP50Combined2
        VideoP75Combined2
        VideoP95Combined2
        VideoMrcViews2
        VideoLength
        EcpvInDollar
        EcpcvInDollar
        EcpcvP95InDollar
        TotalVideo3secViews
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
        IdeaPinProductTagVisit1
        IdeaPinProductTagVisit2
        TotalIdeaPinProductTagVisit
        Leads
        CostPerLead
        QuizCompleted
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

	#tag Enum, Name = Click_window_daysEnum_AdGroupsTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdGroupsTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        AdAction
        Conversion
		
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
