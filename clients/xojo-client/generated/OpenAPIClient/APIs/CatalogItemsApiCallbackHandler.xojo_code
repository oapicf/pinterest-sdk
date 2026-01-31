#tag Interface
Protected Interface CatalogItemsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub ItemsBatchGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsItemsBatch)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemsBatchPostCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsItemsBatch)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemsPostCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsItems)
		  
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
