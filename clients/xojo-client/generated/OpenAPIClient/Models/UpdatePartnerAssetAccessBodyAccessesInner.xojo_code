#tag Class
Protected Class UpdatePartnerAssetAccessBodyAccessesInner

	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of a business partner to update asset access to.
		#tag EndNote
		partner_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the business asset.
		#tag EndNote
		asset_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A non-empty array of permissions to assign to the partner.
		#tag EndNote
		permissions() As Permissions
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
			Name="partner_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="asset_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="permissions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Permissions"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


