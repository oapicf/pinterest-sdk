#tag Class
Protected Class TrendsEditorial

	#tag Property, Flags = &h0
		#tag Note
			URL of the editorial board
		#tag EndNote
		board_url As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Description of the editorial article
		#tag EndNote
		description As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of interests related to the editorial article
		#tag EndNote
		interests() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			URL of the pins related to the editorial article
		#tag EndNote
		pins_url() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of keywords related to the editorial article
		#tag EndNote
		related_keywords() As OpenAPIClient.Models.KeywordInfo
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Title of the editorial article
		#tag EndNote
		title As String
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
			Name="board_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="description"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="interests"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pins_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="related_keywords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="KeywordInfo"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="title"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


