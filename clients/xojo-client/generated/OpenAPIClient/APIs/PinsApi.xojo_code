#tag Class
Protected Class PinsApi
	#tag Method, Flags = &h0
		Sub PinsAnalytics(, pinId As String, startDate As Date, endDate As Date, metricTypes() As OpenAPIClient.Models.PinsAnalyticsMetricTypesParameterInner, appTypes As App_typesEnum_PinsAnalytics, splitField As Split_fieldEnum_PinsAnalytics, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation pins/analytics
		  // Get Pin analytics
		  // - 
		  // - parameter pinId: (path) Unique identifier of a Pin. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter metricTypes: (query) Pin metric types to get data for, default is all. 
		  // - parameter appTypes: (query) Apps or devices to get data for, default is all. (optional, default to ALL)
		  // - parameter splitField: (query) How to split the data into groups. Not including this param means data won&#39;t be split. (optional, default to NO_SPLIT)
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes PinsApiCallbackHandler.PinsAnalyticsCallback(Dictionary) on completion. 
		  //
		  // - GET /pins/{pin_id}/analytics
		  // - Get analytics for a Pin owned by the "operation user_account" - or on a group board that has been shared with this account. - By default, the "operation user_account" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href="https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list">List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("app_types") + "=" + EncodeURLComponent(App_typesEnum_PinsAnalyticsToString(appTypes))
		  
		  
		  Dim localVarQueryStringsmetricTypes() As String
		  For Each localVarItemmetricTypes As PinsAnalyticsMetricTypesParameterInner in metricTypes
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemmetricTypes))
		    localVarQueryStringsmetricTypes.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringmetricTypes As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringmetricTypes = "inner=" + Join(localVarQueryStringsmetricTypes, ",")
		    Case "spaceDelimited"
		      localVarQueryStringmetricTypes = "inner=" + Join(localVarQueryStringsmetricTypes, " ")
		    Case "pipeDelimited"
		      localVarQueryStringmetricTypes = "inner=" + Join(localVarQueryStringsmetricTypes, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringsmetricTypes.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringmetricTypes)
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("split_field") + "=" + EncodeURLComponent(Split_fieldEnum_PinsAnalyticsToString(splitField))
		  
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/pins/{pin_id}/analytics"
		  
		  Dim localVarPathStringpinId As String = pinId
		  
		  localVarPath = localVarPath.ReplaceAllB("{pin_id}", localVarPathStringpinId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PinsAnalytics_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PinsAnalytics_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PinsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As Dictionary) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New Dictionary
			  Try
		        outData = ParseJSON(Content)

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
		Private Sub PinsAnalytics_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As Dictionary
		  CallbackHandler.PinsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PinsAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As Dictionary
		  Call PinsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PinsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function App_typesEnum_PinsAnalyticsToString(value As App_typesEnum_PinsAnalytics) As String
		  Select Case value
		    
		    Case App_typesEnum_PinsAnalytics.All
		      Return "ALL"
		    Case App_typesEnum_PinsAnalytics.Mobile
		      Return "MOBILE"
		    Case App_typesEnum_PinsAnalytics.Tablet
		      Return "TABLET"
		    Case App_typesEnum_PinsAnalytics.Web
		      Return "WEB"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Split_fieldEnum_PinsAnalyticsToString(value As Split_fieldEnum_PinsAnalytics) As String
		  Select Case value
		    
		    Case Split_fieldEnum_PinsAnalytics.NoSplit
		      Return "NO_SPLIT"
		    Case Split_fieldEnum_PinsAnalytics.AppType
		      Return "APP_TYPE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PinsCreate(, pinCreate As OpenAPIClient.Models.PinCreate, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation pins/create
		  // Create Pin
		  // - 
		  // - parameter pinCreate: (body) Create a new Pin. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes PinsApiCallbackHandler.PinsCreateCallback(Pin) on completion. 
		  //
		  // - POST /pins
		  // - Create a Pin on a board or board section owned by the "operation user_account".  Note: If the current "operation user_account" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(pinCreate), "application/json")
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/pins"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PinsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PinsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PinsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Pin) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Pin
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
		Private Sub PinsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Pin
		  CallbackHandler.PinsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PinsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Pin
		  Call PinsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PinsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PinsDelete(, pinId As String, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation pins/delete
		  // Delete Pin
		  // - parameter pinId: (path) Unique identifier of a Pin. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes PinsApiCallbackHandler.PinsDeleteCallback() on completion. 
		  //
		  // - DELETE /pins/{pin_id}
		  // - Delete a Pins owned by the "operation user_account" - or on a group board that has been shared with this account. - By default, the "operation user_account" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/pins/{pin_id}"
		  
		  Dim localVarPathStringpinId As String = pinId
		  
		  localVarPath = localVarPath.ReplaceAllB("{pin_id}", localVarPathStringpinId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PinsDelete_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PinsDelete_error
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PinsDelete_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PinsDeleteCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PinsDelete_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PinsDeleteCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PinsGet(, pinId As String, Optional pinMetrics As Xoson.O.OptionalBoolean, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation pins/get
		  // Get Pin
		  // - 
		  // - parameter pinId: (path) Unique identifier of a Pin. 
		  // - parameter pinMetrics: (query) Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes PinsApiCallbackHandler.PinsGetCallback(Pin) on completion. 
		  //
		  // - GET /pins/{pin_id}
		  // - Get a Pin owned by the "operation user_account" - or on a group board that has been shared with this account. - By default, the "operation user_account" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If pinMetrics <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("pin_metrics") + "=" + EncodeURLComponent(pinMetrics.ToString)
		  
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/pins/{pin_id}"
		  
		  Dim localVarPathStringpinId As String = pinId
		  
		  localVarPath = localVarPath.ReplaceAllB("{pin_id}", localVarPathStringpinId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PinsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PinsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PinsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Pin) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Pin
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
		Private Sub PinsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Pin
		  CallbackHandler.PinsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PinsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Pin
		  Call PinsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PinsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PinsList(, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger, pinFilter As Pin_filterEnum_PinsList, Optional includeProtectedPins As Xoson.O.OptionalBoolean, pinType As Pin_typeEnum_PinsList, creativeTypes() As Creative_typesEnum_PinsList, Optional adAccountId As Xoson.O.OptionalString, Optional pinMetrics As Xoson.O.OptionalBoolean)
		  // Operation pins/list
		  // List Pins
		  // - 
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter pinFilter: (query) Pin filter. (optional, default to Sample)
		  // - parameter includeProtectedPins: (query) Specify if return pins from protected boards (optional, default to false)
		  // - parameter pinType: (query) The type of pins to return, currently only enabled for private pins (optional, default to Sample)
		  // - parameter creativeTypes: (query) Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional, default to Nil)
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  // - parameter pinMetrics: (query) Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
		  //
		  // Invokes PinsApiCallbackHandler.PinsListCallback(PinsList200Response) on completion. 
		  //
		  // - GET /pins
		  // - Get a list of the Pins owned by the "operation user_account". - By default, the "operation user_account" is the token user_account. - All Pins owned by the "operation user_account" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("pin_filter") + "=" + EncodeURLComponent(Pin_filterEnum_PinsListToString(pinFilter))
		  
		  If includeProtectedPins <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("include_protected_pins") + "=" + EncodeURLComponent(includeProtectedPins.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("pin_type") + "=" + EncodeURLComponent(Pin_typeEnum_PinsListToString(pinType))
		  
		  
		  Dim localVarQueryStringscreativeTypes() As String
		  For Each localVarItemcreativeTypes As Creative_typesEnum_PinsList in creativeTypes
		    Dim encodedParameter As String = EncodeURLComponent(Creative_typesEnum_PinsListToString(localVarItemcreativeTypes))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringscreativeTypes.Append("creative_types=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringscreativeTypes.Append("creative_types=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringscreativeTypes.Append("creative_types=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringcreativeTypes As String
		  localVarQueryStringcreativeTypes = Join(localVarQueryStringscreativeTypes, "&")
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  
		  If pinMetrics <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("pin_metrics") + "=" + EncodeURLComponent(pinMetrics.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/pins"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PinsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PinsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PinsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PinsList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PinsList200Response
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
		Private Sub PinsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PinsList200Response
		  CallbackHandler.PinsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PinsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PinsList200Response
		  Call PinsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PinsListCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Pin_filterEnum_PinsListToString(value As Pin_filterEnum_PinsList) As String
		  Select Case value
		    
		    Case Pin_filterEnum_PinsList.ExcludeNative
		      Return "exclude_native"
		    Case Pin_filterEnum_PinsList.ExcludeRepins
		      Return "exclude_repins"
		    Case Pin_filterEnum_PinsList.HasBeenPromoted
		      Return "has_been_promoted"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Pin_typeEnum_PinsListToString(value As Pin_typeEnum_PinsList) As String
		  Select Case value
		    
		    Case Pin_typeEnum_PinsList.Escapedprivate
		      Return "PRIVATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Creative_typesEnum_PinsListToString(value As Creative_typesEnum_PinsList) As String
		  Select Case value
		    
		    Case Creative_typesEnum_PinsList.Regular
		      Return "REGULAR"
		    Case Creative_typesEnum_PinsList.Video
		      Return "VIDEO"
		    Case Creative_typesEnum_PinsList.Shopping
		      Return "SHOPPING"
		    Case Creative_typesEnum_PinsList.Carousel
		      Return "CAROUSEL"
		    Case Creative_typesEnum_PinsList.MaxVideo
		      Return "MAX_VIDEO"
		    Case Creative_typesEnum_PinsList.ShopThePin
		      Return "SHOP_THE_PIN"
		    Case Creative_typesEnum_PinsList.Collection
		      Return "COLLECTION"
		    Case Creative_typesEnum_PinsList.Idea
		      Return "IDEA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PinsSave(, pinId As String, pinsSaveRequest As OpenAPIClient.Models.PinsSaveRequest, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation pins/save
		  // Save Pin
		  // - 
		  // - parameter pinId: (path) Unique identifier of a Pin. 
		  // - parameter pinsSaveRequest: (body) Request object used to save an existing pin 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes PinsApiCallbackHandler.PinsSaveCallback(Pin) on completion. 
		  //
		  // - POST /pins/{pin_id}/save
		  // - Save a Pin on a board or board section owned by the "operation user_account". - By default, the "operation user_account" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(pinsSaveRequest), "application/json")
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/pins/{pin_id}/save"
		  
		  Dim localVarPathStringpinId As String = pinId
		  
		  localVarPath = localVarPath.ReplaceAllB("{pin_id}", localVarPathStringpinId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PinsSave_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PinsSave_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PinsSavePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Pin) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Pin
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
		Private Sub PinsSave_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Pin
		  CallbackHandler.PinsSaveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PinsSave_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Pin
		  Call PinsSavePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PinsSaveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PinsUpdate(, pinId As String, pinUpdate As OpenAPIClient.Models.PinUpdate, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation pins/update
		  // Update Pin
		  // - 
		  // - parameter pinId: (path) Unique identifier of a Pin. 
		  // - parameter pinUpdate: (body)  
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes PinsApiCallbackHandler.PinsUpdateCallback(Pin) on completion. 
		  //
		  // - PATCH /pins/{pin_id}
		  // - Update a pin owned by the "operating user_account". - By default, the "operation user_account" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(pinUpdate), "application/json")
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/pins/{pin_id}"
		  
		  Dim localVarPathStringpinId As String = pinId
		  
		  localVarPath = localVarPath.ReplaceAllB("{pin_id}", localVarPathStringpinId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PinsUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PinsUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PinsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Pin) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Pin
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
		Private Sub PinsUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Pin
		  CallbackHandler.PinsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PinsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Pin
		  Call PinsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PinsUpdateCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.PinsApiCallbackHandler
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

	#tag Enum, Name = App_typesEnum_PinsAnalytics, Type = Integer, Flags = &h0
		
        All
        Mobile
        Tablet
        Web
		
	#tag EndEnum

	#tag Enum, Name = Split_fieldEnum_PinsAnalytics, Type = Integer, Flags = &h0
		
        NoSplit
        AppType
		
	#tag EndEnum

	#tag Enum, Name = Pin_filterEnum_PinsList, Type = Integer, Flags = &h0
		
        ExcludeNative
        ExcludeRepins
        HasBeenPromoted
		
	#tag EndEnum

	#tag Enum, Name = Pin_typeEnum_PinsList, Type = Integer, Flags = &h0
		
        Escapedprivate
		
	#tag EndEnum

	#tag Enum, Name = Creative_typesEnum_PinsList, Type = Integer, Flags = &h0
		
        Regular
        Video
        Shopping
        Carousel
        MaxVideo
        ShopThePin
        Collection
        Idea
		
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
