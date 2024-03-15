#tag Class
Protected Class PinMediaSourceImageURL

	#tag Property, Flags = &h0
		source_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		url As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
		#tag EndNote
		is_standard As Xoson.O.OptionalBoolean
	#tag EndProperty


    #tag Enum, Name = Source_typeEnum, Type = Integer, Flags = &h0
        
        ImageUrl
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Source_typeEnumToString(value As Source_typeEnum) As String
		  Select Case value
		    
		    Case Source_typeEnum.ImageUrl
		      Return "image_url"
		    
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
			Name="url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_standard"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


