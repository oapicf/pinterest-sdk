#tag Class
Protected Class CatalogsAiContentDisclosure

	#tag Property, Flags = &h0
		#tag Note
			Disclosure labels that apply to this asset.
		#tag EndNote
		disclosure() As CatalogsAiContentDisclosureLabel
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			URL of the asset. Must match one of image_link, additional_image_link, or video_link.
		#tag EndNote
		url As String
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
			Name="disclosure"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsAiContentDisclosureLabel"
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
	#tag EndViewBehavior
End Class
#tag EndClass


