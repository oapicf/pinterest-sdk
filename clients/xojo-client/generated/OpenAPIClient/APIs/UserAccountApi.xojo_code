#tag Class
Protected Class UserAccountApi
	#tag Method, Flags = &h0
		Sub BoardsUserFollowsList(, Optional adAccountId As Xoson.O.OptionalString, Optional explicitFollowing As Xoson.O.OptionalBoolean, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation boards_user_follows/list
		  // List following boards
		  // - 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  // - parameter explicitFollowing: (query) Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional, default to false)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  //
		  // Invokes UserAccountApiCallbackHandler.BoardsUserFollowsListCallback(BoardsList200Response) on completion. 
		  //
		  // - GET /user_account/following/boards
		  // - Get a list of the boards a user follows. The request returns a board summary object array.
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
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  
		  If explicitFollowing <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("explicit_following") + "=" + EncodeURLComponent(explicitFollowing.ToString)
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  

		  
		  
		  


		  Dim localVarPath As String = "/user_account/following/boards"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.BoardsUserFollowsList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.BoardsUserFollowsList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function BoardsUserFollowsListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BoardsList200Response) As Boolean
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
		Private Sub BoardsUserFollowsList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BoardsList200Response
		  CallbackHandler.BoardsUserFollowsListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub BoardsUserFollowsList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BoardsList200Response
		  Call BoardsUserFollowsListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.BoardsUserFollowsListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub FollowUserUpdate(, username As String, followUserCreate As OpenAPIClient.Models.FollowUserCreate)
		  // Operation follow_user/update
		  // Follow user
		  // - 
		  // - parameter username: (path) A valid username 
		  // - parameter followUserCreate: (body)  
		  //
		  // Invokes UserAccountApiCallbackHandler.FollowUserUpdateCallback(FollowUser) on completion. 
		  //
		  // - POST /user_account/following/{username}
		  // - **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(followUserCreate), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/user_account/following/{username}"
		  
		  Dim localVarPathStringusername As String = username
		  
		  localVarPath = localVarPath.ReplaceAllB("{username}", localVarPathStringusername)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.FollowUserUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.FollowUserUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function FollowUserUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.FollowUser) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.FollowUser
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
		Private Sub FollowUserUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.FollowUser
		  CallbackHandler.FollowUserUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub FollowUserUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.FollowUser
		  Call FollowUserUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.FollowUserUpdateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub FollowersList(, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation followers/list
		  // List followers
		  // - 
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  //
		  // Invokes UserAccountApiCallbackHandler.FollowersListCallback(FollowersList200Response) on completion. 
		  //
		  // - GET /user_account/followers
		  // - Get a list of your followers.
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
		  

		  
		  
		  


		  Dim localVarPath As String = "/user_account/followers"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.FollowersList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.FollowersList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function FollowersListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.FollowersList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.FollowersList200Response
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
		Private Sub FollowersList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.FollowersList200Response
		  CallbackHandler.FollowersListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub FollowersList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.FollowersList200Response
		  Call FollowersListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.FollowersListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub LinkedBusinessAccountsGet()
		  // Operation linked_business_accounts/get
		  // List linked businesses
		  // - 
		  //
		  // Invokes UserAccountApiCallbackHandler.LinkedBusinessAccountsGetCallback(LinkedBusiness) on completion. 
		  //
		  // - GET /user_account/businesses
		  // - Get a list of your linked business accounts.
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
		  
		  
		  
		  
		  


		  Dim localVarPath As String = "/user_account/businesses"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.LinkedBusinessAccountsGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.LinkedBusinessAccountsGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function LinkedBusinessAccountsGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As OpenAPIClient.Models.LinkedBusiness) As Boolean
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
		Private Sub LinkedBusinessAccountsGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data() As OpenAPIClient.Models.LinkedBusiness
		  CallbackHandler.LinkedBusinessAccountsGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub LinkedBusinessAccountsGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As OpenAPIClient.Models.LinkedBusiness
		  Call LinkedBusinessAccountsGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.LinkedBusinessAccountsGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub UnverifyWebsiteDelete(, website As String)
		  // Operation unverify_website/delete
		  // Unverify website
		  // - 
		  // - parameter website: (query) Website with path or domain only 
		  //
		  // Invokes UserAccountApiCallbackHandler.UnverifyWebsiteDeleteCallback(UserWebsite) on completion. Note that the response is optional. 
		  //
		  // - DELETE /user_account/websites
		  // - Unverify a website verified by the signed-in user.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("website") + "=" + EncodeURLComponent(website)
		  

		  
		  


		  Dim localVarPath As String = "/user_account/websites"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UnverifyWebsiteDelete_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UnverifyWebsiteDelete_error
		  
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UnverifyWebsiteDeletePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UserWebsite) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UserWebsite
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
		Private Sub UnverifyWebsiteDelete_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UserWebsite
		  CallbackHandler.UnverifyWebsiteDeleteCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UnverifyWebsiteDelete_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UserWebsite
		  Call UnverifyWebsiteDeletePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UnverifyWebsiteDeleteCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub UserAccountAnalytics(, startDate As Date, endDate As Date, fromClaimedContent As From_claimed_contentEnum_UserAccountAnalytics, pinFormat As Pin_formatEnum_UserAccountAnalytics, appTypes As App_typesEnum_UserAccountAnalytics, contentType As Content_typeEnum_UserAccountAnalytics, source As SourceEnum_UserAccountAnalytics, metricTypes() As QuerymetrictypesItems, splitField As Split_fieldEnum_UserAccountAnalytics, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation user_account/analytics
		  // Get user account analytics
		  // - 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter fromClaimedContent: (query) Filter on Pins that match your claimed domain. (optional, default to BOTH)
		  // - parameter pinFormat: (query) Pin formats to get data for, default is all. (optional, default to ALL)
		  // - parameter appTypes: (query) Apps or devices to get data for, default is all. (optional, default to ALL)
		  // - parameter contentType: (query) Filter to paid or organic data. Default is all. (optional, default to ALL)
		  // - parameter source: (query) Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to ALL)
		  // - parameter metricTypes: (query) Metric types to get data for, default is all. (optional, default to Nil)
		  // - parameter splitField: (query) How to split the data into groups. Not including this param means data won&#39;t be split. (optional, default to NO_SPLIT)
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes UserAccountApiCallbackHandler.UserAccountAnalyticsCallback(Dictionary) on completion. 
		  //
		  // - GET /user_account/analytics
		  // - Get analytics for the "operation user_account" - By default, the "operation user_account" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("from_claimed_content") + "=" + EncodeURLComponent(From_claimed_contentEnum_UserAccountAnalyticsToString(fromClaimedContent))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("pin_format") + "=" + EncodeURLComponent(Pin_formatEnum_UserAccountAnalyticsToString(pinFormat))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("app_types") + "=" + EncodeURLComponent(App_typesEnum_UserAccountAnalyticsToString(appTypes))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("content_type") + "=" + EncodeURLComponent(Content_typeEnum_UserAccountAnalyticsToString(contentType))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("source") + "=" + EncodeURLComponent(SourceEnum_UserAccountAnalyticsToString(source))
		  
		  
		  Dim localVarQueryStringsmetricTypes() As String
		  For Each localVarItemmetricTypes As QuerymetrictypesItems in metricTypes
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
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("split_field") + "=" + EncodeURLComponent(Split_fieldEnum_UserAccountAnalyticsToString(splitField))
		  
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/user_account/analytics"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UserAccountAnalytics_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UserAccountAnalytics_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UserAccountAnalyticsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As Dictionary) As Boolean
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
		Private Sub UserAccountAnalytics_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As Dictionary
		  CallbackHandler.UserAccountAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UserAccountAnalytics_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As Dictionary
		  Call UserAccountAnalyticsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UserAccountAnalyticsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function From_claimed_contentEnum_UserAccountAnalyticsToString(value As From_claimed_contentEnum_UserAccountAnalytics) As String
		  Select Case value
		    
		    Case From_claimed_contentEnum_UserAccountAnalytics.Other
		      Return "OTHER"
		    Case From_claimed_contentEnum_UserAccountAnalytics.Claimed
		      Return "CLAIMED"
		    Case From_claimed_contentEnum_UserAccountAnalytics.Both
		      Return "BOTH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Pin_formatEnum_UserAccountAnalyticsToString(value As Pin_formatEnum_UserAccountAnalytics) As String
		  Select Case value
		    
		    Case Pin_formatEnum_UserAccountAnalytics.All
		      Return "ALL"
		    Case Pin_formatEnum_UserAccountAnalytics.OrganicImage
		      Return "ORGANIC_IMAGE"
		    Case Pin_formatEnum_UserAccountAnalytics.OrganicProduct
		      Return "ORGANIC_PRODUCT"
		    Case Pin_formatEnum_UserAccountAnalytics.OrganicVideo
		      Return "ORGANIC_VIDEO"
		    Case Pin_formatEnum_UserAccountAnalytics.AdsStandard
		      Return "ADS_STANDARD"
		    Case Pin_formatEnum_UserAccountAnalytics.AdsProduct
		      Return "ADS_PRODUCT"
		    Case Pin_formatEnum_UserAccountAnalytics.AdsVideo
		      Return "ADS_VIDEO"
		    Case Pin_formatEnum_UserAccountAnalytics.AdsIdea
		      Return "ADS_IDEA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function App_typesEnum_UserAccountAnalyticsToString(value As App_typesEnum_UserAccountAnalytics) As String
		  Select Case value
		    
		    Case App_typesEnum_UserAccountAnalytics.All
		      Return "ALL"
		    Case App_typesEnum_UserAccountAnalytics.Mobile
		      Return "MOBILE"
		    Case App_typesEnum_UserAccountAnalytics.Tablet
		      Return "TABLET"
		    Case App_typesEnum_UserAccountAnalytics.Web
		      Return "WEB"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Content_typeEnum_UserAccountAnalyticsToString(value As Content_typeEnum_UserAccountAnalytics) As String
		  Select Case value
		    
		    Case Content_typeEnum_UserAccountAnalytics.All
		      Return "ALL"
		    Case Content_typeEnum_UserAccountAnalytics.Paid
		      Return "PAID"
		    Case Content_typeEnum_UserAccountAnalytics.Organic
		      Return "ORGANIC"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function SourceEnum_UserAccountAnalyticsToString(value As SourceEnum_UserAccountAnalytics) As String
		  Select Case value
		    
		    Case SourceEnum_UserAccountAnalytics.All
		      Return "ALL"
		    Case SourceEnum_UserAccountAnalytics.YourPins
		      Return "YOUR_PINS"
		    Case SourceEnum_UserAccountAnalytics.OtherPins
		      Return "OTHER_PINS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Split_fieldEnum_UserAccountAnalyticsToString(value As Split_fieldEnum_UserAccountAnalytics) As String
		  Select Case value
		    
		    Case Split_fieldEnum_UserAccountAnalytics.NoSplit
		      Return "NO_SPLIT"
		    Case Split_fieldEnum_UserAccountAnalytics.AppType
		      Return "APP_TYPE"
		    Case Split_fieldEnum_UserAccountAnalytics.OwnedContent
		      Return "OWNED_CONTENT"
		    Case Split_fieldEnum_UserAccountAnalytics.Source
		      Return "SOURCE"
		    Case Split_fieldEnum_UserAccountAnalytics.PinFormat
		      Return "PIN_FORMAT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserAccountAnalyticsTopPins(, startDate As Date, endDate As Date, sortBy As OpenAPIClient.Models.TopPinsSortBy, fromClaimedContent As From_claimed_contentEnum_UserAccountAnalyticsTopPins, pinFormat As Pin_formatEnum_UserAccountAnalyticsTopPins, appTypes As App_typesEnum_UserAccountAnalyticsTopPins, contentType As Content_typeEnum_UserAccountAnalyticsTopPins, source As SourceEnum_UserAccountAnalyticsTopPins, metricTypes() As QuerymetrictypesItems, Optional numOfPins As Xoson.O.OptionalInteger, createdInLastNDays As Created_in_last_n_daysEnum_UserAccountAnalyticsTopPins, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation user_account/analytics/top_pins
		  // Get user account top pins analytics
		  // - 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter sortBy: (query) Specify sorting order for metrics 
		  // - parameter fromClaimedContent: (query) Filter on Pins that match your claimed domain. (optional, default to BOTH)
		  // - parameter pinFormat: (query) Pin formats to get data for, default is all. (optional, default to ALL)
		  // - parameter appTypes: (query) Apps or devices to get data for, default is all. (optional, default to ALL)
		  // - parameter contentType: (query) Filter to paid or organic data. Default is all. (optional, default to ALL)
		  // - parameter source: (query) Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to ALL)
		  // - parameter metricTypes: (query) Metric types to get data for, default is all. (optional, default to Nil)
		  // - parameter numOfPins: (query) Number of pins to include, default is 10. Max is 50. (optional, default to 10)
		  // - parameter createdInLastNDays: (query) Get metrics for pins created in the last &quot;n&quot; days. (optional, default to 0)
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes UserAccountApiCallbackHandler.UserAccountAnalyticsTopPinsCallback(TopPinsAnalyticsResponse) on completion. 
		  //
		  // - GET /user_account/analytics/top_pins
		  // - Gets analytics data about a user's top pins (limited to the top 50). - By default, the "operation user_account" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("sort_by") + "=" + EncodeURLComponent(Xoson.toJSON(sortBy))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("from_claimed_content") + "=" + EncodeURLComponent(From_claimed_contentEnum_UserAccountAnalyticsTopPinsToString(fromClaimedContent))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("pin_format") + "=" + EncodeURLComponent(Pin_formatEnum_UserAccountAnalyticsTopPinsToString(pinFormat))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("app_types") + "=" + EncodeURLComponent(App_typesEnum_UserAccountAnalyticsTopPinsToString(appTypes))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("content_type") + "=" + EncodeURLComponent(Content_typeEnum_UserAccountAnalyticsTopPinsToString(contentType))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("source") + "=" + EncodeURLComponent(SourceEnum_UserAccountAnalyticsTopPinsToString(source))
		  
		  
		  Dim localVarQueryStringsmetricTypes() As String
		  For Each localVarItemmetricTypes As QuerymetrictypesItems in metricTypes
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
		  If numOfPins <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("num_of_pins") + "=" + EncodeURLComponent(numOfPins.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("created_in_last_n_days") + "=" + EncodeURLComponent(Created_in_last_n_daysEnum_UserAccountAnalyticsTopPinsToString(createdInLastNDays))
		  
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  
		  


		  Dim localVarPath As String = "/user_account/analytics/top_pins"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UserAccountAnalyticsTopPins_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UserAccountAnalyticsTopPins_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UserAccountAnalyticsTopPinsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.TopPinsAnalyticsResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.TopPinsAnalyticsResponse
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
		Private Sub UserAccountAnalyticsTopPins_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.TopPinsAnalyticsResponse
		  CallbackHandler.UserAccountAnalyticsTopPinsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UserAccountAnalyticsTopPins_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.TopPinsAnalyticsResponse
		  Call UserAccountAnalyticsTopPinsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UserAccountAnalyticsTopPinsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function From_claimed_contentEnum_UserAccountAnalyticsTopPinsToString(value As From_claimed_contentEnum_UserAccountAnalyticsTopPins) As String
		  Select Case value
		    
		    Case From_claimed_contentEnum_UserAccountAnalyticsTopPins.Other
		      Return "OTHER"
		    Case From_claimed_contentEnum_UserAccountAnalyticsTopPins.Claimed
		      Return "CLAIMED"
		    Case From_claimed_contentEnum_UserAccountAnalyticsTopPins.Both
		      Return "BOTH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Pin_formatEnum_UserAccountAnalyticsTopPinsToString(value As Pin_formatEnum_UserAccountAnalyticsTopPins) As String
		  Select Case value
		    
		    Case Pin_formatEnum_UserAccountAnalyticsTopPins.All
		      Return "ALL"
		    Case Pin_formatEnum_UserAccountAnalyticsTopPins.OrganicImage
		      Return "ORGANIC_IMAGE"
		    Case Pin_formatEnum_UserAccountAnalyticsTopPins.OrganicProduct
		      Return "ORGANIC_PRODUCT"
		    Case Pin_formatEnum_UserAccountAnalyticsTopPins.OrganicVideo
		      Return "ORGANIC_VIDEO"
		    Case Pin_formatEnum_UserAccountAnalyticsTopPins.AdsStandard
		      Return "ADS_STANDARD"
		    Case Pin_formatEnum_UserAccountAnalyticsTopPins.AdsProduct
		      Return "ADS_PRODUCT"
		    Case Pin_formatEnum_UserAccountAnalyticsTopPins.AdsVideo
		      Return "ADS_VIDEO"
		    Case Pin_formatEnum_UserAccountAnalyticsTopPins.AdsIdea
		      Return "ADS_IDEA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function App_typesEnum_UserAccountAnalyticsTopPinsToString(value As App_typesEnum_UserAccountAnalyticsTopPins) As String
		  Select Case value
		    
		    Case App_typesEnum_UserAccountAnalyticsTopPins.All
		      Return "ALL"
		    Case App_typesEnum_UserAccountAnalyticsTopPins.Mobile
		      Return "MOBILE"
		    Case App_typesEnum_UserAccountAnalyticsTopPins.Tablet
		      Return "TABLET"
		    Case App_typesEnum_UserAccountAnalyticsTopPins.Web
		      Return "WEB"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Content_typeEnum_UserAccountAnalyticsTopPinsToString(value As Content_typeEnum_UserAccountAnalyticsTopPins) As String
		  Select Case value
		    
		    Case Content_typeEnum_UserAccountAnalyticsTopPins.All
		      Return "ALL"
		    Case Content_typeEnum_UserAccountAnalyticsTopPins.Paid
		      Return "PAID"
		    Case Content_typeEnum_UserAccountAnalyticsTopPins.Organic
		      Return "ORGANIC"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function SourceEnum_UserAccountAnalyticsTopPinsToString(value As SourceEnum_UserAccountAnalyticsTopPins) As String
		  Select Case value
		    
		    Case SourceEnum_UserAccountAnalyticsTopPins.All
		      Return "ALL"
		    Case SourceEnum_UserAccountAnalyticsTopPins.YourPins
		      Return "YOUR_PINS"
		    Case SourceEnum_UserAccountAnalyticsTopPins.OtherPins
		      Return "OTHER_PINS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Created_in_last_n_daysEnum_UserAccountAnalyticsTopPinsToString(value As Created_in_last_n_daysEnum_UserAccountAnalyticsTopPins) As String
		  Select Case value
		    
		    Case Created_in_last_n_daysEnum_UserAccountAnalyticsTopPins.Escaped30
		      Return "30"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserAccountAnalyticsTopVideoPins(, startDate As Date, endDate As Date, sortBy As OpenAPIClient.Models.TopVideoPinsSortBy, fromClaimedContent As From_claimed_contentEnum_UserAccountAnalyticsTopVideoPins, pinFormat As Pin_formatEnum_UserAccountAnalyticsTopVideoPins, appTypes As App_typesEnum_UserAccountAnalyticsTopVideoPins, contentType As Content_typeEnum_UserAccountAnalyticsTopVideoPins, source As SourceEnum_UserAccountAnalyticsTopVideoPins, metricTypes() As QueryvideopinmetrictypesItems, Optional numOfPins As Xoson.O.OptionalInteger, createdInLastNDays As Created_in_last_n_daysEnum_UserAccountAnalyticsTopVideoPins, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation user_account/analytics/top_video_pins
		  // Get user account top video pins analytics
		  // - 
		  // - parameter startDate: (query) Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. 
		  // - parameter endDate: (query) Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. 
		  // - parameter sortBy: (query) Specify sorting order for video metrics 
		  // - parameter fromClaimedContent: (query) Filter on Pins that match your claimed domain. (optional, default to BOTH)
		  // - parameter pinFormat: (query) Pin formats to get data for, default is all. (optional, default to ALL)
		  // - parameter appTypes: (query) Apps or devices to get data for, default is all. (optional, default to ALL)
		  // - parameter contentType: (query) Filter to paid or organic data. Default is all. (optional, default to ALL)
		  // - parameter source: (query) Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to ALL)
		  // - parameter metricTypes: (query) Metric types to get video data for, default is all. (optional, default to Nil)
		  // - parameter numOfPins: (query) Number of pins to include, default is 10. Max is 50. (optional, default to 10)
		  // - parameter createdInLastNDays: (query) Get metrics for pins created in the last &quot;n&quot; days. (optional, default to 0)
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes UserAccountApiCallbackHandler.UserAccountAnalyticsTopVideoPinsCallback(TopVideoPinsAnalyticsResponse) on completion. 
		  //
		  // - GET /user_account/analytics/top_video_pins
		  // - Gets analytics data about a user's top video pins (limited to the top 50). - By default, the "operation user_account" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
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
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("sort_by") + "=" + EncodeURLComponent(Xoson.toJSON(sortBy))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("from_claimed_content") + "=" + EncodeURLComponent(From_claimed_contentEnum_UserAccountAnalyticsTopVideoPinsToString(fromClaimedContent))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("pin_format") + "=" + EncodeURLComponent(Pin_formatEnum_UserAccountAnalyticsTopVideoPinsToString(pinFormat))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("app_types") + "=" + EncodeURLComponent(App_typesEnum_UserAccountAnalyticsTopVideoPinsToString(appTypes))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("content_type") + "=" + EncodeURLComponent(Content_typeEnum_UserAccountAnalyticsTopVideoPinsToString(contentType))
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("source") + "=" + EncodeURLComponent(SourceEnum_UserAccountAnalyticsTopVideoPinsToString(source))
		  
		  
		  Dim localVarQueryStringsmetricTypes() As String
		  For Each localVarItemmetricTypes As QueryvideopinmetrictypesItems in metricTypes
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
		  If numOfPins <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("num_of_pins") + "=" + EncodeURLComponent(numOfPins.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("created_in_last_n_days") + "=" + EncodeURLComponent(Created_in_last_n_daysEnum_UserAccountAnalyticsTopVideoPinsToString(createdInLastNDays))
		  
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  
		  


		  Dim localVarPath As String = "/user_account/analytics/top_video_pins"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UserAccountAnalyticsTopVideoPins_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UserAccountAnalyticsTopVideoPins_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UserAccountAnalyticsTopVideoPinsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.TopVideoPinsAnalyticsResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.TopVideoPinsAnalyticsResponse
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
		Private Sub UserAccountAnalyticsTopVideoPins_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.TopVideoPinsAnalyticsResponse
		  CallbackHandler.UserAccountAnalyticsTopVideoPinsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UserAccountAnalyticsTopVideoPins_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.TopVideoPinsAnalyticsResponse
		  Call UserAccountAnalyticsTopVideoPinsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UserAccountAnalyticsTopVideoPinsCallback(error, data)
		End Sub
	#tag EndMethod



	#tag Method, Flags = &h21
		Private Function From_claimed_contentEnum_UserAccountAnalyticsTopVideoPinsToString(value As From_claimed_contentEnum_UserAccountAnalyticsTopVideoPins) As String
		  Select Case value
		    
		    Case From_claimed_contentEnum_UserAccountAnalyticsTopVideoPins.Other
		      Return "OTHER"
		    Case From_claimed_contentEnum_UserAccountAnalyticsTopVideoPins.Claimed
		      Return "CLAIMED"
		    Case From_claimed_contentEnum_UserAccountAnalyticsTopVideoPins.Both
		      Return "BOTH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Pin_formatEnum_UserAccountAnalyticsTopVideoPinsToString(value As Pin_formatEnum_UserAccountAnalyticsTopVideoPins) As String
		  Select Case value
		    
		    Case Pin_formatEnum_UserAccountAnalyticsTopVideoPins.All
		      Return "ALL"
		    Case Pin_formatEnum_UserAccountAnalyticsTopVideoPins.OrganicImage
		      Return "ORGANIC_IMAGE"
		    Case Pin_formatEnum_UserAccountAnalyticsTopVideoPins.OrganicProduct
		      Return "ORGANIC_PRODUCT"
		    Case Pin_formatEnum_UserAccountAnalyticsTopVideoPins.OrganicVideo
		      Return "ORGANIC_VIDEO"
		    Case Pin_formatEnum_UserAccountAnalyticsTopVideoPins.AdsStandard
		      Return "ADS_STANDARD"
		    Case Pin_formatEnum_UserAccountAnalyticsTopVideoPins.AdsProduct
		      Return "ADS_PRODUCT"
		    Case Pin_formatEnum_UserAccountAnalyticsTopVideoPins.AdsVideo
		      Return "ADS_VIDEO"
		    Case Pin_formatEnum_UserAccountAnalyticsTopVideoPins.AdsIdea
		      Return "ADS_IDEA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function App_typesEnum_UserAccountAnalyticsTopVideoPinsToString(value As App_typesEnum_UserAccountAnalyticsTopVideoPins) As String
		  Select Case value
		    
		    Case App_typesEnum_UserAccountAnalyticsTopVideoPins.All
		      Return "ALL"
		    Case App_typesEnum_UserAccountAnalyticsTopVideoPins.Mobile
		      Return "MOBILE"
		    Case App_typesEnum_UserAccountAnalyticsTopVideoPins.Tablet
		      Return "TABLET"
		    Case App_typesEnum_UserAccountAnalyticsTopVideoPins.Web
		      Return "WEB"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Content_typeEnum_UserAccountAnalyticsTopVideoPinsToString(value As Content_typeEnum_UserAccountAnalyticsTopVideoPins) As String
		  Select Case value
		    
		    Case Content_typeEnum_UserAccountAnalyticsTopVideoPins.All
		      Return "ALL"
		    Case Content_typeEnum_UserAccountAnalyticsTopVideoPins.Paid
		      Return "PAID"
		    Case Content_typeEnum_UserAccountAnalyticsTopVideoPins.Organic
		      Return "ORGANIC"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function SourceEnum_UserAccountAnalyticsTopVideoPinsToString(value As SourceEnum_UserAccountAnalyticsTopVideoPins) As String
		  Select Case value
		    
		    Case SourceEnum_UserAccountAnalyticsTopVideoPins.All
		      Return "ALL"
		    Case SourceEnum_UserAccountAnalyticsTopVideoPins.YourPins
		      Return "YOUR_PINS"
		    Case SourceEnum_UserAccountAnalyticsTopVideoPins.OtherPins
		      Return "OTHER_PINS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h21
		Private Function Created_in_last_n_daysEnum_UserAccountAnalyticsTopVideoPinsToString(value As Created_in_last_n_daysEnum_UserAccountAnalyticsTopVideoPins) As String
		  Select Case value
		    
		    Case Created_in_last_n_daysEnum_UserAccountAnalyticsTopVideoPins.Escaped30
		      Return "30"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserAccountFollowedInterests(, username As String, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation user_account/followed_interests
		  // List following interests
		  // - 
		  // - parameter username: (path) A valid username 
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  //
		  // Invokes UserAccountApiCallbackHandler.UserAccountFollowedInterestsCallback(UserAccountFollowedInterests200Response) on completion. 
		  //
		  // - GET /users/{username}/interests/follow
		  // - Get a list of a user's following interests in one place.
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
		  

		  
		  
		  


		  Dim localVarPath As String = "/users/{username}/interests/follow"
		  
		  Dim localVarPathStringusername As String = username
		  
		  localVarPath = localVarPath.ReplaceAllB("{username}", localVarPathStringusername)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UserAccountFollowedInterests_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UserAccountFollowedInterests_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UserAccountFollowedInterestsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UserAccountFollowedInterests200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UserAccountFollowedInterests200Response
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
		Private Sub UserAccountFollowedInterests_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UserAccountFollowedInterests200Response
		  CallbackHandler.UserAccountFollowedInterestsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UserAccountFollowedInterests_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UserAccountFollowedInterests200Response
		  Call UserAccountFollowedInterestsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UserAccountFollowedInterestsCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub UserAccountGet(, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation user_account/get
		  // Get user account
		  // - 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes UserAccountApiCallbackHandler.UserAccountGetCallback(Account) on completion. 
		  //
		  // - GET /user_account
		  // - Get account information for the "operation user_account" - By default, the "operation user_account" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ "Understanding Business Access" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See [Understanding Business Access] for more information.
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
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  
		  


		  Dim localVarPath As String = "/user_account"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UserAccountGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UserAccountGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UserAccountGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.Account) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.Account
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
		Private Sub UserAccountGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.Account
		  CallbackHandler.UserAccountGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UserAccountGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.Account
		  Call UserAccountGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UserAccountGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub UserFollowingGet(, Optional adAccountId As Xoson.O.OptionalString, Optional explicitFollowing As Xoson.O.OptionalBoolean, feedType As OpenAPIClient.Models.UserFollowingFeedTypeOptional, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation user_following/get
		  // List following
		  // - 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  // - parameter explicitFollowing: (query) Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional, default to false)
		  // - parameter feedType: (query) Thrift param specifying what type of followees will be kept. Default to include all followees. (optional, default to Nil)
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  //
		  // Invokes UserAccountApiCallbackHandler.UserFollowingGetCallback(FollowersList200Response) on completion. 
		  //
		  // - GET /user_account/following
		  // - Get a list of who a certain user follows.
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
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  
		  If explicitFollowing <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("explicit_following") + "=" + EncodeURLComponent(explicitFollowing.ToString)
		  
		  If feedType <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("feed_type") + "=" + EncodeURLComponent(Xoson.toJSON(feedType))
		  
		  If bookmark <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bookmark") + "=" + EncodeURLComponent(bookmark)
		  
		  If pageSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("page_size") + "=" + EncodeURLComponent(pageSize.ToString)
		  

		  
		  
		  


		  Dim localVarPath As String = "/user_account/following"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UserFollowingGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UserFollowingGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UserFollowingGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.FollowersList200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.FollowersList200Response
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
		Private Sub UserFollowingGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.FollowersList200Response
		  CallbackHandler.UserFollowingGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UserFollowingGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.FollowersList200Response
		  Call UserFollowingGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UserFollowingGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub UserWebsitesGet(, Optional bookmark As Xoson.O.OptionalString, Optional pageSize As Xoson.O.OptionalInteger)
		  // Operation user_websites/get
		  // Get user websites
		  // - 
		  // - parameter bookmark: (query) Cursor used to fetch the next page of items (optional, default to Sample)
		  // - parameter pageSize: (query) Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
		  //
		  // Invokes UserAccountApiCallbackHandler.UserWebsitesGetCallback(UserWebsitesGet200Response) on completion. 
		  //
		  // - GET /user_account/websites
		  // - Get user websites, claimed or not
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
		  

		  
		  


		  Dim localVarPath As String = "/user_account/websites"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.UserWebsitesGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.UserWebsitesGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function UserWebsitesGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UserWebsitesGet200Response) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UserWebsitesGet200Response
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
		Private Sub UserWebsitesGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UserWebsitesGet200Response
		  CallbackHandler.UserWebsitesGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub UserWebsitesGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UserWebsitesGet200Response
		  Call UserWebsitesGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.UserWebsitesGetCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub VerifyWebsiteUpdate(, userWebsiteCreate As OpenAPIClient.Models.UserWebsiteCreate, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation verify_website/update
		  // Verify website
		  // - 
		  // - parameter userWebsiteCreate: (body)  
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes UserAccountApiCallbackHandler.VerifyWebsiteUpdateCallback(UserWebsite) on completion. 
		  //
		  // - POST /user_account/websites
		  // - Verify a website as a signed-in user.
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: pinterest_oauth2
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(userWebsiteCreate), "application/json")
		  Dim localVarQueryParams As String = "?"
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  


		  Dim localVarPath As String = "/user_account/websites"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.VerifyWebsiteUpdate_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.VerifyWebsiteUpdate_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function VerifyWebsiteUpdatePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UserWebsite) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UserWebsite
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
		Private Sub VerifyWebsiteUpdate_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UserWebsite
		  CallbackHandler.VerifyWebsiteUpdateCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub VerifyWebsiteUpdate_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UserWebsite
		  Call VerifyWebsiteUpdatePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.VerifyWebsiteUpdateCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub WebsiteVerificationGet(, Optional adAccountId As Xoson.O.OptionalString)
		  // Operation website_verification/get
		  // Get user verification code for website claiming
		  // - 
		  // - parameter adAccountId: (query) Unique identifier of an ad account. (optional, default to Sample)
		  //
		  // Invokes UserAccountApiCallbackHandler.WebsiteVerificationGetCallback(UserWebsiteVerification) on completion. 
		  //
		  // - GET /user_account/websites/verification
		  // - Get verification code for user to install on the website to claim it.
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
		  If adAccountId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("ad_account_id") + "=" + EncodeURLComponent(adAccountId)
		  

		  
		  
		  


		  Dim localVarPath As String = "/user_account/websites/verification"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.WebsiteVerificationGet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.WebsiteVerificationGet_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function WebsiteVerificationGetPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.UserWebsiteVerification) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.UserWebsiteVerification
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
		Private Sub WebsiteVerificationGet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.UserWebsiteVerification
		  CallbackHandler.WebsiteVerificationGetCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub WebsiteVerificationGet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.UserWebsiteVerification
		  Call WebsiteVerificationGetPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.WebsiteVerificationGetCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.UserAccountApiCallbackHandler
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

	#tag Enum, Name = From_claimed_contentEnum_UserAccountAnalytics, Type = Integer, Flags = &h0
		
        Other
        Claimed
        Both
		
	#tag EndEnum

	#tag Enum, Name = Pin_formatEnum_UserAccountAnalytics, Type = Integer, Flags = &h0
		
        All
        OrganicImage
        OrganicProduct
        OrganicVideo
        AdsStandard
        AdsProduct
        AdsVideo
        AdsIdea
		
	#tag EndEnum

	#tag Enum, Name = App_typesEnum_UserAccountAnalytics, Type = Integer, Flags = &h0
		
        All
        Mobile
        Tablet
        Web
		
	#tag EndEnum

	#tag Enum, Name = Content_typeEnum_UserAccountAnalytics, Type = Integer, Flags = &h0
		
        All
        Paid
        Organic
		
	#tag EndEnum

	#tag Enum, Name = SourceEnum_UserAccountAnalytics, Type = Integer, Flags = &h0
		
        All
        YourPins
        OtherPins
		
	#tag EndEnum

	#tag Enum, Name = Split_fieldEnum_UserAccountAnalytics, Type = Integer, Flags = &h0
		
        NoSplit
        AppType
        OwnedContent
        Source
        PinFormat
		
	#tag EndEnum

	#tag Enum, Name = From_claimed_contentEnum_UserAccountAnalyticsTopPins, Type = Integer, Flags = &h0
		
        Other
        Claimed
        Both
		
	#tag EndEnum

	#tag Enum, Name = Pin_formatEnum_UserAccountAnalyticsTopPins, Type = Integer, Flags = &h0
		
        All
        OrganicImage
        OrganicProduct
        OrganicVideo
        AdsStandard
        AdsProduct
        AdsVideo
        AdsIdea
		
	#tag EndEnum

	#tag Enum, Name = App_typesEnum_UserAccountAnalyticsTopPins, Type = Integer, Flags = &h0
		
        All
        Mobile
        Tablet
        Web
		
	#tag EndEnum

	#tag Enum, Name = Content_typeEnum_UserAccountAnalyticsTopPins, Type = Integer, Flags = &h0
		
        All
        Paid
        Organic
		
	#tag EndEnum

	#tag Enum, Name = SourceEnum_UserAccountAnalyticsTopPins, Type = Integer, Flags = &h0
		
        All
        YourPins
        OtherPins
		
	#tag EndEnum

	#tag Enum, Name = Created_in_last_n_daysEnum_UserAccountAnalyticsTopPins, Type = Integer, Flags = &h0
		
        Escaped30
		
	#tag EndEnum

	#tag Enum, Name = From_claimed_contentEnum_UserAccountAnalyticsTopVideoPins, Type = Integer, Flags = &h0
		
        Other
        Claimed
        Both
		
	#tag EndEnum

	#tag Enum, Name = Pin_formatEnum_UserAccountAnalyticsTopVideoPins, Type = Integer, Flags = &h0
		
        All
        OrganicImage
        OrganicProduct
        OrganicVideo
        AdsStandard
        AdsProduct
        AdsVideo
        AdsIdea
		
	#tag EndEnum

	#tag Enum, Name = App_typesEnum_UserAccountAnalyticsTopVideoPins, Type = Integer, Flags = &h0
		
        All
        Mobile
        Tablet
        Web
		
	#tag EndEnum

	#tag Enum, Name = Content_typeEnum_UserAccountAnalyticsTopVideoPins, Type = Integer, Flags = &h0
		
        All
        Paid
        Organic
		
	#tag EndEnum

	#tag Enum, Name = SourceEnum_UserAccountAnalyticsTopVideoPins, Type = Integer, Flags = &h0
		
        All
        YourPins
        OtherPins
		
	#tag EndEnum

	#tag Enum, Name = Created_in_last_n_daysEnum_UserAccountAnalyticsTopVideoPins, Type = Integer, Flags = &h0
		
        Escaped30
		
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
