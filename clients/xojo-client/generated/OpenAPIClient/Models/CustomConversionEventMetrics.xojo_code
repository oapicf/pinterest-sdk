#tag Class
Protected Class CustomConversionEventMetrics

	#tag Property, Flags = &h0
		custom_event_metrics_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Name of the advertiser-defined custom conversion event
		#tag EndNote
		custom_event_name As String
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
			Name="custom_event_metrics_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdeColumnType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_event_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


