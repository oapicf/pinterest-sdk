#tag Class
Protected Class AdGroupDeliveryEstimates

	#tag Property, Flags = &h0
		auto_targeting_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
		#tag EndNote
		creative_types() As AdGroupAudienceSizingCreativeTypes
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
		#tag EndNote
		keywords() As OpenAPIClient.Models.AdGroupDeliveryEstimatesKeywordsItems
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
		#tag EndNote
		monthly_frequency_cap As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		optimization_goal_metadata As OpenAPIClient.Models.OptimizationGoalMetadata
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
		#tag EndNote
		optimization_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		placement_group As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			[Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
		#tag EndNote
		product_group_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		targeting_spec As OpenAPIClient.Models.TargetingSpecOptimal
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
			Name="auto_targeting_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="creative_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupAudienceSizingCreativeTypes"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="keywords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupDeliveryEstimatesKeywordsItems"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="monthly_frequency_cap"
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
			Type="OptimizationGoalMetadata"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="optimization_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OptimizationType"
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
			Name="product_group_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
	#tag EndViewBehavior
End Class
#tag EndClass


