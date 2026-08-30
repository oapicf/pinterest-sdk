#tag Class
Protected Class CampaignBidOptionsUpdate

	#tag Property, Flags = &h0
		#tag Note
			Age bucket multipliers for bid adjustments.
		#tag EndNote
		age_bucket_multipliers As Xoson.O.OptionalAgeBucketMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			App type multipliers for bid adjustments.
		#tag EndNote
		app_type_multipliers As Xoson.O.OptionalAppTypeMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Audience multipliers for bid adjustments.
		#tag EndNote
		audience_multipliers As Xoson.O.OptionalCampaignAudienceMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The time window for frequency bid multipliers.
		#tag EndNote
		freq_bid_multiplier_time_window As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Frequency multipliers for bid adjustments.
		#tag EndNote
		frequency_multipliers As Xoson.O.OptionalFrequencyMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Gender multipliers for bid adjustments.
		#tag EndNote
		gender_multipliers As Xoson.O.OptionalGenderMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Placement multipliers for bid adjustments.
		#tag EndNote
		placement_multipliers As Xoson.O.OptionalPlacementMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of fields to update. Only the fields in the list will be updated.
		#tag EndNote
		update_mask() As CampaignBidOptionsUpdateMaskItems
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
			Name="age_bucket_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AgeBucketMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="app_type_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AppTypeMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="audience_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignAudienceMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="freq_bid_multiplier_time_window"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FreqBidMultiplierTimeWindow"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="frequency_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FrequencyMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="gender_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GenderMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="update_mask"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignBidOptionsUpdateMaskItems"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


