#tag Class
Protected Class AdAccountCreateSubscriptionRequest

	#tag Property, Flags = &h0
		#tag Note
			Standard HTTPS webhook URL.
		#tag EndNote
		webhook_url As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lead form ID.
		#tag EndNote
		lead_form_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
		#tag EndNote
		partner_access_token As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
		#tag EndNote
		partner_refresh_token As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		partner_metadata As OpenAPIClient.Models.AdAccountCreateSubscriptionRequestPartnerMetadata
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
			Name="webhook_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lead_form_id"
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
			Name="partner_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdAccountCreateSubscriptionRequestPartnerMetadata"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


