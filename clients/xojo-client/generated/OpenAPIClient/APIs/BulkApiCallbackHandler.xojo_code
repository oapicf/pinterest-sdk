#tag Interface
Protected Interface BulkApiCallbackHandler
	#tag Method, Flags = &h0
		Sub BulkDownloadCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BulkDownloadResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BulkRequestGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BulkUpsertStatusResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BulkUpsertCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BulkUpsertResponse)
		  
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
