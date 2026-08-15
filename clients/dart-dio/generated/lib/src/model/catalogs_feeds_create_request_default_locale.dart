//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_locale.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_feeds_create_request_default_locale.g.dart';

/// The locale used within a feed for product descriptions.
@BuiltValue()
abstract class CatalogsFeedsCreateRequestDefaultLocale implements Built<CatalogsFeedsCreateRequestDefaultLocale, CatalogsFeedsCreateRequestDefaultLocaleBuilder> {
  /// Any Of [CatalogsLocale], [String]
  AnyOf get anyOf;

  CatalogsFeedsCreateRequestDefaultLocale._();

  factory CatalogsFeedsCreateRequestDefaultLocale([void updates(CatalogsFeedsCreateRequestDefaultLocaleBuilder b)]) = _$CatalogsFeedsCreateRequestDefaultLocale;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedsCreateRequestDefaultLocaleBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedsCreateRequestDefaultLocale> get serializer => _$CatalogsFeedsCreateRequestDefaultLocaleSerializer();
}

class _$CatalogsFeedsCreateRequestDefaultLocaleSerializer implements PrimitiveSerializer<CatalogsFeedsCreateRequestDefaultLocale> {
  @override
  final Iterable<Type> types = const [CatalogsFeedsCreateRequestDefaultLocale, _$CatalogsFeedsCreateRequestDefaultLocale];

  @override
  final String wireName = r'CatalogsFeedsCreateRequestDefaultLocale';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedsCreateRequestDefaultLocale object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedsCreateRequestDefaultLocale object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsFeedsCreateRequestDefaultLocale deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedsCreateRequestDefaultLocaleBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(CatalogsLocale), FullType(String), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

