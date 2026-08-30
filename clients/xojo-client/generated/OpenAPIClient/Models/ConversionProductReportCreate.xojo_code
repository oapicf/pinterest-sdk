#tag Class
Protected Class ConversionProductReportCreate

	#tag Property, Flags = &h0
		#tag Note
			  List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
		#tag EndNote
		ad_group_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			  List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
		#tag EndNote
		campaign_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
		#tag EndNote
		campaign_objective_types() As ConversionObjectiveType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
		#tag EndNote
		click_window_days As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric and entity columns
		#tag EndNote
		columns() As ConversionProductReportingColumn
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			  Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
		#tag EndNote
		conversion_product_attribution_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
		#tag EndNote
		conversion_product_breakdown As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
		#tag EndNote
		conversion_report_time As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			  Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
		#tag EndNote
		end_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Report granularity for time-based metric aggregation
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
			  List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
		#tag EndNote
		product_sku_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Name of the conversion product report
		#tag EndNote
		report_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			  Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
		#tag EndNote
		start_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
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
			Type="ConversionObjectiveType"
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
			Type="ConversionProductReportingColumn"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_product_attribution_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionProductAttributionType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_product_breakdown"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionProductReportBreakdownType"
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
			Type="ConversionProductReportGranularity"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionProductReportLevel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_sku_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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


