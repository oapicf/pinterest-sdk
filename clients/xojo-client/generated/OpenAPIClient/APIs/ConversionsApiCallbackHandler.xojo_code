#tag Interface
Protected Interface ConversionsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AdvertiserDefinedEventsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdvertiserDefinedEventsCreate200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdvertiserDefinedEventsDeleteCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdvertiserDefinedEventsCreate200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdvertiserDefinedEventsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdvertiserDefinedEventsGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdvertiserDefinedEventsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdvertiserDefinedEventsCreate200Response)
		  
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
