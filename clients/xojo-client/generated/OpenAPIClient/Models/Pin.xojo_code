#tag Class
Protected Class Pin

	#tag Property, Flags = &h0
		#tag Note
			AI disclosure declarations the creator has made about this Pin.
		#tag EndNote
		ai_disclosures As OpenAPIClient.Models.AiDisclosures
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The board to which this Pin belongs.
		#tag EndNote
		board_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		board_owner As OpenAPIClient.Models.BoardOwner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The board section to which this Pin belongs.
		#tag EndNote
		board_section_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		created_at As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		creative_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Dominant pin color. Hex number, e.g. `#6E7874`.
		#tag EndNote
		dominant_color As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether the Pin has been promoted or not.
		#tag EndNote
		has_been_promoted As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether the "operation user_account" is the Pin owner.
		#tag EndNote
		is_owner As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether the Pin is a product Pin.
		#tag EndNote
		is_product As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
		#tag EndNote
		is_standard As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		media As OpenAPIClient.Models.PinMedia
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
		#tag EndNote
		parent_pin_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin metrics with associated time intervals if any.
		#tag EndNote
		pin_metrics As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		alt_text As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		link As Xoson.O.OptionalString
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
			Name="board_id"
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
			Name="board_section_id"
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
			Name="creative_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreativeType"
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
			Name="has_been_promoted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
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
			Name="is_owner"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_product"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_standard"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PinMedia"
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
			Name="pin_metrics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
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
			Name="description"
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


