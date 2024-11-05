#tag Class
Protected Class BusinessMemberAssetsSummary

	#tag Property, Flags = &h0
		#tag Note
			List of ad account IDs and respective permission levels.
		#tag EndNote
		ad_accounts() As OpenAPIClient.Models.BusinessMemberAssetsSummaryAdAccountsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of profile IDs and respective permission levels.
		#tag EndNote
		profiles() As OpenAPIClient.Models.BusinessMemberAssetsSummaryProfilesInner
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
			Type="BusinessMemberAssetsSummaryAdAccountsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="profiles"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessMemberAssetsSummaryProfilesInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


