#tag Class
Protected Class AdsAnalyticsCreateAsyncRequest

	#tag Property, Flags = &h0
		#tag Note
			Metric report start date (UTC). Format: YYYY-MM-DD
		#tag EndNote
		start_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric report end date (UTC). Format: YYYY-MM-DD
		#tag EndNote
		end_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
		#tag EndNote
		granularity As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
		#tag EndNote
		click_window_days As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
		#tag EndNote
		engagement_window_days As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
		#tag EndNote
		view_window_days As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
		#tag EndNote
		conversion_report_time As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of types of attribution for the conversion report
		#tag EndNote
		attribution_types() As ConversionReportAttributionType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of campaign ids
		#tag EndNote
		campaign_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of status values for filtering
		#tag EndNote
		campaign_statuses() As CampaignSummaryStatus
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values for filtering. ["WEB_SESSIONS"] in BETA.
		#tag EndNote
		campaign_objective_types() As ObjectiveType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of ad group ids
		#tag EndNote
		ad_group_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values for filtering
		#tag EndNote
		ad_group_statuses() As AdGroupSummaryStatus
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of ad ids [This parameter is no supported for Product Item Level Reports]
		#tag EndNote
		ad_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values for filtering [This parameter is not supported for Product Item Level Reports]
		#tag EndNote
		ad_statuses() As PinPromotionSummaryStatus
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of product group ids
		#tag EndNote
		product_group_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values for filtering
		#tag EndNote
		product_group_statuses() As ProductGroupSummaryStatus
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of product item ids
		#tag EndNote
		product_item_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of targeting types. Requires `level` to be a value ending in `_TARGETING`. ["AGE_BUCKET_AND_GENDER"] is in BETA and not yet available to all users.
		#tag EndNote
		targeting_types() As AdsAnalyticsTargetingType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of metrics filters
		#tag EndNote
		metrics_filters() As OpenAPIClient.Models.AdsAnalyticsMetricsFilter
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
		#tag EndNote
		columns() As ReportingColumnAsync
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Level of the report
		#tag EndNote
		level As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
		#tag EndNote
		report_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
		#tag EndNote
		primary_sort As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
		#tag EndNote
		start_hour As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
		#tag EndNote
		end_hour As Xoson.O.OptionalInteger
	#tag EndProperty


    #tag Enum, Name = Primary_sortEnum, Type = Integer, Flags = &h0
        
        Id
        Date
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Primary_sortEnumToString(value As Primary_sortEnum) As String
		  Select Case value
		    
		    Case Primary_sortEnum.Id
		      Return "BY_ID"
		    Case Primary_sortEnum.Date
		      Return "BY_DATE"
		    
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
			Name="start_date"
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
			Type="Granularity"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="click_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionAttributionWindowDays"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="engagement_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionAttributionWindowDays"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="view_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionAttributionWindowDays"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_report_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionReportTimeType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="attribution_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionReportAttributionType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaign_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaign_statuses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignSummaryStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaign_objective_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ObjectiveType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_group_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_group_statuses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupSummaryStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_statuses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PinPromotionSummaryStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_group_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_group_statuses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductGroupSummaryStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_item_ids"
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
			Type="AdsAnalyticsTargetingType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="metrics_filters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdsAnalyticsMetricsFilter"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="columns"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReportingColumnAsync"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MetricsReportingLevel"
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
			Name="start_hour"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="end_hour"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


