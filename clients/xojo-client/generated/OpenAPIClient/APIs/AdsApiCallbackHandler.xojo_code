#tag Interface
Protected Interface AdsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AdPreviewsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdPreviewURLResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdTargetingAnalyticsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MetricsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdsAnalyticsCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.AdsAnalytics)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdBatchWriteResponseModel)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Ad)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdBatchWriteResponseModel)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignAdPreviewCreateCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.CampaignAdPreviewCreate200ResponseInner)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignAdPreviewDeleteCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.CampaignAdPreviewDelete200ResponseInner)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CampaignAdPreviewReadCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.CampaignAdPreview)
		  
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
