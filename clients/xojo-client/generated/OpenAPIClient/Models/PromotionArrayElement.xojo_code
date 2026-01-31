#tag Class
Protected Class PromotionArrayElement

	#tag Property, Flags = &h0
		data As OpenAPIClient.Models.PromotionResponse
	#tag EndProperty


	#tag Property, Flags = &h0
		Escapedexception As OpenAPIClient.Models.ModelException
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
			Name="data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromotionResponse"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedexception"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ModelException"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


