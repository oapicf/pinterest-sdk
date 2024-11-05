#tag Class
Protected Class UpdateAssetGroupBodyAssetGroupsToUpdateInner

	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the asset group to update.
		#tag EndNote
		asset_group_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Asset Group name
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Asset group description
		#tag EndNote
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
		#tag EndNote
		asset_group_types() As AssetGroupType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of asset ids to add to the asset group.
		#tag EndNote
		assets_to_add() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of asset ids to remove from the asset group.
		#tag EndNote
		assets_to_remove() As String
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
			Name="asset_group_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="description"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="asset_group_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssetGroupType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="assets_to_add"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="assets_to_remove"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


