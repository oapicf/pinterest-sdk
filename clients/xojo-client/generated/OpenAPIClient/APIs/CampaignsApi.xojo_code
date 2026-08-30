#tag Class
Protected Class CampaignsApi
	#tag Method, Flags = &h0
		Sub AdPinsAnalytics(, campaignId As String, pinIds() As String, startDate As Date, endDate As Date, columns() As ReportingColumnSync, granularity As OpenAPIClient.Models.Granularity, adAccountId As String, clickWindowDays As Click_window_daysEnum_AdPinsAnalytics, engagementWindowDays As Engagement_window_daysEnum_AdPinsAnalytics, viewWindowDays As View_window_daysEnum_AdPinsAnalytics, conversionReportTime As Conversion_report_timeEnum_AdPinsAnalytics)
		  // Operation ad_pins/analytics
		  // Get pins analytics
		  // - 
		  // - parameter campaignId: (query) Campaign Id to use to filter the results. 
		  // - parameter pinIds: (query) List of Pin IDs. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. 
		  // - parameter granularity: (query)   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  //
		  // Invokes CampaignsApiCallbackHandler.AdPinsAnalyticsCallback(AdPinAnalytics) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/pins/analytics
		  // - Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
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
		  For Each localVarItemcolumns As ReportingColumnSync in columns
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemcolumns))
		    localVarQueryStringscolumns.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringcolumns As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringcolumns = "inner=" + Join(localVarQueryStringscolumns, ",")
		    Case "spaceDelimited"
		      localVarQueryStringcolumns = "inner=" + Join(localVarQueryStringscolumns, " ")
		    Case "pipeDelimited"
		      localVarQueryStringcolumns = "inner=" + Join(localVarQueryStringscolumns, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringscolumns.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringcolumns)
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
		Private Function AdPinsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As OpenAPIClient.Models.AdPinAnalytics) As Boolean
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
		  Dim data() As OpenAPIClient.Models.AdPinAnalytics
		  CallbackHandler.AdPinsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdPinsAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As OpenAPIClient.Models.AdPinAnalytics
		  Call AdPinsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdPinsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Click_window_daysEnum_AdPinsAnalyticsToString(value As Click_window_daysEnum_AdPinsAnalytics) As String
		  Select Case value
		    
		    Case Click_window_daysEnum_AdPinsAnalytics.Escaped0
		      Return "0"
		    Case Click_window_daysEnum_AdPinsAnalytics.Escaped1
		      Return "1"
		    Case Click_window_daysEnum_AdPinsAnalytics.Escaped7
		      Return "7"
		    Case Click_window_daysEnum_AdPinsAnalytics.Escaped14
		      Return "14"
		    Case Click_window_daysEnum_AdPinsAnalytics.Escaped30
		      Return "30"
		    Case Click_window_daysEnum_AdPinsAnalytics.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Engagement_window_daysEnum_AdPinsAnalyticsToString(value As Engagement_window_daysEnum_AdPinsAnalytics) As String
		  Select Case value
		    
		    Case Engagement_window_daysEnum_AdPinsAnalytics.Escaped0
		      Return "0"
		    Case Engagement_window_daysEnum_AdPinsAnalytics.Escaped1
		      Return "1"
		    Case Engagement_window_daysEnum_AdPinsAnalytics.Escaped7
		      Return "7"
		    Case Engagement_window_daysEnum_AdPinsAnalytics.Escaped14
		      Return "14"
		    Case Engagement_window_daysEnum_AdPinsAnalytics.Escaped30
		      Return "30"
		    Case Engagement_window_daysEnum_AdPinsAnalytics.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function View_window_daysEnum_AdPinsAnalyticsToString(value As View_window_daysEnum_AdPinsAnalytics) As String
		  Select Case value
		    
		    Case View_window_daysEnum_AdPinsAnalytics.Escaped0
		      Return "0"
		    Case View_window_daysEnum_AdPinsAnalytics.Escaped1
		      Return "1"
		    Case View_window_daysEnum_AdPinsAnalytics.Escaped7
		      Return "7"
		    Case View_window_daysEnum_AdPinsAnalytics.Escaped14
		      Return "14"
		    Case View_window_daysEnum_AdPinsAnalytics.Escaped30
		      Return "30"
		    Case View_window_daysEnum_AdPinsAnalytics.Escaped60
		      Return "60"
		    
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
		Sub CampaignTargetingAnalyticsGet(, adAccountId As String, campaignIds() As String, startDate As Date, endDate As Date, targetingTypes() As AdsAnalyticsCampaignTargetingType, columns() As ReportingColumnSync, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_CampaignTargetingAnalyticsGet, engagementWindowDays As Engagement_window_daysEnum_CampaignTargetingAnalyticsGet, viewWindowDays As View_window_daysEnum_CampaignTargetingAnalyticsGet, conversionReportTime As Conversion_report_timeEnum_CampaignTargetingAnalyticsGet, attributionTypes() As ConversionReportAttributionType, reportingTimezone As OpenAPIClient.Models.ReportingTimeZoneOptional)
		  // Operation campaign_targeting_analytics/get
		  // Get targeting analytics for campaigns
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignIds: (query) List of Campaign Ids to use to filter the results. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter targetingTypes: (query) Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [&quot;AGE_BUCKET_AND_GENDER&quot;] is in BETA and not yet available to all users. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. 
		  // - parameter granularity: (query)   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  // - parameter attributionTypes: (query) List of types of attribution for the conversion report (optional, default to Nil)
		  // - parameter reportingTimezone: (query) Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional, default to Nil)
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignTargetingAnalyticsGetCallback(MetricsResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/campaigns/targeting_analytics
		  // - Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
		  For Each localVarItemcolumns As ReportingColumnSync in columns
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemcolumns))
		    localVarQueryStringscolumns.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringcolumns As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringcolumns = "inner=" + Join(localVarQueryStringscolumns, ",")
		    Case "spaceDelimited"
		      localVarQueryStringcolumns = "inner=" + Join(localVarQueryStringscolumns, " ")
		    Case "pipeDelimited"
		      localVarQueryStringcolumns = "inner=" + Join(localVarQueryStringscolumns, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringscolumns.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringcolumns)
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
		Private Function Click_window_daysEnum_CampaignTargetingAnalyticsGetToString(value As Click_window_daysEnum_CampaignTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case Click_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped0
		      Return "0"
		    Case Click_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped1
		      Return "1"
		    Case Click_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped7
		      Return "7"
		    Case Click_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped14
		      Return "14"
		    Case Click_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped30
		      Return "30"
		    Case Click_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Engagement_window_daysEnum_CampaignTargetingAnalyticsGetToString(value As Engagement_window_daysEnum_CampaignTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case Engagement_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped0
		      Return "0"
		    Case Engagement_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped1
		      Return "1"
		    Case Engagement_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped7
		      Return "7"
		    Case Engagement_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped14
		      Return "14"
		    Case Engagement_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped30
		      Return "30"
		    Case Engagement_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function View_window_daysEnum_CampaignTargetingAnalyticsGetToString(value As View_window_daysEnum_CampaignTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case View_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped0
		      Return "0"
		    Case View_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped1
		      Return "1"
		    Case View_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped7
		      Return "7"
		    Case View_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped14
		      Return "14"
		    Case View_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped30
		      Return "30"
		    Case View_window_daysEnum_CampaignTargetingAnalyticsGet.Escaped60
		      Return "60"
		    
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
		Sub CampaignsAnalytics(, startDate As Date, endDate As Date, campaignIds() As String, columns() As ReportingColumnSync, granularity As OpenAPIClient.Models.Granularity, adAccountId As String, clickWindowDays As Click_window_daysEnum_CampaignsAnalytics, engagementWindowDays As Engagement_window_daysEnum_CampaignsAnalytics, viewWindowDays As View_window_daysEnum_CampaignsAnalytics, conversionReportTime As Conversion_report_timeEnum_CampaignsAnalytics, Optional aggregateReportRows As Xoson.O.OptionalBoolean, reportingTimezone As OpenAPIClient.Models.ReportingTimeZoneOptional)
		  // Operation campaigns/analytics
		  // Get campaign analytics
		  // - 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter campaignIds: (query) List of Campaign Ids to use to filter the results. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. 
		  // - parameter granularity: (query)   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  // - parameter aggregateReportRows: (query) Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional, default to false)
		  // - parameter reportingTimezone: (query) Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional, default to Nil)
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsAnalyticsCallback(CampaignsAnalyticsMetrics) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/campaigns/analytics
		  // - Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
		  For Each localVarItemcolumns As ReportingColumnSync in columns
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemcolumns))
		    localVarQueryStringscolumns.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringcolumns As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringcolumns = "inner=" + Join(localVarQueryStringscolumns, ",")
		    Case "spaceDelimited"
		      localVarQueryStringcolumns = "inner=" + Join(localVarQueryStringscolumns, " ")
		    Case "pipeDelimited"
		      localVarQueryStringcolumns = "inner=" + Join(localVarQueryStringscolumns, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringscolumns.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringcolumns)
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
		Private Function CampaignsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As OpenAPIClient.Models.CampaignsAnalyticsMetrics) As Boolean
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
		  Dim data() As OpenAPIClient.Models.CampaignsAnalyticsMetrics
		  CallbackHandler.CampaignsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignsAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As OpenAPIClient.Models.CampaignsAnalyticsMetrics
		  Call CampaignsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Click_window_daysEnum_CampaignsAnalyticsToString(value As Click_window_daysEnum_CampaignsAnalytics) As String
		  Select Case value
		    
		    Case Click_window_daysEnum_CampaignsAnalytics.Escaped0
		      Return "0"
		    Case Click_window_daysEnum_CampaignsAnalytics.Escaped1
		      Return "1"
		    Case Click_window_daysEnum_CampaignsAnalytics.Escaped7
		      Return "7"
		    Case Click_window_daysEnum_CampaignsAnalytics.Escaped14
		      Return "14"
		    Case Click_window_daysEnum_CampaignsAnalytics.Escaped30
		      Return "30"
		    Case Click_window_daysEnum_CampaignsAnalytics.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Engagement_window_daysEnum_CampaignsAnalyticsToString(value As Engagement_window_daysEnum_CampaignsAnalytics) As String
		  Select Case value
		    
		    Case Engagement_window_daysEnum_CampaignsAnalytics.Escaped0
		      Return "0"
		    Case Engagement_window_daysEnum_CampaignsAnalytics.Escaped1
		      Return "1"
		    Case Engagement_window_daysEnum_CampaignsAnalytics.Escaped7
		      Return "7"
		    Case Engagement_window_daysEnum_CampaignsAnalytics.Escaped14
		      Return "14"
		    Case Engagement_window_daysEnum_CampaignsAnalytics.Escaped30
		      Return "30"
		    Case Engagement_window_daysEnum_CampaignsAnalytics.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function View_window_daysEnum_CampaignsAnalyticsToString(value As View_window_daysEnum_CampaignsAnalytics) As String
		  Select Case value
		    
		    Case View_window_daysEnum_CampaignsAnalytics.Escaped0
		      Return "0"
		    Case View_window_daysEnum_CampaignsAnalytics.Escaped1
		      Return "1"
		    Case View_window_daysEnum_CampaignsAnalytics.Escaped7
		      Return "7"
		    Case View_window_daysEnum_CampaignsAnalytics.Escaped14
		      Return "14"
		    Case View_window_daysEnum_CampaignsAnalytics.Escaped30
		      Return "30"
		    Case View_window_daysEnum_CampaignsAnalytics.Escaped60
		      Return "60"
		    
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
		Sub CampaignsCreate(, adAccountId As String, campaignCreateItem() As OpenAPIClient.Models.CampaignCreateItem)
		  // Operation campaigns/create
		  // Create campaigns
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignCreateItem: (body)  
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsCreateCallback(CampaignBatchWriteResponseModel) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/campaigns
		  // - Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(campaignCreateItem), "application/json")
		  
		  
		  


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
		Private Function CampaignsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CampaignBatchWriteResponseModel) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CampaignBatchWriteResponseModel
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
		  Dim data As OpenAPIClient.Models.CampaignBatchWriteResponseModel
		  CallbackHandler.CampaignsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CampaignBatchWriteResponseModel
		  Call CampaignsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub CampaignsGet(, campaignId As String, adAccountId As String)
		  // Operation campaigns/get
		  // Get campaign
		  // - 
		  // - parameter campaignId: (path) Campaign ID, must be associated with the ad account ID provided in the path. 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsGetCallback(Campaign) on completion. 
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
		  
		  Dim localVarPathStringcampaignId As String = campaignId
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaign_id}", localVarPathStringcampaignId)
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
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
		Private Function CampaignsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Campaign) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Campaign
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
		  Dim data As OpenAPIClient.Models.Campaign
		  CallbackHandler.CampaignsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Campaign
		  Call CampaignsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub CampaignsList(, adAccountId As String, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger, order As OpenAPIClient.Models.PinterestLibPaginationOrderOptional, campaignIds() As String, entityStatuses() As EntityStatus)
		  // Operation campaigns/list
		  // List campaigns
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  // - parameter order: (query) The order in which to sort the items returned: &quot;ASCENDING&quot; or &quot;DESCENDING&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to Nil)
		  // - parameter campaignIds: (query) List of Campaign Ids to use to filter the results. (optional, default to Nil)
		  // - parameter entityStatuses: (query) Entity status (optional, default to ["ACTIVE","PAUSED"])
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsListCallback(CampaignsList200Response) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/campaigns
		  // - Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
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
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  
		  If order <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(Xoson.toJSON(order))
		  
		  
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
		  For Each localVarItementityStatuses As EntityStatus in entityStatuses
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItementityStatuses))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsentityStatuses.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsentityStatuses.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsentityStatuses.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringentityStatuses As String
		  localVarQueryStringentityStatuses = Join(localVarQueryStringsentityStatuses, "&")

		  
		  
		  


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




	#tag Method, Flags = &h0
		Sub CampaignsUpdate(, adAccountId As String, campaignBatchUpdateItem() As OpenAPIClient.Models.CampaignBatchUpdateItem)
		  // Operation campaigns/update
		  // Update campaigns
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignBatchUpdateItem: (body)  
		  //
		  // Invokes CampaignsApiCallbackHandler.CampaignsUpdateCallback(CampaignBatchWriteResponseModel) on completion. 
		  //
		  // - PATCH /ad_accounts/{ad_account_id}/campaigns
		  // - Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(campaignBatchUpdateItem), "application/json")
		  
		  
		  


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
		Private Function CampaignsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CampaignBatchWriteResponseModel) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CampaignBatchWriteResponseModel
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
		  Dim data As OpenAPIClient.Models.CampaignBatchWriteResponseModel
		  CallbackHandler.CampaignsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CampaignsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CampaignBatchWriteResponseModel
		  Call CampaignsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CampaignsUpdateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetCampaignDeliveryEstimates(, adAccountId As String, campaignDeliveryEstimatesCampaign() As OpenAPIClient.Models.CampaignDeliveryEstimatesCampaign)
		  // Operation get_campaign_delivery_estimates
		  // Get campaign delivery estimates
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignDeliveryEstimatesCampaign: (body)  
		  //
		  // Invokes CampaignsApiCallbackHandler.GetCampaignDeliveryEstimatesCallback(CampaignDeliveryEstimatesResponse) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/campaigns/delivery_estimates
		  // - Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(campaignDeliveryEstimatesCampaign), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetCampaignDeliveryEstimates_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetCampaignDeliveryEstimates_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetCampaignDeliveryEstimatesPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CampaignDeliveryEstimatesResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CampaignDeliveryEstimatesResponse
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
		Private Sub GetCampaignDeliveryEstimates_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CampaignDeliveryEstimatesResponse
		  CallbackHandler.GetCampaignDeliveryEstimatesCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetCampaignDeliveryEstimates_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CampaignDeliveryEstimatesResponse
		  Call GetCampaignDeliveryEstimatesPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetCampaignDeliveryEstimatesCallback(error, data)
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

	#tag Enum, Name = Click_window_daysEnum_AdPinsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdPinsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdPinsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdPinsAnalytics, Type = Integer, Flags = &h0
		
        TimeOfAdAction
        TimeOfConversion
		
	#tag EndEnum

	#tag Enum, Name = Click_window_daysEnum_CampaignTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_CampaignTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_CampaignTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_CampaignTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        TimeOfAdAction
        TimeOfConversion
		
	#tag EndEnum

	#tag Enum, Name = Click_window_daysEnum_CampaignsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_CampaignsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_CampaignsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_CampaignsAnalytics, Type = Integer, Flags = &h0
		
        TimeOfAdAction
        TimeOfConversion
		
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
