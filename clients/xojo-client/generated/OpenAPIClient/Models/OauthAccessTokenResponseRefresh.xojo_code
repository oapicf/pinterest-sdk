#tag Class
Protected Class OauthAccessTokenResponseRefresh

	#tag Property, Flags = &h0
		response_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		access_token As String
	#tag EndProperty


	#tag Property, Flags = &h0
		token_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		expires_in As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		scope As String
	#tag EndProperty


    #tag Enum, Name = Response_typeEnum, Type = Integer, Flags = &h0
        
        AuthorizationCode
        RefreshToken
        ClientCredentials
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Response_typeEnumToString(value As Response_typeEnum) As String
		  Select Case value
		    
		    Case Response_typeEnum.AuthorizationCode
		      Return "authorization_code"
		    Case Response_typeEnum.RefreshToken
		      Return "refresh_token"
		    Case Response_typeEnum.ClientCredentials
		      Return "client_credentials"
		    
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
			Name="access_token"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="token_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="expires_in"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="scope"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


