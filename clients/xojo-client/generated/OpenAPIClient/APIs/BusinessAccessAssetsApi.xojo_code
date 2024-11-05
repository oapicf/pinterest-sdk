#tag Class
Protected Class BusinessAccessAssetsApi
	#tag Method, Flags = &h0
		Sub AssetGroupCreate(, businessId As String, createAssetGroupBody As OpenAPIClient.Models.CreateAssetGroupBody)
		  // Operation asset_group/create
		  // Create a new asset group.
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter createAssetGroupBody: (body)  
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.AssetGroupCreateCallback(CreateAssetGroupResponse) on completion. 
		  //
		  // - POST /businesses/{business_id}/asset_groups
		  // - Create a new asset group with the specified parameters. - An <a href="https://help.pinterest.com/en/business/article/asset-groups">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(createAssetGroupBody), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/asset_groups"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AssetGroupCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AssetGroupCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AssetGroupCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CreateAssetGroupResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CreateAssetGroupResponse
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
		Private Sub AssetGroupCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CreateAssetGroupResponse
		  CallbackHandler.AssetGroupCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AssetGroupCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CreateAssetGroupResponse
		  Call AssetGroupCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AssetGroupCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AssetGroupDelete(, businessId As String, deleteAssetGroupBody As OpenAPIClient.Models.DeleteAssetGroupBody)
		  // Operation asset_group/delete
		  // Delete asset groups.
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter deleteAssetGroupBody: (body)  
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.AssetGroupDeleteCallback(DeleteAssetGroupResponse) on completion. 
		  //
		  // - DELETE /businesses/{business_id}/asset_groups
		  // - Delete a batch of asset groups.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(deleteAssetGroupBody), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/asset_groups"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AssetGroupDelete_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AssetGroupDelete_error
		  
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AssetGroupDeletePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.DeleteAssetGroupResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.DeleteAssetGroupResponse
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
		Private Sub AssetGroupDelete_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.DeleteAssetGroupResponse
		  CallbackHandler.AssetGroupDeleteCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AssetGroupDelete_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.DeleteAssetGroupResponse
		  Call AssetGroupDeletePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AssetGroupDeleteCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AssetGroupUpdate(, businessId As String, updateAssetGroupBody As OpenAPIClient.Models.UpdateAssetGroupBody)
		  // Operation asset_group/update
		  // Update asset groups.
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter updateAssetGroupBody: (body)  
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.AssetGroupUpdateCallback(UpdateAssetGroupResponse) on completion. 
		  //
		  // - PATCH /businesses/{business_id}/asset_groups
		  // - Update a batch of asset groups with the specified parameters.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(updateAssetGroupBody), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/asset_groups"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AssetGroupUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AssetGroupUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AssetGroupUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UpdateAssetGroupResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UpdateAssetGroupResponse
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
		Private Sub AssetGroupUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UpdateAssetGroupResponse
		  CallbackHandler.AssetGroupUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AssetGroupUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UpdateAssetGroupResponse
		  Call AssetGroupUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AssetGroupUpdateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BusinessAssetMembersGet(, businessId As String, assetId As String, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger, Optional startIndex As Xoson.O.OptionalInteger)
		  // Operation business_asset_members/get
		  // Get members with access to asset
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter assetId: (path) Unique identifier of a business asset. 
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter startIndex: (query) An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.BusinessAssetMembersGetCallback(BusinessAssetMembersGet200Response) on completion. 
		  //
		  // - GET /businesses/{business_id}/assets/{asset_id}/members
		  // - Get all the members the requesting business has granted access to on the given asset.
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
		  
		  If startIndex <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("start_index") + "=" + EncodeURLComponent(startIndex.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/assets/{asset_id}/members"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  Dim localVarPathStringassetId As String = assetId
		  
		  localVarPath = localVarPath.ReplaceAllB("{asset_id}", localVarPathStringassetId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BusinessAssetMembersGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BusinessAssetMembersGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BusinessAssetMembersGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BusinessAssetMembersGet200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BusinessAssetMembersGet200Response
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
		Private Sub BusinessAssetMembersGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BusinessAssetMembersGet200Response
		  CallbackHandler.BusinessAssetMembersGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BusinessAssetMembersGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BusinessAssetMembersGet200Response
		  Call BusinessAssetMembersGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BusinessAssetMembersGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BusinessAssetPartnersGet(, businessId As String, assetId As String, Optional startIndex As Xoson.O.OptionalInteger, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation business_asset_partners/get
		  // Get partners with access to asset
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter assetId: (path) Unique identifier of a business asset. 
		  // - parameter startIndex: (query) An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.BusinessAssetPartnersGetCallback(BusinessAssetPartnersGet200Response) on completion. 
		  //
		  // - GET /businesses/{business_id}/assets/{asset_id}/partners
		  // - Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If startIndex <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("start_index") + "=" + EncodeURLComponent(startIndex.ToString)
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/assets/{asset_id}/partners"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  Dim localVarPathStringassetId As String = assetId
		  
		  localVarPath = localVarPath.ReplaceAllB("{asset_id}", localVarPathStringassetId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BusinessAssetPartnersGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BusinessAssetPartnersGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BusinessAssetPartnersGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BusinessAssetPartnersGet200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BusinessAssetPartnersGet200Response
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
		Private Sub BusinessAssetPartnersGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BusinessAssetPartnersGet200Response
		  CallbackHandler.BusinessAssetPartnersGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BusinessAssetPartnersGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BusinessAssetPartnersGet200Response
		  Call BusinessAssetPartnersGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BusinessAssetPartnersGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BusinessAssetsGet(, businessId As String, permissions() As PermissionsWithOwner, Optional childAssetId As Xoson.O.OptionalString, Optional assetGroupId As Xoson.O.OptionalString, assetType As Asset_typeEnum_BusinessAssetsGet, Optional startIndex As Xoson.O.OptionalInteger, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation business_assets/get
		  // List business assets
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter permissions: (query) A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional, default to Nil)
		  // - parameter childAssetId: (query) A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional, default to Sample)
		  // - parameter assetGroupId: (query) An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional, default to Sample)
		  // - parameter assetType: (query) A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to AD_ACCOUNT)
		  // - parameter startIndex: (query) An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.BusinessAssetsGetCallback(BusinessAssetsGet200Response) on completion. 
		  //
		  // - GET /businesses/{business_id}/assets
		  // - Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  
		  Dim localVarQueryStringspermissions() As String
		  For Each localVarItempermissions As PermissionsWithOwner in permissions
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItempermissions))
		    Select Case "form"
		      Case "form"
		        localVarQueryStringspermissions.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringspermissions.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringspermissions.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringpermissions As String
		  localVarQueryStringpermissions = Join(localVarQueryStringspermissions, "&")
		  If childAssetId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("child_asset_id") + "=" + EncodeURLComponent(childAssetId)
		  
		  If assetGroupId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("asset_group_id") + "=" + EncodeURLComponent(assetGroupId)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("asset_type") + "=" + EncodeURLComponent(Asset_typeEnum_BusinessAssetsGetToString(assetType))
		  
		  If startIndex <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("start_index") + "=" + EncodeURLComponent(startIndex.ToString)
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/assets"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BusinessAssetsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BusinessAssetsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BusinessAssetsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BusinessAssetsGet200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BusinessAssetsGet200Response
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
		Private Sub BusinessAssetsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BusinessAssetsGet200Response
		  CallbackHandler.BusinessAssetsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BusinessAssetsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BusinessAssetsGet200Response
		  Call BusinessAssetsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BusinessAssetsGetCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Asset_typeEnum_BusinessAssetsGetToString(value As Asset_typeEnum_BusinessAssetsGet) As String
		  Select Case value
		    
		    Case Asset_typeEnum_BusinessAssetsGet.AdAccount
		      Return "AD_ACCOUNT"
		    Case Asset_typeEnum_BusinessAssetsGet.Profile
		      Return "PROFILE"
		    Case Asset_typeEnum_BusinessAssetsGet.AssetGroup
		      Return "ASSET_GROUP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessMemberAssetsGet(, businessId As String, memberId As String, assetType As Asset_typeEnum_BusinessMemberAssetsGet, Optional startIndex As Xoson.O.OptionalInteger, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation business_member_assets/get
		  // Get assets assigned to a member
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter memberId: (path) The member id to fetch assets for. 
		  // - parameter assetType: (query) A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to AD_ACCOUNT)
		  // - parameter startIndex: (query) An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.BusinessMemberAssetsGetCallback(BusinessMemberAssetsGet200Response) on completion. 
		  //
		  // - GET /businesses/{business_id}/members/{member_id}/assets
		  // - Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("asset_type") + "=" + EncodeURLComponent(Asset_typeEnum_BusinessMemberAssetsGetToString(assetType))
		  
		  If startIndex <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("start_index") + "=" + EncodeURLComponent(startIndex.ToString)
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/members/{member_id}/assets"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  Dim localVarPathStringmemberId As String = memberId
		  
		  localVarPath = localVarPath.ReplaceAllB("{member_id}", localVarPathStringmemberId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BusinessMemberAssetsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BusinessMemberAssetsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BusinessMemberAssetsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BusinessMemberAssetsGet200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BusinessMemberAssetsGet200Response
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
		Private Sub BusinessMemberAssetsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BusinessMemberAssetsGet200Response
		  CallbackHandler.BusinessMemberAssetsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BusinessMemberAssetsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BusinessMemberAssetsGet200Response
		  Call BusinessMemberAssetsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BusinessMemberAssetsGetCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Asset_typeEnum_BusinessMemberAssetsGetToString(value As Asset_typeEnum_BusinessMemberAssetsGet) As String
		  Select Case value
		    
		    Case Asset_typeEnum_BusinessMemberAssetsGet.AdAccount
		      Return "AD_ACCOUNT"
		    Case Asset_typeEnum_BusinessMemberAssetsGet.Profile
		      Return "PROFILE"
		    Case Asset_typeEnum_BusinessMemberAssetsGet.AssetGroup
		      Return "ASSET_GROUP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessMembersAssetAccessDelete(, businessId As String, businessMembersAssetAccessDeleteRequest As OpenAPIClient.Models.BusinessMembersAssetAccessDeleteRequest)
		  // Operation business_members_asset_access/delete
		  // Delete member access to asset
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter businessMembersAssetAccessDeleteRequest: (body) List member assset permissions to delete. 
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.BusinessMembersAssetAccessDeleteCallback(DeleteMemberAccessResultsResponseArray) on completion. 
		  //
		  // - DELETE /businesses/{business_id}/members/assets/access
		  // - Terminate multiple members' access to an asset.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(businessMembersAssetAccessDeleteRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/members/assets/access"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BusinessMembersAssetAccessDelete_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BusinessMembersAssetAccessDelete_error
		  
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BusinessMembersAssetAccessDeletePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.DeleteMemberAccessResultsResponseArray) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.DeleteMemberAccessResultsResponseArray
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
		Private Sub BusinessMembersAssetAccessDelete_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.DeleteMemberAccessResultsResponseArray
		  CallbackHandler.BusinessMembersAssetAccessDeleteCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BusinessMembersAssetAccessDelete_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.DeleteMemberAccessResultsResponseArray
		  Call BusinessMembersAssetAccessDeletePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BusinessMembersAssetAccessDeleteCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BusinessMembersAssetAccessUpdate(, businessId As String, updateMemberAssetAccessBody As OpenAPIClient.Models.UpdateMemberAssetAccessBody)
		  // Operation business_members_asset_access/update
		  // Assign/Update member asset permissions
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter updateMemberAssetAccessBody: (body) List of member asset permissions to create or update. 
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.BusinessMembersAssetAccessUpdateCallback(UpdateMemberAssetsResultsResponseArray) on completion. 
		  //
		  // - PATCH /businesses/{business_id}/members/assets/access
		  // - Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(updateMemberAssetAccessBody), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/members/assets/access"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BusinessMembersAssetAccessUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BusinessMembersAssetAccessUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BusinessMembersAssetAccessUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UpdateMemberAssetsResultsResponseArray) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UpdateMemberAssetsResultsResponseArray
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
		Private Sub BusinessMembersAssetAccessUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UpdateMemberAssetsResultsResponseArray
		  CallbackHandler.BusinessMembersAssetAccessUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BusinessMembersAssetAccessUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UpdateMemberAssetsResultsResponseArray
		  Call BusinessMembersAssetAccessUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BusinessMembersAssetAccessUpdateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BusinessPartnerAssetAccessGet(, businessId As String, partnerId As String, Optional partnerType As OpenAPIClient.Models.PartnerType, assetType As Asset_typeEnum_BusinessPartnerAssetAccessGet, Optional startIndex As Xoson.O.OptionalInteger, Optional pageSize As Xoson.O.OptionalInteger, Optional bookmark As Xoson.O.OptionalString)
		  // Operation business_partner_asset_access/get
		  // Get assets assigned to a partner or assets assigned by a partner
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter partnerId: (path) The partner id to be bound to the Business 
		  // - parameter partnerType: (query) Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. (optional, default to Nil)
		  // - parameter assetType: (query) A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to AD_ACCOUNT)
		  // - parameter startIndex: (query) An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.BusinessPartnerAssetAccessGetCallback(BusinessPartnerAssetAccessGet200Response) on completion. 
		  //
		  // - GET /businesses/{business_id}/partners/{partner_id}/assets
		  // - Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If partnerType <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("partner_type") + "=" + EncodeURLComponent(Xoson.toJSON(partnerType))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("asset_type") + "=" + EncodeURLComponent(Asset_typeEnum_BusinessPartnerAssetAccessGetToString(assetType))
		  
		  If startIndex <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("start_index") + "=" + EncodeURLComponent(startIndex.ToString)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  

		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/partners/{partner_id}/assets"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  Dim localVarPathStringpartnerId As String = partnerId
		  
		  localVarPath = localVarPath.ReplaceAllB("{partner_id}", localVarPathStringpartnerId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BusinessPartnerAssetAccessGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BusinessPartnerAssetAccessGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BusinessPartnerAssetAccessGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BusinessPartnerAssetAccessGet200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BusinessPartnerAssetAccessGet200Response
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
		Private Sub BusinessPartnerAssetAccessGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BusinessPartnerAssetAccessGet200Response
		  CallbackHandler.BusinessPartnerAssetAccessGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BusinessPartnerAssetAccessGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BusinessPartnerAssetAccessGet200Response
		  Call BusinessPartnerAssetAccessGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BusinessPartnerAssetAccessGetCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Asset_typeEnum_BusinessPartnerAssetAccessGetToString(value As Asset_typeEnum_BusinessPartnerAssetAccessGet) As String
		  Select Case value
		    
		    Case Asset_typeEnum_BusinessPartnerAssetAccessGet.AdAccount
		      Return "AD_ACCOUNT"
		    Case Asset_typeEnum_BusinessPartnerAssetAccessGet.Profile
		      Return "PROFILE"
		    Case Asset_typeEnum_BusinessPartnerAssetAccessGet.AssetGroup
		      Return "ASSET_GROUP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeletePartnerAssetAccessHandlerImpl(, businessId As String, deletePartnerAssetAccessBody As OpenAPIClient.Models.DeletePartnerAssetAccessBody)
		  // Operation delete_partner_asset_access_handler_impl
		  // Delete partner access to asset
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter deletePartnerAssetAccessBody: (body)  
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.DeletePartnerAssetAccessHandlerImplCallback(DeletePartnerAssetsResultsResponseArray) on completion. 
		  //
		  // - DELETE /businesses/{business_id}/partners/assets
		  // - Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(deletePartnerAssetAccessBody), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/partners/assets"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.DeletePartnerAssetAccessHandlerImpl_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.DeletePartnerAssetAccessHandlerImpl_error
		  
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function DeletePartnerAssetAccessHandlerImplPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.DeletePartnerAssetsResultsResponseArray) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.DeletePartnerAssetsResultsResponseArray
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
		Private Sub DeletePartnerAssetAccessHandlerImpl_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.DeletePartnerAssetsResultsResponseArray
		  CallbackHandler.DeletePartnerAssetAccessHandlerImplCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DeletePartnerAssetAccessHandlerImpl_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.DeletePartnerAssetsResultsResponseArray
		  Call DeletePartnerAssetAccessHandlerImplPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.DeletePartnerAssetAccessHandlerImplCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub UpdatePartnerAssetAccessHandlerImpl(, businessId As String, updatePartnerAssetAccessBody As OpenAPIClient.Models.UpdatePartnerAssetAccessBody)
		  // Operation update_partner_asset_access_handler_impl
		  // Assign/Update partner asset permissions
		  // - 
		  // - parameter businessId: (path) Unique identifier of the requesting business. 
		  // - parameter updatePartnerAssetAccessBody: (body) A list of assets and permissions to assign to your partners. 
		  //
		  // Invokes BusinessAccessAssetsApiCallbackHandler.UpdatePartnerAssetAccessHandlerImplCallback(UpdatePartnerAssetsResultsResponseArray) on completion. 
		  //
		  // - PATCH /businesses/{business_id}/partners/assets
		  // - Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(updatePartnerAssetAccessBody), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/businesses/{business_id}/partners/assets"
		  
		  Dim localVarPathStringbusinessId As String = businessId
		  
		  localVarPath = localVarPath.ReplaceAllB("{business_id}", localVarPathStringbusinessId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UpdatePartnerAssetAccessHandlerImpl_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UpdatePartnerAssetAccessHandlerImpl_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UpdatePartnerAssetAccessHandlerImplPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UpdatePartnerAssetsResultsResponseArray) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UpdatePartnerAssetsResultsResponseArray
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
		Private Sub UpdatePartnerAssetAccessHandlerImpl_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UpdatePartnerAssetsResultsResponseArray
		  CallbackHandler.UpdatePartnerAssetAccessHandlerImplCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UpdatePartnerAssetAccessHandlerImpl_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UpdatePartnerAssetsResultsResponseArray
		  Call UpdatePartnerAssetAccessHandlerImplPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UpdatePartnerAssetAccessHandlerImplCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.BusinessAccessAssetsApiCallbackHandler
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

	#tag Enum, Name = Asset_typeEnum_BusinessAssetsGet, Type = Integer, Flags = &h0
		
        AdAccount
        Profile
        AssetGroup
		
	#tag EndEnum

	#tag Enum, Name = Asset_typeEnum_BusinessMemberAssetsGet, Type = Integer, Flags = &h0
		
        AdAccount
        Profile
        AssetGroup
		
	#tag EndEnum

	#tag Enum, Name = Asset_typeEnum_BusinessPartnerAssetAccessGet, Type = Integer, Flags = &h0
		
        AdAccount
        Profile
        AssetGroup
		
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
