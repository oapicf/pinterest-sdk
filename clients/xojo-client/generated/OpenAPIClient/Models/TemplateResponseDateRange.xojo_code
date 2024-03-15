#tag Class
Protected Class TemplateResponseDateRange

	#tag Property, Flags = &h0
		dynamic_date_range As OpenAPIClient.Models.TemplateResponseDateRangeDynamicDateRange
	#tag EndProperty


	#tag Property, Flags = &h0
		relative_date_range As OpenAPIClient.Models.TemplateResponseDateRangeRelativeDateRange
	#tag EndProperty


	#tag Property, Flags = &h0
		absolute_date_range As OpenAPIClient.Models.TemplateResponseDateRangeAbsoluteDateRange
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
			Name="dynamic_date_range"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TemplateResponseDateRangeDynamicDateRange"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="relative_date_range"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TemplateResponseDateRangeRelativeDateRange"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="absolute_date_range"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TemplateResponseDateRangeAbsoluteDateRange"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


