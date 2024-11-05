#tag Interface
Protected Interface LeadFormsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub LeadFormGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.LeadFormResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub LeadFormTestCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.LeadFormTestResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub LeadFormsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.LeadFormArrayResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub LeadFormsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.LeadFormsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub LeadFormsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.LeadFormArrayResponse)
		  
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
