#tag Class
Protected Class AdGroupCreate

	#tag Property, Flags = &h0
		#tag Note
			Advertiser ID.
		#tag EndNote
		ad_account_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
		#tag EndNote
		bid_in_micro_currency As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		bid_strategy_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		billable_event As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
		#tag EndNote
		budget_in_micro_currency As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Campaign ID of the ad group.
		#tag EndNote
		campaign_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			oCPM learn mode
		#tag EndNote
		conversion_learning_mode_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group creation time. Unix timestamp in seconds.
		#tag EndNote
		created_time As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
		#tag EndNote
		customer_segment_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
		#tag EndNote
		dca_assets As Variant
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
		#tag EndNote
		end_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		ext_features As OpenAPIClient.Models.AdgroupTrackingFeatures
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Feed Profile ID associated to the adgroup.
		#tag EndNote
		feed_profile_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group ID.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
		#tag EndNote
		is_creative_optimization As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Indicates whether the ad group should use the local inventory.
		#tag EndNote
		is_local_inventory As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
		#tag EndNote
		lifetime_frequency_cap As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The targeting radius of the local inventory ads in miles.
		#tag EndNote
		local_inventory_radius_in_miles As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group name.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `"WEB_CONVERSION"`.
		#tag EndNote
		optimization_goal_metadata As OpenAPIClient.Models.NullableOptimizationGoalMetadata
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pinterest Performance+ campaign settings.
		#tag EndNote
		performance_plus_campaign_settings As OpenAPIClient.Models.PerformancePlusCampaignSettings
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			[Placement group](https://help.pinterest.com/en/business/article/placement-groups).
		#tag EndNote
		placement_group As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
		#tag EndNote
		placement_traffic_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Specify if the promotion is applied at ad group or item level
		#tag EndNote
		promotion_application_level As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Promotion ID. To clear this field, set to null.
		#tag EndNote
		promotion_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Promotion IDs list. To clear this field, set to an empty array [].
		#tag EndNote
		promotion_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
		#tag EndNote
		start_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group/entity status.
		#tag EndNote
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		summary_status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		targeting_spec As OpenAPIClient.Models.TargetingSpecOptimal
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
		#tag EndNote
		targeting_template_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		tracking_urls As OpenAPIClient.Models.AdGroupTrackingURLs
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Always "adgroup".
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group last update time. Unix timestamp in seconds.
		#tag EndNote
		updated_time As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enable auto-targeting for ad group. Default value is True. Also known as ["Performance+ targeting"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
		#tag EndNote
		auto_targeting_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
		#tag EndNote
		bid_multiplier As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		budget_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		pacing_delivery_type As Xoson.O.OptionalString
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
			Name="bid_in_micro_currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="bid_strategy_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BidStrategyType"
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
		#tag ViewProperty
			Name="budget_in_micro_currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Name="conversion_learning_mode_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionLearningModeType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="customer_segment_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dca_assets"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Variant"
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
			Name="ext_features"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdgroupTrackingFeatures"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="feed_profile_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="is_creative_optimization"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_local_inventory"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
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
			Name="local_inventory_radius_in_miles"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
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
			Name="optimization_goal_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NullableOptimizationGoalMetadata"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="performance_plus_campaign_settings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PerformancePlusCampaignSettings"
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
			Name="placement_traffic_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementTrafficType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promotion_application_level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromotionApplicationLevel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promotion_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promotion_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EntityStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="summary_status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SummaryStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_spec"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecOptimal"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_template_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tracking_urls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupTrackingURLs"
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
			Type="Integer"
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
			Name="bid_multiplier"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
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
			Name="pacing_delivery_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PacingDeliveryType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


