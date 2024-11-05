#tag Interface
Protected Interface BusinessAccessAssetsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AssetGroupCreateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateAssetGroupResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AssetGroupDeleteCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteAssetGroupResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AssetGroupUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateAssetGroupResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessAssetMembersGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BusinessAssetMembersGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessAssetPartnersGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BusinessAssetPartnersGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessAssetsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BusinessAssetsGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessMemberAssetsGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BusinessMemberAssetsGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessMembersAssetAccessDeleteCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteMemberAccessResultsResponseArray)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessMembersAssetAccessUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateMemberAssetsResultsResponseArray)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BusinessPartnerAssetAccessGetCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BusinessPartnerAssetAccessGet200Response)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeletePartnerAssetAccessHandlerImplCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeletePartnerAssetsResultsResponseArray)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdatePartnerAssetAccessHandlerImplCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdatePartnerAssetsResultsResponseArray)
		  
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
