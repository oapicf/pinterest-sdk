#tag Class
Protected Class PlacementMultipliers

	#tag Property, Flags = &h0
		PLACEMENT As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = PLACEMENTEnum, Type = Integer, Flags = &h0
        
        Search
        Browse
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function PLACEMENTEnumToString(value As PLACEMENTEnum) As String
		  Select Case value
		    
		    Case PLACEMENTEnum.Search
		      Return "SEARCH"
		    Case PLACEMENTEnum.Browse
		      Return "BROWSE"
		    
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


