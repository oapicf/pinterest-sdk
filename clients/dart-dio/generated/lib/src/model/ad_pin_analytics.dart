//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_pin_analytics.g.dart';

/// AdPinAnalytics
///
/// Properties:
/// * [DATE] - Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
/// * [PIN_ID] - The ID of the pin that the metric belongs to.
@BuiltValue()
abstract class AdPinAnalytics implements Built<AdPinAnalytics, AdPinAnalyticsBuilder> {
  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  /// The ID of the pin that the metric belongs to.
  @BuiltValueField(wireName: r'PIN_ID')
  String get PIN_ID;

  AdPinAnalytics._();

  factory AdPinAnalytics([void updates(AdPinAnalyticsBuilder b)]) = _$AdPinAnalytics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdPinAnalyticsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdPinAnalytics> get serializer => _$AdPinAnalyticsSerializer();
}

class _$AdPinAnalyticsSerializer implements PrimitiveSerializer<AdPinAnalytics> {
  @override
  final Iterable<Type> types = const [AdPinAnalytics, _$AdPinAnalytics];

  @override
  final String wireName = r'AdPinAnalytics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdPinAnalytics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.DATE != null) {
      yield r'DATE';
      yield serializers.serialize(
        object.DATE,
        specifiedType: const FullType(Date),
      );
    }
    yield r'PIN_ID';
    yield serializers.serialize(
      object.PIN_ID,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdPinAnalytics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdPinAnalyticsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'DATE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.DATE = valueDes;
          break;
        case r'PIN_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.PIN_ID = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdPinAnalytics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdPinAnalyticsBuilder();
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

