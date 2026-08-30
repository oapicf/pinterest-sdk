#tag Class
Protected Class LocalInventoryItemResponse

	#tag Property, Flags = &h0
		#tag Note
			Ad link for the item
		#tag EndNote
		ad_link As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Availability status of the item
		#tag EndNote
		availability As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The millisecond timestamp when the local inventory item was created
		#tag EndNote
		created_at As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The catalog item id in the merchant namespace
		#tag EndNote
		item_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The millisecond timestamp when the local inventory item was lastly modified by the merchant.
		#tag EndNote
		last_updated_time As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The price of the product. It supports the following formats, "49.99 USD", "49.99USD" and "49.99". If the currency is not included, we default to US dollars.
		#tag EndNote
		price As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The sale price of the product. It supports the following formats, "24.99 USD", "24.99USD" and "24.99". If the currency is not included, we default to US dollars.
		#tag EndNote
		sale_price As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Store metadata for this local inventory item
		#tag EndNote
		store_metadata As OpenAPIClient.Models.StoreMetadata
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
			Name="ad_link"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="availability"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemAvailability"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
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
			Name="last_updated_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="price"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sale_price"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="store_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StoreMetadata"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


