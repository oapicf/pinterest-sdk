#tag Class
Protected Class CatalogsReportFeedIngestionStats

	#tag Property, Flags = &h0
		report_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the catalog entity.
		#tag EndNote
		catalog_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The event code that a diagnostics aggregated number references
		#tag EndNote
		code As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
		#tag EndNote
		code_label As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Title message describing the diagnostic issue
		#tag EndNote
		message As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of occurrences of the issue
		#tag EndNote
		occurrences As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
		#tag EndNote
		severity As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Report_typeEnum, Type = Integer, Flags = &h0
        
        FeedIngestionIssues
        
    #tag EndEnum

    #tag Enum, Name = SeverityEnum, Type = Integer, Flags = &h0
        
        Warn
        Error
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Report_typeEnumToString(value As Report_typeEnum) As String
		  Select Case value
		    
		    Case Report_typeEnum.FeedIngestionIssues
		      Return "FEED_INGESTION_ISSUES"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function SeverityEnumToString(value As SeverityEnum) As String
		  Select Case value
		    
		    Case SeverityEnum.Warn
		      Return "WARN"
		    Case SeverityEnum.Error
		      Return "ERROR"
		    
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
			Name="catalog_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="code"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="code_label"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="message"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="occurrences"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


