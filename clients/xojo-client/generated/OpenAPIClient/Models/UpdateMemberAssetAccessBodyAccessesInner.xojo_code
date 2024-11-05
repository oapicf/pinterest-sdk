#tag Class
Protected Class UpdateMemberAssetAccessBodyAccessesInner

	#tag Property, Flags = &h0
		#tag Note
			Id of the asset to update.
		#tag EndNote
		asset_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the member on which to perform the update
		#tag EndNote
		member_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A non-empty array of permissions to assign to the member.
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
			Name="asset_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="member_id"
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


