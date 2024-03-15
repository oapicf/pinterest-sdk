#tag Class
Protected Class OrderLineResponse

	#tag Property, Flags = &h0
		#tag Note
			Error list if update(s) fail.
		#tag EndNote
		errors() As OrderLineError
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Order Line object array.
		#tag EndNote
		order_line() As OrderLine
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
			Name="errors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderLineError"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="order_line"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderLine"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


