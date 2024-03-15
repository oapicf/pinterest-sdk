#tag Interface
Protected Interface BillingApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AdsCreditRedeemCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdsCreditRedeemResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AdsCreditsDiscountsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AdsCreditsDiscountsGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BillingProfilesGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BillingProfilesGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SsioAccountsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SSIOAccountResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SsioInsertionOrderCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SSIOCreateInsertionOrderResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SsioInsertionOrderEditCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SSIOEditInsertionOrderResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SsioInsertionOrdersStatusGetByAdAccountCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SsioInsertionOrdersStatusGetByAdAccount200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SsioInsertionOrdersStatusGetByPinOrderIdCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SSIOInsertionOrderStatusResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SsioOrderLinesGetByAdAccountCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SsioOrderLinesGetByAdAccount200Response)
		  
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
