#tag Interface
Protected Interface CustomerListUploadsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub CustomerListUploadsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CustomerListUploadCreateResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CustomerListUploadsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CustomerListUpload)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CustomerListUploadsRunCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CustomerListUpload)
		  
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
