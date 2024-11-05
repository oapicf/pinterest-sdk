#tag Class
Protected Class AdvancedAuctionBidOptions

	#tag Property, Flags = &h0
		#tag Note
			Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
		#tag EndNote
		bid_in_micro_currency As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		app_type_multipliers As Xoson.O.OptionalAppTypeMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		placement_multipliers As Xoson.O.OptionalPlacementMultipliers
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
			Name="bid_in_micro_currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="app_type_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AppTypeMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementMultipliers"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


