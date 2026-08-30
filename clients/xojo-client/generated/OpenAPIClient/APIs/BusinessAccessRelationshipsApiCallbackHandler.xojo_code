#tag Interface
Protected Interface BusinessAccessRelationshipsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub BrandAccountsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BrandAccount)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BrandAccountsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BrandAccount)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteBusinessMembershipCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteBusinessMembership200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteBusinessPartnersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteBusinessPartners)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetBusinessEmployersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBusinessEmployers200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetBusinessMembersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBusinessEmployers200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetBusinessPartnersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBusinessEmployers200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SystemUserUpdateCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateBusinessMembershipsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateBusinessMembershipsResponse)
		  
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
