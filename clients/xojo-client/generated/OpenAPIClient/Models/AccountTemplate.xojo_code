#tag Class
Protected Class AccountTemplate

	#tag Property, Flags = &h0
		#tag Note
			ID of the Ad Account that owns the template
		#tag EndNote
		ad_account_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			IDs of the Ad Accounts that have access to this template
		#tag EndNote
		ad_account_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of ADE columns
		#tag EndNote
		ade_columns() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Attribution type for Brand/Category/SKU reports
		#tag EndNote
		attribution_type As Variant
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The length of the sliding window over which click conversions will be attributed
		#tag EndNote
		click_window_days As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of columns to be included in the report
		#tag EndNote
		columns() As ReportingColumn
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Conversion report time type
		#tag EndNote
		conversion_report_time_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The surface used to create this template
		#tag EndNote
		creation_source As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of custom column IDs
		#tag EndNote
		custom_column_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Additional metadata about this reporting template
		#tag EndNote
		display_metadata As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The length of the sliding window over which engagement conversions will be attributed
		#tag EndNote
		engagement_window_days As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields: "field": The column name "operator": The operator. Allowed operators: ["=", "!=", "in", "not_in", "~", ">", "<", "contains_substring"] "value": A single value or a list of values
		#tag EndNote
		filters_json As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		granularity As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Template ID
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The filter on the conversion ingestion source method for conversion metrics
		#tag EndNote
		ingestion_sources() As IngestionSource
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A boolean representing if this is the default view that loads for this template type
		#tag EndNote
		is_default As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A boolean that indicates if the template has been deleted
		#tag EndNote
		is_deleted As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A boolean value that indicates if the user owns the template
		#tag EndNote
		is_owned_by_user As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A boolean value that indicates if this template has been used to create a scheduled report
		#tag EndNote
		is_scheduled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Template Name
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of days prior to the day the report will be delivered at which the report will end
		#tag EndNote
		report_end_relative_days_in_past As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		report_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		report_level As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of days prior to the day the report will be delivered at which the report will start
		#tag EndNote
		report_start_relative_days_in_past As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Timezone for reporting data
		#tag EndNote
		reporting_time_zone As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unified metric sort configuration
		#tag EndNote
		sort_by As Variant
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Type of the template
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Time of last update in seconds since Unix epoch
		#tag EndNote
		updated_time As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the user who created the template
		#tag EndNote
		user_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The length of the sliding window over which view conversions will be attributed
		#tag EndNote
		view_window_days As Xoson.O.OptionalDouble
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
			Name="ad_account_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_account_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ade_columns"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="attribution_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Variant"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="click_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="columns"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReportingColumn"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_report_time_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionReportTimeType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="creation_source"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreationSource"
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
			Name="display_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="engagement_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="filters_json"
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
			Type="Granularity"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ingestion_sources"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="IngestionSource"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_default"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_deleted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_owned_by_user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_scheduled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="report_end_relative_days_in_past"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="report_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DataOutputFormat"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="report_level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MetricsReportingLevel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="report_start_relative_days_in_past"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="reporting_time_zone"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReportingTimeZone"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sort_by"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Variant"
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
		#tag ViewProperty
			Name="updated_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="view_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


