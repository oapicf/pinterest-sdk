//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_filter_keys.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_filters_all_of.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_filters_any_of.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_hotel_product_group_filters.g.dart';

/// Object holding a group of filters for a hotel product group
///
/// Properties:
/// * [anyOf] 
/// * [allOf] 
@BuiltValue()
abstract class CatalogsHotelProductGroupFilters implements Built<CatalogsHotelProductGroupFilters, CatalogsHotelProductGroupFiltersBuilder> {
  /// Any Of [CatalogsHotelProductGroupFiltersAllOf], [CatalogsHotelProductGroupFiltersAnyOf]
  AnyOf get anyOf;

  CatalogsHotelProductGroupFilters._();

  factory CatalogsHotelProductGroupFilters([void updates(CatalogsHotelProductGroupFiltersBuilder b)]) = _$CatalogsHotelProductGroupFilters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductGroupFiltersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProductGroupFilters> get serializer => _$CatalogsHotelProductGroupFiltersSerializer();
}

class _$CatalogsHotelProductGroupFiltersSerializer implements PrimitiveSerializer<CatalogsHotelProductGroupFilters> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProductGroupFilters, _$CatalogsHotelProductGroupFilters];

  @override
  final String wireName = r'CatalogsHotelProductGroupFilters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProductGroupFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelProductGroupFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsHotelProductGroupFilters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductGroupFiltersBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(CatalogsHotelProductGroupFiltersAnyOf), FullType(CatalogsHotelProductGroupFiltersAllOf), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

