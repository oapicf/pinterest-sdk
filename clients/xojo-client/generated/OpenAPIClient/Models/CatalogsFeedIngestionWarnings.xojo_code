#tag Class
Protected Class CatalogsFeedIngestionWarnings

	#tag Property, Flags = &h0
		#tag Note
			We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
		#tag EndNote
		ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Additional image files are unreadable. Please upload new files to continue.
		#tag EndNote
		ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Additional image files are unreadable. Please check your link and upload new files to continue.
		#tag EndNote
		ADDITIONAL_IMAGE_MALFORMED_URL As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Additional image files are unreadable. Please upload new files to continue.
		#tag EndNote
		ADDITIONAL_IMAGE_FILE_NOT_FOUND As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Additional image files are unreadable. Please upload new files to continue.
		#tag EndNote
		ADDITIONAL_IMAGE_INVALID_FILE As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			price is not a supported column. Use base_price and sale_price instead.
		#tag EndNote
		HOTEL_PRICE_HEADER_IS_PRESENT As Xoson.O.OptionalInteger
	#tag EndProperty





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
			Name="ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADDITIONAL_IMAGE_MALFORMED_URL"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADDITIONAL_IMAGE_FILE_NOT_FOUND"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADDITIONAL_IMAGE_INVALID_FILE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="HOTEL_PRICE_HEADER_IS_PRESENT"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


