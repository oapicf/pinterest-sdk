#tag Class
Protected Class LocalInventoryItemsBatch

	#tag Property, Flags = &h0
		#tag Note
			Id of the batch operation
		#tag EndNote
		batch_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
		#tag EndNote
		completed_time As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
		#tag EndNote
		created_time As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of operation results
		#tag EndNote
		operation_results() As OpenAPIClient.Models.SupplementalOperationResult
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Status of the batch: PROCESSING, COMPLETED, FAILED
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
			Name="batch_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="completed_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
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
			Name="operation_results"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SupplementalOperationResult"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SupplementalItemBatchOperationStatus"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


