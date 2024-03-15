#tag Class
Protected Class AdGroupCreateRequest

	#tag Property, Flags = &h0
		#tag Note
			Ad group name.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group/entity status.
		#tag EndNote
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
		#tag EndNote
		budget_in_micro_currency As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
		#tag EndNote
		bid_in_micro_currency As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		optimization_goal_metadata As OpenAPIClient.Models.AdGroupCommonOptimizationGoalMetadata
	#tag EndProperty


	#tag Property, Flags = &h0
		budget_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group start time. Unix timestamp in seconds. Defaults to current time.
		#tag EndNote
		start_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group end time. Unix timestamp in seconds.
		#tag EndNote
		end_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		targeting_spec As OpenAPIClient.Models.TargetingSpec
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href="https://developers.pinterest.com/docs/redoc/#section/Billable-event">billable_event</a> value. This field **REQUIRES** the `end_time` field.
		#tag EndNote
		lifetime_frequency_cap As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		tracking_urls As OpenAPIClient.Models.AdGroupCommonTrackingUrls
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enable auto-targeting for ad group.Default value is True. Also known as <a href="https://help.pinterest.com/en/business/article/expanded-targeting" target="_blank">"expanded targeting"</a>.
		#tag EndNote
		auto_targeting_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			<a href="https://developers.pinterest.com/docs/redoc/#section/Placement-group">Placement group</a>.
		#tag EndNote
		placement_group As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		pacing_delivery_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Campaign ID of the ad group.
		#tag EndNote
		campaign_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		billable_event As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Bid strategy type
		#tag EndNote
		bid_strategy_type As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Bid_strategy_typeEnum, Type = Integer, Flags = &h0
        
        AutomaticBid
        MaxBid
        TargetAvg
        Null
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Bid_strategy_typeEnumToString(value As Bid_strategy_typeEnum) As String
		  Select Case value
		    
		    Case Bid_strategy_typeEnum.AutomaticBid
		      Return "AUTOMATIC_BID"
		    Case Bid_strategy_typeEnum.MaxBid
		      Return "MAX_BID"
		    Case Bid_strategy_typeEnum.TargetAvg
		      Return "TARGET_AVG"
		    Case Bid_strategy_typeEnum.Null
		      Return "null"
		    
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EntityStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="budget_in_micro_currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="bid_in_micro_currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="optimization_goal_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupCommonOptimizationGoalMetadata"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="budget_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BudgetType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="start_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="end_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_spec"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpec"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifetime_frequency_cap"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tracking_urls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupCommonTrackingUrls"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="auto_targeting_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementGroupType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pacing_delivery_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PacingDeliveryType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaign_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="billable_event"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ActionType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


