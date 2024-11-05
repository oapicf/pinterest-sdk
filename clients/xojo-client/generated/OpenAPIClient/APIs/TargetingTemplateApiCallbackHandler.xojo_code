#tag Interface
Protected Interface TargetingTemplateApiCallbackHandler
	#tag Method, Flags = &h0
		Sub TargetingTemplateCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.TargetingTemplateGetResponseData)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub TargetingTemplateListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.TargetingTemplateList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub TargetingTemplateUpdateCallback(status As OpenAPIClient.OpenAPIClientException)
		  
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
