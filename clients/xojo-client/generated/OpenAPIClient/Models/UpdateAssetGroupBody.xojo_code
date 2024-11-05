#tag Class
Protected Class UpdateAssetGroupBody

	#tag Property, Flags = &h0
		#tag Note
			A list of asset groups and the data that will be used to update them.
		#tag EndNote
		asset_groups_to_update() As OpenAPIClient.Models.UpdateAssetGroupBodyAssetGroupsToUpdateInner
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
			Name="asset_groups_to_update"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdateAssetGroupBodyAssetGroupsToUpdateInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


