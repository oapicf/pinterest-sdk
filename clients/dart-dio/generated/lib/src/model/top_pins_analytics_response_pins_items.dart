//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/data_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'top_pins_analytics_response_pins_items.g.dart';

/// Array with metrics, status, and pin id for the requested metric
///
/// Properties:
/// * [dataStatus] 
/// * [metrics] 
/// * [pinId] - The pin id
@BuiltValue()
abstract class TopPinsAnalyticsResponsePinsItems implements Built<TopPinsAnalyticsResponsePinsItems, TopPinsAnalyticsResponsePinsItemsBuilder> {
  @BuiltValueField(wireName: r'data_status')
  BuiltMap<String, DataStatus>? get dataStatus;

  @BuiltValueField(wireName: r'metrics')
  BuiltMap<String, num>? get metrics;

  /// The pin id
  @BuiltValueField(wireName: r'pin_id')
  String? get pinId;

  TopPinsAnalyticsResponsePinsItems._();

  factory TopPinsAnalyticsResponsePinsItems([void updates(TopPinsAnalyticsResponsePinsItemsBuilder b)]) = _$TopPinsAnalyticsResponsePinsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TopPinsAnalyticsResponsePinsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TopPinsAnalyticsResponsePinsItems> get serializer => _$TopPinsAnalyticsResponsePinsItemsSerializer();
}

class _$TopPinsAnalyticsResponsePinsItemsSerializer implements PrimitiveSerializer<TopPinsAnalyticsResponsePinsItems> {
  @override
  final Iterable<Type> types = const [TopPinsAnalyticsResponsePinsItems, _$TopPinsAnalyticsResponsePinsItems];

  @override
  final String wireName = r'TopPinsAnalyticsResponsePinsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TopPinsAnalyticsResponsePinsItems object, {
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
    TopPinsAnalyticsResponsePinsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TopPinsAnalyticsResponsePinsItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(DataStatus)]),
          ) as BuiltMap<String, DataStatus>?;
          if (valueDes == null) continue;
          result.dataStatus.replace(valueDes);
          break;
        case r'metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>?;
          if (valueDes == null) continue;
          result.metrics.replace(valueDes);
          break;
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  TopPinsAnalyticsResponsePinsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TopPinsAnalyticsResponsePinsItemsBuilder();
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

