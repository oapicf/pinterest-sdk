#tag Class
Protected Class SchedulesCreate200ResponseInnerData

	#tag Property, Flags = &h0
		delta_value As OpenAPIClient.Models.ScheduleDeltaValue
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Schedule end time. Unix timestamp in seconds.
		#tag EndNote
		end_timestamp As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			entity ID.
		#tag EndNote
		entity_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Specify the entity_type to get summary information
		#tag EndNote
		entity_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Schedule name.
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The schedule action.
		#tag EndNote
		schedule_action As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Schedule ID.
		#tag EndNote
		schedule_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Schedule status.
		#tag EndNote
		schedule_status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The schedule type.
		#tag EndNote
		schedule_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Schedule start time. Unix timestamp in seconds.
		#tag EndNote
		start_timestamp As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		exceptions As OpenAPIClient.Models.PinterestLibError
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
			Name="delta_value"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScheduleDeltaValue"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="end_timestamp"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Name="entity_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdAccountEntityType"
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
			Name="schedule_action"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScheduleAction"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="schedule_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="schedule_status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScheduleStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="schedule_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScheduleType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="start_timestamp"
			Visible=false
			Group="Behavior"
			InitialValue=""
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
			Name="exceptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PinterestLibError"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


