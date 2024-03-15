#tag Class
Protected Class CatalogsItemValidationDetails

	#tag Property, Flags = &h0
		attribute_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Provided value that caused the validation issue.
		#tag EndNote
		provided_value As String
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
			Name="attribute_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NullableCatalogsItemFieldType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="provided_value"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


