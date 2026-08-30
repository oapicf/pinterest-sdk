//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'top_video_pins_analytics_response_date_availability.g.dart';

/// TopVideoPinsAnalyticsResponseDateAvailability
///
/// Properties:
/// * [isRealtime] 
/// * [latestAvailableTimestamp] 
@BuiltValue()
abstract class TopVideoPinsAnalyticsResponseDateAvailability implements Built<TopVideoPinsAnalyticsResponseDateAvailability, TopVideoPinsAnalyticsResponseDateAvailabilityBuilder> {
  @BuiltValueField(wireName: r'is_realtime')
  bool? get isRealtime;

  @BuiltValueField(wireName: r'latest_available_timestamp')
  num? get latestAvailableTimestamp;

  TopVideoPinsAnalyticsResponseDateAvailability._();

  factory TopVideoPinsAnalyticsResponseDateAvailability([void updates(TopVideoPinsAnalyticsResponseDateAvailabilityBuilder b)]) = _$TopVideoPinsAnalyticsResponseDateAvailability;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TopVideoPinsAnalyticsResponseDateAvailabilityBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TopVideoPinsAnalyticsResponseDateAvailability> get serializer => _$TopVideoPinsAnalyticsResponseDateAvailabilitySerializer();
}

class _$TopVideoPinsAnalyticsResponseDateAvailabilitySerializer implements PrimitiveSerializer<TopVideoPinsAnalyticsResponseDateAvailability> {
  @override
  final Iterable<Type> types = const [TopVideoPinsAnalyticsResponseDateAvailability, _$TopVideoPinsAnalyticsResponseDateAvailability];

  @override
  final String wireName = r'TopVideoPinsAnalyticsResponseDateAvailability';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TopVideoPinsAnalyticsResponseDateAvailability object, {
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
    TopVideoPinsAnalyticsResponseDateAvailability object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TopVideoPinsAnalyticsResponseDateAvailabilityBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_realtime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isRealtime = valueDes;
          break;
        case r'latest_available_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
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
  TopVideoPinsAnalyticsResponseDateAvailability deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TopVideoPinsAnalyticsResponseDateAvailabilityBuilder();
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

