#tag Class
Protected Class TrendingKeywordDemographics

	#tag Property, Flags = &h0
		age_distribution As Xoson.O.OptionalTrendingKeywordDemographicsAgeDistribution
	#tag EndProperty


	#tag Property, Flags = &h0
		gender_distribution As Xoson.O.OptionalTrendingKeywordDemographicsGenderDistribution
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
			Name="age_distribution"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TrendingKeywordDemographicsAgeDistribution"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="gender_distribution"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TrendingKeywordDemographicsGenderDistribution"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


