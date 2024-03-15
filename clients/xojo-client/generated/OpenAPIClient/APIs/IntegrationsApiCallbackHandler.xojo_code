#tag Interface
Protected Interface IntegrationsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub IntegrationsCommerceDelCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub IntegrationsCommerceGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.IntegrationMetadata)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub IntegrationsCommercePatchCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.IntegrationMetadata)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub IntegrationsCommercePostCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.IntegrationMetadata)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub IntegrationsGetByIdCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.IntegrationRecord)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub IntegrationsGetListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.IntegrationsGetList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub IntegrationsLogsPostCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.IntegrationLogsSuccessResponse)
		  
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
