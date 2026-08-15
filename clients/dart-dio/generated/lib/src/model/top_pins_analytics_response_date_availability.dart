//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'top_pins_analytics_response_date_availability.g.dart';

/// TopPinsAnalyticsResponseDateAvailability
///
/// Properties:
/// * [isRealtime] 
/// * [latestAvailableTimestamp] 
@BuiltValue()
abstract class TopPinsAnalyticsResponseDateAvailability implements Built<TopPinsAnalyticsResponseDateAvailability, TopPinsAnalyticsResponseDateAvailabilityBuilder> {
  @BuiltValueField(wireName: r'is_realtime')
  bool? get isRealtime;

  @BuiltValueField(wireName: r'latest_available_timestamp')
  num? get latestAvailableTimestamp;

  TopPinsAnalyticsResponseDateAvailability._();

  factory TopPinsAnalyticsResponseDateAvailability([void updates(TopPinsAnalyticsResponseDateAvailabilityBuilder b)]) = _$TopPinsAnalyticsResponseDateAvailability;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TopPinsAnalyticsResponseDateAvailabilityBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TopPinsAnalyticsResponseDateAvailability> get serializer => _$TopPinsAnalyticsResponseDateAvailabilitySerializer();
}

class _$TopPinsAnalyticsResponseDateAvailabilitySerializer implements PrimitiveSerializer<TopPinsAnalyticsResponseDateAvailability> {
  @override
  final Iterable<Type> types = const [TopPinsAnalyticsResponseDateAvailability, _$TopPinsAnalyticsResponseDateAvailability];

  @override
  final String wireName = r'TopPinsAnalyticsResponseDateAvailability';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TopPinsAnalyticsResponseDateAvailability object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isRealtime != null) {
      yield r'is_realtime';
      yield serializers.serialize(
        object.isRealtime,
        specifiedType: const FullType(bool),
      );
    }
    if (object.latestAvailableTimestamp != null) {
      yield r'latest_available_timestamp';
      yield serializers.serialize(
        object.latestAvailableTimestamp,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TopPinsAnalyticsResponseDateAvailability object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TopPinsAnalyticsResponseDateAvailabilityBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_realtime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isRealtime = valueDes;
          break;
        case r'latest_available_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.latestAvailableTimestamp = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TopPinsAnalyticsResponseDateAvailability deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TopPinsAnalyticsResponseDateAvailabilityBuilder();
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

