#tag Class
Protected Class ConversionTagConfigs

	#tag Property, Flags = &h0
		#tag Note
			Whether Automatic Enhanced Match email is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
		#tag EndNote
		aem_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metadata ingestion frequency.
		#tag EndNote
		md_frequency As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether Automatic Enhanced Match name is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
		#tag EndNote
		aem_fnln_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether Automatic Enhanced Match phone is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
		#tag EndNote
		aem_ph_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether Automatic Enhanced Match gender is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
		#tag EndNote
		aem_ge_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether Automatic Enhanced Match birthdate is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
		#tag EndNote
		aem_db_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether Automatic Enhanced Match location is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
		#tag EndNote
		aem_loc_enabled As Xoson.O.OptionalBoolean
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
			Name="aem_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="md_frequency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="aem_fnln_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="aem_ph_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="aem_ge_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="aem_db_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="aem_loc_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


