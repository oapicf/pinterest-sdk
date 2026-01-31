#tag Class
Protected Class PinMediaWithImage

	#tag Property, Flags = &h0
		images As OpenAPIClient.Models.ImageSize
	#tag EndProperty


	#tag Property, Flags = &h0
		media_type As String
	#tag EndProperty


    #tag Enum, Name = Media_typeEnum, Type = Integer, Flags = &h0
        
        Image
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Media_typeEnumToString(value As Media_typeEnum) As String
		  Select Case value
		    
		    Case Media_typeEnum.Image
		      Return "image"
		    
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
			Name="images"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ImageSize"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


