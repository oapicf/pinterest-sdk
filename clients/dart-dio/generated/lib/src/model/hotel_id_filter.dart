//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'hotel_id_filter.g.dart';

/// HotelIdFilter
///
/// Properties:
/// * [HOTEL_ID] 
@BuiltValue()
abstract class HotelIdFilter implements Built<HotelIdFilter, HotelIdFilterBuilder> {
  @BuiltValueField(wireName: r'HOTEL_ID')
  CatalogsProductGroupMultipleStringCriteria get HOTEL_ID;

  HotelIdFilter._();

  factory HotelIdFilter([void updates(HotelIdFilterBuilder b)]) = _$HotelIdFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(HotelIdFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<HotelIdFilter> get serializer => _$HotelIdFilterSerializer();
}

class _$HotelIdFilterSerializer implements PrimitiveSerializer<HotelIdFilter> {
  @override
  final Iterable<Type> types = const [HotelIdFilter, _$HotelIdFilter];

  @override
  final String wireName = r'HotelIdFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    HotelIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'HOTEL_ID';
    yield serializers.serialize(
      object.HOTEL_ID,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    HotelIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required HotelIdFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'HOTEL_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
          ) as CatalogsProductGroupMultipleStringCriteria;
          result.HOTEL_ID.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  HotelIdFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = HotelIdFilterBuilder();
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

