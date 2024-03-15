#tag Interface
Protected Interface KeywordsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CountryKeywordsMetricsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.KeywordsMetricsArrayResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub KeywordsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.KeywordsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub KeywordsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.KeywordsGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub KeywordsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.KeywordsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub TrendingKeywordsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.TrendingKeywordsResponse)
		  
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
