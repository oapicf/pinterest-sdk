#tag Class
Protected Class AdAccount

	#tag Property, Flags = &h0
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		owner As OpenAPIClient.Models.AdAccountOwner
	#tag EndProperty


	#tag Property, Flags = &h0
		country As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		currency As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		permissions() As BusinessAccessRole
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Creation time. Unix timestamp in seconds.
		#tag EndNote
		created_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Last update time. Unix timestamp in seconds.
		#tag EndNote
		updated_time As Xoson.O.OptionalInteger
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="owner"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdAccountOwner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="country"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Country"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Currency"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="permissions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessAccessRole"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updated_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


