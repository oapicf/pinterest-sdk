#tag Class
Protected Class ConversionEventDeviceInfo

	#tag Property, Flags = &h0
		#tag Note
			Battery charge level percentage
		#tag EndNote
		battery_level As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Device brand
		#tag EndNote
		brand As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			User device's mobile carrier.
		#tag EndNote
		carrier As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of CPU cores
		#tag EndNote
		cpu_cores As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			External storage size in GB
		#tag EndNote
		external_storage_free_space As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			External storage size in GB
		#tag EndNote
		external_storage_size As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Device form factor
		#tag EndNote
		form_factor As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
		#tag EndNote
		kernel_version As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of user installed languages. ISO 639-1 format
		#tag EndNote
		languages() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Device locale BCP-47 format
		#tag EndNote
		locale As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Device model name
		#tag EndNote
		model As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
		#tag EndNote
		network_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			OS Family
		#tag EndNote
		os_family As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
		#tag EndNote
		os_name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
		#tag EndNote
		os_release_name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
		#tag EndNote
		os_version As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Screen density, PPI
		#tag EndNote
		screen_density As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Screen height in pixels
		#tag EndNote
		screen_height As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Screen width in pixels
		#tag EndNote
		screen_width As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Internal storage size in GB
		#tag EndNote
		storage_free_space As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Internal storage size in GB
		#tag EndNote
		storage_size As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Device timezone
		#tag EndNote
		timezone As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Timezone abbreviation
		#tag EndNote
		timezone_abbr As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Device type
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Form_factorEnum, Type = Integer, Flags = &h0
        
        Desktop
        Laptop
        Cellphone
        Tablet
        Smartwatch
        Tv
        Vr
        Console
        Other
        
    #tag EndEnum

    #tag Enum, Name = Network_typeEnum, Type = Integer, Flags = &h0
        
        Wifi
        Cellular2g
        Cellular3g
        Cellular4g
        Cellular5g
        Cellular6g
        Ethernet
        Unknown
        
    #tag EndEnum

    #tag Enum, Name = Os_familyEnum, Type = Integer, Flags = &h0
        
        Ios
        Android
        Macos
        Windows
        Linux
        Bsd
        Other
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Form_factorEnumToString(value As Form_factorEnum) As String
		  Select Case value
		    
		    Case Form_factorEnum.Desktop
		      Return "desktop"
		    Case Form_factorEnum.Laptop
		      Return "laptop"
		    Case Form_factorEnum.Cellphone
		      Return "cellphone"
		    Case Form_factorEnum.Tablet
		      Return "tablet"
		    Case Form_factorEnum.Smartwatch
		      Return "smartwatch"
		    Case Form_factorEnum.Tv
		      Return "tv"
		    Case Form_factorEnum.Vr
		      Return "vr"
		    Case Form_factorEnum.Console
		      Return "console"
		    Case Form_factorEnum.Other
		      Return "other"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Network_typeEnumToString(value As Network_typeEnum) As String
		  Select Case value
		    
		    Case Network_typeEnum.Wifi
		      Return "wifi"
		    Case Network_typeEnum.Cellular2g
		      Return "cellular_2g"
		    Case Network_typeEnum.Cellular3g
		      Return "cellular_3g"
		    Case Network_typeEnum.Cellular4g
		      Return "cellular_4g"
		    Case Network_typeEnum.Cellular5g
		      Return "cellular_5g"
		    Case Network_typeEnum.Cellular6g
		      Return "cellular_6g"
		    Case Network_typeEnum.Ethernet
		      Return "ethernet"
		    Case Network_typeEnum.Unknown
		      Return "unknown"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Os_familyEnumToString(value As Os_familyEnum) As String
		  Select Case value
		    
		    Case Os_familyEnum.Ios
		      Return "ios"
		    Case Os_familyEnum.Android
		      Return "android"
		    Case Os_familyEnum.Macos
		      Return "macos"
		    Case Os_familyEnum.Windows
		      Return "windows"
		    Case Os_familyEnum.Linux
		      Return "linux"
		    Case Os_familyEnum.Bsd
		      Return "bsd"
		    Case Os_familyEnum.Other
		      Return "other"
		    
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
			Name="battery_level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="brand"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="carrier"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cpu_cores"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="external_storage_free_space"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="external_storage_size"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="kernel_version"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="languages"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="locale"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="os_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="os_release_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="os_version"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="screen_density"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="screen_height"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="screen_width"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="storage_free_space"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="storage_size"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="timezone"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="timezone_abbr"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


