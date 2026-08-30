#tag Class
Protected Class CatalogsProductGroupFilterOperatorTypeCriteria

	#tag Property, Flags = &h0
		filter_operator_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		negated As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		values() As String
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
			Name="filter_operator_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FilterOperatorType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="negated"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="values"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


