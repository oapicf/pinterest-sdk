//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:openapi/src/model/product_group_reference_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_pricing_criteria.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_gender_criteria.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_media_types_criteria.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_pinterest_product_category_criteria.dart';
import 'package:openapi/src/model/catalogs_base_filter_keys.dart';
import 'package:openapi/src/model/catalogs_product_group_uint32_criteria.dart';
import 'package:openapi/src/model/catalogs_product_group_currency_criteria.dart';
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
/// * [CUSTOM_LABEL_0] 
/// * [CUSTOM_LABEL_1] 
/// * [CUSTOM_LABEL_2] 
/// * [CUSTOM_LABEL_3] 
/// * [CUSTOM_LABEL_4] 
/// * [ITEM_GROUP_ID] 
/// * [GENDER] 
/// * [MEDIA_TYPE] 
/// * [PRODUCT_TYPE_4] 
/// * [PRODUCT_TYPE_3] 
/// * [PRODUCT_TYPE_2] 
/// * [PRODUCT_TYPE_1] 
/// * [PRODUCT_TYPE_0] 
/// * [GOOGLE_PRODUCT_CATEGORY_6] 
/// * [GOOGLE_PRODUCT_CATEGORY_5] 
/// * [GOOGLE_PRODUCT_CATEGORY_4] 
/// * [GOOGLE_PRODUCT_CATEGORY_3] 
/// * [GOOGLE_PRODUCT_CATEGORY_2] 
/// * [GOOGLE_PRODUCT_CATEGORY_1] 
/// * [GOOGLE_PRODUCT_CATEGORY_0] 
/// * [CUSTOM_NUMBER_0] 
/// * [CUSTOM_NUMBER_1] 
/// * [CUSTOM_NUMBER_2] 
/// * [CUSTOM_NUMBER_3] 
/// * [CUSTOM_NUMBER_4] 
/// * [TITLE_KEYWORDS] 
/// * [PINTEREST_PRODUCT_CATEGORIES] 
/// * [PRODUCT_GROUP] 
@BuiltValue()
abstract class CatalogsProductGroupFilterKeys implements Built<CatalogsProductGroupFilterKeys, CatalogsProductGroupFilterKeysBuilder> {
  /// Any Of [CatalogsBaseFilterKeys], [ProductGroupReferenceFilter]
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
    final targetType = const FullType(AnyOf, [FullType(CatalogsBaseFilterKeys), FullType(ProductGroupReferenceFilter), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

