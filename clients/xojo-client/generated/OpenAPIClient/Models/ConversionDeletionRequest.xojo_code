#tag Class
Protected Class ConversionDeletionRequest

	#tag Property, Flags = &h0
		#tag Note
			Timestamp when the conversion deletion request was succesfully created.
		#tag EndNote
		created_time As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Timestamp when the conversion deletion request was processed.
		#tag EndNote
		processed_time As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the conversion deletion request
		#tag EndNote
		request_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Represents the status of the conversion deletion request. "PENDING" or "SUBMITTED". "PENDING" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. "SUBMITTED" meaning that the Data Deletion process has begun and can no longer be canceled.
		#tag EndNote
		status As String
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
			Name="created_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="processed_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="request_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionDeletionRequestStatus"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


