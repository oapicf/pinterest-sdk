/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CatalogsProductGroupFilterKeys from './CatalogsProductGroupFilterKeys';

/**
 * The CatalogsProductGroupFiltersAllOf model module.
 * @module model/CatalogsProductGroupFiltersAllOf
 * @version 5.3.0
 */
class CatalogsProductGroupFiltersAllOf {
    /**
     * @member {Array.<CodegenProperty{openApiType='object', baseName='allOf', complexType='null', getter='getAllOf', setter='setAllOf', description='null', dataType='CatalogsProductGroupFilterKeys', datatypeWithEnum='CatalogsProductGroupFilterKeys', dataFormat='null', name='allOf', min='null', max='null', defaultValue='null', defaultValueWithParam=' = CatalogsProductGroupFilterKeys.constructFromObject(data['allOf']);', baseType='CatalogsProductGroupFilterKeys', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/CatalogsProductGroupFilterKeys"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=false, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=true, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='AllOf', nameInSnakeCase='ALL_OF', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false}>} all_of
     * @type {Array.<CodegenProperty{openApiType='object', baseName='allOf', complexType='null', getter='getAllOf', setter='setAllOf', description='null', dataType='CatalogsProductGroupFilterKeys', datatypeWithEnum='CatalogsProductGroupFilterKeys', dataFormat='null', name='allOf', min='null', max='null', defaultValue='null', defaultValueWithParam=' = CatalogsProductGroupFilterKeys.constructFromObject(data['allOf']);', baseType='CatalogsProductGroupFilterKeys', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/CatalogsProductGroupFilterKeys"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=false, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=true, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='AllOf', nameInSnakeCase='ALL_OF', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false}>}
     */
    all_of;

    

    /**
     * Constructs a new <code>CatalogsProductGroupFiltersAllOf</code>.
     * @alias module:model/CatalogsProductGroupFiltersAllOf
     */
    constructor() { 
        
        CatalogsProductGroupFiltersAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CatalogsProductGroupFiltersAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsProductGroupFiltersAllOf} obj Optional instance to populate.
     * @return {module:model/CatalogsProductGroupFiltersAllOf} The populated <code>CatalogsProductGroupFiltersAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsProductGroupFiltersAllOf();

            if (data.hasOwnProperty('all_of')) {
                obj['all_of'] = ApiClient.convertToType(data['all_of'], [CatalogsProductGroupFilterKeys]);
            }
        }
        return obj;
    }
}



export default CatalogsProductGroupFiltersAllOf;
