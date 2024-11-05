#tag Class
Protected Class AssetGroupBinding

	#tag Property, Flags = &h0
		#tag Note
			Asset Group ID.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Asset Group name
		#tag EndNote
		asset_group_name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Asset group description
		#tag EndNote
		asset_group_description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Asset group types
		#tag EndNote
		asset_group_types() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of ad account IDs under the asset group
		#tag EndNote
		ad_accounts_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of profile IDs under asset group
		#tag EndNote
		profiles_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The creation time of the asset group
		#tag EndNote
		created_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The last update time of the asset group
		#tag EndNote
		updated_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The data of the business that owns the asset group.
		#tag EndNote
		owner As OpenAPIClient.Models.BusinessAccessUserSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The data of the user that created the asset group.
		#tag EndNote
		created_by As OpenAPIClient.Models.BusinessAccessUserSummary
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="asset_group_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="asset_group_description"
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
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_accounts_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="profiles_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updated_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="owner"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessAccessUserSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_by"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessAccessUserSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


