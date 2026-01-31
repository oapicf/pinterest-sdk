#tag Class
Protected Class CampaignBidOptionsCreate

	#tag Property, Flags = &h0
		app_type_multipliers As Xoson.O.OptionalAppTypeMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		audience_multipliers As Xoson.O.OptionalCampaignAudienceMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		placement_multipliers As Xoson.O.OptionalPlacementMultipliers
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
			Name="placement_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementMultipliers"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


