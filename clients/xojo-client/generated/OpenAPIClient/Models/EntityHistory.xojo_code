#tag Class
Protected Class EntityHistory

	#tag Property, Flags = &h0
		#tag Note
			A Unix timestamp representing the time of the change in seconds
		#tag EndNote
		change_timestamp As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Properties associated with a particular change to an entity's data
		#tag EndNote
		data_changes() As OpenAPIClient.Models.EntityDataChangeHistory
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The id of the entity that was changed
		#tag EndNote
		entity_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the entity that was changed
		#tag EndNote
		entity_name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
		#tag EndNote
		ldap As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of operation that caused the change
		#tag EndNote
		operation As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The id of the user who initiated the change
		#tag EndNote
		user_id As Xoson.O.OptionalString
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
			Name="change_timestamp"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="data_changes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EntityDataChangeHistory"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="entity_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="entity_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ldap"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="operation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChangeHistoryOperationType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


