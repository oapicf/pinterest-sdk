#tag Class
Protected Class PinCreate

	#tag Property, Flags = &h0
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		created_at As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		link As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		title As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Dominant pin color. Hex number, e.g. "#6E7874".
		#tag EndNote
		dominant_color As Xoson.O.OptionalString
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
		board_owner As OpenAPIClient.Models.BoardOwner
	#tag EndProperty


	#tag Property, Flags = &h0
		media As OpenAPIClient.Models.SummaryPinMedia
	#tag EndProperty


	#tag Property, Flags = &h0
		media_source As OpenAPIClient.Models.PinMediaSource
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The source pin id if this pin was saved from another pin. <a href="https://help.pinterest.com/article/save-pins-on-pinterest">Learn more</a>.
		#tag EndNote
		parent_pin_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Private note for this Pin. <a href="https://help.pinterest.com/en/article/add-notes-to-your-pins">Learn more</a>.
		#tag EndNote
		note As Xoson.O.OptionalString
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
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
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
			Name="title"
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
			Name="board_owner"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BoardOwner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SummaryPinMedia"
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
			Name="note"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


