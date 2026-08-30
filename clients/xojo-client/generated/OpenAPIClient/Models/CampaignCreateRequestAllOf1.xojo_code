#tag Class
Protected Class CampaignCreateRequestAllOf1

	#tag Property, Flags = &h0
		bid_options As OpenAPIClient.Models.CampaignBidOptionsCreate
	#tag EndProperty


	#tag Property, Flags = &h0
		intended_promotion_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB_CONVERSION - SALES - CATALOG_SALES
		#tag EndNote
		is_automated_campaign As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
		#tag EndNote
		is_campaign_budget_optimization As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Determine if a campaign has setup for flexible daily budgets, also known as "Pinterest Performance+ budgets". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
		#tag EndNote
		is_flexible_daily_budgets As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
		#tag EndNote
		is_ltv_optimized As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enable Pinterest Performance+ for your campaign. To learn more, see <a href="https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/">Pinterest Performance+ Setup</a>.
		#tag EndNote
		is_performance_plus As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			<a href="/docs/getting-started/using-beta-and-restricted-features/" target="blank" target="blank">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href="https://developer.pinterest.com/docs/api/v5/campaigns-update" target="blank">update it</a>.
		#tag EndNote
		is_top_of_search As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		objective_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
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
			Name="bid_options"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignBidOptionsCreate"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="intended_promotion_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="IntendedPromotionType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_automated_campaign"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_campaign_budget_optimization"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_flexible_daily_budgets"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_ltv_optimized"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_performance_plus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_top_of_search"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="objective_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ObjectiveType"
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
	#tag EndViewBehavior
End Class
#tag EndClass


