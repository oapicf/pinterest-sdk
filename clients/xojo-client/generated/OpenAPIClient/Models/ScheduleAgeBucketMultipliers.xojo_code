#tag Class
Protected Class ScheduleAgeBucketMultipliers

	#tag Property, Flags = &h0
		AGE_BUCKET As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = AGE_BUCKETEnum, Type = Integer, Flags = &h0
        
        Escaped1824
        Escaped2534
        Escaped3544
        Escaped4549
        Escaped5054
        Escaped5564
        Escaped65Plus
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function AGE_BUCKETEnumToString(value As AGE_BUCKETEnum) As String
		  Select Case value
		    
		    Case AGE_BUCKETEnum.Escaped1824
		      Return "18-24"
		    Case AGE_BUCKETEnum.Escaped2534
		      Return "25-34"
		    Case AGE_BUCKETEnum.Escaped3544
		      Return "35-44"
		    Case AGE_BUCKETEnum.Escaped4549
		      Return "45-49"
		    Case AGE_BUCKETEnum.Escaped5054
		      Return "50-54"
		    Case AGE_BUCKETEnum.Escaped5564
		      Return "55-64"
		    Case AGE_BUCKETEnum.Escaped65Plus
		      Return "65+"
		    
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


