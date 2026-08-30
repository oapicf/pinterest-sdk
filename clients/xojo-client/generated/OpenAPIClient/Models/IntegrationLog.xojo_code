#tag Class
Protected Class IntegrationLog

	#tag Property, Flags = &h0
		advertiser_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Version number of the integration application.
		#tag EndNote
		app_version_number As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Timestamp in milliseconds of when the log was executed at the client.
		#tag EndNote
		client_timestamp As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		error As OpenAPIClient.Models.IntegrationLogClientError
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Log event type
		#tag EndNote
		event_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		external_business_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		feed_profile_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Log level type
		#tag EndNote
		log_level As String
	#tag EndProperty


	#tag Property, Flags = &h0
		merchant_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Explanation of the event that occured.
		#tag EndNote
		message As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Version number of the platform the integration application is running on.
		#tag EndNote
		platform_version_number As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		request As OpenAPIClient.Models.IntegrationLogClientRequest
	#tag EndProperty


	#tag Property, Flags = &h0
		tag_id As Xoson.O.OptionalString
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
			Name="advertiser_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="app_version_number"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="client_timestamp"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="error"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="IntegrationLogClientError"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="event_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="IntegrationLogEventType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="external_business_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="feed_profile_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="log_level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="IntegrationLogLevel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="merchant_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="message"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="platform_version_number"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="request"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="IntegrationLogClientRequest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tag_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


