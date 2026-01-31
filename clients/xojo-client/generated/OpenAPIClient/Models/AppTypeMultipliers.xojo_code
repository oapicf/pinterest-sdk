#tag Class
Protected Class AppTypeMultipliers

	#tag Property, Flags = &h0
		APP_TYPE As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = APP_TYPEEnum, Type = Integer, Flags = &h0
        
        AndroidMobile
        AndroidTablet
        Ipad
        Iphone
        Web
        WebMobile
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function APP_TYPEEnumToString(value As APP_TYPEEnum) As String
		  Select Case value
		    
		    Case APP_TYPEEnum.AndroidMobile
		      Return "android_mobile"
		    Case APP_TYPEEnum.AndroidTablet
		      Return "android_tablet"
		    Case APP_TYPEEnum.Ipad
		      Return "ipad"
		    Case APP_TYPEEnum.Iphone
		      Return "iphone"
		    Case APP_TYPEEnum.Web
		      Return "web"
		    Case APP_TYPEEnum.WebMobile
		      Return "web_mobile"
		    
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
	#tag EndViewBehavior
End Class
#tag EndClass


