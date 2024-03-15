#tag Class
Protected Class KeywordUpdateBody

	#tag Property, Flags = &h0
		#tag Note
			Keywords to update. Object array. Each object has 3 possible fields:<br>1. "id": (required) keyword ID<br>2. "archived": boolean. Should keyword be archived?<br>3. "bid": number<br>For example: [{"id":"2886610576653", "archived": false, "bid": 20000}, {"id":"2886610576654",  "archived": true, "bid": 20000}, ...]
		#tag EndNote
		keywords() As OpenAPIClient.Models.KeywordUpdate
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
			Name="keywords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="KeywordUpdate"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


