#tag Class
Protected Class ScheduleBidMultipliers

	#tag Property, Flags = &h0
		age_bucket_multipliers As OpenAPIClient.Models.BidOptionsAgeBucketMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		app_type_multipliers As OpenAPIClient.Models.BidOptionsAppTypeMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		audience_multipliers() As OpenAPIClient.Models.BidOptionsAudienceMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		gender_multipliers As OpenAPIClient.Models.BidOptionsGenderMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		placement_multipliers As OpenAPIClient.Models.BidOptionsPlacementMultipliers
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
			Type="BidOptionsAgeBucketMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="app_type_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BidOptionsAppTypeMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="audience_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BidOptionsAudienceMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="gender_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BidOptionsGenderMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BidOptionsPlacementMultipliers"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


