#tag Interface
Protected Interface LeadAdsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AdAccountsSubscriptionsDelByIdCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdAccountsSubscriptionsGetByIdCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdAccountGetSubscriptionResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdAccountsSubscriptionsGetListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdAccountsSubscriptionsGetList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdAccountsSubscriptionsPostCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdAccountCreateSubscriptionResponse)
		  
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
