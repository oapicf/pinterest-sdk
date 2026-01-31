#tag Class
Protected Class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics

	#tag Property, Flags = &h0
		#tag Note
			Metrics for custom defined conversion event.
		#tag EndNote
		custom_event_metrics_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Name of the advertiser-defined custom conversion event
		#tag EndNote
		custom_event_name As String
	#tag EndProperty


    #tag Enum, Name = Custom_event_metrics_typeEnum, Type = Integer, Flags = &h0
        
        AdeCostPerAction
        AdeRoas
        AdeTotalConversions
        AdeTotalValueInMicroDollar
        AdeAverageValueInMicroDollar
        AdeTotalClick
        AdeTotalClickValueInMicroDollar
        AdeTotalView
        AdeTotalViewValueInMicroDollar
        AdeTotalConversionRate
        AdeWebCostPerAction
        AdeWebRoas
        AdeTotalWebConversions
        AdeTotalWebValueInMicroDollar
        AdeTotalWebClick
        AdeTotalWebClickValueInMicroDollar
        AdeTotalWebView
        AdeTotalWebViewValueInMicroDollar
        AdeInappCostPerAction
        AdeInappRoas
        AdeTotalInappConversions
        AdeTotalInappValueInMicroDollar
        AdeTotalInappClick
        AdeTotalInappClickValueInMicroDollar
        AdeTotalInappView
        AdeTotalInappViewValueInMicroDollar
        AdeOfflineCostPerAction
        AdeOfflineRoas
        AdeTotalOfflineConversions
        AdeTotalOfflineValueInMicroDollar
        AdeTotalOfflineClick
        AdeTotalOfflineClickValueInMicroDollar
        AdeTotalOfflineView
        AdeTotalOfflineViewValueInMicroDollar
        AdeTotalConversionProductQuantity
        AdeTotalConversionProductValue
        AdeTotalConversionProductValueInMicroUnits
        AdeTotalConversionProductValueInUsd
        AdeTotalConversionProductValueInMicroUsd
        AdeTotalWebConversionProductQuantity
        AdeTotalWebConversionProductValue
        AdeTotalWebConversionProductValueInMicroUnits
        AdeTotalWebConversionProductValueInUsd
        AdeTotalWebConversionProductValueInMicroUsd
        AdeTotalInappConversionProductQuantity
        AdeTotalInappConversionProductValue
        AdeTotalInappConversionProductValueInMicroUnits
        AdeTotalInappConversionProductValueInUsd
        AdeTotalInappConversionProductValueInMicroUsd
        AdeTotalOfflineConversionProductQuantity
        AdeTotalOfflineConversionProductValue
        AdeTotalOfflineConversionProductValueInMicroUnits
        AdeTotalOfflineConversionProductValueInUsd
        AdeTotalOfflineConversionProductValueInMicroUsd
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Custom_event_metrics_typeEnumToString(value As Custom_event_metrics_typeEnum) As String
		  Select Case value
		    
		    Case Custom_event_metrics_typeEnum.AdeCostPerAction
		      Return "ADE_COST_PER_ACTION"
		    Case Custom_event_metrics_typeEnum.AdeRoas
		      Return "ADE_ROAS"
		    Case Custom_event_metrics_typeEnum.AdeTotalConversions
		      Return "ADE_TOTAL_CONVERSIONS"
		    Case Custom_event_metrics_typeEnum.AdeTotalValueInMicroDollar
		      Return "ADE_TOTAL_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeAverageValueInMicroDollar
		      Return "ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalClick
		      Return "ADE_TOTAL_CLICK"
		    Case Custom_event_metrics_typeEnum.AdeTotalClickValueInMicroDollar
		      Return "ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalView
		      Return "ADE_TOTAL_VIEW"
		    Case Custom_event_metrics_typeEnum.AdeTotalViewValueInMicroDollar
		      Return "ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalConversionRate
		      Return "ADE_TOTAL_CONVERSION_RATE"
		    Case Custom_event_metrics_typeEnum.AdeWebCostPerAction
		      Return "ADE_WEB_COST_PER_ACTION"
		    Case Custom_event_metrics_typeEnum.AdeWebRoas
		      Return "ADE_WEB_ROAS"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebConversions
		      Return "ADE_TOTAL_WEB_CONVERSIONS"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebValueInMicroDollar
		      Return "ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebClick
		      Return "ADE_TOTAL_WEB_CLICK"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebClickValueInMicroDollar
		      Return "ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebView
		      Return "ADE_TOTAL_WEB_VIEW"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebViewValueInMicroDollar
		      Return "ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeInappCostPerAction
		      Return "ADE_INAPP_COST_PER_ACTION"
		    Case Custom_event_metrics_typeEnum.AdeInappRoas
		      Return "ADE_INAPP_ROAS"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappConversions
		      Return "ADE_TOTAL_INAPP_CONVERSIONS"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappValueInMicroDollar
		      Return "ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappClick
		      Return "ADE_TOTAL_INAPP_CLICK"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappClickValueInMicroDollar
		      Return "ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappView
		      Return "ADE_TOTAL_INAPP_VIEW"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappViewValueInMicroDollar
		      Return "ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeOfflineCostPerAction
		      Return "ADE_OFFLINE_COST_PER_ACTION"
		    Case Custom_event_metrics_typeEnum.AdeOfflineRoas
		      Return "ADE_OFFLINE_ROAS"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineConversions
		      Return "ADE_TOTAL_OFFLINE_CONVERSIONS"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineValueInMicroDollar
		      Return "ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineClick
		      Return "ADE_TOTAL_OFFLINE_CLICK"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineClickValueInMicroDollar
		      Return "ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineView
		      Return "ADE_TOTAL_OFFLINE_VIEW"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineViewValueInMicroDollar
		      Return "ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR"
		    Case Custom_event_metrics_typeEnum.AdeTotalConversionProductQuantity
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY"
		    Case Custom_event_metrics_typeEnum.AdeTotalConversionProductValue
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_VALUE"
		    Case Custom_event_metrics_typeEnum.AdeTotalConversionProductValueInMicroUnits
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case Custom_event_metrics_typeEnum.AdeTotalConversionProductValueInUsd
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case Custom_event_metrics_typeEnum.AdeTotalConversionProductValueInMicroUsd
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebConversionProductQuantity
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebConversionProductValue
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebConversionProductValueInMicroUnits
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebConversionProductValueInUsd
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case Custom_event_metrics_typeEnum.AdeTotalWebConversionProductValueInMicroUsd
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappConversionProductQuantity
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappConversionProductValue
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappConversionProductValueInMicroUnits
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappConversionProductValueInUsd
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case Custom_event_metrics_typeEnum.AdeTotalInappConversionProductValueInMicroUsd
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineConversionProductQuantity
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineConversionProductValue
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineConversionProductValueInMicroUnits
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineConversionProductValueInUsd
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case Custom_event_metrics_typeEnum.AdeTotalOfflineConversionProductValueInMicroUsd
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    
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
			Name="custom_event_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


