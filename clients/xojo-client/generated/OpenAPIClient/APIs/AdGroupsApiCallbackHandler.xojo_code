#tag Interface
Protected Interface AdGroupsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AdGroupsAnalyticsCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.AdGroupsAnalyticsMetrics)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsAudienceSizingCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroupAudienceSizing)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsBidFloorGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BidFloor)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroupsCreate200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsDynamicTitlesDownloadCsvCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DynamicTitlesDownloadCSV)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsDynamicTitlesGetStatusCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DynamicTitlesGetStatus)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsDynamicTitlesGetUploadUrlCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DynamicTitlesUploadURL)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsDynamicTitlesProcessCsvCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DynamicTitlesProcessCSV)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroup)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroupsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsTargetingAnalyticsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MetricsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroupsCreate200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetAdGroupsByPromotionIdsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroupsList200Response)
		  
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
