#tag Class
Protected Class RetailLocalInventoryItemAttributes

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
		availability As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The price of the product. It supports the following formats, "49.99 USD", "49.99USD" and "49.99". If the currency is not included, we default to US dollars.
		#tag EndNote
		price As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The sale price of the product. It supports the following formats, "24.99 USD", "24.99USD" and "24.99". If the currency is not included, we default to US dollars.
		#tag EndNote
		sale_price As Xoson.O.OptionalString
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
	#tag EndViewBehavior
End Class
#tag EndClass


