#tag Class
Protected Class CampaignPlanningExperimentBudgetRecommendation

	#tag Property, Flags = &h0
		#tag Note
			Recommended budget for this experiment version.
		#tag EndNote
		budget_recommendation As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Recommended lifetime days for this experiment.
		#tag EndNote
		lifetime_days_recommendation As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Point estimations for this experiment version.
		#tag EndNote
		point_estimations() As OpenAPIClient.Models.CampaignPlanningBudgetRecommendationPoint
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Version identifier for the experiment.
		#tag EndNote
		version_id As Xoson.O.OptionalString
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
			Name="budget_recommendation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_days_recommendation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="point_estimations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningBudgetRecommendationPoint"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


