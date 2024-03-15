#tag Class
Protected Class LeadFormQuestion

	#tag Property, Flags = &h0
		question_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		custom_question_field_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Question label for a custom question.
		#tag EndNote
		custom_question_label As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Question options for a custom question.
		#tag EndNote
		custom_question_options() As String
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
			Name="question_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LeadFormQuestionType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_question_field_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LeadFormQuestionFieldType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_question_label"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_question_options"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


