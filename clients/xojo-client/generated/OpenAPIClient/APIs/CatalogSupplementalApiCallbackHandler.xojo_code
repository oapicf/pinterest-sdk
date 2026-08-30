#tag Interface
Protected Interface CatalogSupplementalApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CatalogsLocalInventoryItemsBatchOperateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SupplementalItemsBatchResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsLocalInventoryItemsPostCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.LocalInventoryItemsGet)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsLocalStoresCreateCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.CatalogsLocalStoresCreate200ResponseInner)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsLocalStoresDeleteCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.CatalogsLocalStoresDelete200ResponseInner)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsLocalStoresListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsLocalStoresList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsLocalStoresUpdateCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.CatalogsLocalStoresCreate200ResponseInner)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsSupplementalItemsBatchGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SupplementalItemsBatchResponse)
		  
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
