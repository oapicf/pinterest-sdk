#tag Class
Protected Class ProductGroupPromotionsApi
	#tag Method, Flags = &h0
		Sub ProductGroupPromotionsCreate(, adAccountId As String, productGroupPromotionCreateRequest As OpenAPIClient.Models.ProductGroupPromotionCreateRequest)
		  // Operation product_group_promotions/create
		  // Create product group promotions
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter productGroupPromotionCreateRequest: (body) List of Product Group Promotions to create, size limit [1, 30]. 
		  //
		  // Invokes ProductGroupPromotionsApiCallbackHandler.ProductGroupPromotionsCreateCallback(ProductGroupPromotionResponse) on completion. 
		  //
		  // - POST /ad_accounts/{ad_account_id}/product_group_promotions
		  // - Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(productGroupPromotionCreateRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/product_group_promotions"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ProductGroupPromotionsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ProductGroupPromotionsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ProductGroupPromotionsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.ProductGroupPromotionResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.ProductGroupPromotionResponse
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
		Private Sub ProductGroupPromotionsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.ProductGroupPromotionResponse
		  CallbackHandler.ProductGroupPromotionsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ProductGroupPromotionsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.ProductGroupPromotionResponse
		  Call ProductGroupPromotionsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ProductGroupPromotionsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub ProductGroupPromotionsGet(, adAccountId As String, productGroupPromotionId As String)
		  // Operation product_group_promotions/get
		  // Get a product group promotion by id
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter productGroupPromotionId: (path) Unique identifier of a product group promotion 
		  //
		  // Invokes ProductGroupPromotionsApiCallbackHandler.ProductGroupPromotionsGetCallback(ProductGroupPromotionResponse) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}
		  // - Get a product group promotion by id
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  Dim localVarPathStringproductGroupPromotionId As String = productGroupPromotionId
		  
		  localVarPath = localVarPath.ReplaceAllB("{product_group_promotion_id}", localVarPathStringproductGroupPromotionId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ProductGroupPromotionsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ProductGroupPromotionsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ProductGroupPromotionsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.ProductGroupPromotionResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.ProductGroupPromotionResponse
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
		Private Sub ProductGroupPromotionsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.ProductGroupPromotionResponse
		  CallbackHandler.ProductGroupPromotionsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ProductGroupPromotionsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.ProductGroupPromotionResponse
		  Call ProductGroupPromotionsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ProductGroupPromotionsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub ProductGroupPromotionsList(, adAccountId As String, productGroupPromotionIds() As String, entityStatuses() As Entity_statusesEnum_ProductGroupPromotionsList, Optional adGroupId As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger, order As OrderEnum_ProductGroupPromotionsList, Optional bookmark As Xoson.O.OptionalString)
		  // Operation product_group_promotions/list
		  // Get product group promotions
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter productGroupPromotionIds: (query) List of Product group promotion Ids. (optional, default to Nil)
		  // - parameter entityStatuses: (query) Entity status (optional, default to ["ACTIVE","PAUSED"])
		  // - parameter adGroupId: (query) Ad group Id. (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter order: (query) The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to Sample)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  //
		  // Invokes ProductGroupPromotionsApiCallbackHandler.ProductGroupPromotionsListCallback(ProductGroupPromotionsList200Response) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/product_group_promotions
		  // - List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  
		  Dim localVarQueryStringsproductGroupPromotionIds() As String
		  For Each localVarItemproductGroupPromotionIds As String in productGroupPromotionIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemproductGroupPromotionIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsproductGroupPromotionIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsproductGroupPromotionIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsproductGroupPromotionIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringproductGroupPromotionIds As String
		  localVarQueryStringproductGroupPromotionIds = Join(localVarQueryStringsproductGroupPromotionIds, "&")
		  
		  Dim localVarQueryStringsentityStatuses() As String
		  For Each localVarItementityStatuses As Entity_statusesEnum_ProductGroupPromotionsList in entityStatuses
		    Dim encodedParameter As String = EncodeURLComponent(Entity_statusesEnum_ProductGroupPromotionsListToString(localVarItementityStatuses))
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
		  If adGroupId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("ad_group_id") + "=" + EncodeURLComponent(adGroupId)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("order") + "=" + EncodeURLComponent(OrderEnum_ProductGroupPromotionsListToString(order))
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/product_group_promotions"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ProductGroupPromotionsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ProductGroupPromotionsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ProductGroupPromotionsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.ProductGroupPromotionsList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.ProductGroupPromotionsList200Response
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
		Private Sub ProductGroupPromotionsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.ProductGroupPromotionsList200Response
		  CallbackHandler.ProductGroupPromotionsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ProductGroupPromotionsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.ProductGroupPromotionsList200Response
		  Call ProductGroupPromotionsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ProductGroupPromotionsListCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Entity_statusesEnum_ProductGroupPromotionsListToString(value As Entity_statusesEnum_ProductGroupPromotionsList) As String
		  Select Case value
		    
		    Case Entity_statusesEnum_ProductGroupPromotionsList.Active
		      Return "ACTIVE"
		    Case Entity_statusesEnum_ProductGroupPromotionsList.Paused
		      Return "PAUSED"
		    Case Entity_statusesEnum_ProductGroupPromotionsList.Archived
		      Return "ARCHIVED"
		    Case Entity_statusesEnum_ProductGroupPromotionsList.Draft
		      Return "DRAFT"
		    Case Entity_statusesEnum_ProductGroupPromotionsList.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function OrderEnum_ProductGroupPromotionsListToString(value As OrderEnum_ProductGroupPromotionsList) As String
		  Select Case value
		    
		    Case OrderEnum_ProductGroupPromotionsList.Ascending
		      Return "ASCENDING"
		    Case OrderEnum_ProductGroupPromotionsList.Descending
		      Return "DESCENDING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProductGroupPromotionsUpdate(, adAccountId As String, productGroupPromotionUpdateRequest As OpenAPIClient.Models.ProductGroupPromotionUpdateRequest)
		  // Operation product_group_promotions/update
		  // Update product group promotions
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter productGroupPromotionUpdateRequest: (body) Parameters to update Product group promotions 
		  //
		  // Invokes ProductGroupPromotionsApiCallbackHandler.ProductGroupPromotionsUpdateCallback(ProductGroupPromotionResponse) on completion. 
		  //
		  // - PATCH /ad_accounts/{ad_account_id}/product_group_promotions
		  // - Update multiple existing Product Group Promotions (by product_group_id)
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(productGroupPromotionUpdateRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/product_group_promotions"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ProductGroupPromotionsUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ProductGroupPromotionsUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ProductGroupPromotionsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.ProductGroupPromotionResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.ProductGroupPromotionResponse
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
		Private Sub ProductGroupPromotionsUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.ProductGroupPromotionResponse
		  CallbackHandler.ProductGroupPromotionsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ProductGroupPromotionsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.ProductGroupPromotionResponse
		  Call ProductGroupPromotionsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ProductGroupPromotionsUpdateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub ProductGroupsAnalytics(, adAccountId As String, startDate As Date, endDate As Date, productGroupIds() As String, columns() As ColumnsEnum_ProductGroupsAnalytics, granularity As OpenAPIClient.Models.Granularity, clickWindowDays As Click_window_daysEnum_ProductGroupsAnalytics, engagementWindowDays As Engagement_window_daysEnum_ProductGroupsAnalytics, viewWindowDays As View_window_daysEnum_ProductGroupsAnalytics, conversionReportTime As Conversion_report_timeEnum_ProductGroupsAnalytics)
		  // Operation product_groups/analytics
		  // Get product group analytics
		  // - 
		  // - parameter adAccountId: (path) Unique identifier of an ad account. 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter productGroupIds: (query) List of Product group Ids to use to filter the results. 
		  // - parameter columns: (query) Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned 
		  // - parameter granularity: (query) TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly 
		  // - parameter clickWindowDays: (query) Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter engagementWindowDays: (query) Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
		  // - parameter viewWindowDays: (query) Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
		  // - parameter conversionReportTime: (query) The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
		  //
		  // Invokes ProductGroupPromotionsApiCallbackHandler.ProductGroupsAnalyticsCallback(ProductGroupAnalyticsResponseInner) on completion. 
		  //
		  // - GET /ad_accounts/{ad_account_id}/product_groups/analytics
		  // - Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
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
		  
		  
		  Dim localVarQueryStringsproductGroupIds() As String
		  For Each localVarItemproductGroupIds As String in productGroupIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemproductGroupIds)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsproductGroupIds.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsproductGroupIds.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsproductGroupIds.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringproductGroupIds As String
		  localVarQueryStringproductGroupIds = Join(localVarQueryStringsproductGroupIds, "&")
		  
		  Dim localVarQueryStringscolumns() As String
		  For Each localVarItemcolumns As ColumnsEnum_ProductGroupsAnalytics in columns
		    Dim encodedParameter As String = EncodeURLComponent(ColumnsEnum_ProductGroupsAnalyticsToString(localVarItemcolumns))
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("click_window_days") + "=" + EncodeURLComponent(Click_window_daysEnum_ProductGroupsAnalyticsToString(clickWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("engagement_window_days") + "=" + EncodeURLComponent(Engagement_window_daysEnum_ProductGroupsAnalyticsToString(engagementWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("view_window_days") + "=" + EncodeURLComponent(View_window_daysEnum_ProductGroupsAnalyticsToString(viewWindowDays))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("conversion_report_time") + "=" + EncodeURLComponent(Conversion_report_timeEnum_ProductGroupsAnalyticsToString(conversionReportTime))
		  

		  
		  


		  Dim localVarPath As String = "/ad_accounts/{ad_account_id}/product_groups/analytics"
		  
		  Dim localVarPathStringadAccountId As String = adAccountId
		  
		  localVarPath = localVarPath.ReplaceAllB("{ad_account_id}", localVarPathStringadAccountId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ProductGroupsAnalytics_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ProductGroupsAnalytics_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ProductGroupsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As ProductGroupAnalyticsResponseInner) As Boolean
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
		Private Sub ProductGroupsAnalytics_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data() As ProductGroupAnalyticsResponseInner
		  CallbackHandler.ProductGroupsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ProductGroupsAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As ProductGroupAnalyticsResponseInner
		  Call ProductGroupsAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ProductGroupsAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function ColumnsEnum_ProductGroupsAnalyticsToString(value As ColumnsEnum_ProductGroupsAnalytics) As String
		  Select Case value
		    
		    Case ColumnsEnum_ProductGroupsAnalytics.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum_ProductGroupsAnalytics.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.Ctr
		      Return "CTR"
		    Case ColumnsEnum_ProductGroupsAnalytics.Ectr
		      Return "ECTR"
		    Case ColumnsEnum_ProductGroupsAnalytics.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum_ProductGroupsAnalytics.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum_ProductGroupsAnalytics.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum_ProductGroupsAnalytics.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum_ProductGroupsAnalytics.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum_ProductGroupsAnalytics.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum_ProductGroupsAnalytics.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum_ProductGroupsAnalytics.AdId
		      Return "AD_ID"
		    Case ColumnsEnum_ProductGroupsAnalytics.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum_ProductGroupsAnalytics.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum_ProductGroupsAnalytics.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum_ProductGroupsAnalytics.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum_ProductGroupsAnalytics.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum_ProductGroupsAnalytics.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum_ProductGroupsAnalytics.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum_ProductGroupsAnalytics.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum_ProductGroupsAnalytics.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum_ProductGroupsAnalytics.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum_ProductGroupsAnalytics.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum_ProductGroupsAnalytics.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum_ProductGroupsAnalytics.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum_ProductGroupsAnalytics.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum_ProductGroupsAnalytics.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum_ProductGroupsAnalytics.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum_ProductGroupsAnalytics.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum_ProductGroupsAnalytics.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum_ProductGroupsAnalytics.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum_ProductGroupsAnalytics.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum_ProductGroupsAnalytics.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum_ProductGroupsAnalytics.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum_ProductGroupsAnalytics.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_ProductGroupsAnalytics.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum_ProductGroupsAnalytics.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum_ProductGroupsAnalytics.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum_ProductGroupsAnalytics.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum_ProductGroupsAnalytics.Leads
		      Return "LEADS"
		    Case ColumnsEnum_ProductGroupsAnalytics.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum_ProductGroupsAnalytics.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum_ProductGroupsAnalytics.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum_ProductGroupsAnalytics.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum_ProductGroupsAnalytics.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Conversion_report_timeEnum_ProductGroupsAnalyticsToString(value As Conversion_report_timeEnum_ProductGroupsAnalytics) As String
		  Select Case value
		    
		    Case Conversion_report_timeEnum_ProductGroupsAnalytics.AdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_timeEnum_ProductGroupsAnalytics.Conversion
		      Return "TIME_OF_CONVERSION"
		    
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
		CallbackHandler As OpenAPIClient.APIs.ProductGroupPromotionsApiCallbackHandler
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

	#tag Enum, Name = Entity_statusesEnum_ProductGroupPromotionsList, Type = Integer, Flags = &h0
		
        Active
        Paused
        Archived
        Draft
        DeletedDraft
		
	#tag EndEnum

	#tag Enum, Name = OrderEnum_ProductGroupPromotionsList, Type = Integer, Flags = &h0
		
        Ascending
        Descending
		
	#tag EndEnum

	#tag Enum, Name = ColumnsEnum_ProductGroupsAnalytics, Type = Integer, Flags = &h0
		
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

	#tag Enum, Name = Click_window_daysEnum_ProductGroupsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Engagement_window_daysEnum_ProductGroupsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = View_window_daysEnum_ProductGroupsAnalytics, Type = Integer, Flags = &h0
		
        Escaped0 = "0"
        Escaped1 = "1"
        Escaped7 = "7"
        Escaped14 = "14"
        Escaped30 = "30"
        Escaped60 = "60"
		
	#tag EndEnum

	#tag Enum, Name = Conversion_report_timeEnum_ProductGroupsAnalytics, Type = Integer, Flags = &h0
		
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
