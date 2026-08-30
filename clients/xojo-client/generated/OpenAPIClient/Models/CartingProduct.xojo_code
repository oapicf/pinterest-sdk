#tag Class
Protected Class CartingProduct

	#tag Property, Flags = &h0
		#tag Note
			the internal Pinterest carting product id (different from industry product id)
		#tag EndNote
		carting_product_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to display only the preferred retailers for the carting product
		#tag EndNote
		display_preferred_retailers_only As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to display the price for the carting product
		#tag EndNote
		display_product_price As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A sorted array of preferred retailers for the carting product
		#tag EndNote
		preferred_retailers() As OpenAPIClient.Models.CartingRetailer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to randomize preferred retailers for the carting product
		#tag EndNote
		randomize_preferred_retailers As Xoson.O.OptionalBoolean
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
			Name="carting_product_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="display_preferred_retailers_only"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="display_product_price"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="preferred_retailers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CartingRetailer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="randomize_preferred_retailers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


