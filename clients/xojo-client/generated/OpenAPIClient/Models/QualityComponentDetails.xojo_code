#tag Class
Protected Class QualityComponentDetails

	#tag Property, Flags = &h0
		#tag Note
			Coverage percentage for this event type.
		#tag EndNote
		coverage As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of issues detected for this event type, if any.
		#tag EndNote
		issues() As OpenAPIClient.Models.QualityComponentIssue
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Overlap percentage for this event type. Only populated for external_event_id
		#tag EndNote
		overlap As Xoson.O.OptionalDouble
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
			Name="coverage"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="issues"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QualityComponentIssue"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="overlap"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


