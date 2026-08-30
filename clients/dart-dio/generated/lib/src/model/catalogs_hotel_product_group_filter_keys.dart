//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/custom_label3_filter.dart';
import 'package:openapi/src/model/country_filter.dart';
import 'package:openapi/src/model/custom_label2_filter.dart';
import 'package:openapi/src/model/custom_label4_filter.dart';
import 'package:openapi/src/model/price_filter_price.dart';
import 'package:openapi/src/model/custom_label1_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:openapi/src/model/custom_label0_filter.dart';
import 'package:openapi/src/model/price_filter.dart';
import 'package:openapi/src/model/brand_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:openapi/src/model/title_keywords_filter.dart';
import 'package:openapi/src/model/hotel_id_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_countries_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_hotel_product_group_filter_keys.g.dart';

/// CatalogsHotelProductGroupFilterKeys
///
/// Properties:
/// * [PRICE] 
/// * [HOTEL_ID] 
/// * [BRAND] 
/// * [CUSTOM_LABEL_0] 
/// * [CUSTOM_LABEL_1] 
/// * [CUSTOM_LABEL_2] 
/// * [CUSTOM_LABEL_3] 
/// * [CUSTOM_LABEL_4] 
/// * [COUNTRY] 
/// * [TITLE_KEYWORDS] 
@BuiltValue()
abstract class CatalogsHotelProductGroupFilterKeys implements Built<CatalogsHotelProductGroupFilterKeys, CatalogsHotelProductGroupFilterKeysBuilder> {
  /// Any Of [BrandFilter], [CountryFilter], [CustomLabel0Filter], [CustomLabel1Filter], [CustomLabel2Filter], [CustomLabel3Filter], [CustomLabel4Filter], [HotelIdFilter], [PriceFilter], [TitleKeywordsFilter]
  AnyOf get anyOf;

  CatalogsHotelProductGroupFilterKeys._();

  factory CatalogsHotelProductGroupFilterKeys([void updates(CatalogsHotelProductGroupFilterKeysBuilder b)]) = _$CatalogsHotelProductGroupFilterKeys;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductGroupFilterKeysBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProductGroupFilterKeys> get serializer => _$CatalogsHotelProductGroupFilterKeysSerializer();
}

class _$CatalogsHotelProductGroupFilterKeysSerializer implements PrimitiveSerializer<CatalogsHotelProductGroupFilterKeys> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProductGroupFilterKeys, _$CatalogsHotelProductGroupFilterKeys];

  @override
  final String wireName = r'CatalogsHotelProductGroupFilterKeys';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProductGroupFilterKeys object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelProductGroupFilterKeys object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsHotelProductGroupFilterKeys deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductGroupFilterKeysBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(PriceFilter), FullType(HotelIdFilter), FullType(BrandFilter), FullType(CustomLabel0Filter), FullType(CustomLabel1Filter), FullType(CustomLabel2Filter), FullType(CustomLabel3Filter), FullType(CustomLabel4Filter), FullType(CountryFilter), FullType(TitleKeywordsFilter), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

