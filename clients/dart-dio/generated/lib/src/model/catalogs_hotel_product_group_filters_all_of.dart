//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_product_group_filters_all_of.g.dart';

/// CatalogsHotelProductGroupFiltersAllOf
///
/// Properties:
/// * [allOf] 
@BuiltValue()
abstract class CatalogsHotelProductGroupFiltersAllOf implements Built<CatalogsHotelProductGroupFiltersAllOf, CatalogsHotelProductGroupFiltersAllOfBuilder> {
  @BuiltValueField(wireName: r'all_of')
  BuiltList<CatalogsHotelProductGroupFilterKeys> get allOf;

  CatalogsHotelProductGroupFiltersAllOf._();

  factory CatalogsHotelProductGroupFiltersAllOf([void updates(CatalogsHotelProductGroupFiltersAllOfBuilder b)]) = _$CatalogsHotelProductGroupFiltersAllOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductGroupFiltersAllOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProductGroupFiltersAllOf> get serializer => _$CatalogsHotelProductGroupFiltersAllOfSerializer();
}

class _$CatalogsHotelProductGroupFiltersAllOfSerializer implements PrimitiveSerializer<CatalogsHotelProductGroupFiltersAllOf> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProductGroupFiltersAllOf, _$CatalogsHotelProductGroupFiltersAllOf];

  @override
  final String wireName = r'CatalogsHotelProductGroupFiltersAllOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProductGroupFiltersAllOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'all_of';
    yield serializers.serialize(
      object.allOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsHotelProductGroupFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelProductGroupFiltersAllOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelProductGroupFiltersAllOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'all_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsHotelProductGroupFilterKeys)]),
          ) as BuiltList<CatalogsHotelProductGroupFilterKeys>;
          result.allOf.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelProductGroupFiltersAllOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductGroupFiltersAllOfBuilder();
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

