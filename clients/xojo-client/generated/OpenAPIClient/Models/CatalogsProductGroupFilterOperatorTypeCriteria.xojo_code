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


    #tag Enum, Name = Filter_operator_typeEnum, Type = Integer, Flags = &h0
        
        Escapedis
        Contains
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Filter_operator_typeEnumToString(value As Filter_operator_typeEnum) As String
		  Select Case value
		    
		    Case Filter_operator_typeEnum.Escapedis
		      Return "IS"
		    Case Filter_operator_typeEnum.Contains
		      Return "CONTAINS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


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


