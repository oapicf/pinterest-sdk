#tag Class
Protected Class CatalogsItemValidationIssues

	#tag Property, Flags = &h0
		#tag Note
			Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
		#tag EndNote
		item_number As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The merchant-created unique ID that represents the product.
		#tag EndNote
		item_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		errors As OpenAPIClient.Models.CatalogsItemValidationErrors
	#tag EndProperty


	#tag Property, Flags = &h0
		warnings As OpenAPIClient.Models.CatalogsItemValidationWarnings
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
			Name="item_number"
			Visible=false
			Group="Behavior"
			InitialValue=""
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
			Name="errors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationErrors"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warnings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationWarnings"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


