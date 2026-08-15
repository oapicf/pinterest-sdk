//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filter_keys.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters_all_of.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters_any_of.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_creative_assets_product_group_filters.g.dart';

/// Object holding a group of filters for a creative assets product group
///
/// Properties:
/// * [anyOf] 
/// * [allOf] 
@BuiltValue()
abstract class CatalogsCreativeAssetsProductGroupFilters implements Built<CatalogsCreativeAssetsProductGroupFilters, CatalogsCreativeAssetsProductGroupFiltersBuilder> {
  /// Any Of [CatalogsCreativeAssetsProductGroupFiltersAllOf], [CatalogsCreativeAssetsProductGroupFiltersAnyOf]
  AnyOf get anyOf;

  CatalogsCreativeAssetsProductGroupFilters._();

  factory CatalogsCreativeAssetsProductGroupFilters([void updates(CatalogsCreativeAssetsProductGroupFiltersBuilder b)]) = _$CatalogsCreativeAssetsProductGroupFilters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductGroupFiltersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProductGroupFilters> get serializer => _$CatalogsCreativeAssetsProductGroupFiltersSerializer();
}

class _$CatalogsCreativeAssetsProductGroupFiltersSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProductGroupFilters> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProductGroupFilters, _$CatalogsCreativeAssetsProductGroupFilters];

  @override
  final String wireName = r'CatalogsCreativeAssetsProductGroupFilters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsCreativeAssetsProductGroupFilters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductGroupFiltersBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(CatalogsCreativeAssetsProductGroupFiltersAnyOf), FullType(CatalogsCreativeAssetsProductGroupFiltersAllOf), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

