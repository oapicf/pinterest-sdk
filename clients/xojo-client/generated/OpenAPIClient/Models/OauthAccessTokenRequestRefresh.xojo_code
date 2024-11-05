#tag Class
Protected Class OauthAccessTokenRequestRefresh

	#tag Property, Flags = &h0
		grant_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		refresh_token As String
	#tag EndProperty


	#tag Property, Flags = &h0
		scope As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to "everlasting_refresh".
		#tag EndNote
		refresh_on As Xoson.O.OptionalBoolean
	#tag EndProperty


    #tag Enum, Name = Grant_typeEnum, Type = Integer, Flags = &h0
        
        AuthorizationCode
        RefreshToken
        ClientCredentials
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Grant_typeEnumToString(value As Grant_typeEnum) As String
		  Select Case value
		    
		    Case Grant_typeEnum.AuthorizationCode
		      Return "authorization_code"
		    Case Grant_typeEnum.RefreshToken
		      Return "refresh_token"
		    Case Grant_typeEnum.ClientCredentials
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
			Name="refresh_token"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
		#tag ViewProperty
			Name="refresh_on"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


