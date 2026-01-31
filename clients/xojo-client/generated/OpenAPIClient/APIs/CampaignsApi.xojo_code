#tag Class
Protected Class CampaignsApi
	#tag Method, Flags = &h0
		Sub AdPinsAnalytics(, adAccountId As String, campaignId As String, pinIds() As String, startDate As Date, endDate As Date, columns() As ColumnsEnum_AdPinsAnalytics, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_AdPinsAnalytics, engagementWindowDays As Engagement_window_daysEnum_AdPinsAnalytics, viewWindowDays As View_window_daysEnum_AdPinsAnalytics, conversionReportTime As Conversion_report_timeEnum_AdPinsAnalytics)
		  // Operation ad_pins/analytics
		  // Get pins analytics
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignId: (query) Campaign Id to use to filter the results. 
		  // - parameter pinIds: (query) List of Pin IDs. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned 
		  // - parameter granularity: (query) TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  //
		  // Invokes CampaignsApiCallbackHandler.AdPinsAnalyticsCallback(AdPinAnalytics) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/pins/analytics
		  // - Get analytics for the pins given a campaign and pins in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
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
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("campaign_id") + "=" + EncodeURLComponent(campaignId)
		  
		  
		  Dim localVarQueryStringspinIds() As String
		  For Each localVarItempinIds As String in pinIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItempinIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringspinIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringspinIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringspinIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringpinIds As String
		  localVarQueryStringpinIds = Join(localVarQueryStringspinIds, "&")
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("start_date") + "=" + EncodeURLComponent(startDate.ToRFC3339)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_date") + "=" + EncodeURLComponent(endDate.ToRFC3339)
		  
		  
		  Dim localVarQueryStringscolumns() As String
		  For Each localVarItemcolumns As ColumnsEnum_AdPinsAnalytics in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_AdPinsAnalyticsToString(localVarItemcolumns))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_AdPinsAnalyticsToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_AdPinsAnalyticsToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_AdPinsAnalyticsToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_AdPinsAnalyticsToString(conversionReportTime))
		  

		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/pins/analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdPinsAnalytics_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdPinsAnalytics_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdPinsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As AdPinAnalytics) As Boolean
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
		Private Sub AdPinsAnalytics_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data() As AdPinAnalytics
		  CallbackHandler.AdPinsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdPinsAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As AdPinAnalytics
		  Call AdPinsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdPinsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_AdPinsAnalyticsToString(value As ColumnsEnum_AdPinsAnalytics) As String
		  Select Case value
		    
		    Case ColumnsEnum_AdPinsAnalytics.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_AdPinsAnalytics.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.Ctr
		      Return "CTR"
		    Case ColumnsEnum_AdPinsAnalytics.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_AdPinsAnalytics.OutboundCtr1
		      Return "OUTBOUND_CTR_1"
		    Case ColumnsEnum_AdPinsAnalytics.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_AdPinsAnalytics.CampaignBrandLabel
		      Return "CAMPAIGN_BRAND_LABEL"
		    Case ColumnsEnum_AdPinsAnalytics.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_AdPinsAnalytics.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_AdPinsAnalytics.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_AdPinsAnalytics.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_AdPinsAnalytics.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_AdPinsAnalytics.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_AdPinsAnalytics.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_AdPinsAnalytics.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_AdPinsAnalytics.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_AdPinsAnalytics.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_AdPinsAnalytics.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_AdPinsAnalytics.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_AdPinsAnalytics.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_AdPinsAnalytics.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ColumnsEnum_AdPinsAnalytics.AdGroupBudgetType
		      Return "AD_GROUP_BUDGET_TYPE"
		    Case ColumnsEnum_AdPinsAnalytics.AdGroupBudgetInLocalCurrency
		      Return "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum_AdPinsAnalytics.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_AdPinsAnalytics.AdGroupBidMultiplier
		      Return "AD_GROUP_BID_MULTIPLIER"
		    Case ColumnsEnum_AdPinsAnalytics.PromoId
		      Return "PROMO_ID"
		    Case ColumnsEnum_AdPinsAnalytics.PromoName
		      Return "PROMO_NAME"
		    Case ColumnsEnum_AdPinsAnalytics.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_AdPinsAnalytics.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_AdPinsAnalytics.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_AdPinsAnalytics.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_AdPinsAnalytics.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_AdPinsAnalytics.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_AdPinsAnalytics.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_AdPinsAnalytics.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_AdPinsAnalytics.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_AdPinsAnalytics.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_AdPinsAnalytics.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_AdPinsAnalytics.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_AdPinsAnalytics.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_AdPinsAnalytics.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_AdPinsAnalytics.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_AdPinsAnalytics.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_AdPinsAnalytics.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.CostPerOutboundClickInDollar1
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1"
		    Case ColumnsEnum_AdPinsAnalytics.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_AdPinsAnalytics.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_AdPinsAnalytics.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_AdPinsAnalytics.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_AdPinsAnalytics.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_AdPinsAnalytics.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_AdPinsAnalytics.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_AdPinsAnalytics.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_AdPinsAnalytics.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_AdPinsAnalytics.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_AdPinsAnalytics.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_AdPinsAnalytics.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_AdPinsAnalytics.AdName
		      Return "AD_NAME"
		    Case ColumnsEnum_AdPinsAnalytics.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_AdPinsAnalytics.AdGroupOptimization
		      Return "AD_GROUP_OPTIMIZATION"
		    Case ColumnsEnum_AdPinsAnalytics.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_AdPinsAnalytics.CampaignBudgetOptimization
		      Return "CAMPAIGN_BUDGET_OPTIMIZATION"
		    Case ColumnsEnum_AdPinsAnalytics.IsPremiereCampaign
		      Return "IS_PREMIERE_CAMPAIGN"
		    Case ColumnsEnum_AdPinsAnalytics.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_AdPinsAnalytics.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_AdPinsAnalytics.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_AdPinsAnalytics.TotalAddToWishlist
		      Return "TOTAL_ADD_TO_WISHLIST"
		    Case ColumnsEnum_AdPinsAnalytics.TotalSubscribe
		      Return "TOTAL_SUBSCRIBE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_AdPinsAnalytics.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_AdPinsAnalytics.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_AdPinsAnalytics.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_AdPinsAnalytics.ProductGroupAdImageTag
		      Return "PRODUCT_GROUP_AD_IMAGE_TAG"
		    Case ColumnsEnum_AdPinsAnalytics.ProductGroupAdVideoTag
		      Return "PRODUCT_GROUP_AD_VIDEO_TAG"
		    Case ColumnsEnum_AdPinsAnalytics.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
		    Case ColumnsEnum_AdPinsAnalytics.Video15secUniqueViews1
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_1"
		    Case ColumnsEnum_AdPinsAnalytics.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_AdPinsAnalytics.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_AdPinsAnalytics.Video15secUniqueViews2
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_2"
		    Case ColumnsEnum_AdPinsAnalytics.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_AdPinsAnalytics.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_AdPinsAnalytics.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_AdPinsAnalytics.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_AdPinsAnalytics.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_AdPinsAnalytics.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_AdPinsAnalytics.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_AdPinsAnalytics.PaidVideoViewableRate
		      Return "PAID_VIDEO_VIEWABLE_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_AdPinsAnalytics.VideoSpendInDollar
		      Return "VIDEO_SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideo15secUniqueViews
		      Return "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_AdPinsAnalytics.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_AdPinsAnalytics.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdPinsAnalytics.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdPinsAnalytics.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdPinsAnalytics.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_AdPinsAnalytics.TotalAppInstallConversionRate
		      Return "TOTAL_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalInappAppInstallConversionRate
		      Return "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_AdPinsAnalytics.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_AdPinsAnalytics.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_AdPinsAnalytics.Leads
		      Return "LEADS"
		    Case ColumnsEnum_AdPinsAnalytics.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_AdPinsAnalytics.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_AdPinsAnalytics.QuizPinResultOpen
		      Return "QUIZ_PIN_RESULT_OPEN"
		    Case ColumnsEnum_AdPinsAnalytics.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_AdPinsAnalytics.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_AdPinsAnalytics.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_AdPinsAnalytics.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_AdPinsAnalyticsToString(value As Conversion_report_timeEnum_AdPinsAnalytics) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_AdPinsAnalytics.TimeOfAdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_AdPinsAnalytics.TimeOfConversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignTargetingAnalyticsGet(, adAccountId As String, campaignIds() As String, startDate As Date, endDate As Date, targetingTypes() As AdsAnalyticsCampaignTargetingType, columns() As ColumnsEnum_CampaignTargetingAnalyticsGet, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_CampaignTargetingAnalyticsGet, engagementWindowDays As Engagement_window_daysEnum_CampaignTargetingAnalyticsGet, viewWindowDays As View_window_daysEnum_CampaignTargetingAnalyticsGet, conversionReportTime As Conversion_report_timeEnum_CampaignTargetingAnalyticsGet, attributionTypes() As ConversionReportAttributionType, reportingTimezone As OpenAPIClient.Models.ReportingTimeZoneOptional)
		  // Operation campaign_targeting_analytics/get
		  // Get targeting analytics for campaigns
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignIds: (query) List of Campaign Ids to use to filter the results. 
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
		  // Invokes CampaignsApiCallbackHandler.CampaignTargetingAnalyticsGetCallback(MetricsResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/campaigns/targeting_analytics
		  // - Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("start_date") + "=" + EncodeURLComponent(startDate.ToRFC3339)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("end_date") + "=" + EncodeURLComponent(endDate.ToRFC3339)
		  
		  
		  Dim localVarQueryStringstargetingTypes() As String
		  For Each localVarItemtargetingTypes As AdsAnalyticsCampaignTargetingType in targetingTypes
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
		  For Each localVarItemcolumns As ColumnsEnum_CampaignTargetingAnalyticsGet in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_CampaignTargetingAnalyticsGetToString(localVarItemcolumns))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_CampaignTargetingAnalyticsGetToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_CampaignTargetingAnalyticsGetToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_CampaignTargetingAnalyticsGetToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_CampaignTargetingAnalyticsGetToString(conversionReportTime))
		  
		  
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
		  

		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CampaignTargetingAnalyticsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CampaignTargetingAnalyticsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CampaignTargetingAnalyticsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MetricsResponse) As Boolean
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
		Private Sub CampaignTargetingAnalyticsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MetricsResponse
		  CallbackHandler.CampaignTargetingAnalyticsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignTargetingAnalyticsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MetricsResponse
		  Call CampaignTargetingAnalyticsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignTargetingAnalyticsGetCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_CampaignTargetingAnalyticsGetToString(value As ColumnsEnum_CampaignTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Ctr
		      Return "CTR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.OutboundCtr1
		      Return "OUTBOUND_CTR_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CampaignBrandLabel
		      Return "CAMPAIGN_BRAND_LABEL"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdGroupBudgetType
		      Return "AD_GROUP_BUDGET_TYPE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdGroupBudgetInLocalCurrency
		      Return "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdGroupBidMultiplier
		      Return "AD_GROUP_BID_MULTIPLIER"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.PromoId
		      Return "PROMO_ID"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.PromoName
		      Return "PROMO_NAME"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CostPerOutboundClickInDollar1
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdName
		      Return "AD_NAME"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.AdGroupOptimization
		      Return "AD_GROUP_OPTIMIZATION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CampaignBudgetOptimization
		      Return "CAMPAIGN_BUDGET_OPTIMIZATION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.IsPremiereCampaign
		      Return "IS_PREMIERE_CAMPAIGN"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalAddToWishlist
		      Return "TOTAL_ADD_TO_WISHLIST"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalSubscribe
		      Return "TOTAL_SUBSCRIBE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ProductGroupAdImageTag
		      Return "PRODUCT_GROUP_AD_IMAGE_TAG"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ProductGroupAdVideoTag
		      Return "PRODUCT_GROUP_AD_VIDEO_TAG"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Video15secUniqueViews1
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Video15secUniqueViews2
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.PaidVideoViewableRate
		      Return "PAID_VIDEO_VIEWABLE_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.VideoSpendInDollar
		      Return "VIDEO_SPEND_IN_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideo15secUniqueViews
		      Return "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalAppInstallConversionRate
		      Return "TOTAL_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalInappAppInstallConversionRate
		      Return "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.Leads
		      Return "LEADS"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.QuizPinResultOpen
		      Return "QUIZ_PIN_RESULT_OPEN"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignTargetingAnalyticsGet.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_CampaignTargetingAnalyticsGetToString(value As Conversion_report_timeEnum_CampaignTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_CampaignTargetingAnalyticsGet.TimeOfAdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_CampaignTargetingAnalyticsGet.TimeOfConversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignsAnalytics(, adAccountId As String, startDate As Date, endDate As Date, campaignIds() As String, columns() As ColumnsEnum_CampaignsAnalytics, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_CampaignsAnalytics, engagementWindowDays As Engagement_window_daysEnum_CampaignsAnalytics, viewWindowDays As View_window_daysEnum_CampaignsAnalytics, conversionReportTime As Conversion_report_timeEnum_CampaignsAnalytics, Optional aggregateReportRows As Xoson.O.OptionalBoolean, reportingTimezone As OpenAPIClient.Models.ReportingTimeZoneOptional)
		  // Operation campaigns/analytics
		  // Get campaign analytics
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter campaignIds: (query) List of Campaign Ids to use to filter the results. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned 
		  // - parameter granularity: (query) TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  // - parameter aggregateReportRows: (query) Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional, default to false)
		  // - parameter reportingTimezone: (query) Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional, default to Nil)
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsAnalyticsCallback(CampaignsAnalyticsResponseInner) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/campaigns/analytics
		  // - Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
		  
		  Dim localVarQueryStringscolumns() As String
		  For Each localVarItemcolumns As ColumnsEnum_CampaignsAnalytics in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_CampaignsAnalyticsToString(localVarItemcolumns))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_CampaignsAnalyticsToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_CampaignsAnalyticsToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_CampaignsAnalyticsToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_CampaignsAnalyticsToString(conversionReportTime))
		  
		  If aggregateReportRows <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("aggregate_report_rows") + "=" + EncodeURLComponent(aggregateReportRows.ToString)
		  
		  If reportingTimezone <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("reporting_timezone") + "=" + EncodeURLComponent(Xoson.toJSON(reportingTimezone))
		  

		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/campaigns/analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CampaignsAnalytics_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CampaignsAnalytics_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CampaignsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As CampaignsAnalyticsResponseInner) As Boolean
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
		Private Sub CampaignsAnalytics_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data() As CampaignsAnalyticsResponseInner
		  CallbackHandler.CampaignsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignsAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As CampaignsAnalyticsResponseInner
		  Call CampaignsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_CampaignsAnalyticsToString(value As ColumnsEnum_CampaignsAnalytics) As String
		  Select Case value
		    
		    Case ColumnsEnum_CampaignsAnalytics.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_CampaignsAnalytics.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.Ctr
		      Return "CTR"
		    Case ColumnsEnum_CampaignsAnalytics.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_CampaignsAnalytics.OutboundCtr1
		      Return "OUTBOUND_CTR_1"
		    Case ColumnsEnum_CampaignsAnalytics.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_CampaignsAnalytics.CampaignBrandLabel
		      Return "CAMPAIGN_BRAND_LABEL"
		    Case ColumnsEnum_CampaignsAnalytics.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_CampaignsAnalytics.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_CampaignsAnalytics.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_CampaignsAnalytics.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_CampaignsAnalytics.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_CampaignsAnalytics.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_CampaignsAnalytics.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_CampaignsAnalytics.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_CampaignsAnalytics.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_CampaignsAnalytics.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_CampaignsAnalytics.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_CampaignsAnalytics.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_CampaignsAnalytics.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_CampaignsAnalytics.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ColumnsEnum_CampaignsAnalytics.AdGroupBudgetType
		      Return "AD_GROUP_BUDGET_TYPE"
		    Case ColumnsEnum_CampaignsAnalytics.AdGroupBudgetInLocalCurrency
		      Return "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum_CampaignsAnalytics.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_CampaignsAnalytics.AdGroupBidMultiplier
		      Return "AD_GROUP_BID_MULTIPLIER"
		    Case ColumnsEnum_CampaignsAnalytics.PromoId
		      Return "PROMO_ID"
		    Case ColumnsEnum_CampaignsAnalytics.PromoName
		      Return "PROMO_NAME"
		    Case ColumnsEnum_CampaignsAnalytics.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_CampaignsAnalytics.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_CampaignsAnalytics.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_CampaignsAnalytics.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_CampaignsAnalytics.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_CampaignsAnalytics.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_CampaignsAnalytics.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_CampaignsAnalytics.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_CampaignsAnalytics.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_CampaignsAnalytics.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_CampaignsAnalytics.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_CampaignsAnalytics.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_CampaignsAnalytics.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_CampaignsAnalytics.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_CampaignsAnalytics.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_CampaignsAnalytics.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_CampaignsAnalytics.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.CostPerOutboundClickInDollar1
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1"
		    Case ColumnsEnum_CampaignsAnalytics.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_CampaignsAnalytics.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_CampaignsAnalytics.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_CampaignsAnalytics.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_CampaignsAnalytics.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_CampaignsAnalytics.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_CampaignsAnalytics.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_CampaignsAnalytics.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_CampaignsAnalytics.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_CampaignsAnalytics.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_CampaignsAnalytics.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_CampaignsAnalytics.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_CampaignsAnalytics.AdName
		      Return "AD_NAME"
		    Case ColumnsEnum_CampaignsAnalytics.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_CampaignsAnalytics.AdGroupOptimization
		      Return "AD_GROUP_OPTIMIZATION"
		    Case ColumnsEnum_CampaignsAnalytics.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_CampaignsAnalytics.CampaignBudgetOptimization
		      Return "CAMPAIGN_BUDGET_OPTIMIZATION"
		    Case ColumnsEnum_CampaignsAnalytics.IsPremiereCampaign
		      Return "IS_PREMIERE_CAMPAIGN"
		    Case ColumnsEnum_CampaignsAnalytics.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_CampaignsAnalytics.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_CampaignsAnalytics.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_CampaignsAnalytics.TotalAddToWishlist
		      Return "TOTAL_ADD_TO_WISHLIST"
		    Case ColumnsEnum_CampaignsAnalytics.TotalSubscribe
		      Return "TOTAL_SUBSCRIBE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_CampaignsAnalytics.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_CampaignsAnalytics.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_CampaignsAnalytics.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_CampaignsAnalytics.ProductGroupAdImageTag
		      Return "PRODUCT_GROUP_AD_IMAGE_TAG"
		    Case ColumnsEnum_CampaignsAnalytics.ProductGroupAdVideoTag
		      Return "PRODUCT_GROUP_AD_VIDEO_TAG"
		    Case ColumnsEnum_CampaignsAnalytics.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
		    Case ColumnsEnum_CampaignsAnalytics.Video15secUniqueViews1
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_1"
		    Case ColumnsEnum_CampaignsAnalytics.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_CampaignsAnalytics.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_CampaignsAnalytics.Video15secUniqueViews2
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_2"
		    Case ColumnsEnum_CampaignsAnalytics.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_CampaignsAnalytics.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_CampaignsAnalytics.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_CampaignsAnalytics.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_CampaignsAnalytics.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_CampaignsAnalytics.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_CampaignsAnalytics.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_CampaignsAnalytics.PaidVideoViewableRate
		      Return "PAID_VIDEO_VIEWABLE_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_CampaignsAnalytics.VideoSpendInDollar
		      Return "VIDEO_SPEND_IN_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideo15secUniqueViews
		      Return "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_CampaignsAnalytics.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_CampaignsAnalytics.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_CampaignsAnalytics.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_CampaignsAnalytics.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_CampaignsAnalytics.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_CampaignsAnalytics.TotalAppInstallConversionRate
		      Return "TOTAL_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalInappAppInstallConversionRate
		      Return "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_CampaignsAnalytics.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_CampaignsAnalytics.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_CampaignsAnalytics.Leads
		      Return "LEADS"
		    Case ColumnsEnum_CampaignsAnalytics.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_CampaignsAnalytics.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_CampaignsAnalytics.QuizPinResultOpen
		      Return "QUIZ_PIN_RESULT_OPEN"
		    Case ColumnsEnum_CampaignsAnalytics.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_CampaignsAnalytics.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_CampaignsAnalytics.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_CampaignsAnalytics.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_CampaignsAnalyticsToString(value As Conversion_report_timeEnum_CampaignsAnalytics) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_CampaignsAnalytics.TimeOfAdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_CampaignsAnalytics.TimeOfConversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignsCreate(, adAccountId As String, campaignCreateRequest() As OpenAPIClient.Models.CampaignCreateRequest)
		  // Operation campaigns/create
		  // Create campaigns
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignCreateRequest: (body) Array of campaigns. 
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsCreateCallback(CampaignCreateResponse) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/campaigns
		  // - Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href="https://help.pinterest.com/en/business/article/set-up-your-campaign/">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(campaignCreateRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/campaigns"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CampaignsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CampaignsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CampaignsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CampaignCreateResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CampaignCreateResponse
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
		Private Sub CampaignsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CampaignCreateResponse
		  CallbackHandler.CampaignsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CampaignCreateResponse
		  Call CampaignsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub CampaignsGet(, adAccountId As String, campaignId As String)
		  // Operation campaigns/get
		  // Get campaign
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignId: (path) Campaign ID, must be associated with the ad account ID provided in the path. 
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsGetCallback(CampaignResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/campaigns/{campaign_id}
		  // - Get a specific campaign given the campaign ID.
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
		  
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  Dim localVarPathStringcampaignId As String = campaignId
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaign_id}", localVarPathStringcampaignId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CampaignsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CampaignsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CampaignsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CampaignResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CampaignResponse
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
		Private Sub CampaignsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CampaignResponse
		  CallbackHandler.CampaignsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CampaignResponse
		  Call CampaignsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub CampaignsList(, adAccountId As String, campaignIds() As String, entityStatuses() As Entity_statusesEnum_CampaignsList, Optional pageSize As Xoson.O.OptionalInteger, order As OrderEnum_CampaignsList, Optional bookmark As Xoson.O.OptionalString)
		  // Operation campaigns/list
		  // List campaigns
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignIds: (query) List of Campaign Ids to use to filter the results. (optional, default to Nil)
		  // - parameter entityStatuses: (query) Entity status (optional, default to ["ACTIVE","PAUSED"])
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter order: (query) The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to Sample)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsListCallback(CampaignsList200Response) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/campaigns
		  // - Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
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
		  
		  Dim localVarQueryStringsentityStatuses() As String
		  For Each localVarItementityStatuses As Entity_statusesEnum_CampaignsList in entityStatuses
		    Dim encodedParameter As String = EncodeURLComponent(Entity_statusesEnum_CampaignsListToString(localVarItementityStatuses))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(OrderEnum_CampaignsListToString(order))
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  

		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/campaigns"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CampaignsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CampaignsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CampaignsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CampaignsList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CampaignsList200Response
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
		Private Sub CampaignsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CampaignsList200Response
		  CallbackHandler.CampaignsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CampaignsList200Response
		  Call CampaignsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignsListCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Entity_statusesEnum_CampaignsListToString(value As Entity_statusesEnum_CampaignsList) As String
		  Select Case value
		    
		    Case Entity_statusesEnum_CampaignsList.Active
		      Return "ACTIVE"
		    Case Entity_statusesEnum_CampaignsList.Paused
		      Return "PAUSED"
		    Case Entity_statusesEnum_CampaignsList.Archived
		      Return "ARCHIVED"
		    Case Entity_statusesEnum_CampaignsList.Draft
		      Return "DRAFT"
		    Case Entity_statusesEnum_CampaignsList.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function OrderEnum_CampaignsListToString(value As OrderEnum_CampaignsList) As String
		  Select Case value
		    
		    Case OrderEnum_CampaignsList.Ascending
		      Return "ASCENDING"
		    Case OrderEnum_CampaignsList.Descending
		      Return "DESCENDING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignsUpdate(, adAccountId As String, campaignUpdateRequest() As OpenAPIClient.Models.CampaignUpdateRequest)
		  // Operation campaigns/update
		  // Update campaigns
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignUpdateRequest: (body) Array of campaigns. 
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsUpdateCallback(CampaignUpdateResponse) on completion. 
		  //
		  // - PATCH /ad_accounts/{ad_account_id}/campaigns
		  // - <p>Update multiple ad campaigns based on campaign_ids. </p> <p><strong>Note:</strong></p> - <p>The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(campaignUpdateRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/campaigns"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CampaignsUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CampaignsUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CampaignsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CampaignUpdateResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CampaignUpdateResponse
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
		Private Sub CampaignsUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CampaignUpdateResponse
		  CallbackHandler.CampaignsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CampaignUpdateResponse
		  Call CampaignsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignsUpdateCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.CampaignsApiCallbackHandler
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

	#tag Enum, Name = ColumnsEnum_AdPinsAnalytics, Type = Integer, Flags = &h0
		
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

	#tag Enum, Name = Click_window_daysEnum_AdPinsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdPinsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdPinsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdPinsAnalytics, Type = Integer, Flags = &h0
		
        TimeOfAdAction
        TimeOfConversion
		
	#tag EndEnum

	#tag Enum, Name = ColumnsEnum_CampaignTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
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

	#tag Enum, Name = Click_window_daysEnum_CampaignTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_CampaignTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_CampaignTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_CampaignTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        TimeOfAdAction
        TimeOfConversion
		
	#tag EndEnum

	#tag Enum, Name = ColumnsEnum_CampaignsAnalytics, Type = Integer, Flags = &h0
		
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

	#tag Enum, Name = Click_window_daysEnum_CampaignsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_CampaignsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_CampaignsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_CampaignsAnalytics, Type = Integer, Flags = &h0
		
        TimeOfAdAction
        TimeOfConversion
		
	#tag EndEnum

	#tag Enum, Name = Entity_statusesEnum_CampaignsList, Type = Integer, Flags = &h0
		
        Active
        Paused
        Archived
        Draft
        DeletedDraft
		
	#tag EndEnum

	#tag Enum, Name = OrderEnum_CampaignsList, Type = Integer, Flags = &h0
		
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
