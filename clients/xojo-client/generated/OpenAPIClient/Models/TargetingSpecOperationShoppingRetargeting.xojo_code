#tag Class
Protected Class TargetingSpecOperationShoppingRetargeting

	#tag Property, Flags = &h0
		field As String
	#tag EndProperty


	#tag Property, Flags = &h0
		operation As String
	#tag EndProperty


	#tag Property, Flags = &h0
		values() As OpenAPIClient.Models.TargetingSpecShoppingRetargeting
	#tag EndProperty


    #tag Enum, Name = FieldEnum, Type = Integer, Flags = &h0
        
        ShoppingRetargeting
        
    #tag EndEnum

    #tag Enum, Name = OperationEnum, Type = Integer, Flags = &h0
        
        Set
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function FieldEnumToString(value As FieldEnum) As String
		  Select Case value
		    
		    Case FieldEnum.ShoppingRetargeting
		      Return "SHOPPING_RETARGETING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function OperationEnumToString(value As OperationEnum) As String
		  Select Case value
		    
		    Case OperationEnum.Set
		      Return "SET"
		    
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
			Name="values"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecShoppingRetargeting"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


