#tag Interface
Protected Interface CatalogFeedsApiCallbackHandler
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
		Sub ItemsIssuesListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ItemsIssuesList200Response)
		  
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
