#tag Class
Protected Class ConversionApiResponse

	#tag Property, Flags = &h0
		#tag Note
			Total number of events received in the request.
		#tag EndNote
		num_events_received As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of events that were successfully processed from the events.
		#tag EndNote
		num_events_processed As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Specific messages for each event received. The order will match the order in which the events were received in the request.
		#tag EndNote
		events() As OpenAPIClient.Models.ConversionApiResponseEventsInner
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
			Name="num_events_received"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="num_events_processed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="events"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionApiResponseEventsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


