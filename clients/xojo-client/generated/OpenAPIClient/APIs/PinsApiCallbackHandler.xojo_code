#tag Interface
Protected Interface PinsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub MultiPinsAnalyticsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As Dictionary)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PinsAnalyticsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As Dictionary)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PinsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Pin)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PinsDeleteCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PinsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Pin)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PinsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PinsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PinsSaveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Pin)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PinsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Pin)
		  
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
