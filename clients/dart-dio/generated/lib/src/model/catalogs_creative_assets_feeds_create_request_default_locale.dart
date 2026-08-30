//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_locale.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_creative_assets_feeds_create_request_default_locale.g.dart';

/// The locale used within a feed for product descriptions.
@BuiltValue()
abstract class CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale implements Built<CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale, CatalogsCreativeAssetsFeedsCreateRequestDefaultLocaleBuilder> {
  /// Any Of [CatalogsLocale], [String]
  AnyOf get anyOf;

  CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale._();

  factory CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale([void updates(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocaleBuilder b)]) = _$CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocaleBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale> get serializer => _$CatalogsCreativeAssetsFeedsCreateRequestDefaultLocaleSerializer();
}

class _$CatalogsCreativeAssetsFeedsCreateRequestDefaultLocaleSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale, _$CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale];

  @override
  final String wireName = r'CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsFeedsCreateRequestDefaultLocaleBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(CatalogsLocale), FullType(String), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

