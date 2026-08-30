#tag Class
Protected Class CampaignDeliveryEstimatesDerivedMetrics

	#tag Property, Flags = &h0
		#tag Note
			Estimated cost per click.
		#tag EndNote
		cpc As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lower estimate of the cost per click.
		#tag EndNote
		cpc_lower As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Upper estimate of the cost per click.
		#tag EndNote
		cpc_upper As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Estimated cost per thousand impressions.
		#tag EndNote
		cpm As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lower estimate of cost per thousand impressions.
		#tag EndNote
		cpm_lower As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Upper estimate of cost per thousand impressions.
		#tag EndNote
		cpm_upper As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Estimated lifetime frequency.
		#tag EndNote
		lifetime_frequency As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lower estimate of lifetime frequency.
		#tag EndNote
		lifetime_frequency_lower As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Upper estimate of lifetime frequency.
		#tag EndNote
		lifetime_frequency_upper As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Estimated lifetime impressions.
		#tag EndNote
		lifetime_impression As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lower estimate of lifetime impressions.
		#tag EndNote
		lifetime_impression_lower As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Upper estimate of lifetime impressions.
		#tag EndNote
		lifetime_impression_upper As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Estimated lifetime reach.
		#tag EndNote
		lifetime_reach As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lower estimate of lifetime reach.
		#tag EndNote
		lifetime_reach_lower As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Upper estimate of lifetime reach.
		#tag EndNote
		lifetime_reach_upper As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Estimated weekly clicks.
		#tag EndNote
		weekly_click As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lower estimate of weekly clicks.
		#tag EndNote
		weekly_click_lower As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Upper estimate of weekly clicks.
		#tag EndNote
		weekly_click_upper As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Estimated weekly frequency.
		#tag EndNote
		weekly_frequency As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lower estimate of weekly frequency.
		#tag EndNote
		weekly_frequency_lower As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Upper estimate of weekly frequency.
		#tag EndNote
		weekly_frequency_upper As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Estimated weekly impressions.
		#tag EndNote
		weekly_impression As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lower estimate of weekly impressions.
		#tag EndNote
		weekly_impression_lower As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Upper estimate of weekly impressions.
		#tag EndNote
		weekly_impression_upper As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Estimated weekly reach.
		#tag EndNote
		weekly_reach As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lower estimate of weekly reach.
		#tag EndNote
		weekly_reach_lower As Xoson.O.OptionalSingle
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Upper estimate of weekly reach.
		#tag EndNote
		weekly_reach_upper As Xoson.O.OptionalSingle
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
			Name="cpc"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cpc_lower"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cpc_upper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cpm"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cpm_lower"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cpm_upper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_frequency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_frequency_lower"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_frequency_upper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_impression"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_impression_lower"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_impression_upper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_reach"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_reach_lower"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_reach_upper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_click"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_click_lower"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_click_upper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_frequency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_frequency_lower"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_frequency_upper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_impression"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_impression_lower"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_impression_upper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_reach"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_reach_lower"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weekly_reach_upper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


