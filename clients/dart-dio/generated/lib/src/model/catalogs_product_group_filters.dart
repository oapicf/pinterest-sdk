//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_keys.dart';
import 'package:openapi/src/model/catalogs_product_group_filters_all_of.dart';
import 'package:openapi/src/model/catalogs_product_group_filters_any_of.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_product_group_filters.g.dart';

/// Object holding a group of filters for a catalog product group
///
/// Properties:
/// * [anyOf] 
/// * [allOf] 
@BuiltValue()
abstract class CatalogsProductGroupFilters implements Built<CatalogsProductGroupFilters, CatalogsProductGroupFiltersBuilder> {
  /// Any Of [CatalogsProductGroupFiltersAllOf], [CatalogsProductGroupFiltersAnyOf]
  AnyOf get anyOf;

  CatalogsProductGroupFilters._();

  factory CatalogsProductGroupFilters([void updates(CatalogsProductGroupFiltersBuilder b)]) = _$CatalogsProductGroupFilters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupFiltersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupFilters> get serializer => _$CatalogsProductGroupFiltersSerializer();
}

class _$CatalogsProductGroupFiltersSerializer implements PrimitiveSerializer<CatalogsProductGroupFilters> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupFilters, _$CatalogsProductGroupFilters];

  @override
  final String wireName = r'CatalogsProductGroupFilters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsProductGroupFilters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupFiltersBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(CatalogsProductGroupFiltersAnyOf), FullType(CatalogsProductGroupFiltersAllOf), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

