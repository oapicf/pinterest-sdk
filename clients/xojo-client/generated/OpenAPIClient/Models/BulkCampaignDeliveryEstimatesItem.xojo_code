#tag Class
Protected Class BulkCampaignDeliveryEstimatesItem

	#tag Property, Flags = &h0
		#tag Note
			Range audience sizes for each ad group, in the same order as the ad groups in the request.
		#tag EndNote
		adgroup_audience_sizes() As OpenAPIClient.Models.CampaignPlanningAdGroupAudienceSize
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
		#tag EndNote
		conversion_rate As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
		#tag EndNote
		conversion_rates() As OpenAPIClient.Models.CampaignPlanningConversionRate
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Estimated curves. Each curve will pertain to a single estimation type.
		#tag EndNote
		curves() As OpenAPIClient.Models.CampaignPlanningCurveEstimate
	#tag EndProperty


	#tag Property, Flags = &h0
		derived_metrics As OpenAPIClient.Models.CampaignDeliveryEstimatesDerivedMetrics
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Errors encountered during estimation for this campaign.
		#tag EndNote
		errors() As OpenAPIClient.Models.CampaignPlanningResponseError
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			UUID used to track delivery estimates when they are generated as part of a saved campaign.
		#tag EndNote
		estimate_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Maximum potential spend estimate.
		#tag EndNote
		max_potential_spend As Xoson.O.OptionalInteger
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
			Name="adgroup_audience_sizes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningAdGroupAudienceSize"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_rate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_rates"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningConversionRate"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="curves"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningCurveEstimate"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="derived_metrics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignDeliveryEstimatesDerivedMetrics"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="errors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningResponseError"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="estimate_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_potential_spend"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


