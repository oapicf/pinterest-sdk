#tag Interface
Protected Interface CatalogProductGroupsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CatalogsProductGroupPinsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsProductGroupPinsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsProductGroupsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsVerticalProductGroup)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsProductGroupsCreateManyCallback(status As OpenAPIClient.OpenAPIClientException, data() As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsProductGroupsDeleteCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsVerticalProductGroup)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsProductGroupsDeleteManyCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsProductGroupsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsVerticalProductGroup)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsProductGroupsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsProductGroupsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsProductGroupsProductCountsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsProductGroupProductCountsVertical)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsProductGroupsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsVerticalProductGroup)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProductsByProductGroupFilterListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsProductGroupPinsList200Response)
		  
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
