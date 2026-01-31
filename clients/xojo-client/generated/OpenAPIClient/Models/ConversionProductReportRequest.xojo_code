#tag Class
Protected Class ConversionProductReportRequest

	#tag Property, Flags = &h0
		#tag Note
			List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
		#tag EndNote
		ad_group_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
		#tag EndNote
		campaign_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
		#tag EndNote
		campaign_objective_types() As ObjectiveType
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
		conversion_product_attribution_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
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
			Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
		#tag EndNote
		end_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
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
			List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
		#tag EndNote
		product_sku_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Name of the conversion product report.
		#tag EndNote
		report_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
		#tag EndNote
		start_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
		#tag EndNote
		view_window_days As Xoson.O.OptionalInteger
	#tag EndProperty


    #tag Enum, Name = Conversion_product_attribution_typeEnum, Type = Integer, Flags = &h0
        
        Default
        BrandAttribution
        
    #tag EndEnum

    #tag Enum, Name = Conversion_product_breakdownEnum, Type = Integer, Flags = &h0
        
        ProductBrand
        ProductCategory
        ProductBrandAndCategory
        ProductSku
        ProductSkuGroup
        
    #tag EndEnum

    #tag Enum, Name = GranularityEnum, Type = Integer, Flags = &h0
        
        Week
        Month
        Total
        
    #tag EndEnum

    #tag Enum, Name = LevelEnum, Type = Integer, Flags = &h0
        
        Advertiser
        Campaign
        AdGroup
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Conversion_product_attribution_typeEnumToString(value As Conversion_product_attribution_typeEnum) As String
		  Select Case value
		    
		    Case Conversion_product_attribution_typeEnum.Default
		      Return "DEFAULT"
		    Case Conversion_product_attribution_typeEnum.BrandAttribution
		      Return "BRAND_ATTRIBUTION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Conversion_product_breakdownEnumToString(value As Conversion_product_breakdownEnum) As String
		  Select Case value
		    
		    Case Conversion_product_breakdownEnum.ProductBrand
		      Return "PRODUCT_BRAND"
		    Case Conversion_product_breakdownEnum.ProductCategory
		      Return "PRODUCT_CATEGORY"
		    Case Conversion_product_breakdownEnum.ProductBrandAndCategory
		      Return "PRODUCT_BRAND_AND_CATEGORY"
		    Case Conversion_product_breakdownEnum.ProductSku
		      Return "PRODUCT_SKU"
		    Case Conversion_product_breakdownEnum.ProductSkuGroup
		      Return "PRODUCT_SKU_GROUP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function GranularityEnumToString(value As GranularityEnum) As String
		  Select Case value
		    
		    Case GranularityEnum.Week
		      Return "WEEK"
		    Case GranularityEnum.Month
		      Return "MONTH"
		    Case GranularityEnum.Total
		      Return "TOTAL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function LevelEnumToString(value As LevelEnum) As String
		  Select Case value
		    
		    Case LevelEnum.Advertiser
		      Return "ADVERTISER"
		    Case LevelEnum.Campaign
		      Return "CAMPAIGN"
		    Case LevelEnum.AdGroup
		      Return "AD_GROUP"
		    
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
			Type="ObjectiveType"
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


