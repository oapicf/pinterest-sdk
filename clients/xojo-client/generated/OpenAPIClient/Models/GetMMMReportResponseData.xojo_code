#tag Class
Protected Class GetMMMReportResponseData

	#tag Property, Flags = &h0
		report_status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		size As Xoson.O.OptionalDouble
	#tag EndProperty


    #tag Enum, Name = Report_statusEnum, Type = Integer, Flags = &h0
        
        DoesNotExist
        Finished
        InProgress
        Expired
        Failed
        Cancelled
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Report_statusEnumToString(value As Report_statusEnum) As String
		  Select Case value
		    
		    Case Report_statusEnum.DoesNotExist
		      Return "DOES_NOT_EXIST"
		    Case Report_statusEnum.Finished
		      Return "FINISHED"
		    Case Report_statusEnum.InProgress
		      Return "IN_PROGRESS"
		    Case Report_statusEnum.Expired
		      Return "EXPIRED"
		    Case Report_statusEnum.Failed
		      Return "FAILED"
		    Case Report_statusEnum.Cancelled
		      Return "CANCELLED"
		    
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
			Name="url"
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
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


