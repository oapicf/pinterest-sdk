//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_product_group_filters_any_of.g.dart';

/// CatalogsHotelProductGroupFiltersAnyOf
///
/// Properties:
/// * [anyOf] 
@BuiltValue()
abstract class CatalogsHotelProductGroupFiltersAnyOf implements Built<CatalogsHotelProductGroupFiltersAnyOf, CatalogsHotelProductGroupFiltersAnyOfBuilder> {
  @BuiltValueField(wireName: r'any_of')
  BuiltList<CatalogsHotelProductGroupFilterKeys> get anyOf;

  CatalogsHotelProductGroupFiltersAnyOf._();

  factory CatalogsHotelProductGroupFiltersAnyOf([void updates(CatalogsHotelProductGroupFiltersAnyOfBuilder b)]) = _$CatalogsHotelProductGroupFiltersAnyOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductGroupFiltersAnyOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProductGroupFiltersAnyOf> get serializer => _$CatalogsHotelProductGroupFiltersAnyOfSerializer();
}

class _$CatalogsHotelProductGroupFiltersAnyOfSerializer implements PrimitiveSerializer<CatalogsHotelProductGroupFiltersAnyOf> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProductGroupFiltersAnyOf, _$CatalogsHotelProductGroupFiltersAnyOf];

  @override
  final String wireName = r'CatalogsHotelProductGroupFiltersAnyOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProductGroupFiltersAnyOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'any_of';
    yield serializers.serialize(
      object.anyOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsHotelProductGroupFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelProductGroupFiltersAnyOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelProductGroupFiltersAnyOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'any_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsHotelProductGroupFilterKeys)]),
          ) as BuiltList<CatalogsHotelProductGroupFilterKeys>;
          result.anyOf.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelProductGroupFiltersAnyOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductGroupFiltersAnyOfBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

