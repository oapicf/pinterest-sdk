#tag Class
Protected Class OptimizationGoalMetadataConversionTagV3GoalMetadata

	#tag Property, Flags = &h0
		attribution_windows As OpenAPIClient.Models.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
	#tag EndProperty


	#tag Property, Flags = &h0
		conversion_event As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		conversion_tag_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		cpa_goal_value_in_micro_currency As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group is ROAS optimized
		#tag EndNote
		is_roas_optimized As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Conversion learning model type
		#tag EndNote
		learning_mode_type As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Conversion_eventEnum, Type = Integer, Flags = &h0
        
        PageVisit
        Signup
        Checkout
        Custom
        ViewCategory
        Search
        AddToCart
        WatchVideo
        Lead
        AppInstall
        
    #tag EndEnum

    #tag Enum, Name = Learning_mode_typeEnum, Type = Integer, Flags = &h0
        
        NotActive
        Active
        Null
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Conversion_eventEnumToString(value As Conversion_eventEnum) As String
		  Select Case value
		    
		    Case Conversion_eventEnum.PageVisit
		      Return "PAGE_VISIT"
		    Case Conversion_eventEnum.Signup
		      Return "SIGNUP"
		    Case Conversion_eventEnum.Checkout
		      Return "CHECKOUT"
		    Case Conversion_eventEnum.Custom
		      Return "CUSTOM"
		    Case Conversion_eventEnum.ViewCategory
		      Return "VIEW_CATEGORY"
		    Case Conversion_eventEnum.Search
		      Return "SEARCH"
		    Case Conversion_eventEnum.AddToCart
		      Return "ADD_TO_CART"
		    Case Conversion_eventEnum.WatchVideo
		      Return "WATCH_VIDEO"
		    Case Conversion_eventEnum.Lead
		      Return "LEAD"
		    Case Conversion_eventEnum.AppInstall
		      Return "APP_INSTALL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Learning_mode_typeEnumToString(value As Learning_mode_typeEnum) As String
		  Select Case value
		    
		    Case Learning_mode_typeEnum.NotActive
		      Return "NOT_ACTIVE"
		    Case Learning_mode_typeEnum.Active
		      Return "ACTIVE"
		    Case Learning_mode_typeEnum.Null
		      Return "null"
		    
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
			Name="attribution_windows"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="conversion_tag_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cpa_goal_value_in_micro_currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_roas_optimized"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


