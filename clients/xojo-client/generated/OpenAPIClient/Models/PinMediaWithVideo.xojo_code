#tag Class
Protected Class PinMediaWithVideo

	#tag Property, Flags = &h0
		cover_image_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Duration (in miliseconds). Field maybe null after creation due to video processing time.
		#tag EndNote
		duration As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Height (in pixels). Field maybe null after creation due to video processing time.
		#tag EndNote
		height As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		images As OpenAPIClient.Models.ImageSize
	#tag EndProperty


	#tag Property, Flags = &h0
		media_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Video url (720p).  **Note:** This field is limited and not available to all apps.
		#tag EndNote
		video_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Width (in pixels). Field maybe null after creation due to video processing time.
		#tag EndNote
		width As Xoson.O.OptionalInteger
	#tag EndProperty


    #tag Enum, Name = Media_typeEnum, Type = Integer, Flags = &h0
        
        Video
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Media_typeEnumToString(value As Media_typeEnum) As String
		  Select Case value
		    
		    Case Media_typeEnum.Video
		      Return "video"
		    
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
			Name="duration"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="height"
			Visible=false
			Group="Behavior"
			InitialValue=""
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
		#tag ViewProperty
			Name="video_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="width"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


