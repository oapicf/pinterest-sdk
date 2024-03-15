#tag Class
Protected Class BoardsApi
	#tag Method, Flags = &h0
		Sub BoardSectionsCreate(, boardId As String, boardSection As OpenAPIClient.Models.BoardSection, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation board_sections/create
		  // Create board section
		  // - 
		  // - parameter boardId: (path) Unique identifier of a board. 
		  // - parameter boardSection: (body) Create a board section. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardSectionsCreateCallback(BoardSection) on completion. 
		  //
		  // - POST /boards/{board_id}/sections
		  // - Create a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(boardSection), "application/json")
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/boards/{board_id}/sections"
		  
		  Dim localVarPathStringboardId As String = boardId
		  
		  localVarPath = localVarPath.ReplaceAllB("{board_id}", localVarPathStringboardId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardSectionsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardSectionsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardSectionsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BoardSection) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BoardSection
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
		Private Sub BoardSectionsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BoardSection
		  CallbackHandler.BoardSectionsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardSectionsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BoardSection
		  Call BoardSectionsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardSectionsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BoardSectionsDelete(, boardId As String, sectionId As String, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation board_sections/delete
		  // Delete board section
		  // - parameter boardId: (path) Unique identifier of a board. 
		  // - parameter sectionId: (path) Unique identifier of a board section. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardSectionsDeleteCallback() on completion. 
		  //
		  // - DELETE /boards/{board_id}/sections/{section_id}
		  // - Delete a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/boards/{board_id}/sections/{section_id}"
		  
		  Dim localVarPathStringboardId As String = boardId
		  
		  localVarPath = localVarPath.ReplaceAllB("{board_id}", localVarPathStringboardId)
		  Dim localVarPathStringsectionId As String = sectionId
		  
		  localVarPath = localVarPath.ReplaceAllB("{section_id}", localVarPathStringsectionId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.BoardSectionsDelete_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardSectionsDelete_error
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub BoardSectionsDelete_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.BoardSectionsDeleteCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardSectionsDelete_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.BoardSectionsDeleteCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BoardSectionsList(, boardId As String, Optional adAccountId As Xoson.O.OptionalString, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation board_sections/list
		  // List board sections
		  // - 
		  // - parameter boardId: (path) Unique identifier of a board. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardSectionsListCallback(BoardSectionsList200Response) on completion. 
		  //
		  // - GET /boards/{board_id}/sections
		  // - Get a list of all board sections from a board owned by the "operation user_account" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/boards/{board_id}/sections"
		  
		  Dim localVarPathStringboardId As String = boardId
		  
		  localVarPath = localVarPath.ReplaceAllB("{board_id}", localVarPathStringboardId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardSectionsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardSectionsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardSectionsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BoardSectionsList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BoardSectionsList200Response
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
		Private Sub BoardSectionsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BoardSectionsList200Response
		  CallbackHandler.BoardSectionsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardSectionsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BoardSectionsList200Response
		  Call BoardSectionsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardSectionsListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BoardSectionsListPins(, boardId As String, sectionId As String, Optional adAccountId As Xoson.O.OptionalString, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation board_sections/list_pins
		  // List Pins on board section
		  // - 
		  // - parameter boardId: (path) Unique identifier of a board. 
		  // - parameter sectionId: (path) Unique identifier of a board section. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardSectionsListPinsCallback(BoardsListPins200Response) on completion. 
		  //
		  // - GET /boards/{board_id}/sections/{section_id}/pins
		  // - Get a list of the Pins on a board section of a board owned by the "operation user_account" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/boards/{board_id}/sections/{section_id}/pins"
		  
		  Dim localVarPathStringboardId As String = boardId
		  
		  localVarPath = localVarPath.ReplaceAllB("{board_id}", localVarPathStringboardId)
		  Dim localVarPathStringsectionId As String = sectionId
		  
		  localVarPath = localVarPath.ReplaceAllB("{section_id}", localVarPathStringsectionId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardSectionsListPins_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardSectionsListPins_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardSectionsListPinsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BoardsListPins200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BoardsListPins200Response
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
		Private Sub BoardSectionsListPins_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BoardsListPins200Response
		  CallbackHandler.BoardSectionsListPinsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardSectionsListPins_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BoardsListPins200Response
		  Call BoardSectionsListPinsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardSectionsListPinsCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BoardSectionsUpdate(, boardId As String, sectionId As String, boardSection As OpenAPIClient.Models.BoardSection, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation board_sections/update
		  // Update board section
		  // - 
		  // - parameter boardId: (path) Unique identifier of a board. 
		  // - parameter sectionId: (path) Unique identifier of a board section. 
		  // - parameter boardSection: (body) Update a board section. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardSectionsUpdateCallback(BoardSection) on completion. 
		  //
		  // - PATCH /boards/{board_id}/sections/{section_id}
		  // - Update a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(boardSection), "application/json")
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/boards/{board_id}/sections/{section_id}"
		  
		  Dim localVarPathStringboardId As String = boardId
		  
		  localVarPath = localVarPath.ReplaceAllB("{board_id}", localVarPathStringboardId)
		  Dim localVarPathStringsectionId As String = sectionId
		  
		  localVarPath = localVarPath.ReplaceAllB("{section_id}", localVarPathStringsectionId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardSectionsUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardSectionsUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardSectionsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BoardSection) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BoardSection
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
		Private Sub BoardSectionsUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BoardSection
		  CallbackHandler.BoardSectionsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardSectionsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BoardSection
		  Call BoardSectionsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardSectionsUpdateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BoardsCreate(, board As OpenAPIClient.Models.Board, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation boards/create
		  // Create board
		  // - 
		  // - parameter board: (body) Create a board using a single board json object. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardsCreateCallback(Board) on completion. 
		  //
		  // - POST /boards
		  // - Create a board owned by the "operation user_account". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(board), "application/json")
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/boards"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardsCreate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardsCreate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardsCreatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Board) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Board
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
		Private Sub BoardsCreate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Board
		  CallbackHandler.BoardsCreateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardsCreate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Board
		  Call BoardsCreatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardsCreateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BoardsDelete(, boardId As String, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation boards/delete
		  // Delete board
		  // - parameter boardId: (path) Unique identifier of a board. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardsDeleteCallback() on completion. 
		  //
		  // - DELETE /boards/{board_id}
		  // - Delete a board owned by the "operation user_account". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/boards/{board_id}"
		  
		  Dim localVarPathStringboardId As String = boardId
		  
		  localVarPath = localVarPath.ReplaceAllB("{board_id}", localVarPathStringboardId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.BoardsDelete_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardsDelete_error
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub BoardsDelete_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.BoardsDeleteCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardsDelete_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.BoardsDeleteCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BoardsGet(, boardId As String, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation boards/get
		  // Get board
		  // - 
		  // - parameter boardId: (path) Unique identifier of a board. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardsGetCallback(Board) on completion. 
		  //
		  // - GET /boards/{board_id}
		  // - Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/boards/{board_id}"
		  
		  Dim localVarPathStringboardId As String = boardId
		  
		  localVarPath = localVarPath.ReplaceAllB("{board_id}", localVarPathStringboardId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Board) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Board
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
		Private Sub BoardsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Board
		  CallbackHandler.BoardsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Board
		  Call BoardsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub BoardsList(, Optional adAccountId As Xoson.O.OptionalString, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger, privacy As PrivacyEnum_BoardsList)
		  // Operation boards/list
		  // List boards
		  // - 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter privacy: (query) Privacy setting for a board. (optional, default to Sample)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardsListCallback(BoardsList200Response) on completion. 
		  //
		  // - GET /boards
		  // - Get a list of the boards owned by the "operation user_account" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("privacy") + "=" + EncodeURLComponent(PrivacyEnum_BoardsListToString(privacy))
		  

		  
		  


		  Dim localVarPath As String = "/boards"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BoardsList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BoardsList200Response
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
		Private Sub BoardsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BoardsList200Response
		  CallbackHandler.BoardsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BoardsList200Response
		  Call BoardsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardsListCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function PrivacyEnum_BoardsListToString(value As PrivacyEnum_BoardsList) As String
		  Select Case value
		    
		    Case PrivacyEnum_BoardsList.All
		      Return "ALL"
		    Case PrivacyEnum_BoardsList.Escapedprotected
		      Return "PROTECTED"
		    Case PrivacyEnum_BoardsList.Escapedpublic
		      Return "PUBLIC"
		    Case PrivacyEnum_BoardsList.Secret
		      Return "SECRET"
		    Case PrivacyEnum_BoardsList.PublicAndSecret
		      Return "PUBLIC_AND_SECRET"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardsListPins(, boardId As String, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger, creativeTypes() As Creative_typesEnum_BoardsListPins, Optional adAccountId As Xoson.O.OptionalString, Optional pinMetrics As Xoson.O.OptionalBoolean)
		  // Operation boards/list_pins
		  // List Pins on board
		  // - 
		  // - parameter boardId: (path) Unique identifier of a board. 
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
		  // - parameter creativeTypes: (query) Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional, default to Nil)
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  // - parameter pinMetrics: (query) Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardsListPinsCallback(BoardsListPins200Response) on completion. 
		  //
		  // - GET /boards/{board_id}/pins
		  // - Get a list of the Pins on a board owned by the "operation user_account" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
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
		  
		  
		  Dim localVarQueryStringscreativeTypes() As String
		  For Each localVarItemcreativeTypes As Creative_typesEnum_BoardsListPins in creativeTypes
		    Dim encodedParameter As String = EncodeURLComponent(Creative_typesEnum_BoardsListPinsToString(localVarItemcreativeTypes))
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
		  

		  
		  


		  Dim localVarPath As String = "/boards/{board_id}/pins"
		  
		  Dim localVarPathStringboardId As String = boardId
		  
		  localVarPath = localVarPath.ReplaceAllB("{board_id}", localVarPathStringboardId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardsListPins_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardsListPins_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardsListPinsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BoardsListPins200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BoardsListPins200Response
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
		Private Sub BoardsListPins_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BoardsListPins200Response
		  CallbackHandler.BoardsListPinsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardsListPins_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BoardsListPins200Response
		  Call BoardsListPinsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardsListPinsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function Creative_typesEnum_BoardsListPinsToString(value As Creative_typesEnum_BoardsListPins) As String
		  Select Case value
		    
		    Case Creative_typesEnum_BoardsListPins.Regular
		      Return "REGULAR"
		    Case Creative_typesEnum_BoardsListPins.Video
		      Return "VIDEO"
		    Case Creative_typesEnum_BoardsListPins.Shopping
		      Return "SHOPPING"
		    Case Creative_typesEnum_BoardsListPins.Carousel
		      Return "CAROUSEL"
		    Case Creative_typesEnum_BoardsListPins.MaxVideo
		      Return "MAX_VIDEO"
		    Case Creative_typesEnum_BoardsListPins.ShopThePin
		      Return "SHOP_THE_PIN"
		    Case Creative_typesEnum_BoardsListPins.Collection
		      Return "COLLECTION"
		    Case Creative_typesEnum_BoardsListPins.Idea
		      Return "IDEA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardsUpdate(, boardId As String, boardUpdate As OpenAPIClient.Models.BoardUpdate, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation boards/update
		  // Update board
		  // - 
		  // - parameter boardId: (path) Unique identifier of a board. 
		  // - parameter boardUpdate: (body) Update a board. 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes BoardsApiCallbackHandler.BoardsUpdateCallback(Board) on completion. 
		  //
		  // - PATCH /boards/{board_id}
		  // - Update a board owned by the "operating user_account". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". - By default, the "operation user_account" is the token user_account.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(boardUpdate), "application/json")
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/boards/{board_id}"
		  
		  Dim localVarPathStringboardId As String = boardId
		  
		  localVarPath = localVarPath.ReplaceAllB("{board_id}", localVarPathStringboardId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardsUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardsUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("PATCH", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardsUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Board) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Board
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
		Private Sub BoardsUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Board
		  CallbackHandler.BoardsUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardsUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Board
		  Call BoardsUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardsUpdateCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.BoardsApiCallbackHandler
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

	#tag Enum, Name = PrivacyEnum_BoardsList, Type = Integer, Flags = &h0
		
        All
        Escapedprotected
        Escapedpublic
        Secret
        PublicAndSecret
		
	#tag EndEnum

	#tag Enum, Name = Creative_typesEnum_BoardsListPins, Type = Integer, Flags = &h0
		
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
