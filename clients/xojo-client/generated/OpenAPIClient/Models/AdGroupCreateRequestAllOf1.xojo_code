#tag Class
Protected Class AdGroupCreateRequestAllOf1

	#tag Property, Flags = &h0
		#tag Note
			Enable auto-targeting for ad group. Default value is True. Also known as <a href="https://help.pinterest.com/en/business/article/performance-plus-targeting" target="_blank">"Pinterest Performance+ targeting"</a>.
		#tag EndNote
		auto_targeting_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			<a href="/docs/getting-started/using-beta-and-restricted-features/" target="blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href="/docs/api-features/pinterest-performance-plus-setup/" target="blank">Pinterest Performance+ campaigns</a>.
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


