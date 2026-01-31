#tag Class
Protected Class ProductGroupPromotionCreateRequest

	#tag Property, Flags = &h0
		#tag Note
			ID of the Ad Group the Product Group Promotion belongs to.
		#tag EndNote
		ad_group_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		product_group_promotion() As OpenAPIClient.Models.ProductGroupPromotion
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
			Name="ad_group_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_group_promotion"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductGroupPromotion"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


