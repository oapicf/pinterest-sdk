//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_event.dart';
import 'package:openapi/src/model/attribution_windows.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tag_v3_goal_metadata.g.dart';

/// ConversionTagV3GoalMetadata
///
/// Properties:
/// * [attributionWindows] 
/// * [conversionEvent] 
/// * [conversionTagId] 
/// * [cpaGoalValueInMicroCurrency] 
/// * [isRoasOptimized] - Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
/// * [reportingEvent] - Event name for custom or standard events mapped to an oCPM model
@BuiltValue()
abstract class ConversionTagV3GoalMetadata implements Built<ConversionTagV3GoalMetadata, ConversionTagV3GoalMetadataBuilder> {
  @BuiltValueField(wireName: r'attribution_windows')
  AttributionWindows? get attributionWindows;

  @BuiltValueField(wireName: r'conversion_event')
  ConversionEvent? get conversionEvent;
  // enum conversionEventEnum {  PAGE_VISIT,  SIGNUP,  CHECKOUT,  CUSTOM,  VIEW_CATEGORY,  SEARCH,  ADD_TO_CART,  WATCH_VIDEO,  LEAD,  APP_INSTALL,  };

  @BuiltValueField(wireName: r'conversion_tag_id')
  String? get conversionTagId;

  @BuiltValueField(wireName: r'cpa_goal_value_in_micro_currency')
  String? get cpaGoalValueInMicroCurrency;

  /// Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
  @BuiltValueField(wireName: r'is_roas_optimized')
  bool? get isRoasOptimized;

  /// Event name for custom or standard events mapped to an oCPM model
  @BuiltValueField(wireName: r'reporting_event')
  String? get reportingEvent;

  ConversionTagV3GoalMetadata._();

  factory ConversionTagV3GoalMetadata([void updates(ConversionTagV3GoalMetadataBuilder b)]) = _$ConversionTagV3GoalMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionTagV3GoalMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionTagV3GoalMetadata> get serializer => _$ConversionTagV3GoalMetadataSerializer();
}

class _$ConversionTagV3GoalMetadataSerializer implements PrimitiveSerializer<ConversionTagV3GoalMetadata> {
  @override
  final Iterable<Type> types = const [ConversionTagV3GoalMetadata, _$ConversionTagV3GoalMetadata];

  @override
  final String wireName = r'ConversionTagV3GoalMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionTagV3GoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attributionWindows != null) {
      yield r'attribution_windows';
      yield serializers.serialize(
        object.attributionWindows,
        specifiedType: const FullType(AttributionWindows),
      );
    }
    if (object.conversionEvent != null) {
      yield r'conversion_event';
      yield serializers.serialize(
        object.conversionEvent,
        specifiedType: const FullType(ConversionEvent),
      );
    }
    if (object.conversionTagId != null) {
      yield r'conversion_tag_id';
      yield serializers.serialize(
        object.conversionTagId,
        specifiedType: const FullType(String),
      );
    }
    if (object.cpaGoalValueInMicroCurrency != null) {
      yield r'cpa_goal_value_in_micro_currency';
      yield serializers.serialize(
        object.cpaGoalValueInMicroCurrency,
        specifiedType: const FullType(String),
      );
    }
    if (object.isRoasOptimized != null) {
      yield r'is_roas_optimized';
      yield serializers.serialize(
        object.isRoasOptimized,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.reportingEvent != null) {
      yield r'reporting_event';
      yield serializers.serialize(
        object.reportingEvent,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionTagV3GoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionTagV3GoalMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attribution_windows':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AttributionWindows),
          ) as AttributionWindows?;
          if (valueDes == null) continue;
          result.attributionWindows.replace(valueDes);
          break;
        case r'conversion_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionEvent),
          ) as ConversionEvent?;
          if (valueDes == null) continue;
          result.conversionEvent = valueDes;
          break;
        case r'conversion_tag_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.conversionTagId = valueDes;
          break;
        case r'cpa_goal_value_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.cpaGoalValueInMicroCurrency = valueDes;
          break;
        case r'is_roas_optimized':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isRoasOptimized = valueDes;
          break;
        case r'reporting_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.reportingEvent = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionTagV3GoalMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionTagV3GoalMetadataBuilder();
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

