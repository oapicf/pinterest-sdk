//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'availability_filter.g.dart';

/// AvailabilityFilter
///
/// Properties:
/// * [AVAILABILITY] 
@BuiltValue()
abstract class AvailabilityFilter implements Built<AvailabilityFilter, AvailabilityFilterBuilder> {
  @BuiltValueField(wireName: r'AVAILABILITY')
  CatalogsProductGroupMultipleStringCriteria get AVAILABILITY;

  AvailabilityFilter._();

  factory AvailabilityFilter([void updates(AvailabilityFilterBuilder b)]) = _$AvailabilityFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AvailabilityFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AvailabilityFilter> get serializer => _$AvailabilityFilterSerializer();
}

class _$AvailabilityFilterSerializer implements PrimitiveSerializer<AvailabilityFilter> {
  @override
  final Iterable<Type> types = const [AvailabilityFilter, _$AvailabilityFilter];

  @override
  final String wireName = r'AvailabilityFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AvailabilityFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'AVAILABILITY';
    yield serializers.serialize(
      object.AVAILABILITY,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AvailabilityFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AvailabilityFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AVAILABILITY':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
          ) as CatalogsProductGroupMultipleStringCriteria;
          result.AVAILABILITY = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AvailabilityFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AvailabilityFilterBuilder();
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

