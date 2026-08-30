//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_keys.dart';
import 'package:openapi/src/model/catalogs_product_group_filters_request_any_of_items1.dart';
import 'package:openapi/src/model/catalogs_product_group_filters_request_any_of_items0.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_product_group_filters_request.g.dart';

/// Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
///
/// Properties:
/// * [anyOf] 
/// * [allOf] 
@BuiltValue()
abstract class CatalogsProductGroupFiltersRequest implements Built<CatalogsProductGroupFiltersRequest, CatalogsProductGroupFiltersRequestBuilder> {
  /// Any Of [CatalogsProductGroupFiltersRequestAnyOfItems0], [CatalogsProductGroupFiltersRequestAnyOfItems1]
  AnyOf get anyOf;

  CatalogsProductGroupFiltersRequest._();

  factory CatalogsProductGroupFiltersRequest([void updates(CatalogsProductGroupFiltersRequestBuilder b)]) = _$CatalogsProductGroupFiltersRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupFiltersRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupFiltersRequest> get serializer => _$CatalogsProductGroupFiltersRequestSerializer();
}

class _$CatalogsProductGroupFiltersRequestSerializer implements PrimitiveSerializer<CatalogsProductGroupFiltersRequest> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupFiltersRequest, _$CatalogsProductGroupFiltersRequest];

  @override
  final String wireName = r'CatalogsProductGroupFiltersRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupFiltersRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupFiltersRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsProductGroupFiltersRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupFiltersRequestBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(CatalogsProductGroupFiltersRequestAnyOfItems0), FullType(CatalogsProductGroupFiltersRequestAnyOfItems1), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

