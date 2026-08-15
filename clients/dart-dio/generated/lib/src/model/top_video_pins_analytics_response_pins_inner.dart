//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/data_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'top_video_pins_analytics_response_pins_inner.g.dart';

/// Array with metrics, status, and pin id for the requested metric
///
/// Properties:
/// * [dataStatus] 
/// * [metrics] - The metric name and daily value for each requested metric
/// * [pinId] - The pin id
@BuiltValue()
abstract class TopVideoPinsAnalyticsResponsePinsInner implements Built<TopVideoPinsAnalyticsResponsePinsInner, TopVideoPinsAnalyticsResponsePinsInnerBuilder> {
  @BuiltValueField(wireName: r'data_status')
  BuiltMap<String, DataStatus>? get dataStatus;

  /// The metric name and daily value for each requested metric
  @BuiltValueField(wireName: r'metrics')
  BuiltMap<String, num>? get metrics;

  /// The pin id
  @BuiltValueField(wireName: r'pin_id')
  String? get pinId;

  TopVideoPinsAnalyticsResponsePinsInner._();

  factory TopVideoPinsAnalyticsResponsePinsInner([void updates(TopVideoPinsAnalyticsResponsePinsInnerBuilder b)]) = _$TopVideoPinsAnalyticsResponsePinsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TopVideoPinsAnalyticsResponsePinsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TopVideoPinsAnalyticsResponsePinsInner> get serializer => _$TopVideoPinsAnalyticsResponsePinsInnerSerializer();
}

class _$TopVideoPinsAnalyticsResponsePinsInnerSerializer implements PrimitiveSerializer<TopVideoPinsAnalyticsResponsePinsInner> {
  @override
  final Iterable<Type> types = const [TopVideoPinsAnalyticsResponsePinsInner, _$TopVideoPinsAnalyticsResponsePinsInner];

  @override
  final String wireName = r'TopVideoPinsAnalyticsResponsePinsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TopVideoPinsAnalyticsResponsePinsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dataStatus != null) {
      yield r'data_status';
      yield serializers.serialize(
        object.dataStatus,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(DataStatus)]),
      );
    }
    if (object.metrics != null) {
      yield r'metrics';
      yield serializers.serialize(
        object.metrics,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
      );
    }
    if (object.pinId != null) {
      yield r'pin_id';
      yield serializers.serialize(
        object.pinId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TopVideoPinsAnalyticsResponsePinsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TopVideoPinsAnalyticsResponsePinsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(DataStatus)]),
          ) as BuiltMap<String, DataStatus>;
          result.dataStatus.replace(valueDes);
          break;
        case r'metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>;
          result.metrics.replace(valueDes);
          break;
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pinId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TopVideoPinsAnalyticsResponsePinsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TopVideoPinsAnalyticsResponsePinsInnerBuilder();
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

