#tag Class
Protected Class DeleteAssetGroupResponse

	#tag Property, Flags = &h0
		#tag Note
			A list of ids of successfully deleted asset groups.
		#tag EndNote
		deleted_asset_groups() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of errors associated with the asset groups. Will be returned if there is an error.
		#tag EndNote
		exceptions() As OpenAPIClient.Models.DeleteAssetGroupResponseExceptionsInner
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
			Name="deleted_asset_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="exceptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DeleteAssetGroupResponseExceptionsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


