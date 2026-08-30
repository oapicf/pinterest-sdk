#tag Class
Protected Class CampaignDeliveryEstimatesResponse

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


