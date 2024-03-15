#tag Class
Protected Class TemplateResponseDateRangeDynamicDateRange

	#tag Property, Flags = &h0
		#tag Note
			The date range type
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The dynamic range type
		#tag EndNote
		range As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = RangeEnum, Type = Integer, Flags = &h0
        
        YearToDate
        QuarterToDate
        MonthToDate
        LastMonth
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function RangeEnumToString(value As RangeEnum) As String
		  Select Case value
		    
		    Case RangeEnum.YearToDate
		      Return "YEAR_TO_DATE"
		    Case RangeEnum.QuarterToDate
		      Return "QUARTER_TO_DATE"
		    Case RangeEnum.MonthToDate
		      Return "MONTH_TO_DATE"
		    Case RangeEnum.LastMonth
		      Return "LAST_MONTH"
		    
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
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


