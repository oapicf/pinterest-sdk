#tag Class
Protected Class PinCreate

	#tag Property, Flags = &h0
		#tag Note
			AI disclosure declarations the creator has made about this Pin.
		#tag EndNote
		ai_disclosures As OpenAPIClient.Models.AiDisclosures
	#tag EndProperty


	#tag Property, Flags = &h0
		alt_text As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The board to which this Pin belongs.
		#tag EndNote
		board_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The board section to which this Pin belongs.
		#tag EndNote
		board_section_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Dominant pin color. Hex number, e.g. `#6E7874`.
		#tag EndNote
		dominant_color As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		link As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		media_source As OpenAPIClient.Models.PinMediaSource
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
		#tag EndNote
		parent_pin_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
		#tag EndNote
		sponsor_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		title As Xoson.O.OptionalString
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
			Name="ai_disclosures"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AiDisclosures"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="alt_text"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="board_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="board_section_id"
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
			Name="dominant_color"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="link"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media_source"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PinMediaSource"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="parent_pin_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sponsor_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="title"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


