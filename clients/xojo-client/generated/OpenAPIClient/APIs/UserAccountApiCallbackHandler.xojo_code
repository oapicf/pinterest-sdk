#tag Interface
Protected Interface UserAccountApiCallbackHandler
	#tag Method, Flags = &h0
		Sub BoardsUserFollowsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BoardsUserFollowsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub FollowUserUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UserSummary)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub FollowersListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.FollowersList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub LinkedBusinessAccountsGetCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.LinkedBusiness)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UnverifyWebsiteDeleteCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserAccountAnalyticsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As Dictionary)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserAccountAnalyticsTopPinsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.TopPinsAnalyticsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserAccountAnalyticsTopVideoPinsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.TopVideoPinsAnalyticsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserAccountFollowedInterestsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UserAccountFollowedInterests200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserAccountGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Account)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserFollowingGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UserFollowingGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UserWebsitesGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UserWebsitesGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub VerifyWebsiteUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UserWebsiteSummary)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub WebsiteVerificationGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UserWebsiteVerificationCode)
		  
		End Sub
	#tag EndMethod




	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
	#tag EndViewBehavior
End Interface
#tag EndInterface
