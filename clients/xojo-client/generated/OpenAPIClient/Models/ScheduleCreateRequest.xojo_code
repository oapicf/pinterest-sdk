#tag Class
Protected Class ScheduleCreateRequest

	#tag Property, Flags = &h0
		entity_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Entity type
		#tag EndNote
		entity_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		delta_value As OpenAPIClient.Models.ScheduleCommonDeltaValue
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Schedule end time. Unix timestamp in seconds.
		#tag EndNote
		end_timestamp As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		schedule_action As String
	#tag EndProperty


	#tag Property, Flags = &h0
		schedule_status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		schedule_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Schedule start time. Unix timestamp in seconds.
		#tag EndNote
		start_timestamp As Integer
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
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="delta_value"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScheduleCommonDeltaValue"
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
	#tag EndViewBehavior
End Class
#tag EndClass


