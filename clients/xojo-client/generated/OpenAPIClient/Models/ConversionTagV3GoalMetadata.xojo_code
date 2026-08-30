#tag Class
Protected Class ConversionTagV3GoalMetadata

	#tag Property, Flags = &h0
		attribution_windows As OpenAPIClient.Models.AttributionWindows
	#tag EndProperty


	#tag Property, Flags = &h0
		conversion_event As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		conversion_tag_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		cpa_goal_value_in_micro_currency As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `"CHECKOUT"` and `bid_strategy_type` is set to `"AUTOMATIC_BID"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
		#tag EndNote
		is_roas_optimized As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Event name for custom or standard events mapped to an oCPM model
		#tag EndNote
		reporting_event As Xoson.O.OptionalString
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
			Name="attribution_windows"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AttributionWindows"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_event"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionEvent"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_tag_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cpa_goal_value_in_micro_currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_roas_optimized"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="reporting_event"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


