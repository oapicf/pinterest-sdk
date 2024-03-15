#tag Class
Protected Class BulkUpsertRequestUpdate

	#tag Property, Flags = &h0
		campaigns() As OpenAPIClient.Models.CampaignUpdateRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		ad_groups() As OpenAPIClient.Models.AdGroupUpdateRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		ads() As OpenAPIClient.Models.AdUpdateRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		product_groups() As OpenAPIClient.Models.ProductGroupPromotionUpdateRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		keywords() As OpenAPIClient.Models.KeywordUpdate
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaigns"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignUpdateRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupUpdateRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ads"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdUpdateRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductGroupPromotionUpdateRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="keywords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="KeywordUpdate"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


