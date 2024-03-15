#tag Class
Protected Class OptimizationGoalMetadataFrequencyGoalMetadata

	#tag Property, Flags = &h0
		frequency As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			User entity counts time range
		#tag EndNote
		timerange As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = TimerangeEnum, Type = Integer, Flags = &h0
        
        ThirtyDay
        Day
        SevenDay
        TwentyMinute
        TenMinute
        TwentyFourHour
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TimerangeEnumToString(value As TimerangeEnum) As String
		  Select Case value
		    
		    Case TimerangeEnum.ThirtyDay
		      Return "THIRTY_DAY"
		    Case TimerangeEnum.Day
		      Return "DAY"
		    Case TimerangeEnum.SevenDay
		      Return "SEVEN_DAY"
		    Case TimerangeEnum.TwentyMinute
		      Return "TWENTY_MINUTE"
		    Case TimerangeEnum.TenMinute
		      Return "TEN_MINUTE"
		    Case TimerangeEnum.TwentyFourHour
		      Return "TWENTY_FOUR_HOUR"
		    
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
		#tag ViewProperty
			Name="frequency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


