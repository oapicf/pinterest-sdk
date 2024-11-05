#tag Class
Protected Class InviteAssetsSummary

	#tag Property, Flags = &h0
		#tag Note
			List of ad account IDs and respective permission levels that will be assigned.
		#tag EndNote
		ad_accounts() As OpenAPIClient.Models.InviteAssetsSummaryAdAccountsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of profile IDs and respective permission levels that will be assigned.
		#tag EndNote
		profiles() As OpenAPIClient.Models.InviteAssetsSummaryProfilesInner
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
			Name="ad_accounts"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InviteAssetsSummaryAdAccountsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="profiles"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InviteAssetsSummaryProfilesInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


