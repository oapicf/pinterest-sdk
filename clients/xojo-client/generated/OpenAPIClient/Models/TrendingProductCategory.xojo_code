#tag Class
Protected Class TrendingProductCategory

	#tag Property, Flags = &h0
		#tag Note
			Engagement type
		#tag EndNote
		engagement_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Month-over-month change percentage
		#tag EndNote
		pct_change_mom As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Relative volume percentage
		#tag EndNote
		percent_relative_volume As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Product Category Name
		#tag EndNote
		product_category As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Vertical name associated with the product category
		#tag EndNote
		verticals() As VerticalProductCategory
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
			Name="engagement_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductCategoriesEngagementType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pct_change_mom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="percent_relative_volume"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_category"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="verticals"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VerticalProductCategory"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


