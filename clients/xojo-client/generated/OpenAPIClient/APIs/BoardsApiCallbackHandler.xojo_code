#tag Interface
Protected Interface BoardsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub BoardSectionsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BoardSection)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardSectionsDeleteCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardSectionsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BoardSectionsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardSectionsListPinsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BoardsListPins200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardSectionsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BoardSection)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardsCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Board)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardsDeleteCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Board)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardsListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BoardsList200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardsListPinsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BoardsListPins200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BoardsUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.Board)
		  
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
