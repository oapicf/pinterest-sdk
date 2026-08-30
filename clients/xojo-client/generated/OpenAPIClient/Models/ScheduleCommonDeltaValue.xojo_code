#tag Class
Protected Class ScheduleCommonDeltaValue

	#tag Property, Flags = &h0
		age_bucket_multipliers As Xoson.O.OptionalScheduleAgeBucketMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		app_type_multipliers As Xoson.O.OptionalScheduleAppTypeMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		audience_multipliers As Xoson.O.OptionalScheduleAudienceMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		gender_multipliers As Xoson.O.OptionalScheduleBidOptionsGenderMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		placement_multipliers As OpenAPIClient.Models.ScheduleBidOptionsPlacementMultipliers
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
			Type="ScheduleAgeBucketMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="app_type_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScheduleAppTypeMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="audience_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScheduleAudienceMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="gender_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScheduleBidOptionsGenderMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScheduleBidOptionsPlacementMultipliers"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


