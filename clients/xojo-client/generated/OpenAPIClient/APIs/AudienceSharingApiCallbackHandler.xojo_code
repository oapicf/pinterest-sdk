#tag Interface
Protected Interface AudienceSharingApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AdAccountsAudiencesSharedAccountsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdAccountsAudiencesSharedAccountsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessAccountAudiencesSharedAccountsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdAccountsAudiencesSharedAccountsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SharedAudiencesForBusinessListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AudiencesList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateAdAccountToAdAccountSharedAudienceCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SharedAudienceResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateAdAccountToBusinessSharedAudienceCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BusinessSharedAudienceResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateBusinessToAdAccountSharedAudienceCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SharedAudienceResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateBusinessToBusinessSharedAudienceCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BusinessSharedAudienceResponse)
		  
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
