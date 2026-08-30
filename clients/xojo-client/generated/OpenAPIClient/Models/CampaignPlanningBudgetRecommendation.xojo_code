#tag Class
Protected Class CampaignPlanningBudgetRecommendation

	#tag Property, Flags = &h0
		#tag Note
			The recommended budget amount.
		#tag EndNote
		budget_recommendation As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of experimental budget recommendations.
		#tag EndNote
		experiment_campaign_budget_recommendation() As OpenAPIClient.Models.CampaignPlanningExperimentBudgetRecommendation
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Recommended number of days for the campaign lifetime.
		#tag EndNote
		lifetime_days_recommendation As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of point estimations for different budget scenarios.
		#tag EndNote
		point_estimations() As OpenAPIClient.Models.CampaignPlanningBudgetRecommendationPoint
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
			Name="experiment_campaign_budget_recommendation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningExperimentBudgetRecommendation"
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
	#tag EndViewBehavior
End Class
#tag EndClass


