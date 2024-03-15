#tag Class
Protected Class AudienceRule

	#tag Property, Flags = &h0
		#tag Note
			Valid countries include: "US", "CA", and "GB".
		#tag EndNote
		country As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Customer list ID. For CUSTOMER_LIST `audience_type`.
		#tag EndNote
		customer_list_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
		#tag EndNote
		engagement_domain() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
		#tag EndNote
		engagement_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
		#tag EndNote
		Escapedevent As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		event_data As OpenAPIClient.Models.PinterestTagEventData
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
		#tag EndNote
		percentage As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, "pin_id:": ["34567"]
		#tag EndNote
		pin_id() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
		#tag EndNote
		prefill As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
		#tag EndNote
		retention_days As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Audience ID(s). For ACTALIKE `audience_type`. 
		#tag EndNote
		seed_id() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  "url": "http://www.myonlinestore123.com/view_item/shoe"<br>Example 2: "url": {"contains": "/view_item/shoe"}
		#tag EndNote
		url() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
		#tag EndNote
		visitor_source_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
		#tag EndNote
		event_source As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
		#tag EndNote
		ingestion_source As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Optional for ENGAGEMENT. Engager type value should be 1-2.
		#tag EndNote
		engager_type As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Campaign ID for engagement audience filter.
		#tag EndNote
		campaign_id() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad ID for engagement audience filter.
		#tag EndNote
		ad_id() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Objective for engagement audience filter.
		#tag EndNote
		objective_type() As ObjectiveType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad account ID.
		#tag EndNote
		ad_account_id As Xoson.O.OptionalString
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
			Name="country"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="customer_list_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="engagement_domain"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="engagement_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedevent"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="event_data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PinterestTagEventData"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="percentage"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pin_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="prefill"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="retention_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="seed_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="visitor_source_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="event_source"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ingestion_source"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="engager_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaign_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="objective_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ObjectiveType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_account_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


