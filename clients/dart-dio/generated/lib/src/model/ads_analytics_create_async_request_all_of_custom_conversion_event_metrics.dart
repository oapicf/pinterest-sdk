//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_create_async_request_all_of_custom_conversion_event_metrics.g.dart';

/// AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
///
/// Properties:
/// * [customEventMetricsType] - Metrics for custom defined conversion event.
/// * [customEventName] - Name of the advertiser-defined custom conversion event
@BuiltValue()
abstract class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics implements Built<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics, AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsBuilder> {
  /// Metrics for custom defined conversion event.
  @BuiltValueField(wireName: r'custom_event_metrics_type')
  AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum get customEventMetricsType;
  // enum customEventMetricsTypeEnum {  ADE_COST_PER_ACTION,  ADE_ROAS,  ADE_TOTAL_CONVERSIONS,  ADE_TOTAL_VALUE_IN_MICRO_DOLLAR,  ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_CLICK,  ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_VIEW,  ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_CONVERSION_RATE,  ADE_WEB_COST_PER_ACTION,  ADE_WEB_ROAS,  ADE_TOTAL_WEB_CONVERSIONS,  ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_WEB_CLICK,  ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_WEB_VIEW,  ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR,  ADE_INAPP_COST_PER_ACTION,  ADE_INAPP_ROAS,  ADE_TOTAL_INAPP_CONVERSIONS,  ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_INAPP_CLICK,  ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_INAPP_VIEW,  ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR,  ADE_OFFLINE_COST_PER_ACTION,  ADE_OFFLINE_ROAS,  ADE_TOTAL_OFFLINE_CONVERSIONS,  ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_OFFLINE_CLICK,  ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_OFFLINE_VIEW,  ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR,  ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY,  ADE_TOTAL_CONVERSION_PRODUCT_VALUE,  ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,  ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD,  ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD,  ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD,  ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD,  ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,  };

  /// Name of the advertiser-defined custom conversion event
  @BuiltValueField(wireName: r'custom_event_name')
  String get customEventName;

  AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics._();

  factory AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics([void updates(AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsBuilder b)]) = _$AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics> get serializer => _$AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsSerializer();
}

class _$AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsSerializer implements PrimitiveSerializer<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics> {
  @override
  final Iterable<Type> types = const [AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics, _$AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics];

  @override
  final String wireName = r'AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'custom_event_metrics_type';
    yield serializers.serialize(
      object.customEventMetricsType,
      specifiedType: const FullType(AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum),
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
    AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'custom_event_metrics_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum),
          ) as AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum;
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
  AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsBuilder();
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

class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum extends EnumClass {

  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_COST_PER_ACTION')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_COST_PER_ACTION = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_COST_PER_ACTION;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_ROAS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_ROAS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_ROAS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_CONVERSIONS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_CONVERSIONS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_CONVERSIONS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_CLICK')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_CLICK = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_CLICK;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_VIEW')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_VIEW = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_VIEW;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_CONVERSION_RATE')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_CONVERSION_RATE = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_CONVERSION_RATE;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_WEB_COST_PER_ACTION')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_WEB_COST_PER_ACTION = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_WEB_COST_PER_ACTION;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_WEB_ROAS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_WEB_ROAS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_WEB_ROAS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_CONVERSIONS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_CONVERSIONS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_CONVERSIONS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_CLICK')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_CLICK = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_CLICK;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_VIEW')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_VIEW = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_VIEW;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_INAPP_COST_PER_ACTION')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_INAPP_COST_PER_ACTION = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_INAPP_COST_PER_ACTION;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_INAPP_ROAS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_INAPP_ROAS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_INAPP_ROAS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_CONVERSIONS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_CONVERSIONS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_CONVERSIONS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_CLICK')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_CLICK = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_CLICK;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_VIEW')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_VIEW = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_VIEW;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_OFFLINE_COST_PER_ACTION')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_OFFLINE_COST_PER_ACTION = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_OFFLINE_COST_PER_ACTION;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_OFFLINE_ROAS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_OFFLINE_ROAS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_OFFLINE_ROAS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_CONVERSIONS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_CONVERSIONS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_CONVERSIONS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_CLICK')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_CLICK = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_CLICK;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_VIEW')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_VIEW = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_VIEW;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_CONVERSION_PRODUCT_VALUE = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_CONVERSION_PRODUCT_VALUE;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD;
  /// Metrics for custom defined conversion event.
  @BuiltValueEnumConst(wireName: r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD')
  static const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum_ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;

  static Serializer<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum> get serializer => _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumSerializer;

  const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(String name): super(name);

  static BuiltSet<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum> get values => _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumValues;
  static AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum valueOf(String name) => _$adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumValueOf(name);
}

