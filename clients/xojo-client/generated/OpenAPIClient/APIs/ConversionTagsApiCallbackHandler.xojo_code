#tag Interface
Protected Interface ConversionTagsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub ConversionTagsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ConversionTagResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ConversionTagsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ConversionTagResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ConversionTagsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ConversionTagListResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub OcpmEligibleConversionTagsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As Dictionary)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PageVisitConversionTagsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PageVisitConversionTagsGet200Response)
		  
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
