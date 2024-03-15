#tag Class
Protected Class CatalogsProductGroupPricingCurrencyCriteria

	#tag Property, Flags = &h0
		operator As String
	#tag EndProperty


	#tag Property, Flags = &h0
		value As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		currency As String
	#tag EndProperty


	#tag Property, Flags = &h0
		negated As Xoson.O.OptionalBoolean
	#tag EndProperty


    #tag Enum, Name = OperatorEnum, Type = Integer, Flags = &h0
        
        GreaterThan
        GreaterThanOrEquals
        LessThan
        LessThanOrEquals
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function OperatorEnumToString(value As OperatorEnum) As String
		  Select Case value
		    
		    Case OperatorEnum.GreaterThan
		      Return "GREATER_THAN"
		    Case OperatorEnum.GreaterThanOrEquals
		      Return "GREATER_THAN_OR_EQUALS"
		    Case OperatorEnum.LessThan
		      Return "LESS_THAN"
		    Case OperatorEnum.LessThanOrEquals
		      Return "LESS_THAN_OR_EQUALS"
		    
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
			Name="value"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NonNullableCatalogsCurrency"
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
	#tag EndViewBehavior
End Class
#tag EndClass


