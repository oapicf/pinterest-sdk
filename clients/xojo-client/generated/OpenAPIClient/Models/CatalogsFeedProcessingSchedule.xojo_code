#tag Class
Protected Class CatalogsFeedProcessingSchedule

	#tag Property, Flags = &h0
		#tag Note
			A time in format HH:MM with leading 0 (zero)
		#tag EndNote
		time As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The timezone considered for the processing schedule time.
		#tag EndNote
		timezone As String
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
			Name="time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="timezone"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedProcessingScheduleTimezone"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


