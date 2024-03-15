#tag Interface
Protected Interface AudiencesApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AudiencesCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Audience)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AudiencesCreateCustomCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Audience)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AudiencesGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Audience)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AudiencesListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AudiencesList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AudiencesUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Audience)
		  
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
