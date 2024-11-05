#tag Class
Protected Class AdvancedAuctionItemsSubmitRecord

	#tag Property, Flags = &h0
		operation As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The catalog retail item id in the merchant namespace
		#tag EndNote
		item_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		country As String
	#tag EndProperty


	#tag Property, Flags = &h0
		language As String
	#tag EndProperty


	#tag Property, Flags = &h0
		bid_options As OpenAPIClient.Models.AdvancedAuctionBidOptions
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
		#tag EndNote
		update_mask() As UpdateMaskBidOptionField
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
			Name="operation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdvancedAuctionOperation"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="item_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="country"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Country"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="language"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Language"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="bid_options"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdvancedAuctionBidOptions"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="update_mask"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdateMaskBidOptionField"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


