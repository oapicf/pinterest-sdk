#tag Class
Protected Class AdvancedAuctionItemsSubmitRequest

	#tag Property, Flags = &h0
		#tag Note
			Catalog id pertaining to all items
		#tag EndNote
		catalog_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of item bid option operations
		#tag EndNote
		items() As OpenAPIClient.Models.AdvancedAuctionItemsSubmitRecord
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
			Name="catalog_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdvancedAuctionItemsSubmitRecord"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


