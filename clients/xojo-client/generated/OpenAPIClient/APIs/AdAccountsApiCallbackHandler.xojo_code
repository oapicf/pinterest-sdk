#tag Interface
Protected Interface AdAccountsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AdAccountAnalyticsCallback(status As OpenAPIClient.OpenAPIClientException, data() As AdAccountAnalyticsResponseInner)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdAccountTargetingAnalyticsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MetricsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdAccountsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdAccount)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdAccountsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdAccount)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdAccountsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdAccountsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AnalyticsCreateMmmReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateMMMReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AnalyticsCreateReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AnalyticsCreateTemplateReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdsAnalyticsCreateAsyncResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AnalyticsGetMmmReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetMMMReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AnalyticsGetReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdsAnalyticsGetAsyncResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SandboxDeleteCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub TemplatesListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.TemplatesList200Response)
		  
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
