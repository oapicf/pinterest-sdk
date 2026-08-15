//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/custom_label3_filter.dart';
import 'package:openapi/src/model/google_product_category0_filter.dart';
import 'package:openapi/src/model/custom_label2_filter.dart';
import 'package:openapi/src/model/custom_label4_filter.dart';
import 'package:openapi/src/model/custom_label1_filter.dart';
import 'package:openapi/src/model/google_product_category2_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_media_types_criteria.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:openapi/src/model/google_product_category3_filter.dart';
import 'package:openapi/src/model/media_type_filter.dart';
import 'package:openapi/src/model/custom_label0_filter.dart';
import 'package:openapi/src/model/google_product_category1_filter.dart';
import 'package:openapi/src/model/creative_assets_id_filter.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:openapi/src/model/title_keywords_filter.dart';
import 'package:openapi/src/model/google_product_category6_filter.dart';
import 'package:openapi/src/model/google_product_category4_filter.dart';
import 'package:openapi/src/model/google_product_category5_filter.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_creative_assets_product_group_filter_keys.g.dart';

/// CatalogsCreativeAssetsProductGroupFilterKeys
///
/// Properties:
/// * [CREATIVE_ASSETS_ID] 
/// * [cUSTOMLABEL0] 
/// * [cUSTOMLABEL1] 
/// * [cUSTOMLABEL2] 
/// * [cUSTOMLABEL3] 
/// * [cUSTOMLABEL4] 
/// * [gOOGLEPRODUCTCATEGORY6] 
/// * [gOOGLEPRODUCTCATEGORY5] 
/// * [gOOGLEPRODUCTCATEGORY4] 
/// * [gOOGLEPRODUCTCATEGORY3] 
/// * [gOOGLEPRODUCTCATEGORY2] 
/// * [gOOGLEPRODUCTCATEGORY1] 
/// * [gOOGLEPRODUCTCATEGORY0] 
/// * [MEDIA_TYPE] 
/// * [TITLE_KEYWORDS] 
@BuiltValue()
abstract class CatalogsCreativeAssetsProductGroupFilterKeys implements Built<CatalogsCreativeAssetsProductGroupFilterKeys, CatalogsCreativeAssetsProductGroupFilterKeysBuilder> {
  /// Any Of [CreativeAssetsIdFilter], [CustomLabel0Filter], [CustomLabel1Filter], [CustomLabel2Filter], [CustomLabel3Filter], [CustomLabel4Filter], [GoogleProductCategory0Filter], [GoogleProductCategory1Filter], [GoogleProductCategory2Filter], [GoogleProductCategory3Filter], [GoogleProductCategory4Filter], [GoogleProductCategory5Filter], [GoogleProductCategory6Filter], [MediaTypeFilter], [TitleKeywordsFilter]
  AnyOf get anyOf;

  CatalogsCreativeAssetsProductGroupFilterKeys._();

  factory CatalogsCreativeAssetsProductGroupFilterKeys([void updates(CatalogsCreativeAssetsProductGroupFilterKeysBuilder b)]) = _$CatalogsCreativeAssetsProductGroupFilterKeys;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductGroupFilterKeysBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProductGroupFilterKeys> get serializer => _$CatalogsCreativeAssetsProductGroupFilterKeysSerializer();
}

class _$CatalogsCreativeAssetsProductGroupFilterKeysSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProductGroupFilterKeys> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProductGroupFilterKeys, _$CatalogsCreativeAssetsProductGroupFilterKeys];

  @override
  final String wireName = r'CatalogsCreativeAssetsProductGroupFilterKeys';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupFilterKeys object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupFilterKeys object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsCreativeAssetsProductGroupFilterKeys deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductGroupFilterKeysBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(CreativeAssetsIdFilter), FullType(CustomLabel0Filter), FullType(CustomLabel1Filter), FullType(CustomLabel2Filter), FullType(CustomLabel3Filter), FullType(CustomLabel4Filter), FullType(GoogleProductCategory6Filter), FullType(GoogleProductCategory5Filter), FullType(GoogleProductCategory4Filter), FullType(GoogleProductCategory3Filter), FullType(GoogleProductCategory2Filter), FullType(GoogleProductCategory1Filter), FullType(GoogleProductCategory0Filter), FullType(MediaTypeFilter), FullType(TitleKeywordsFilter), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

