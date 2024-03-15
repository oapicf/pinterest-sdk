#tag Class
Protected Class PinMediaSourcePinURL

	#tag Property, Flags = &h0
		source_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
		#tag EndNote
		is_affiliate_link As Xoson.O.OptionalBoolean
	#tag EndProperty


    #tag Enum, Name = Source_typeEnum, Type = Integer, Flags = &h0
        
        PinUrl
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Source_typeEnumToString(value As Source_typeEnum) As String
		  Select Case value
		    
		    Case Source_typeEnum.PinUrl
		      Return "pin_url"
		    
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
			Name="is_affiliate_link"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


