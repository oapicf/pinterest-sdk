#tag Class
Protected Class TargetingTemplateUpdateRequest

	#tag Property, Flags = &h0
		operation_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeting template ID
		#tag EndNote
		id As String
	#tag EndProperty


    #tag Enum, Name = Operation_typeEnum, Type = Integer, Flags = &h0
        
        Remove
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Operation_typeEnumToString(value As Operation_typeEnum) As String
		  Select Case value
		    
		    Case Operation_typeEnum.Remove
		      Return "REMOVE"
		    
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


