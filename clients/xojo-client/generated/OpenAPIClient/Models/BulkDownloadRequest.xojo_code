#tag Class
Protected Class BulkDownloadRequest

	#tag Property, Flags = &h0
		#tag Note
			All entity types specified will be downloaded. Fewer types result in faster downloads.
		#tag EndNote
		entity_types() As BulkEntityType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
		#tag EndNote
		entity_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unix UTC timestamp to retrieve all entities that have changed since this time.
		#tag EndNote
		updated_since As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		campaign_filter As OpenAPIClient.Models.BulkDownloadRequestCampaignFilter
	#tag EndProperty


	#tag Property, Flags = &h0
		output_format As Xoson.O.OptionalString
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
			Name="entity_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BulkEntityType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="entity_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updated_since"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaign_filter"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BulkDownloadRequestCampaignFilter"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="output_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BulkOutputFormat"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


