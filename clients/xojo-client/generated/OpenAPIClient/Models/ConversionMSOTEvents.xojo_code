#tag Class
Protected Class ConversionMSOTEvents

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
		attribution_scope As String
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
		currency As OpenAPIClient.Models.Currency
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
			Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
		#tag EndNote
		total_events As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
		#tag EndNote
		value As Xoson.O.OptionalDouble
	#tag EndProperty


    #tag Enum, Name = Attribution_modelEnum, Type = Integer, Flags = &h0
        
        FirstTouch
        LastTouch
        MultiTouch
        
    #tag EndEnum

    #tag Enum, Name = Attribution_scopeEnum, Type = Integer, Flags = &h0
        
        View
        Engagement
        Click
        
    #tag EndEnum

    #tag Enum, Name = Event_nameEnum, Type = Integer, Flags = &h0
        
        AddToCart
        Checkout
        Lead
        Signup
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Attribution_modelEnumToString(value As Attribution_modelEnum) As String
		  Select Case value
		    
		    Case Attribution_modelEnum.FirstTouch
		      Return "first_touch"
		    Case Attribution_modelEnum.LastTouch
		      Return "last_touch"
		    Case Attribution_modelEnum.MultiTouch
		      Return "multi_touch"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Attribution_scopeEnumToString(value As Attribution_scopeEnum) As String
		  Select Case value
		    
		    Case Attribution_scopeEnum.View
		      Return "view"
		    Case Attribution_scopeEnum.Engagement
		      Return "engagement"
		    Case Attribution_scopeEnum.Click
		      Return "click"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Event_nameEnumToString(value As Event_nameEnum) As String
		  Select Case value
		    
		    Case Event_nameEnum.AddToCart
		      Return "add_to_cart"
		    Case Event_nameEnum.Checkout
		      Return "checkout"
		    Case Event_nameEnum.Lead
		      Return "lead"
		    Case Event_nameEnum.Signup
		      Return "signup"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


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
			Name="value"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


