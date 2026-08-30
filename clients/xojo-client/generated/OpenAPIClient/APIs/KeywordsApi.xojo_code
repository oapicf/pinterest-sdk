#tag Class
Protected Class KeywordsApi
	#tag Method, Flags = &h0
		Sub CountryKeywordsMetricsGet(, adAccountId As String, countryCode As String, keywords() As String)
		  // Operation country_keywords_metrics/get
		  // Get country's keyword metrics
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter countryCode: (query) Two letter country code (ISO 3166-1 alpha-2) 
		  // - parameter keywords: (query) Comma-separated keywords 
		  //
		  // Invokes KeywordsApiCallbackHandler.CountryKeywordsMetricsGetCallback(KeywordsMetricsArrayResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/keywords/metrics
		  // -   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the "Get delivery metrics definitions"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
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
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("country_code") + "=" + EncodeURLComponent(countryCode)
		  
		  
		  Dim localVarQueryStringskeywords() As String
		  For Each localVarItemkeywords As String in keywords
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemkeywords)
		    localVarQueryStringskeywords.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringkeywords As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringkeywords = "inner=" + Join(localVarQueryStringskeywords, ",")
		    Case "spaceDelimited"
		      localVarQueryStringkeywords = "inner=" + Join(localVarQueryStringskeywords, " ")
		    Case "pipeDelimited"
		      localVarQueryStringkeywords = "inner=" + Join(localVarQueryStringskeywords, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringskeywords.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringkeywords)

		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/keywords/metrics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CountryKeywordsMetricsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CountryKeywordsMetricsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CountryKeywordsMetricsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.KeywordsMetricsArrayResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.KeywordsMetricsArrayResponse
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
		Private Sub CountryKeywordsMetricsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.KeywordsMetricsArrayResponse
		  CallbackHandler.CountryKeywordsMetricsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CountryKeywordsMetricsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.KeywordsMetricsArrayResponse
		  Call CountryKeywordsMetricsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CountryKeywordsMetricsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub KeywordsCreate(, adAccountId As String, keywordsCreate As OpenAPIClient.Models.KeywordsCreate)
		  // Operation keywords/create
		  // Create keywords
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter keywordsCreate: (body)  
		  //
		  // Invokes KeywordsApiCallbackHandler.KeywordsCreateCallback(Keywords) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/keywords
		  // -   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       "keywords": [],       "errors": [         {           "data": {             "archived": null,             "match_type": "EXACT",             "parent_type": null,             "value": "foobar",             "parent_id": null,             "type": "keyword",             "id": null           },           "error_messages": [             "Advertisers and Campaigns only accept excluded targeting attributes."           ]         }       ]     }
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(keywordsCreate), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/keywords"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.KeywordsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.KeywordsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function KeywordsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Keywords) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Keywords
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
		Private Sub KeywordsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Keywords
		  CallbackHandler.KeywordsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub KeywordsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Keywords
		  Call KeywordsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.KeywordsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub KeywordsGet(, adAccountId As String, Optional campaignId As Xoson.O.OptionalString, Optional adGroupId As Xoson.O.OptionalString, adGroupIds() As String, matchTypes() As MatchType, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation keywords/get
		  // Get keywords
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter campaignId: (query) Campaign Id to use to filter the results. (optional, default to Sample)
		  // - parameter adGroupId: (query) Ad group Id. (optional, default to Sample)
		  // - parameter adGroupIds: (query) List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional, default to Nil)
		  // - parameter matchTypes: (query) Keyword [match type](/docs/api-features/targeting-overview/) (optional, default to Nil)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  //
		  // Invokes KeywordsApiCallbackHandler.KeywordsGetCallback(KeywordsGet200Response) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/keywords
		  // -     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         "keywords": [],         "errors": [           {             "data": {               "archived": null,               "match_type": "EXACT",               "parent_type": null,               "value": "foobar",               "parent_id": null,               "type": "keyword",               "id": null             },             "error_messages": [               "Advertisers and Campaigns only accept excluded targeting attributes."             ]           }         ]       }
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
		  If campaignId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("campaign_id") + "=" + EncodeURLComponent(campaignId)
		  
		  If adGroupId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("ad_group_id") + "=" + EncodeURLComponent(adGroupId)
		  
		  
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
		  
		  Dim localVarQueryStringsmatchTypes() As String
		  For Each localVarItemmatchTypes As MatchType in matchTypes
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemmatchTypes))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsmatchTypes.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsmatchTypes.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsmatchTypes.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringmatchTypes As String
		  localVarQueryStringmatchTypes = Join(localVarQueryStringsmatchTypes, "&")
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  

		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/keywords"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.KeywordsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.KeywordsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function KeywordsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.KeywordsGet200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.KeywordsGet200Response
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
		Private Sub KeywordsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.KeywordsGet200Response
		  CallbackHandler.KeywordsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub KeywordsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.KeywordsGet200Response
		  Call KeywordsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.KeywordsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub KeywordsUpdate(, adAccountId As String, keywordsUpdate As OpenAPIClient.Models.KeywordsUpdate)
		  // Operation keywords/update
		  // Update keywords
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter keywordsUpdate: (body)  
		  //
		  // Invokes KeywordsApiCallbackHandler.KeywordsUpdateCallback(Keywords) on completion. 
		  //
		  // - PATCH /ad_accounts/{ad_account_id}/keywords
		  // -   Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(keywordsUpdate), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/keywords"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.KeywordsUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.KeywordsUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function KeywordsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Keywords) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Keywords
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
		Private Sub KeywordsUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Keywords
		  CallbackHandler.KeywordsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub KeywordsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Keywords
		  Call KeywordsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.KeywordsUpdateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub TrendingKeywordsList(, region As OpenAPIClient.Models.TrendsSupportedRegion, trendType As OpenAPIClient.Models.TrendType, interests() As TrendsL1Interest, genders() As TrendsGenderFilter, ages() As TrendsAgeBucket, includeKeywords() As String, Optional normalizeAgainstGroup As Xoson.O.OptionalBoolean, Optional limit As Xoson.O.OptionalInteger, Optional includeDemographics As Xoson.O.OptionalBoolean)
		  // Operation trending_keywords/list
		  // List trending keywords
		  // - 
		  // - parameter region: (path)   The geographic region of interest. Only top trends within the specified region will be returned.    The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas:   - &#x60;US&#x60; - United States   - &#x60;CA&#x60; - Canada   - &#x60;DE&#x60; - Germany   - &#x60;FR&#x60; - France   - &#x60;ES&#x60; - Spain   - &#x60;IT&#x60; - Italy   - &#x60;DE+AT+CH&#x60; - Germanic countries   - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland   - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe   - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe   - &#x60;SE+DK+FI+NO&#x60; - Nordic countries   - &#x60;NL+BE+LU&#x60; - Benelux   - &#x60;AR&#x60; - Argentina   - &#x60;BR&#x60; - Brazil   - &#x60;CO&#x60; - Colombia   - &#x60;MX&#x60; - Mexico   - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm   - &#x60;AU+NZ&#x60; - Australasia 
		  // - parameter trendType: (path)   The methodology used to rank how trendy a keyword is.   - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter   - &#x60;monthly&#x60; trends have high search volume in the last month   - &#x60;yearly&#x60; trends have high search volume in the last year   - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) 
		  // - parameter interests: (query)   The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women&#39;s Fashion (optional, default to Nil)
		  // - parameter genders: (query) If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. (optional, default to Nil)
		  // - parameter ages: (query) If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. (optional, default to Nil)
		  // - parameter includeKeywords: (query) If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. (optional, default to Nil)
		  // - parameter normalizeAgainstGroup: (query)  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. (optional, default to false)
		  // - parameter limit: (query) The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. (optional, default to 50)
		  // - parameter includeDemographics: (query) Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data. (optional, default to false)
		  //
		  // Invokes KeywordsApiCallbackHandler.TrendingKeywordsListCallback(TrendingKeywordsResponse) on completion. 
		  //
		  // - GET /trends/keywords/{region}/top/{trend_type}
		  // - Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  
		  Dim localVarQueryStringsinterests() As String
		  For Each localVarIteminterests As TrendsL1Interest in interests
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarIteminterests))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsinterests.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsinterests.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsinterests.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringinterests As String
		  localVarQueryStringinterests = Join(localVarQueryStringsinterests, "&")
		  
		  Dim localVarQueryStringsgenders() As String
		  For Each localVarItemgenders As TrendsGenderFilter in genders
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemgenders))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsgenders.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsgenders.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsgenders.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringgenders As String
		  localVarQueryStringgenders = Join(localVarQueryStringsgenders, "&")
		  
		  Dim localVarQueryStringsages() As String
		  For Each localVarItemages As TrendsAgeBucket in ages
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemages))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsages.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsages.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsages.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringages As String
		  localVarQueryStringages = Join(localVarQueryStringsages, "&")
		  
		  Dim localVarQueryStringsincludeKeywords() As String
		  For Each localVarItemincludeKeywords As String in includeKeywords
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemincludeKeywords)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsincludeKeywords.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsincludeKeywords.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsincludeKeywords.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringincludeKeywords As String
		  localVarQueryStringincludeKeywords = Join(localVarQueryStringsincludeKeywords, "&")
		  If normalizeAgainstGroup <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("normalize_against_group") + "=" + EncodeURLComponent(normalizeAgainstGroup.ToString)
		  
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If includeDemographics <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("include_demographics") + "=" + EncodeURLComponent(includeDemographics.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/trends/keywords/{region}/top/{trend_type}"
		  
		  Dim localVarPathStringregion As String = Xoson.toJSON(region)
		  
		  localVarPath = localVarPath.ReplaceAllB("{region}", localVarPathStringregion)
		  Dim localVarPathStringtrendType As String = Xoson.toJSON(trendType)
		  
		  localVarPath = localVarPath.ReplaceAllB("{trend_type}", localVarPathStringtrendType)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.TrendingKeywordsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.TrendingKeywordsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function TrendingKeywordsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.TrendingKeywordsResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.TrendingKeywordsResponse
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
		Private Sub TrendingKeywordsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.TrendingKeywordsResponse
		  CallbackHandler.TrendingKeywordsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub TrendingKeywordsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.TrendingKeywordsResponse
		  Call TrendingKeywordsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.TrendingKeywordsListCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.KeywordsApiCallbackHandler
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
