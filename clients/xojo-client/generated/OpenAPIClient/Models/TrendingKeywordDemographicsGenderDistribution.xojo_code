#tag Class
Protected Class TrendingKeywordDemographicsGenderDistribution

	#tag Property, Flags = &h0
		gender_distribution As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Gender_distributionEnum, Type = Integer, Flags = &h0
        
        Male
        Female
        Unspecified
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Gender_distributionEnumToString(value As Gender_distributionEnum) As String
		  Select Case value
		    
		    Case Gender_distributionEnum.Male
		      Return "male"
		    Case Gender_distributionEnum.Female
		      Return "female"
		    Case Gender_distributionEnum.Unspecified
		      Return "unspecified"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


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
	#tag EndViewBehavior
End Class
#tag EndClass


