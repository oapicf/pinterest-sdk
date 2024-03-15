#tag Class
Protected Class PinMediaWithImages
Inherits CodegenModel{name='PinMedia', schemaName='PinMedia', parent='null', parentSchema='null', interfaces=null, interfaceModels=[], allParents=null, parentModel=null, children=6, anyOf=[], oneOf=[], allOf=[], classname='PinMedia', title='Pin media', description='Pin media objects.', classVarName='PinMedia', modelJson='{
  "title" : "Pin media",
  "type" : "object",
  "properties" : {
    "media_type" : {
      "type" : "string"
    }
  },
  "description" : "Pin media objects.",
  "discriminator" : {
    "propertyName" : "media_type",
    "mapping" : {
      "image" : "#/components/schemas/PinMediaWithImage",
      "video" : "#/components/schemas/PinMediaWithVideo",
      "multiple_images" : "#/components/schemas/PinMediaWithImages",
      "multiple_videos" : "#/components/schemas/PinMediaWithVideos",
      "multiple_mixed" : "#/components/schemas/PinMediaWithImageAndVideo"
    }
  }
}', dataType='Object', xmlPrefix='null', xmlNamespace='null', xmlName='null', classFilename='PinMedia', unescapedDescription='Pin media objects.', discriminator=CodegenDiscriminator{propertyName='media_type', propertyBaseName='media_type', mapping={image=#/components/schemas/PinMediaWithImage, video=#/components/schemas/PinMediaWithVideo, multiple_images=#/components/schemas/PinMediaWithImages, multiple_videos=#/components/schemas/PinMediaWithVideos, multiple_mixed=#/components/schemas/PinMediaWithImageAndVideo}, mappedModels=[org.openapitools.codegen.CodegenDiscriminator$MappedModel@68983f4c, org.openapitools.codegen.CodegenDiscriminator$MappedModel@8a3884c7, org.openapitools.codegen.CodegenDiscriminator$MappedModel@7195ccbf, org.openapitools.codegen.CodegenDiscriminator$MappedModel@4937a0c7, org.openapitools.codegen.CodegenDiscriminator$MappedModel@7f45a34c], vendorExtensions={}}, defaultValue='null', arrayModelType='null', isAlias=false, isString=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isBoolean=false, isNumber=false, isNumeric=false, isFloat=false, isDouble=false, isDate=false, isDateTime=false, vars=[CodegenProperty{openApiType='string', baseName='media_type', complexType='null', getter='getMediaType', setter='setMediaType', description='null', dataType='String', datatypeWithEnum='String', dataFormat='null', name='media_type', min='null', max='null', defaultValue='Sample', defaultValueWithParam=' = data.media_type;', baseType='String', containerType='null', containerTypeMapped='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='Sample', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=true, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='MediaType', nameInSnakeCase='MEDIA_TYPE', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=null, dependentRequired=null, contains=null}], allVars=[CodegenProperty{openApiType='string', baseName='media_type', complexType='null', getter='getMediaType', setter='setMediaType', description='null', dataType='String', datatypeWithEnum='String', dataFormat='null', name='media_type', min='null', max='null', defaultValue='Sample', defaultValueWithParam=' = data.media_type;', baseType='String', containerType='null', containerTypeMapped='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='Sample', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=true, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='MediaType', nameInSnakeCase='MEDIA_TYPE', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=null, dependentRequired=null, contains=null}], nonNullableVars=[CodegenProperty{openApiType='string', baseName='media_type', complexType='null', getter='getMediaType', setter='setMediaType', description='null', dataType='String', datatypeWithEnum='String', dataFormat='null', name='media_type', min='null', max='null', defaultValue='Sample', defaultValueWithParam=' = data.media_type;', baseType='String', containerType='null', containerTypeMapped='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='Sample', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='MediaType', nameInSnakeCase='MEDIA_TYPE', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=null, dependentRequired=null, contains=null}], requiredVars=[], optionalVars=[CodegenProperty{openApiType='string', baseName='media_type', complexType='null', getter='getMediaType', setter='setMediaType', description='null', dataType='String', datatypeWithEnum='String', dataFormat='null', name='media_type', min='null', max='null', defaultValue='Sample', defaultValueWithParam=' = data.media_type;', baseType='String', containerType='null', containerTypeMapped='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='Sample', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='MediaType', nameInSnakeCase='MEDIA_TYPE', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=null, dependentRequired=null, contains=null}], readOnlyVars=[], readWriteVars=[CodegenProperty{openApiType='string', baseName='media_type', complexType='null', getter='getMediaType', setter='setMediaType', description='null', dataType='String', datatypeWithEnum='String', dataFormat='null', name='media_type', min='null', max='null', defaultValue='Sample', defaultValueWithParam=' = data.media_type;', baseType='String', containerType='null', containerTypeMapped='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='Sample', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='MediaType', nameInSnakeCase='MEDIA_TYPE', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=null, dependentRequired=null, contains=null}], parentVars=[], allowableValues=null, mandatory=[], allMandatory=[], imports=[], hasVars=true, emptyVars=false, hasMoreModels=false, hasEnums=false, isEnum=false, isNullable=false, hasRequired=false, hasOptional=true, isArray=false, hasChildren=true, isMap=false, isDeprecated=false, hasReadOnly=false, hasOnlyReadOnly=false, externalDocumentation=null, vendorExtensions={x-xojo-project-id=00000000019C1AFF}, additionalPropertiesType='null', isAdditionalPropertiesTrue='false', maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, maxItems=null, minItems=null, maxLength=null, minLength=null, exclusiveMinimum=false, exclusiveMaximum=false, minimum='null', maximum='null', pattern='null', multipleOf='null', items='null', additionalProperties='null', isModel='true', isNull='false, hasValidation='false, getAdditionalPropertiesIsAnyType=false, getHasDiscriminatorWithNonEmptyMapping=true, getIsAnyType=false, composedSchemas=null, hasMultipleTypes=false, isDecimal=false, isUUID=false, isURI=false, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=null, dependentRequired=null, contains=null}
	#tag Property, Flags = &h0
		media_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		items() As OpenAPIClient.Models.ImageMetadata
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
			Name="media_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ImageMetadata"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


