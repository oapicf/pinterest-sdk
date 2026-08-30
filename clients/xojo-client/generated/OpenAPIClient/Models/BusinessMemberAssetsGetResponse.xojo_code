#tag Class
Protected Class BusinessMemberAssetsGetResponse

	#tag Property, Flags = &h0
		bookmark As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		items() As OpenAPIClient.Models.AssetIdPermissions
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Total number of assets matching the query
		#tag EndNote
		total_data_count As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Breakdown of asset counts by entity status (ad accounts only)
		#tag EndNote
		total_data_count_by_status As OpenAPIClient.Models.TotalCountByEntityStatus
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
			Name="bookmark"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssetIdPermissions"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="total_data_count"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="total_data_count_by_status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TotalCountByEntityStatus"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


