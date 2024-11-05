#tag Class
Protected Class CatalogsHotelReportParametersReport

	#tag Property, Flags = &h0
		report_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the feed entity.
		#tag EndNote
		feed_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of a feed processing result. It can be acquired from the "id" field of the "items" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
		#tag EndNote
		processing_result_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of a catalog. If not given, oldest catalog will be used
		#tag EndNote
		catalog_id As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Report_typeEnum, Type = Integer, Flags = &h0
        
        FeedIngestionIssues
        DistributionIssues
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Report_typeEnumToString(value As Report_typeEnum) As String
		  Select Case value
		    
		    Case Report_typeEnum.FeedIngestionIssues
		      Return "FEED_INGESTION_ISSUES"
		    Case Report_typeEnum.DistributionIssues
		      Return "DISTRIBUTION_ISSUES"
		    
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
			Name="feed_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="processing_result_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
	#tag EndViewBehavior
End Class
#tag EndClass


