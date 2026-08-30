#tag Class
Protected Class CampaignDeliveryEstimatesCampaign

	#tag Property, Flags = &h0
		ad_groups() As OpenAPIClient.Models.AdGroupDeliveryEstimates
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Duration type of the budget
		#tag EndNote
		budget_duration_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
		#tag EndNote
		daily_spend_cap As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
		#tag EndNote
		end_date As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
		#tag EndNote
		lifetime_spend_cap As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		objective_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
		#tag EndNote
		start_date As String
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
			Name="ad_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupDeliveryEstimates"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="budget_duration_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BudgetDurationType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="daily_spend_cap"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="end_date"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_spend_cap"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="objective_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DeliveryEstimateObjectiveType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="start_date"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


