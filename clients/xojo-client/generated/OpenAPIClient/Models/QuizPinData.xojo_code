#tag Class
Protected Class QuizPinData

	#tag Property, Flags = &h0
		questions() As OpenAPIClient.Models.QuizPinQuestion
	#tag EndProperty


	#tag Property, Flags = &h0
		results() As OpenAPIClient.Models.QuizPinResult
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Quiz ad tie breaker type, default is RANDOM
		#tag EndNote
		tie_breaker_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		tie_breaker_custom_result As OpenAPIClient.Models.QuizPinResult
	#tag EndProperty


    #tag Enum, Name = Tie_breaker_typeEnum, Type = Integer, Flags = &h0
        
        Random
        Custom
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Tie_breaker_typeEnumToString(value As Tie_breaker_typeEnum) As String
		  Select Case value
		    
		    Case Tie_breaker_typeEnum.Random
		      Return "RANDOM"
		    Case Tie_breaker_typeEnum.Custom
		      Return "CUSTOM"
		    
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
		#tag ViewProperty
			Name="tie_breaker_custom_result"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QuizPinResult"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


