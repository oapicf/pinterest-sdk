#tag Interface
Protected Interface ProductGroupPromotionsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub ProductGroupPromotionsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProductGroupPromotionResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProductGroupPromotionsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProductGroupPromotionResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProductGroupPromotionsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProductGroupPromotionsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProductGroupPromotionsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProductGroupPromotionResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProductGroupsAnalyticsCallback(status As OpenAPIClient.OpenAPIClientException, data() As ProductGroupAnalyticsResponseInner)
		  
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
