#tag Class
Protected Class QualityComponents

	#tag Property, Flags = &h0
		advertiser_external_id As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		click_id_epik As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Dedup components.
		#tag EndNote
		external_event_id As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			User matching identifiers.
		#tag EndNote
		hashed_email As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		hashed_maid As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		ip_address As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		order_id As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		order_value As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Product/event metadata.
		#tag EndNote
		product_id As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		source_url As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		user_agent As Dictionary
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
			Name="advertiser_external_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="click_id_epik"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="external_event_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hashed_email"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hashed_maid"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ip_address"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="order_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="order_value"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="source_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_agent"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


