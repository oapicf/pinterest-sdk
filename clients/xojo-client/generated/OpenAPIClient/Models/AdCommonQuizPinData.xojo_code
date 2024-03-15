#tag Class
Protected Class AdCommonQuizPinData

	#tag Property, Flags = &h0
		questions() As OpenAPIClient.Models.QuizPinQuestion
	#tag EndProperty


	#tag Property, Flags = &h0
		results() As OpenAPIClient.Models.QuizPinResult
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
			Name="questions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QuizPinQuestion"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="results"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QuizPinResult"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


