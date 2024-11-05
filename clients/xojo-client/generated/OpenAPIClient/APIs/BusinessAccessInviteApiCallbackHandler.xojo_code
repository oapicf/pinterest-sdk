#tag Interface
Protected Interface BusinessAccessInviteApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AssetAccessRequestsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateAssetAccessRequestResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CancelInvitesOrRequestsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteInvitesResultsResponseArray)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateAssetInvitesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateInvitesResultsResponseArray)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateMembershipOrPartnershipInvitesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateInvitesResultsResponseArray)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetInvitesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetInvites200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RespondBusinessAccessInvitesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.RespondToInvitesResponseArray)
		  
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
