#tag Class
Protected Class CatalogsVerticalBatchRequest

	#tag Property, Flags = &h0
		catalog_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		country As String
	#tag EndProperty


	#tag Property, Flags = &h0
		language As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array with catalogs item operations
		#tag EndNote
		items() As OpenAPIClient.Models.CatalogsHotelBatchItem
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
		#tag EndNote
		catalog_id As Xoson.O.OptionalString
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
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsHotelBatchItem"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="catalog_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


