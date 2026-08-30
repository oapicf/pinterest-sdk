#tag Class
Protected Class CampaignPlanningConfidenceLevelAlert

	#tag Property, Flags = &h0
		#tag Note
			Human-readable context for debugging. Not intended for display to end users.
		#tag EndNote
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Reason for the confidence level alert.
		#tag EndNote
		reason As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Severity of the confidence level alert.
		#tag EndNote
		severity As Xoson.O.OptionalString
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
			Name="description"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="reason"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningConfidenceLevelAlertReason"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="severity"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningConfidenceLevelAlertSeverity"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


