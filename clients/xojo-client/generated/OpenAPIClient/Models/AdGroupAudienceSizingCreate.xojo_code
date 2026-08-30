#tag Class
Protected Class AdGroupAudienceSizingCreate

	#tag Property, Flags = &h0
		#tag Note
			Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
		#tag EndNote
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
		keywords() As OpenAPIClient.Models.AdGroupAudienceSizingKeyword
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			[Placement group](/docs/redoc/#section/Placement-group).
		#tag EndNote
		placement_group As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
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
			Type="AdGroupAudienceSizingKeyword"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdgroupPlacementGroupType"
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


