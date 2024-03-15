#tag Class
Protected Class PinMediaSourceImagesURL

	#tag Property, Flags = &h0
		source_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array with image objects.
		#tag EndNote
		items() As OpenAPIClient.Models.PinMediaSourceImagesURLItemsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		index As Xoson.O.OptionalInteger
	#tag EndProperty


    #tag Enum, Name = Source_typeEnum, Type = Integer, Flags = &h0
        
        MultipleImageUrls
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Source_typeEnumToString(value As Source_typeEnum) As String
		  Select Case value
		    
		    Case Source_typeEnum.MultipleImageUrls
		      Return "multiple_image_urls"
		    
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
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PinMediaSourceImagesURLItemsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


