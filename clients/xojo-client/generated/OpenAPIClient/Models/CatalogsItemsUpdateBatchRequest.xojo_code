#tag Class
Protected Class CatalogsItemsUpdateBatchRequest

	#tag Property, Flags = &h0
		country As String
	#tag EndProperty


	#tag Property, Flags = &h0
		language As String
	#tag EndProperty


	#tag Property, Flags = &h0
		operation As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array with catalogs items
		#tag EndNote
		items() As OpenAPIClient.Models.ItemUpdateBatchRecord
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
			Name="operation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BatchOperation"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemUpdateBatchRecord"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


