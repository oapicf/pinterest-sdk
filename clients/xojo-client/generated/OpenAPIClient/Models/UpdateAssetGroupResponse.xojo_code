#tag Class
Protected Class UpdateAssetGroupResponse

	#tag Property, Flags = &h0
		#tag Note
			A list of successfully edited asset groups.
		#tag EndNote
		updated_asset_groups() As OpenAPIClient.Models.AssetGroupBinding
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of errors associated with the asset groups. Will be returned if there is an error.
		#tag EndNote
		exceptions() As OpenAPIClient.Models.UpdateAssetGroupResponseExceptionsInner
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
			Name="updated_asset_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssetGroupBinding"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="exceptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdateAssetGroupResponseExceptionsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


