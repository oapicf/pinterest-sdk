#tag Class
Protected Class MediaUpload

	#tag Property, Flags = &h0
		#tag Note
			Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
		#tag EndNote
		media_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		media_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The URL where you will POST your media file.
		#tag EndNote
		upload_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		upload_parameters As OpenAPIClient.Models.MediaUploadAllOfUploadParameters
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
			Name="media_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MediaUploadType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="upload_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="upload_parameters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MediaUploadAllOfUploadParameters"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


