#tag Class
Protected Class AdGroupsApi
	#tag Method, Flags = &h0
		Sub AdGroupsAnalytics(, startDate As Date, endDate As Date, adGroupIds() As String, columns() As ReportingColumnSync, granularity As OpenAPIClient.Models.Granularity, adAccountId As String, clickWindowDays As Click_window_daysEnum_AdGroupsAnalytics, engagementWindowDays As Engagement_window_daysEnum_AdGroupsAnalytics, viewWindowDays As View_window_daysEnum_AdGroupsAnalytics, conversionReportTime As Conversion_report_timeEnum_AdGroupsAnalytics, Optional aggregateReportRows As Xoson.O.OptionalBoolean, reportingTimezone As OpenAPIClient.Models.ReportingTimeZoneOptional)
		  // Operation ad_groups/analytics
		  // Get ad group analytics
		  // - 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter adGroupIds: (query) List of Ad group Ids to use to filter the results. 
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
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsAnalyticsCallback(AdGroupsAnalyticsMetrics) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/analytics
		  // - Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_AdGroupsAnalyticsToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_AdGroupsAnalyticsToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_AdGroupsAnalyticsToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_AdGroupsAnalyticsToString(conversionReportTime))
		  
		  If aggregateReportRows <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("aggregate_report_rows") + "=" + EncodeURLComponent(aggregateReportRows.ToString)
		  
		  If reportingTimezone <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("reporting_timezone") + "=" + EncodeURLComponent(Xoson.toJSON(reportingTimezone))
		  

		  
		  
		  


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
		Private Function AdGroupsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As OpenAPIClient.Models.AdGroupsAnalyticsMetrics) As Boolean
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
		  Dim data() As OpenAPIClient.Models.AdGroupsAnalyticsMetrics
		  CallbackHandler.AdGroupsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As OpenAPIClient.Models.AdGroupsAnalyticsMetrics
		  Call AdGroupsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Click_window_daysEnum_AdGroupsAnalyticsToString(value As Click_window_daysEnum_AdGroupsAnalytics) As String
		  Select Case value
		    
		    Case Click_window_daysEnum_AdGroupsAnalytics.Escaped0
		      Return "0"
		    Case Click_window_daysEnum_AdGroupsAnalytics.Escaped1
		      Return "1"
		    Case Click_window_daysEnum_AdGroupsAnalytics.Escaped7
		      Return "7"
		    Case Click_window_daysEnum_AdGroupsAnalytics.Escaped14
		      Return "14"
		    Case Click_window_daysEnum_AdGroupsAnalytics.Escaped30
		      Return "30"
		    Case Click_window_daysEnum_AdGroupsAnalytics.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Engagement_window_daysEnum_AdGroupsAnalyticsToString(value As Engagement_window_daysEnum_AdGroupsAnalytics) As String
		  Select Case value
		    
		    Case Engagement_window_daysEnum_AdGroupsAnalytics.Escaped0
		      Return "0"
		    Case Engagement_window_daysEnum_AdGroupsAnalytics.Escaped1
		      Return "1"
		    Case Engagement_window_daysEnum_AdGroupsAnalytics.Escaped7
		      Return "7"
		    Case Engagement_window_daysEnum_AdGroupsAnalytics.Escaped14
		      Return "14"
		    Case Engagement_window_daysEnum_AdGroupsAnalytics.Escaped30
		      Return "30"
		    Case Engagement_window_daysEnum_AdGroupsAnalytics.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function View_window_daysEnum_AdGroupsAnalyticsToString(value As View_window_daysEnum_AdGroupsAnalytics) As String
		  Select Case value
		    
		    Case View_window_daysEnum_AdGroupsAnalytics.Escaped0
		      Return "0"
		    Case View_window_daysEnum_AdGroupsAnalytics.Escaped1
		      Return "1"
		    Case View_window_daysEnum_AdGroupsAnalytics.Escaped7
		      Return "7"
		    Case View_window_daysEnum_AdGroupsAnalytics.Escaped14
		      Return "14"
		    Case View_window_daysEnum_AdGroupsAnalytics.Escaped30
		      Return "30"
		    Case View_window_daysEnum_AdGroupsAnalytics.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_AdGroupsAnalyticsToString(value As Conversion_report_timeEnum_AdGroupsAnalytics) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_AdGroupsAnalytics.TimeOfAdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_AdGroupsAnalytics.TimeOfConversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsAudienceSizing(, adAccountId As String, adGroupAudienceSizingCreate As OpenAPIClient.Models.AdGroupAudienceSizingCreate)
		  // Operation ad_groups/audience_sizing
		  // Get audience sizing
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupAudienceSizingCreate: (body)  
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsAudienceSizingCallback(AdGroupAudienceSizing) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/ad_groups/audience_sizing
		  // - Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
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
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adGroupAudienceSizingCreate), "application/json")
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsAudienceSizing_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsAudienceSizing_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsAudienceSizingPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroupAudienceSizing) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdGroupAudienceSizing
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
		  Dim data As OpenAPIClient.Models.AdGroupAudienceSizing
		  CallbackHandler.AdGroupsAudienceSizingCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsAudienceSizing_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroupAudienceSizing
		  Call AdGroupsAudienceSizingPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsAudienceSizingCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsBidFloorGet(, adAccountId As String, bidFloorCreate As OpenAPIClient.Models.BidFloorCreate)
		  // Operation ad_groups_bid_floor/get
		  // Get bid floors
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter bidFloorCreate: (body)  
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsBidFloorGetCallback(BidFloor) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/bid_floor
		  // - List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
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
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(bidFloorCreate), "application/json")
		  
		  
		  
		  


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
		Sub AdGroupsCreate(, adAccountId As String, adGroupCreateCreate() As OpenAPIClient.Models.AdGroupCreateCreate)
		  // Operation ad_groups/create
		  // Create ad groups
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupCreateCreate: (body)  
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsCreateCallback(AdGroupsCreate200Response) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/ad_groups
		  // - Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adGroupCreateCreate), "application/json")
		  
		  
		  


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
		Private Function AdGroupsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroupsCreate200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdGroupsCreate200Response
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
		  Dim data As OpenAPIClient.Models.AdGroupsCreate200Response
		  CallbackHandler.AdGroupsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroupsCreate200Response
		  Call AdGroupsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsDynamicTitlesDownloadCsv(, adAccountId As String, adGroupId As String)
		  // Operation ad_groups_dynamic_titles/download_csv
		  // Get dynamic titles CSV download URL
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupId: (path) Ad group ID. 
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsDynamicTitlesDownloadCsvCallback(DynamicTitlesDownloadCSV) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv
		  // - Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  Dim localVarPathStringadGroupId As String = adGroupId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_group_id}", localVarPathStringadGroupId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsDynamicTitlesDownloadCsv_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsDynamicTitlesDownloadCsv_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsDynamicTitlesDownloadCsvPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.DynamicTitlesDownloadCSV) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.DynamicTitlesDownloadCSV
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
		Private Sub AdGroupsDynamicTitlesDownloadCsv_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.DynamicTitlesDownloadCSV
		  CallbackHandler.AdGroupsDynamicTitlesDownloadCsvCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsDynamicTitlesDownloadCsv_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.DynamicTitlesDownloadCSV
		  Call AdGroupsDynamicTitlesDownloadCsvPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsDynamicTitlesDownloadCsvCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsDynamicTitlesGetStatus(, adAccountId As String, adGroupId As String)
		  // Operation ad_groups_dynamic_titles/get_status
		  // Get dynamic titles status
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupId: (path) Ad group ID. 
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsDynamicTitlesGetStatusCallback(DynamicTitlesGetStatus) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status
		  // - Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  Dim localVarPathStringadGroupId As String = adGroupId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_group_id}", localVarPathStringadGroupId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsDynamicTitlesGetStatus_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsDynamicTitlesGetStatus_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsDynamicTitlesGetStatusPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.DynamicTitlesGetStatus) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.DynamicTitlesGetStatus
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
		Private Sub AdGroupsDynamicTitlesGetStatus_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.DynamicTitlesGetStatus
		  CallbackHandler.AdGroupsDynamicTitlesGetStatusCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsDynamicTitlesGetStatus_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.DynamicTitlesGetStatus
		  Call AdGroupsDynamicTitlesGetStatusPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsDynamicTitlesGetStatusCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsDynamicTitlesGetUploadUrl(, adAccountId As String, adGroupId As String)
		  // Operation ad_groups_dynamic_titles/get_upload_url
		  // Get dynamic titles upload URL
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupId: (path) Ad group ID. 
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsDynamicTitlesGetUploadUrlCallback(DynamicTitlesUploadURL) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads
		  // - Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  Dim localVarPathStringadGroupId As String = adGroupId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_group_id}", localVarPathStringadGroupId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsDynamicTitlesGetUploadUrl_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsDynamicTitlesGetUploadUrl_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsDynamicTitlesGetUploadUrlPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.DynamicTitlesUploadURL) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.DynamicTitlesUploadURL
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
		Private Sub AdGroupsDynamicTitlesGetUploadUrl_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.DynamicTitlesUploadURL
		  CallbackHandler.AdGroupsDynamicTitlesGetUploadUrlCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsDynamicTitlesGetUploadUrl_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.DynamicTitlesUploadURL
		  Call AdGroupsDynamicTitlesGetUploadUrlPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsDynamicTitlesGetUploadUrlCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsDynamicTitlesProcessCsv(, adAccountId As String, adGroupId As String, dynamicTitlesProcessCSVCreate As OpenAPIClient.Models.DynamicTitlesProcessCSVCreate)
		  // Operation ad_groups_dynamic_titles/process_csv
		  // Process dynamic titles CSV
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupId: (path) Ad group ID. 
		  // - parameter dynamicTitlesProcessCSVCreate: (body)  
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsDynamicTitlesProcessCsvCallback(DynamicTitlesProcessCSV) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles
		  // - Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(dynamicTitlesProcessCSVCreate), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  Dim localVarPathStringadGroupId As String = adGroupId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_group_id}", localVarPathStringadGroupId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AdGroupsDynamicTitlesProcessCsv_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AdGroupsDynamicTitlesProcessCsv_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AdGroupsDynamicTitlesProcessCsvPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.DynamicTitlesProcessCSV) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.DynamicTitlesProcessCSV
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
		Private Sub AdGroupsDynamicTitlesProcessCsv_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.DynamicTitlesProcessCSV
		  CallbackHandler.AdGroupsDynamicTitlesProcessCsvCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsDynamicTitlesProcessCsv_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.DynamicTitlesProcessCSV
		  Call AdGroupsDynamicTitlesProcessCsvPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsDynamicTitlesProcessCsvCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsGet(, adGroupId As String, adAccountId As String)
		  // Operation ad_groups/get
		  // Get ad group
		  // - 
		  // - parameter adGroupId: (path) Ad group ID. 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsGetCallback(AdGroup) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}
		  // - Get a specific ad group given the ad group ID.
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
		  
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}"
		  
		  Dim localVarPathStringadGroupId As String = adGroupId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_group_id}", localVarPathStringadGroupId)
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
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
		Private Function AdGroupsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroup) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdGroup
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
		  Dim data As OpenAPIClient.Models.AdGroup
		  CallbackHandler.AdGroupsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroup
		  Call AdGroupsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AdGroupsList(, adAccountId As String, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger, order As OpenAPIClient.Models.PinterestLibPaginationOrderOptional, campaignIds() As String, adGroupIds() As String, entityStatuses() As EntityStatus, Optional translateInterestsToNames As Xoson.O.OptionalBoolean)
		  // Operation ad_groups/list
		  // List ad groups
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  // - parameter order: (query) The order in which to sort the items returned: &quot;ASCENDING&quot; or &quot;DESCENDING&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to Nil)
		  // - parameter campaignIds: (query) List of Campaign Ids to use to filter the results. (optional, default to Nil)
		  // - parameter adGroupIds: (query) List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional, default to Nil)
		  // - parameter entityStatuses: (query) Entity status (optional, default to ["ACTIVE","PAUSED"])
		  // - parameter translateInterestsToNames: (query) Return interests as text names (if value is true) rather than topic IDs. (optional, default to false)
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsListCallback(AdGroupsList200Response) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups
		  // - List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
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




	#tag Method, Flags = &h0
		Sub AdGroupsTargetingAnalyticsGet(, adAccountId As String, adGroupIds() As String, startDate As Date, endDate As Date, targetingTypes() As AdsAnalyticsAdGroupTargetingType, columns() As ReportingColumnSync, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_AdGroupsTargetingAnalyticsGet, engagementWindowDays As Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet, viewWindowDays As View_window_daysEnum_AdGroupsTargetingAnalyticsGet, conversionReportTime As Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet, attributionTypes() As ConversionReportAttributionType, reportingTimezone As OpenAPIClient.Models.ReportingTimeZoneOptional, sortColumns() As String, Optional sortAscending As Xoson.O.OptionalBoolean)
		  // Operation ad_groups_targeting_analytics/get
		  // Get targeting analytics for ad groups
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupIds: (query) List of Ad group Ids to use to filter the results. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter targetingTypes: (query) Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [&quot;AGE_BUCKET_AND_GENDER&quot;, &quot;CREATIVE_ENHANCEMENTS&quot;] are in BETA and not yet available to all users. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. 
		  // - parameter granularity: (query)   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  // - parameter attributionTypes: (query) List of types of attribution for the conversion report (optional, default to Nil)
		  // - parameter reportingTimezone: (query) Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional, default to Nil)
		  // - parameter sortColumns: (query) Sort Columns. (optional, default to Nil)
		  // - parameter sortAscending: (query) Sort ascending. (optional, default to False)
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsTargetingAnalyticsGetCallback(MetricsResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics
		  // - Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
		  For Each localVarItemtargetingTypes As AdsAnalyticsAdGroupTargetingType in targetingTypes
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_AdGroupsTargetingAnalyticsGetToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGetToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_AdGroupsTargetingAnalyticsGetToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGetToString(conversionReportTime))
		  
		  
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
		  
		  
		  Dim localVarQueryStringssortColumns() As String
		  For Each localVarItemsortColumns As String in sortColumns
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemsortColumns)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringssortColumns.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringssortColumns.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringssortColumns.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringsortColumns As String
		  localVarQueryStringsortColumns = Join(localVarQueryStringssortColumns, "&")
		  If sortAscending <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("sort_ascending") + "=" + EncodeURLComponent(sortAscending.ToString)
		  

		  
		  
		  


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
		Private Function Click_window_daysEnum_AdGroupsTargetingAnalyticsGetToString(value As Click_window_daysEnum_AdGroupsTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case Click_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped0
		      Return "0"
		    Case Click_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped1
		      Return "1"
		    Case Click_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped7
		      Return "7"
		    Case Click_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped14
		      Return "14"
		    Case Click_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped30
		      Return "30"
		    Case Click_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGetToString(value As Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped0
		      Return "0"
		    Case Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped1
		      Return "1"
		    Case Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped7
		      Return "7"
		    Case Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped14
		      Return "14"
		    Case Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped30
		      Return "30"
		    Case Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function View_window_daysEnum_AdGroupsTargetingAnalyticsGetToString(value As View_window_daysEnum_AdGroupsTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case View_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped0
		      Return "0"
		    Case View_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped1
		      Return "1"
		    Case View_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped7
		      Return "7"
		    Case View_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped14
		      Return "14"
		    Case View_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped30
		      Return "30"
		    Case View_window_daysEnum_AdGroupsTargetingAnalyticsGet.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGetToString(value As Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet.TimeOfAdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet.TimeOfConversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsUpdate(, adAccountId As String, adGroupUpdateBatchUpdate() As OpenAPIClient.Models.AdGroupUpdateBatchUpdate)
		  // Operation ad_groups/update
		  // Update ad groups
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter adGroupUpdateBatchUpdate: (body)  
		  //
		  // Invokes AdGroupsApiCallbackHandler.AdGroupsUpdateCallback(AdGroupsCreate200Response) on completion. 
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
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(adGroupUpdateBatchUpdate), "application/json")
		  
		  
		  


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
		Private Function AdGroupsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroupsCreate200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AdGroupsCreate200Response
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
		  Dim data As OpenAPIClient.Models.AdGroupsCreate200Response
		  CallbackHandler.AdGroupsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AdGroupsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroupsCreate200Response
		  Call AdGroupsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AdGroupsUpdateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetAdGroupsByPromotionIdsList(, adAccountId As String, promotionIds() As String, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger, order As OpenAPIClient.Models.PinterestLibPaginationOrderOptional)
		  // Operation get_ad_groups_by_promotion_ids/list
		  // List of ad groups using promotions IDs.
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter promotionIds: (query) List of Promotion IDs to use to filter the results. 
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  // - parameter order: (query) The order in which to sort the items returned: &quot;ASCENDING&quot; or &quot;DESCENDING&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to Nil)
		  //
		  // Invokes AdGroupsApiCallbackHandler.GetAdGroupsByPromotionIdsListCallback(AdGroupsList200Response) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/promotion_applied_entities
		  // -   Get a list of ad groups that are associated with those promotion ids
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  
		  If order <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(Xoson.toJSON(order))
		  
		  
		  Dim localVarQueryStringspromotionIds() As String
		  For Each localVarItempromotionIds As String in promotionIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItempromotionIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringspromotionIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringspromotionIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringspromotionIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringpromotionIds As String
		  localVarQueryStringpromotionIds = Join(localVarQueryStringspromotionIds, "&")

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/promotion_applied_entities"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetAdGroupsByPromotionIdsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetAdGroupsByPromotionIdsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetAdGroupsByPromotionIdsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AdGroupsList200Response) As Boolean
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
		Private Sub GetAdGroupsByPromotionIdsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AdGroupsList200Response
		  CallbackHandler.GetAdGroupsByPromotionIdsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetAdGroupsByPromotionIdsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AdGroupsList200Response
		  Call GetAdGroupsByPromotionIdsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetAdGroupsByPromotionIdsListCallback(error, data)
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

	#tag Enum, Name = Click_window_daysEnum_AdGroupsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdGroupsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdGroupsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdGroupsAnalytics, Type = Integer, Flags = &h0
		
        TimeOfAdAction
        TimeOfConversion
		
	#tag EndEnum

	#tag Enum, Name = Click_window_daysEnum_AdGroupsTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_AdGroupsTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_AdGroupsTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
        Escaped0
        Escaped1
        Escaped7
        Escaped14
        Escaped30
        Escaped60
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_AdGroupsTargetingAnalyticsGet, Type = Integer, Flags = &h0
		
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
