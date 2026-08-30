#tag Class
Protected Class CampaignAdPreview

	#tag Property, Flags = &h0
		#tag Note
			Advertiser ID for this preview.
		#tag EndNote
		ad_account_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group ID to create a preview record for.
		#tag EndNote
		ad_group_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Client ID that created preview.
		#tag EndNote
		client_id As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unix timestamp in milliseconds for preview expiration.
		#tag EndNote
		expires_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether preview link is active.
		#tag EndNote
		is_active As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin ID for pin promotion preview.
		#tag EndNote
		pin_id As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin promotion ID for this preview.
		#tag EndNote
		pin_promotion_id As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Promoted product group ID for catalog previews.
		#tag EndNote
		promoted_product_group_id As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Campaign ad preview URL.
		#tag EndNote
		url As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			User ID that created preview.
		#tag EndNote
		user_id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin promotion preview key.
		#tag EndNote
		uuid As String
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
			Name="ad_account_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="client_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="expires_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_active"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pin_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pin_promotion_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promoted_product_group_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="uuid"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


