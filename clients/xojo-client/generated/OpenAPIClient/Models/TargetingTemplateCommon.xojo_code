#tag Class
Protected Class TargetingTemplateCommon

	#tag Property, Flags = &h0
		#tag Note
			targeting template name
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enable auto-targeting for ad group. Also known as <a href="https://help.pinterest.com/en/business/article/expanded-targeting" target="_blank">"expanded targeting"</a>.
		#tag EndNote
		auto_targeting_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		targeting_attributes As OpenAPIClient.Models.TargetingSpec
	#tag EndProperty


	#tag Property, Flags = &h0
		placement_group As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		keywords() As OpenAPIClient.Models.TargetingTemplateKeyword
	#tag EndProperty


	#tag Property, Flags = &h0
		tracking_urls As OpenAPIClient.Models.TrackingUrls
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="auto_targeting_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_attributes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpec"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementGroupType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="keywords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingTemplateKeyword"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tracking_urls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TrackingUrls"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


