#tag Class
Protected Class AdsAnalyticsCreateAsyncRequest

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
			List of ad ids. This parameter is not supported for Product Item level reports.
		#tag EndNote
		ad_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values for filtering. This parameter is not supported for Product Item level reports.
		#tag EndNote
		ad_statuses() As PinPromotionSummaryStatus
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of attribution types for the conversion report.
		#tag EndNote
		attribution_types() As ConversionReportAttributionType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Campaign brand label for filtering.
		#tag EndNote
		campaign_brand_label As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Campaign custom label for filtering.
		#tag EndNote
		campaign_custom_label As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of campaign ids
		#tag EndNote
		campaign_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values for filtering. ["WEB_SESSIONS"] is in BETA.
		#tag EndNote
		campaign_objective_types() As CampaignObjectiveType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of status values for filtering
		#tag EndNote
		campaign_statuses() As CampaignSummaryStatus
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for a pin click action.
		#tag EndNote
		click_window_days As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
		#tag EndNote
		columns() As ReportingColumnAsync
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Determines if the targeting types included in the request should be consolidated into a single breakdown.
		#tag EndNote
		combine_targeting_types As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Date dimension for conversion metrics.
		#tag EndNote
		conversion_report_time As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of advertiser-defined custom conversion event metrics to include in the report
		#tag EndNote
		custom_conversion_event_metrics() As OpenAPIClient.Models.CustomConversionEventMetrics
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric report end date (UTC). Format: YYYY-MM-DD
		#tag EndNote
		end_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
		#tag EndNote
		end_hour As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for an engagement action.
		#tag EndNote
		engagement_window_days As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			  TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
		#tag EndNote
		granularity As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Level of the report
		#tag EndNote
		level As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of metrics filters
		#tag EndNote
		metrics_filters() As OpenAPIClient.Models.AdsAnalyticsMetricsFilter
	#tag EndProperty


	#tag Property, Flags = &h0
		primary_sort As Xoson.O.OptionalString
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
		report_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Specify the timezone to be applied for the reporting.
		#tag EndNote
		reporting_timezone As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric report start date (UTC). Format: YYYY-MM-DD
		#tag EndNote
		start_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Which hour of the start date to begin the report. Only allowed for hourly reports.
		#tag EndNote
		start_hour As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
		#tag EndNote
		targeting_types() As AdAdsAnalyticsAsyncTargetingTypes
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for a view action.
		#tag EndNote
		view_window_days As Xoson.O.OptionalInteger
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
			Name="attribution_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionReportAttributionType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaign_brand_label"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaign_custom_label"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="campaign_objective_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignObjectiveType"
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
			Name="click_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionAttributionWindowDays"
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
			Name="combine_targeting_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
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
			Name="custom_conversion_event_metrics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CustomConversionEventMetrics"
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
			Name="end_hour"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Name="granularity"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Granularity"
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
			Name="metrics_filters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdsAnalyticsMetricsFilter"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="primary_sort"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PrimarySort"
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
			Name="report_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DataOutputFormat"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="reporting_timezone"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReportingTimeZone"
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
			Name="start_hour"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdAdsAnalyticsAsyncTargetingTypes"
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
	#tag EndViewBehavior
End Class
#tag EndClass


