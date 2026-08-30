#tag Class
Protected Class ConversionMSOTEventsCreate

	#tag Property, Flags = &h0
		#tag Note
			Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
		#tag EndNote
		action_timestamps() As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the ad group that was attributed to the conversion event.
		#tag EndNote
		ad_group_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The attribution model used to attribute the conversion event.
		#tag EndNote
		attribution_model As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad event type.
		#tag EndNote
		attribution_scope As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
		#tag EndNote
		attribution_score As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the campaign that was attributed to the conversion event.
		#tag EndNote
		campaign_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
		#tag EndNote
		click_window As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
		#tag EndNote
		currency As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
		#tag EndNote
		event_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Type of user event.
		#tag EndNote
		event_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The time when the event occurred. Unix timestamp in seconds.
		#tag EndNote
		event_timestamp As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Total number of ad events including other non-Pinterest ad platforms.
		#tag EndNote
		total_event_touchpoints As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
		#tag EndNote
		Attributes( Deprecated ) total_events As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
		#tag EndNote
		total_events_fractional As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
		#tag EndNote
		value As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			View window used for attribution (for example, `1d`, `7d`, `30d`).
		#tag EndNote
		view_window As Xoson.O.OptionalString
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
			Name="action_timestamps"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_group_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="attribution_model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AttributionModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="attribution_scope"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AttributionScope"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="attribution_score"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
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
			Name="click_window"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Currency"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="event_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="event_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MsotEventName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="event_timestamp"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="total_event_touchpoints"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="total_events"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="total_events_fractional"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="value"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="view_window"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


