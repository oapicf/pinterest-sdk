#tag Class
Protected Class CampaignUpdateRequestAllOf2

	#tag Property, Flags = &h0
		bid_options As OpenAPIClient.Models.CampaignBidOptionsUpdate
	#tag EndProperty


	#tag Property, Flags = &h0
		intended_promotion_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
		#tag EndNote
		is_ltv_optimized As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enable Pinterest Performance+ for your campaign. To learn more, see <a href="https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
		#tag EndNote
		is_performance_plus As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
		#tag EndNote
		is_top_of_search As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		objective_type As Xoson.O.OptionalString
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
			Type="CampaignBidOptionsUpdate"
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
	#tag EndViewBehavior
End Class
#tag EndClass


