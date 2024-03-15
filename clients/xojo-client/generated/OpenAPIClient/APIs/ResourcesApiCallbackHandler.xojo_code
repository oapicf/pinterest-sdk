#tag Interface
Protected Interface ResourcesApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AdAccountCountriesGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdAccountsCountryResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeliveryMetricsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeliveryMetricsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub InterestTargetingOptionsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SingleInterestTargetingOptionResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub LeadFormQuestionsGetCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MetricsReadyStateGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BookClosedResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub TargetingOptionsGetCallback(status As OpenAPIClient.OpenAPIClientException, data() As Object)
		  
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
