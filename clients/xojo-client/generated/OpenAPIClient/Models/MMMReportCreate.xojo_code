#tag Class
Protected Class MMMReportCreate

	#tag Property, Flags = &h0
		#tag Note
			Advertiser IDs for multi-advertiser report
		#tag EndNote
		advertiser_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric and entity columns
		#tag EndNote
		columns() As MMMReportingColumn
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A List of countries for filtering
		#tag EndNote
		countries() As TargetingAdvertiserCountry
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of custom column IDs
		#tag EndNote
		custom_column_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric report end date (UTC). Format: YYYY-MM-DD
		#tag EndNote
		end_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			  DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
		#tag EndNote
		granularity As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Level of the report
		#tag EndNote
		level As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Name of the Marketing Mix Modeling (MMM) report
		#tag EndNote
		report_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric report start date (UTC). Format: YYYY-MM-DD
		#tag EndNote
		start_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of targeting types
		#tag EndNote
		targeting_types() As MMMReportingTargetingType
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
			Name="advertiser_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="columns"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MMMReportingColumn"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="countries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingAdvertiserCountry"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_column_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="end_date"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="granularity"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MMMReportGranularity"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MMMReportLevel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="report_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="start_date"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MMMReportingTargetingType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


