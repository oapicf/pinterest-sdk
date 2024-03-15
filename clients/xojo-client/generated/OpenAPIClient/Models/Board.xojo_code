#tag Class
Protected Class Board

	#tag Property, Flags = &h0
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Date and time of board creation.
		#tag EndNote
		created_at As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Date and time of last board pins modified.
		#tag EndNote
		board_pins_modified_at As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Count of collaborators on the board.
		#tag EndNote
		collaborator_count As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Count of pins on the board.
		#tag EndNote
		pin_count As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Board follower count.
		#tag EndNote
		follower_count As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		media As OpenAPIClient.Models.BoardMedia
	#tag EndProperty


	#tag Property, Flags = &h0
		owner As OpenAPIClient.Models.BoardOwner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Privacy setting for a board. Learn more about <a href="https://help.pinterest.com/en/article/secret-boards">secret boards</a> and <a href="https://help.pinterest.com/en/business/article/protected-boards">protected boards</a>
		#tag EndNote
		privacy As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = PrivacyEnum, Type = Integer, Flags = &h0
        
        Escapedpublic
        Escapedprotected
        Secret
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function PrivacyEnumToString(value As PrivacyEnum) As String
		  Select Case value
		    
		    Case PrivacyEnum.Escapedpublic
		      Return "PUBLIC"
		    Case PrivacyEnum.Escapedprotected
		      Return "PROTECTED"
		    Case PrivacyEnum.Secret
		      Return "SECRET"
		    
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="board_pins_modified_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
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
			Name="collaborator_count"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pin_count"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="follower_count"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BoardMedia"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="owner"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BoardOwner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


