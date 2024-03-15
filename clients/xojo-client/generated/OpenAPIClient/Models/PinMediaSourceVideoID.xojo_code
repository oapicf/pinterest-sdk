#tag Class
Protected Class PinMediaSourceVideoID

	#tag Property, Flags = &h0
		source_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Cover image url.
		#tag EndNote
		cover_image_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content type for cover image Base64.
		#tag EndNote
		cover_image_content_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Cover image Base64.
		#tag EndNote
		cover_image_data As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		media_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
		#tag EndNote
		is_standard As Xoson.O.OptionalBoolean
	#tag EndProperty


    #tag Enum, Name = Source_typeEnum, Type = Integer, Flags = &h0
        
        VideoId
        
    #tag EndEnum

    #tag Enum, Name = Cover_image_content_typeEnum, Type = Integer, Flags = &h0
        
        Jpeg
        Png
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Source_typeEnumToString(value As Source_typeEnum) As String
		  Select Case value
		    
		    Case Source_typeEnum.VideoId
		      Return "video_id"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Cover_image_content_typeEnumToString(value As Cover_image_content_typeEnum) As String
		  Select Case value
		    
		    Case Cover_image_content_typeEnum.Jpeg
		      Return "image/jpeg"
		    Case Cover_image_content_typeEnum.Png
		      Return "image/png"
		    
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
			Name="cover_image_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cover_image_data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media_id"
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


