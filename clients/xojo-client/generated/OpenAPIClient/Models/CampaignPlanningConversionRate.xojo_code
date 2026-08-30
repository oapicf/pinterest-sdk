#tag Class
Protected Class CampaignPlanningConversionRate

	#tag Property, Flags = &h0
		attribution_windows As OpenAPIClient.Models.CampaignPlanningConversionAttribution
	#tag EndProperty


	#tag Property, Flags = &h0
		conversion_event As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
		#tag EndNote
		conversion_rate As Single
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
			Name="attribution_windows"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningConversionAttribution"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_event"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningConversionEvent"
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
	#tag EndViewBehavior
End Class
#tag EndClass


