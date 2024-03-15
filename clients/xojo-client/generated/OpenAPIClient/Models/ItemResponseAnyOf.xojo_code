#tag Class
Protected Class ItemResponseAnyOf

	#tag Property, Flags = &h0
		catalog_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The catalog retail item id in the merchant namespace
		#tag EndNote
		item_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The pins mapped to the item
		#tag EndNote
		pins() As OpenAPIClient.Models.Pin
	#tag EndProperty


	#tag Property, Flags = &h0
		Escapedattributes As OpenAPIClient.Models.CatalogsHotelAttributes
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The catalog hotel id in the merchant namespace
		#tag EndNote
		hotel_id As Xoson.O.OptionalString
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
			Name="catalog_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsType"
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
			Name="pins"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Pin"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedattributes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsHotelAttributes"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hotel_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


