#tag Class
Protected Class UserWebsiteVerifyRequest

	#tag Property, Flags = &h0
		website As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		verification_method As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Verification_methodEnum, Type = Integer, Flags = &h0
        
        Filename
        Metatag
        Dnstxt
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Verification_methodEnumToString(value As Verification_methodEnum) As String
		  Select Case value
		    
		    Case Verification_methodEnum.Filename
		      Return "FILENAME"
		    Case Verification_methodEnum.Metatag
		      Return "METATAG"
		    Case Verification_methodEnum.Dnstxt
		      Return "DNSTXT"
		    
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
			Name="website"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


