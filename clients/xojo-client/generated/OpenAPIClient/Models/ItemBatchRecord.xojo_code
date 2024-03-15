#tag Class
Protected Class ItemBatchRecord

	#tag Property, Flags = &h0
		#tag Note
			The catalog item id in the merchant namespace
		#tag EndNote
		item_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		Escapedattributes As OpenAPIClient.Models.ItemAttributes
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
		#tag EndNote
		update_mask() As UpdateMaskFieldType
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
			Name="Escapedattributes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemAttributes"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="update_mask"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdateMaskFieldType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


