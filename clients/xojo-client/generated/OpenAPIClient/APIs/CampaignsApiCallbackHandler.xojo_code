#tag Interface
Protected Interface CampaignsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CampaignTargetingAnalyticsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MetricsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignsAnalyticsCallback(status As OpenAPIClient.OpenAPIClientException, data() As CampaignsAnalyticsResponseInner)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CampaignCreateResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CampaignResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CampaignsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CampaignUpdateResponse)
		  
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
