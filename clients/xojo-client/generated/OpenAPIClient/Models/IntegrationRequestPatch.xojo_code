#tag Class
Protected Class IntegrationRequestPatch

	#tag Property, Flags = &h0
		connected_merchant_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		connected_advertiser_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		connected_lba_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		connected_tag_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		partner_access_token As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		partner_refresh_token As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		partner_primary_email As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		partner_access_token_expiry As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		partner_refresh_token_expiry As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		scopes As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		additional_id_1 As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		partner_metadata As Xoson.O.OptionalString
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
			Name="connected_merchant_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="connected_advertiser_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="connected_lba_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="connected_tag_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partner_access_token"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partner_refresh_token"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partner_primary_email"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partner_access_token_expiry"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partner_refresh_token_expiry"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="scopes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="additional_id_1"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partner_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


