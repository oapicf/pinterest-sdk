#tag Class
Protected Class PinterestLibStatus204

	#tag Property, Flags = &h0
		statusCode As Double
	#tag EndProperty


    #tag Enum, Name = StatusCodeEnum, Type = Integer, Flags = &h0
        
        Escaped204
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function StatusCodeEnumToString(value As StatusCodeEnum) As String
		  Select Case value
		    
		    Case StatusCodeEnum.Escaped204
		      Return "204"
		    
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
	#tag EndViewBehavior
End Class
#tag EndClass


