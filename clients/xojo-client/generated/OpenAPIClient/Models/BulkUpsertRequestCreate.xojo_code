#tag Class
Protected Class BulkUpsertRequestCreate

	#tag Property, Flags = &h0
		campaigns() As OpenAPIClient.Models.CampaignCreateRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		ad_groups() As OpenAPIClient.Models.AdGroupCreateRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		ads() As OpenAPIClient.Models.AdCreateRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		product_groups() As OpenAPIClient.Models.ProductGroupPromotionCreateRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		keywords() As OpenAPIClient.Models.KeywordsRequest
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
			Type="CampaignCreateRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupCreateRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ads"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdCreateRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductGroupPromotionCreateRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="keywords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="KeywordsRequest"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


