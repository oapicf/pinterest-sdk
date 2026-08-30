#tag Class
Protected Class TargetingSpecOperationAppType

	#tag Property, Flags = &h0
		field As String
	#tag EndProperty


	#tag Property, Flags = &h0
		operation As String
	#tag EndProperty


	#tag Property, Flags = &h0
		values() As TargetingSpecAppType
	#tag EndProperty


    #tag Enum, Name = FieldEnum, Type = Integer, Flags = &h0
        
        Apptype
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function FieldEnumToString(value As FieldEnum) As String
		  Select Case value
		    
		    Case FieldEnum.Apptype
		      Return "APPTYPE"
		    
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
			Name="operation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecListOperation"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="values"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecAppType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


