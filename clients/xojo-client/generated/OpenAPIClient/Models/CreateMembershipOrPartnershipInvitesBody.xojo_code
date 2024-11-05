#tag Class
Protected Class CreateMembershipOrPartnershipInvitesBody

	#tag Property, Flags = &h0
		#tag Note
			The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
		#tag EndNote
		business_role As String
	#tag EndProperty


	#tag Property, Flags = &h0
		invite_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
		#tag EndNote
		members() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
		#tag EndNote
		partners() As String
	#tag EndProperty


    #tag Enum, Name = Business_roleEnum, Type = Integer, Flags = &h0
        
        Employee
        BizAdmin
        Partner
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Business_roleEnumToString(value As Business_roleEnum) As String
		  Select Case value
		    
		    Case Business_roleEnum.Employee
		      Return "EMPLOYEE"
		    Case Business_roleEnum.BizAdmin
		      Return "BIZ_ADMIN"
		    Case Business_roleEnum.Partner
		      Return "PARTNER"
		    
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
			Name="invite_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InviteType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="members"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partners"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


