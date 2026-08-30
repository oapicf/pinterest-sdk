//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ade_column_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_conversion_event_metrics.g.dart';

/// CustomConversionEventMetrics
///
/// Properties:
/// * [customEventMetricsType] 
/// * [customEventName] - Name of the advertiser-defined custom conversion event
@BuiltValue()
abstract class CustomConversionEventMetrics implements Built<CustomConversionEventMetrics, CustomConversionEventMetricsBuilder> {
  @BuiltValueField(wireName: r'custom_event_metrics_type')
  AdeColumnType get customEventMetricsType;
  // enum customEventMetricsTypeEnum {  ADE_COST_PER_ACTION,  ADE_ROAS,  ADE_TOTAL_CONVERSIONS,  ADE_TOTAL_VALUE_IN_MICRO_DOLLAR,  ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_CLICK,  ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_VIEW,  ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_CONVERSION_RATE,  ADE_WEB_COST_PER_ACTION,  ADE_WEB_ROAS,  ADE_TOTAL_WEB_CONVERSIONS,  ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_WEB_CLICK,  ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_WEB_VIEW,  ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR,  ADE_INAPP_COST_PER_ACTION,  ADE_INAPP_ROAS,  ADE_TOTAL_INAPP_CONVERSIONS,  ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_INAPP_CLICK,  ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_INAPP_VIEW,  ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR,  ADE_OFFLINE_COST_PER_ACTION,  ADE_OFFLINE_ROAS,  ADE_TOTAL_OFFLINE_CONVERSIONS,  ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_OFFLINE_CLICK,  ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_OFFLINE_VIEW,  ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY,  ADE_TOTAL_CONVERSION_PRODUCT_VALUE,  ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,  ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD,  ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,  };

  /// Name of the advertiser-defined custom conversion event
  @BuiltValueField(wireName: r'custom_event_name')
  String get customEventName;

  CustomConversionEventMetrics._();

  factory CustomConversionEventMetrics([void updates(CustomConversionEventMetricsBuilder b)]) = _$CustomConversionEventMetrics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomConversionEventMetricsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomConversionEventMetrics> get serializer => _$CustomConversionEventMetricsSerializer();
}

class _$CustomConversionEventMetricsSerializer implements PrimitiveSerializer<CustomConversionEventMetrics> {
  @override
  final Iterable<Type> types = const [CustomConversionEventMetrics, _$CustomConversionEventMetrics];

  @override
  final String wireName = r'CustomConversionEventMetrics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomConversionEventMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'custom_event_metrics_type';
    yield serializers.serialize(
      object.customEventMetricsType,
      specifiedType: const FullType(AdeColumnType),
    );
    yield r'custom_event_name';
    yield serializers.serialize(
      object.customEventName,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomConversionEventMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomConversionEventMetricsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'custom_event_metrics_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdeColumnType),
          ) as AdeColumnType;
          result.customEventMetricsType = valueDes;
          break;
        case r'custom_event_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.customEventName = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomConversionEventMetrics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomConversionEventMetricsBuilder();
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

