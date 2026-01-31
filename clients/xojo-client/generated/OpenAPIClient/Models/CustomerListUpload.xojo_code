#tag Class
Protected Class CustomerListUpload

	#tag Property, Flags = &h0
		#tag Note
			Advertiser ID.
		#tag EndNote
		ad_account_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Customer List Upload creation_time. Epoch (seconds).
		#tag EndNote
		creation_time As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the customer list associated with this upload.
		#tag EndNote
		customer_list_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Error counts by error code
		#tag EndNote
		error_counts() As OpenAPIClient.Models.ErrorDetail
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Customer List Upload ID.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		operation As String
	#tag EndProperty


	#tag Property, Flags = &h0
		record_counts As OpenAPIClient.Models.RecordCounts
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Workload processing state
		#tag EndNote
		state As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Customer List Upload updated_time. Epoch (seconds).
		#tag EndNote
		updated_time As Integer
	#tag EndProperty


    #tag Enum, Name = StateEnum, Type = Integer, Flags = &h0
        
        NotStarted
        Running
        Paused
        Succeeded
        Failed
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function StateEnumToString(value As StateEnum) As String
		  Select Case value
		    
		    Case StateEnum.NotStarted
		      Return "NOT_STARTED"
		    Case StateEnum.Running
		      Return "RUNNING"
		    Case StateEnum.Paused
		      Return "PAUSED"
		    Case StateEnum.Succeeded
		      Return "SUCCEEDED"
		    Case StateEnum.Failed
		      Return "FAILED"
		    
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
			Name="ad_account_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="creation_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Name="error_counts"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ErrorDetail"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="operation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UserListOperationType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="record_counts"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RecordCounts"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updated_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


