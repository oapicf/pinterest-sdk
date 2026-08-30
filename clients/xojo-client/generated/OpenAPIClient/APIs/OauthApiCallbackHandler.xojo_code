#tag Interface
Protected Interface OauthApiCallbackHandler
	#tag Method, Flags = &h0
		Sub OauthConversionTokenCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ConversionAccessToken)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub OauthTokenCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.OauthAccessToken)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub TokenRevokeCallback(status As OpenAPIClient.OpenAPIClientException)
		  
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
