#tag Class
Protected Class CatalogsRetailProductMetadata

	#tag Property, Flags = &h0
		#tag Note
			The user-created unique ID that represents the product.
		#tag EndNote
		item_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The parent ID of the product.
		#tag EndNote
		item_group_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		availability As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The price of the product.
		#tag EndNote
		price As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The discounted price of the product.
		#tag EndNote
		sale_price As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		currency As String
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
			Name="item_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="item_group_id"
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
			Type="NonNullableProductAvailabilityType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="price"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sale_price"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NonNullableCatalogsCurrency"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


