#tag Class
Protected Class AudienceDefinitionType

	#tag Property, Flags = &h0
		scope As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = ScopeEnum, Type = Integer, Flags = &h0
        
        ImpressionPlusEngagement
        Engagement
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ScopeEnumToString(value As ScopeEnum) As String
		  Select Case value
		    
		    Case ScopeEnum.ImpressionPlusEngagement
		      Return "IMPRESSION_PLUS_ENGAGEMENT"
		    Case ScopeEnum.Engagement
		      Return "ENGAGEMENT"
		    
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
	#tag EndViewBehavior
End Class
#tag EndClass


