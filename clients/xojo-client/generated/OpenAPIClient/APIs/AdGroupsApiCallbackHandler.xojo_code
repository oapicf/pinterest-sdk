#tag Interface
Protected Interface AdGroupsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AdGroupsAnalyticsCallback(status As OpenAPIClient.OpenAPIClientException, data() As AdGroupsAnalyticsResponseInner)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsAudienceSizingCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroupAudienceSizingResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsBidFloorGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BidFloor)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroupArrayResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdGroupsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroupResponse)
		  
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
		Sub AdGroupsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdGroupArrayResponse)
		  
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
