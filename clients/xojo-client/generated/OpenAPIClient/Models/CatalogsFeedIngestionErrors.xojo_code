#tag Class
Protected Class CatalogsFeedIngestionErrors

	#tag Property, Flags = &h0
		#tag Note
			We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
		#tag EndNote
		LINE_LEVEL_INTERNAL_ERROR As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The product count has decreased by more than 99% compared to the last successful ingestion.
		#tag EndNote
		LARGE_PRODUCT_COUNT_DECREASE As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
		#tag EndNote
		ACCOUNT_FLAGGED As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
		#tag EndNote
		IMAGE_LEVEL_INTERNAL_ERROR As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Image files are unreadable. Please upload new files to continue.
		#tag EndNote
		IMAGE_FILE_NOT_ACCESSIBLE As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Image files are unreadable. Please check your link and upload new files to continue.
		#tag EndNote
		IMAGE_MALFORMED_URL As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Image files are unreadable. Please upload new files to continue.
		#tag EndNote
		IMAGE_FILE_NOT_FOUND As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Image files are unreadable. Please upload new files to continue.
		#tag EndNote
		IMAGE_INVALID_FILE As Xoson.O.OptionalInteger
	#tag EndProperty


    #tag Enum, Name = LARGE_PRODUCT_COUNT_DECREASEEnum, Type = Integer, Flags = &h0
        
        Escaped1 = "1"
        
    #tag EndEnum




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
			Name="LINE_LEVEL_INTERNAL_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ACCOUNT_FLAGGED"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_LEVEL_INTERNAL_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_FILE_NOT_ACCESSIBLE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_MALFORMED_URL"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_FILE_NOT_FOUND"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_INVALID_FILE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


