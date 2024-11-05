#tag Interface
Protected Interface CatalogsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CatalogsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Catalog)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CatalogsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsList200Response)
		  
		End Sub
	#tag EndMethod

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
		Sub CatalogsProductGroupsDeleteCallback(status As OpenAPIClient.OpenAPIClientException)
		  
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
		Sub FeedProcessingResultsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.FeedProcessingResultsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub FeedsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsFeed)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub FeedsDeleteCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub FeedsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsFeed)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub FeedsIngestCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsFeedIngestion)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub FeedsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.FeedsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub FeedsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsFeed)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemsBatchGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsItemsBatch)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemsBatchPostCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsItemsBatch)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsItems)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemsIssuesListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ItemsIssuesList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ItemsPostCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsItems)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProductsByProductGroupFilterListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsProductGroupPinsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ReportsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsCreateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ReportsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CatalogsReport)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ReportsStatsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ReportsStats200Response)
		  
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
