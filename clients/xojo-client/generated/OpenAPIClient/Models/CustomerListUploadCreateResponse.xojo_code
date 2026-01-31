#tag Class
Protected Class CustomerListUploadCreateResponse

	#tag Property, Flags = &h0
		customer_list_upload As OpenAPIClient.Models.CustomerListUpload
	#tag EndProperty


	#tag Property, Flags = &h0
		s3_multipart_upload_data As OpenAPIClient.Models.S3MultipartUploadData
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
			Name="customer_list_upload"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CustomerListUpload"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="s3_multipart_upload_data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="S3MultipartUploadData"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


