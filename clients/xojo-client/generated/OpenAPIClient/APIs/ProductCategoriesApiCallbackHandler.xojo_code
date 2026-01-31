#tag Interface
Protected Interface ProductCategoriesApiCallbackHandler
	#tag Method, Flags = &h0
		Sub TrendsFeaturedTopicsListCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.FeaturedTrend)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub TrendsProductCategoriesDetailsListCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.ProductCategoryDetails)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub TrendsProductCategoriesTrendingListCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.TrendingProductCategory)
		  
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
