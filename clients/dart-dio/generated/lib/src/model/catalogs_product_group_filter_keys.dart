//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/custom_label3_filter.dart';
import 'package:openapi/src/model/google_product_category0_filter.dart';
import 'package:openapi/src/model/custom_label2_filter.dart';
import 'package:openapi/src/model/custom_label4_filter.dart';
import 'package:openapi/src/model/product_group_reference_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_pricing_criteria.dart';
import 'package:openapi/src/model/custom_label1_filter.dart';
import 'package:openapi/src/model/google_product_category2_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:openapi/src/model/google_product_category3_filter.dart';
import 'package:openapi/src/model/custom_label0_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_currency_criteria.dart';
import 'package:openapi/src/model/google_product_category1_filter.dart';
import 'package:openapi/src/model/brand_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:openapi/src/model/custom_number4_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_gender_criteria.dart';
import 'package:openapi/src/model/condition_filter.dart';
import 'package:openapi/src/model/custom_number3_filter.dart';
import 'package:openapi/src/model/item_id_filter.dart';
import 'package:openapi/src/model/currency_filter.dart';
import 'package:openapi/src/model/product_type4_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_media_types_criteria.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:openapi/src/model/media_type_filter.dart';
import 'package:openapi/src/model/product_type2_filter.dart';
import 'package:openapi/src/model/max_price_filter.dart';
import 'package:openapi/src/model/custom_number0_filter.dart';
import 'package:openapi/src/model/custom_number2_filter.dart';
import 'package:openapi/src/model/gender_filter.dart';
import 'package:openapi/src/model/item_group_id_filter.dart';
import 'package:openapi/src/model/product_type3_filter.dart';
import 'package:openapi/src/model/custom_number1_filter.dart';
import 'package:openapi/src/model/availability_filter.dart';
import 'package:openapi/src/model/title_keywords_filter.dart';
import 'package:openapi/src/model/google_product_category6_filter.dart';
import 'package:openapi/src/model/product_type0_filter.dart';
import 'package:openapi/src/model/product_type1_filter.dart';
import 'package:openapi/src/model/google_product_category4_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_uint32_criteria.dart';
import 'package:openapi/src/model/google_product_category5_filter.dart';
import 'package:openapi/src/model/min_price_filter.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_product_group_filter_keys.g.dart';

/// CatalogsProductGroupFilterKeys
///
/// Properties:
/// * [MIN_PRICE] 
/// * [MAX_PRICE] 
/// * [CURRENCY] 
/// * [ITEM_ID] 
/// * [AVAILABILITY] 
/// * [BRAND] 
/// * [CONDITION] 
/// * [cUSTOMLABEL0] 
/// * [cUSTOMLABEL1] 
/// * [cUSTOMLABEL2] 
/// * [cUSTOMLABEL3] 
/// * [cUSTOMLABEL4] 
/// * [ITEM_GROUP_ID] 
/// * [GENDER] 
/// * [MEDIA_TYPE] 
/// * [pRODUCTTYPE4] 
/// * [pRODUCTTYPE3] 
/// * [pRODUCTTYPE2] 
/// * [pRODUCTTYPE1] 
/// * [pRODUCTTYPE0] 
/// * [gOOGLEPRODUCTCATEGORY6] 
/// * [gOOGLEPRODUCTCATEGORY5] 
/// * [gOOGLEPRODUCTCATEGORY4] 
/// * [gOOGLEPRODUCTCATEGORY3] 
/// * [gOOGLEPRODUCTCATEGORY2] 
/// * [gOOGLEPRODUCTCATEGORY1] 
/// * [gOOGLEPRODUCTCATEGORY0] 
/// * [PRODUCT_GROUP] 
/// * [cUSTOMNUMBER0] 
/// * [cUSTOMNUMBER1] 
/// * [cUSTOMNUMBER2] 
/// * [cUSTOMNUMBER3] 
/// * [cUSTOMNUMBER4] 
/// * [TITLE_KEYWORDS] 
@BuiltValue()
abstract class CatalogsProductGroupFilterKeys implements Built<CatalogsProductGroupFilterKeys, CatalogsProductGroupFilterKeysBuilder> {
  /// Any Of [AvailabilityFilter], [BrandFilter], [ConditionFilter], [CurrencyFilter], [CustomLabel0Filter], [CustomLabel1Filter], [CustomLabel2Filter], [CustomLabel3Filter], [CustomLabel4Filter], [CustomNumber0Filter], [CustomNumber1Filter], [CustomNumber2Filter], [CustomNumber3Filter], [CustomNumber4Filter], [GenderFilter], [GoogleProductCategory0Filter], [GoogleProductCategory1Filter], [GoogleProductCategory2Filter], [GoogleProductCategory3Filter], [GoogleProductCategory4Filter], [GoogleProductCategory5Filter], [GoogleProductCategory6Filter], [ItemGroupIdFilter], [ItemIdFilter], [MaxPriceFilter], [MediaTypeFilter], [MinPriceFilter], [ProductGroupReferenceFilter], [ProductType0Filter], [ProductType1Filter], [ProductType2Filter], [ProductType3Filter], [ProductType4Filter], [TitleKeywordsFilter]
  AnyOf get anyOf;

  CatalogsProductGroupFilterKeys._();

  factory CatalogsProductGroupFilterKeys([void updates(CatalogsProductGroupFilterKeysBuilder b)]) = _$CatalogsProductGroupFilterKeys;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupFilterKeysBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupFilterKeys> get serializer => _$CatalogsProductGroupFilterKeysSerializer();
}

class _$CatalogsProductGroupFilterKeysSerializer implements PrimitiveSerializer<CatalogsProductGroupFilterKeys> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupFilterKeys, _$CatalogsProductGroupFilterKeys];

  @override
  final String wireName = r'CatalogsProductGroupFilterKeys';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupFilterKeys object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupFilterKeys object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsProductGroupFilterKeys deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupFilterKeysBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(MinPriceFilter), FullType(MaxPriceFilter), FullType(CurrencyFilter), FullType(ItemIdFilter), FullType(AvailabilityFilter), FullType(BrandFilter), FullType(ConditionFilter), FullType(CustomLabel0Filter), FullType(CustomLabel1Filter), FullType(CustomLabel2Filter), FullType(CustomLabel3Filter), FullType(CustomLabel4Filter), FullType(ItemGroupIdFilter), FullType(GenderFilter), FullType(MediaTypeFilter), FullType(ProductType4Filter), FullType(ProductType3Filter), FullType(ProductType2Filter), FullType(ProductType1Filter), FullType(ProductType0Filter), FullType(GoogleProductCategory6Filter), FullType(GoogleProductCategory5Filter), FullType(GoogleProductCategory4Filter), FullType(GoogleProductCategory3Filter), FullType(GoogleProductCategory2Filter), FullType(GoogleProductCategory1Filter), FullType(GoogleProductCategory0Filter), FullType(ProductGroupReferenceFilter), FullType(CustomNumber0Filter), FullType(CustomNumber1Filter), FullType(CustomNumber2Filter), FullType(CustomNumber3Filter), FullType(CustomNumber4Filter), FullType(TitleKeywordsFilter), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

