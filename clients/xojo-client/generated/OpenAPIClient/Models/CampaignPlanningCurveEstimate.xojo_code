#tag Class
Protected Class CampaignPlanningCurveEstimate

	#tag Property, Flags = &h0
		#tag Note
			Estimation type for campaign planning estimated curve
		#tag EndNote
		estimation_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The estimation points that make up the estimated curve.
		#tag EndNote
		points() As OpenAPIClient.Models.CampaignPlanningPointEstimate
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
			Name="estimation_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningEstimationType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="points"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningPointEstimate"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


