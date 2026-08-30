#tag Class
Protected Class CampaignPlanningConversionAttribution

	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for a pin click action.
		#tag EndNote
		click_window_days As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
		#tag EndNote
		engagement_window_days As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for a view action.
		#tag EndNote
		view_window_days As Xoson.O.OptionalString
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
			Name="click_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningConversionAttributionWindowDays"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="engagement_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningConversionAttributionWindowDays"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="view_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignPlanningConversionAttributionWindowDays"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


