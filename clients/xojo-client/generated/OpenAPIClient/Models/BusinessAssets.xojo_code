#tag Class
Protected Class BusinessAssets

	#tag Property, Flags = &h0
		#tag Note
			An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
		#tag EndNote
		asset_group_info As OpenAPIClient.Models.AssetGroupBinding
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of a business asset.
		#tag EndNote
		asset_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		asset_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Permission levels the requesting business has on an asset.
		#tag EndNote
		permissions() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
		#tag EndNote
		catalog_info As OpenAPIClient.Models.CatalogBinding
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
			Name="asset_group_info"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssetGroupBinding"
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
			Name="asset_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssetTypeResponse"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="permissions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="catalog_info"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogBinding"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


