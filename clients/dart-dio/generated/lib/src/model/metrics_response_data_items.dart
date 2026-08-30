//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'metrics_response_data_items.g.dart';

/// MetricsResponseDataItems
///
/// Properties:
/// * [metrics] - Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
/// * [targetingType] - The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
/// * [targetingValue] - The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
@BuiltValue()
abstract class MetricsResponseDataItems implements Built<MetricsResponseDataItems, MetricsResponseDataItemsBuilder> {
  /// Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
  @BuiltValueField(wireName: r'metrics')
  JsonObject get metrics;

  /// The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
  @BuiltValueField(wireName: r'targeting_type')
  String get targetingType;

  /// The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
  @BuiltValueField(wireName: r'targeting_value')
  String get targetingValue;

  MetricsResponseDataItems._();

  factory MetricsResponseDataItems([void updates(MetricsResponseDataItemsBuilder b)]) = _$MetricsResponseDataItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MetricsResponseDataItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MetricsResponseDataItems> get serializer => _$MetricsResponseDataItemsSerializer();
}

class _$MetricsResponseDataItemsSerializer implements PrimitiveSerializer<MetricsResponseDataItems> {
  @override
  final Iterable<Type> types = const [MetricsResponseDataItems, _$MetricsResponseDataItems];

  @override
  final String wireName = r'MetricsResponseDataItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MetricsResponseDataItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'metrics';
    yield serializers.serialize(
      object.metrics,
      specifiedType: const FullType(JsonObject),
    );
    yield r'targeting_type';
    yield serializers.serialize(
      object.targetingType,
      specifiedType: const FullType(String),
    );
    yield r'targeting_value';
    yield serializers.serialize(
      object.targetingValue,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MetricsResponseDataItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MetricsResponseDataItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.metrics = valueDes;
          break;
        case r'targeting_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.targetingType = valueDes;
          break;
        case r'targeting_value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.targetingValue = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MetricsResponseDataItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MetricsResponseDataItemsBuilder();
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

