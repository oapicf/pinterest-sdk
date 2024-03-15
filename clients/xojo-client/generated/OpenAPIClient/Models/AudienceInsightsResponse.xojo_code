#tag Class
Protected Class AudienceInsightsResponse

	#tag Property, Flags = &h0
		#tag Note
			Category interest distribution
		#tag EndNote
		categories() As OpenAPIClient.Models.AudienceCategory
	#tag EndProperty


	#tag Property, Flags = &h0
		demographics As OpenAPIClient.Models.AudienceDemographics
	#tag EndProperty


	#tag Property, Flags = &h0
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Generation date
		#tag EndNote
		date As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Population count.
		#tag EndNote
		size As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Indicates whether the audience size has been rounded up to the next highest upper boundary.
		#tag EndNote
		size_is_upper_bound As Xoson.O.OptionalBoolean
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
			Name="categories"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceCategory"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="demographics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceDemographics"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceInsightType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="date"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="size"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="size_is_upper_bound"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


