#tag Class
Protected Class AdsApi
	#tag Method, Flags = &h0
		Sub AdPreviewsCreate(, adAccountId As String, adPreviewRequest As OpenAPIClient.Models.AdPreviewRequest)
		  // Operation ad_previews/create
		  // Create ad preview with pin or image
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adPreviewRequest: (body) Create ad preview with pin or image. 
		  //
		  // Invokes AdsApiCallbackHandler.AdPreviewsCreateCallback(AdPreviewURLResponse) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/ad_previews
		  // - Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href="https://help.pinterest.com/en/business/article/promoted-pins-overview" target="_blank">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adPreviewRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_previews"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdPreviewsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdPreviewsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdPreviewsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdPreviewURLResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdPreviewURLResponse
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
		Private Sub AdPreviewsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdPreviewURLResponse
		  CallbackHandler.AdPreviewsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdPreviewsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdPreviewURLResponse
		  Call AdPreviewsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdPreviewsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdTargetingAnalyticsGet(, adAccountId As String, adIds() As String, startDate As Date, endDate As Date, targetingTypes() As AdsAnalyticsTargetingType, columns() As ColumnsEnum_AdTargetingAnalyticsGet, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_AdTargetingAnalyticsGet, engagementWindowDays As Engagement_window_daysEnum_AdTargetingAnalyticsGet, viewWindowDays As View_window_daysEnum_AdTargetingAnalyticsGet, conversionReportTime As Conversion_report_timeEnum_AdTargetingAnalyticsGet, attributionTypes As OpenAPIClient.Models.ConversionReportAttributionTypeOptional)
		  // Operation ad_targeting_analytics/get
		  // Get targeting analytics for ads
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adIds: (query) List of Ad Ids to use to filter the results. 
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
		  // Invokes AdsApiCallbackHandler.AdTargetingAnalyticsGetCallback(MetricsResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ads/targeting_analytics
		  // - Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  
		  Dim localVarQueryStringsadIds() As String
		  For Each localVarItemadIds As String in adIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemadIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsadIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsadIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsadIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringadIds As String
		  localVarQueryStringadIds = Join(localVarQueryStringsadIds, "&")
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
		  For Each localVarItemcolumns As ColumnsEnum_AdTargetingAnalyticsGet in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_AdTargetingAnalyticsGetToString(localVarItemcolumns))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_AdTargetingAnalyticsGetToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_AdTargetingAnalyticsGetToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_AdTargetingAnalyticsGetToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_AdTargetingAnalyticsGetToString(conversionReportTime))
		  
		  If attributionTypes <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("attribution_types") + "=" + EncodeURLComponent(Xoson.toJSON(attributionTypes))
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ads/targeting_analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdTargetingAnalyticsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdTargetingAnalyticsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdTargetingAnalyticsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MetricsResponse) As Boolean
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
		Private Sub AdTargetingAnalyticsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MetricsResponse
		  CallbackHandler.AdTargetingAnalyticsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdTargetingAnalyticsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MetricsResponse
		  Call AdTargetingAnalyticsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdTargetingAnalyticsGetCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_AdTargetingAnalyticsGetToString(value As ColumnsEnum_AdTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case ColumnsEnum_AdTargetingAnalyticsGet.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Ctr
		      Return "CTR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.Leads
		      Return "LEADS"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_AdTargetingAnalyticsGet.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_AdTargetingAnalyticsGetToString(value As Conversion_report_timeEnum_AdTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_AdTargetingAnalyticsGet.AdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_AdTargetingAnalyticsGet.Conversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdsAnalytics(, adAccountId As String, startDate As Date, endDate As Date, adIds() As String, columns() As ColumnsEnum_AdsAnalytics, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_AdsAnalytics, engagementWindowDays As Engagement_window_daysEnum_AdsAnalytics, viewWindowDays As View_window_daysEnum_AdsAnalytics, conversionReportTime As Conversion_report_timeEnum_AdsAnalytics)
		  // Operation ads/analytics
		  // Get ad analytics
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter adIds: (query) List of Ad Ids to use to filter the results. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned 
		  // - parameter granularity: (query) TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  //
		  // Invokes AdsApiCallbackHandler.AdsAnalyticsCallback(AdsAnalyticsResponseInner) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ads/analytics
		  // - Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
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
		  
		  
		  Dim localVarQueryStringsadIds() As String
		  For Each localVarItemadIds As String in adIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemadIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsadIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsadIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsadIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringadIds As String
		  localVarQueryStringadIds = Join(localVarQueryStringsadIds, "&")
		  
		  Dim localVarQueryStringscolumns() As String
		  For Each localVarItemcolumns As ColumnsEnum_AdsAnalytics in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_AdsAnalyticsToString(localVarItemcolumns))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_AdsAnalyticsToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_AdsAnalyticsToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_AdsAnalyticsToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_AdsAnalyticsToString(conversionReportTime))
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ads/analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdsAnalytics_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdsAnalytics_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As AdsAnalyticsResponseInner) As Boolean
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
		Private Sub AdsAnalytics_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data() As AdsAnalyticsResponseInner
		  CallbackHandler.AdsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdsAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As AdsAnalyticsResponseInner
		  Call AdsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_AdsAnalyticsToString(value As ColumnsEnum_AdsAnalytics) As String
		  Select Case value
		    
		    Case ColumnsEnum_AdsAnalytics.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_AdsAnalytics.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.Ctr
		      Return "CTR"
		    Case ColumnsEnum_AdsAnalytics.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_AdsAnalytics.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_AdsAnalytics.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_AdsAnalytics.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_AdsAnalytics.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_AdsAnalytics.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_AdsAnalytics.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_AdsAnalytics.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_AdsAnalytics.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_AdsAnalytics.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_AdsAnalytics.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_AdsAnalytics.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_AdsAnalytics.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_AdsAnalytics.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_AdsAnalytics.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_AdsAnalytics.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_AdsAnalytics.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_AdsAnalytics.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_AdsAnalytics.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_AdsAnalytics.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_AdsAnalytics.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_AdsAnalytics.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_AdsAnalytics.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_AdsAnalytics.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_AdsAnalytics.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_AdsAnalytics.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_AdsAnalytics.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_AdsAnalytics.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_AdsAnalytics.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_AdsAnalytics.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_AdsAnalytics.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_AdsAnalytics.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_AdsAnalytics.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_AdsAnalytics.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_AdsAnalytics.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_AdsAnalytics.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_AdsAnalytics.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdsAnalytics.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_AdsAnalytics.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_AdsAnalytics.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdsAnalytics.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_AdsAnalytics.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_AdsAnalytics.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_AdsAnalytics.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdsAnalytics.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_AdsAnalytics.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_AdsAnalytics.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_AdsAnalytics.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_AdsAnalytics.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_AdsAnalytics.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_AdsAnalytics.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_AdsAnalytics.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_AdsAnalytics.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_AdsAnalytics.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_AdsAnalytics.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_AdsAnalytics.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_AdsAnalytics.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_AdsAnalytics.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_AdsAnalytics.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_AdsAnalytics.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_AdsAnalytics.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_AdsAnalytics.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_AdsAnalytics.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_AdsAnalytics.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_AdsAnalytics.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_AdsAnalytics.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_AdsAnalytics.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_AdsAnalytics.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_AdsAnalytics.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_AdsAnalytics.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_AdsAnalytics.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_AdsAnalytics.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_AdsAnalytics.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_AdsAnalytics.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_AdsAnalytics.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_AdsAnalytics.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_AdsAnalytics.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_AdsAnalytics.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_AdsAnalytics.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_AdsAnalytics.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_AdsAnalytics.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_AdsAnalytics.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdsAnalytics.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_AdsAnalytics.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_AdsAnalytics.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_AdsAnalytics.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_AdsAnalytics.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_AdsAnalytics.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_AdsAnalytics.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_AdsAnalytics.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_AdsAnalytics.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_AdsAnalytics.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_AdsAnalytics.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_AdsAnalytics.Leads
		      Return "LEADS"
		    Case ColumnsEnum_AdsAnalytics.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_AdsAnalytics.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_AdsAnalytics.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_AdsAnalytics.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_AdsAnalytics.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_AdsAnalytics.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_AdsAnalytics.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_AdsAnalytics.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_AdsAnalytics.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_AdsAnalytics.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_AdsAnalytics.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_AdsAnalytics.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_AdsAnalytics.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_AdsAnalytics.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_AdsAnalytics.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_AdsAnalyticsToString(value As Conversion_report_timeEnum_AdsAnalytics) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_AdsAnalytics.AdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_AdsAnalytics.Conversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdsCreate(, adAccountId As String, adCreateRequest() As OpenAPIClient.Models.AdCreateRequest)
		  // Operation ads/create
		  // Create ads
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adCreateRequest: (body) List of ads to create, size limit [1, 30]. 
		  //
		  // Invokes AdsApiCallbackHandler.AdsCreateCallback(AdArrayResponse) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/ads
		  // - Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adCreateRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ads"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdArrayResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdArrayResponse
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
		Private Sub AdsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdArrayResponse
		  CallbackHandler.AdsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdArrayResponse
		  Call AdsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdsGet(, adAccountId As String, adId As String)
		  // Operation ads/get
		  // Get ad
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adId: (path) Unique identifier of an ad. 
		  //
		  // Invokes AdsApiCallbackHandler.AdsGetCallback(AdResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ads/{ad_id}
		  // - Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href="https://www.pinterest.com/_/_/policy/advertising-guidelines/" target="_blank">Pinterest advertising standards</a>.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ads/{ad_id}"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  Dim localVarPathStringadId As String = adId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_id}", localVarPathStringadId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdResponse
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
		Private Sub AdsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdResponse
		  CallbackHandler.AdsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdResponse
		  Call AdsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdsList(, adAccountId As String, campaignIds() As String, adGroupIds() As String, adIds() As String, entityStatuses() As Entity_statusesEnum_AdsList, Optional pageSize As Xoson.O.OptionalInteger, order As OrderEnum_AdsList, Optional bookmark As Xoson.O.OptionalString)
		  // Operation ads/list
		  // List ads
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignIds: (query) List of Campaign Ids to use to filter the results. (optional, default to Nil)
		  // - parameter adGroupIds: (query) List of Ad group Ids to use to filter the results. (optional, default to Nil)
		  // - parameter adIds: (query) List of Ad Ids to use to filter the results. (optional, default to Nil)
		  // - parameter entityStatuses: (query) Entity status (optional, default to ["ACTIVE","PAUSED"])
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter order: (query) The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to Sample)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  //
		  // Invokes AdsApiCallbackHandler.AdsListCallback(AdsList200Response) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ads
		  // - List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href="https://policy.pinterest.com/en/advertising-guidelines">Pinterest advertising standards</a>.
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
		  
		  Dim localVarQueryStringsadIds() As String
		  For Each localVarItemadIds As String in adIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemadIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsadIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsadIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsadIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringadIds As String
		  localVarQueryStringadIds = Join(localVarQueryStringsadIds, "&")
		  
		  Dim localVarQueryStringsentityStatuses() As String
		  For Each localVarItementityStatuses As Entity_statusesEnum_AdsList in entityStatuses
		    Dim encodedParameter As String = EncodeURLComponent(Entity_statusesEnum_AdsListToString(localVarItementityStatuses))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(OrderEnum_AdsListToString(order))
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ads"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdsList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdsList200Response
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
		Private Sub AdsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdsList200Response
		  CallbackHandler.AdsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdsList200Response
		  Call AdsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdsListCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Entity_statusesEnum_AdsListToString(value As Entity_statusesEnum_AdsList) As String
		  Select Case value
		    
		    Case Entity_statusesEnum_AdsList.Active
		      Return "ACTIVE"
		    Case Entity_statusesEnum_AdsList.Paused
		      Return "PAUSED"
		    Case Entity_statusesEnum_AdsList.Archived
		      Return "ARCHIVED"
		    Case Entity_statusesEnum_AdsList.Draft
		      Return "DRAFT"
		    Case Entity_statusesEnum_AdsList.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function OrderEnum_AdsListToString(value As OrderEnum_AdsList) As String
		  Select Case value
		    
		    Case OrderEnum_AdsList.Ascending
		      Return "ASCENDING"
		    Case OrderEnum_AdsList.Descending
		      Return "DESCENDING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdsUpdate(, adAccountId As String, adUpdateRequest() As OpenAPIClient.Models.AdUpdateRequest)
		  // Operation ads/update
		  // Update ads
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adUpdateRequest: (body) List of ads to update, size limit [1, 30] 
		  //
		  // Invokes AdsApiCallbackHandler.AdsUpdateCallback(AdArrayResponse) on completion. 
		  //
		  // - PATCH /ad_accounts/{ad_account_id}/ads
		  // - Update multiple existing ads
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adUpdateRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ads"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdsUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdsUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdArrayResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdArrayResponse
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
		Private Sub AdsUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdArrayResponse
		  CallbackHandler.AdsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdArrayResponse
		  Call AdsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdsUpdateCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.AdsApiCallbackHandler
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

	#tag Enum, Name = ColumnsEnum_AdTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
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

	#tag Enum, Name = Click_window_daysEnum_AdTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        AdAction
        Conversion
		
	#tag EndEnum

	#tag Enum, Name = ColumnsEnum_AdsAnalytics, Type = Integer, Flags = &h0
		
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

	#tag Enum, Name = Click_window_daysEnum_AdsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdsAnalytics, Type = Integer, Flags = &h0
		
        AdAction
        Conversion
		
	#tag EndEnum

	#tag Enum, Name = Entity_statusesEnum_AdsList, Type = Integer, Flags = &h0
		
        Active
        Paused
        Archived
        Draft
        DeletedDraft
		
	#tag EndEnum

	#tag Enum, Name = OrderEnum_AdsList, Type = Integer, Flags = &h0
		
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
