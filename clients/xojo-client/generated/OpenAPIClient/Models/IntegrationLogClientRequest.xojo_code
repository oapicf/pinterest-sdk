#tag Class
Protected Class IntegrationLogClientRequest

	#tag Property, Flags = &h0
		method As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			HTTP request host from host header.
		#tag EndNote
		host As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			HTTP request path.
		#tag EndNote
		path As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			HTTP request headers as key-value pairs.
		#tag EndNote
		request_headers As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			HTTP response headers as key-value pairs.
		#tag EndNote
		response_headers As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		response_status_code As Xoson.O.OptionalInteger
	#tag EndProperty


    #tag Enum, Name = MethodEnum, Type = Integer, Flags = &h0
        
        Get
        Head
        Post
        Put
        Delete
        Connect
        Options
        Trace
        Patch
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function MethodEnumToString(value As MethodEnum) As String
		  Select Case value
		    
		    Case MethodEnum.Get
		      Return "GET"
		    Case MethodEnum.Head
		      Return "HEAD"
		    Case MethodEnum.Post
		      Return "POST"
		    Case MethodEnum.Put
		      Return "PUT"
		    Case MethodEnum.Delete
		      Return "DELETE"
		    Case MethodEnum.Connect
		      Return "CONNECT"
		    Case MethodEnum.Options
		      Return "OPTIONS"
		    Case MethodEnum.Trace
		      Return "TRACE"
		    Case MethodEnum.Patch
		      Return "PATCH"
		    
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
			Name="host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="path"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="request_headers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="response_headers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="response_status_code"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


