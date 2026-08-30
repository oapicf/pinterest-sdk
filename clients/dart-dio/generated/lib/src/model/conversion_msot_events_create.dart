//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/currency.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/msot_event_name.dart';
import 'package:openapi/src/model/attribution_model.dart';
import 'package:openapi/src/model/attribution_scope.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_msot_events_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [actionTimestamps] - Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
/// * [adGroupId] - The ID of the ad group that was attributed to the conversion event.
/// * [attributionModel] - The attribution model used to attribute the conversion event.
/// * [attributionScope] - Ad event type.
/// * [attributionScore] - Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
/// * [campaignId] - The ID of the campaign that was attributed to the conversion event.
/// * [clickWindow] - Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
/// * [currency] - Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
/// * [eventId] - A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
/// * [eventName] - Type of user event.
/// * [eventTimestamp] - The time when the event occurred. Unix timestamp in seconds.
/// * [totalEventTouchpoints] - Total number of ad events including other non-Pinterest ad platforms.
/// * [totalEvents] - Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
/// * [totalEventsFractional] - Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
/// * [value] - Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
/// * [viewWindow] - View window used for attribution (for example, `1d`, `7d`, `30d`).
@BuiltValue()
abstract class ConversionMSOTEventsCreate implements Built<ConversionMSOTEventsCreate, ConversionMSOTEventsCreateBuilder> {
  /// Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'action_timestamps')
  BuiltList<int>? get actionTimestamps;

  /// The ID of the ad group that was attributed to the conversion event.
  @BuiltValueField(wireName: r'ad_group_id')
  String get adGroupId;

  /// The attribution model used to attribute the conversion event.
  @BuiltValueField(wireName: r'attribution_model')
  AttributionModel? get attributionModel;
  // enum attributionModelEnum {  first_touch,  last_touch,  multi_touch,  mmm,  };

  /// Ad event type.
  @BuiltValueField(wireName: r'attribution_scope')
  AttributionScope? get attributionScope;
  // enum attributionScopeEnum {  view,  engagement,  click,  };

  /// Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
  @BuiltValueField(wireName: r'attribution_score')
  double? get attributionScore;

  /// The ID of the campaign that was attributed to the conversion event.
  @BuiltValueField(wireName: r'campaign_id')
  String? get campaignId;

  /// Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
  @BuiltValueField(wireName: r'click_window')
  String? get clickWindow;

  /// Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
  @BuiltValueField(wireName: r'currency')
  Currency? get currency;
  // enum currencyEnum {  UNK,  USD,  GBP,  CAD,  EUR,  AUD,  NZD,  SEK,  ILS,  CHF,  HKD,  JPY,  SGD,  KRW,  NOK,  DKK,  PLN,  RON,  HUF,  CZK,  BRL,  MXN,  ARS,  CLP,  COP,  INR,  TRY,  };

  /// A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// Type of user event.
  @BuiltValueField(wireName: r'event_name')
  MsotEventName get eventName;
  // enum eventNameEnum {  add_to_cart,  checkout,  lead,  signup,  };

  /// The time when the event occurred. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'event_timestamp')
  int get eventTimestamp;

  /// Total number of ad events including other non-Pinterest ad platforms.
  @BuiltValueField(wireName: r'total_event_touchpoints')
  int? get totalEventTouchpoints;

  /// Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
  @Deprecated('totalEvents has been deprecated')
  @BuiltValueField(wireName: r'total_events')
  int? get totalEvents;

  /// Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
  @BuiltValueField(wireName: r'total_events_fractional')
  double? get totalEventsFractional;

  /// Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
  @BuiltValueField(wireName: r'value')
  double? get value;

  /// View window used for attribution (for example, `1d`, `7d`, `30d`).
  @BuiltValueField(wireName: r'view_window')
  String? get viewWindow;

  ConversionMSOTEventsCreate._();

  factory ConversionMSOTEventsCreate([void updates(ConversionMSOTEventsCreateBuilder b)]) = _$ConversionMSOTEventsCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionMSOTEventsCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionMSOTEventsCreate> get serializer => _$ConversionMSOTEventsCreateSerializer();
}

class _$ConversionMSOTEventsCreateSerializer implements PrimitiveSerializer<ConversionMSOTEventsCreate> {
  @override
  final Iterable<Type> types = const [ConversionMSOTEventsCreate, _$ConversionMSOTEventsCreate];

  @override
  final String wireName = r'ConversionMSOTEventsCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionMSOTEventsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.actionTimestamps != null) {
      yield r'action_timestamps';
      yield serializers.serialize(
        object.actionTimestamps,
        specifiedType: const FullType(BuiltList, [FullType(int)]),
      );
    }
    yield r'ad_group_id';
    yield serializers.serialize(
      object.adGroupId,
      specifiedType: const FullType(String),
    );
    if (object.attributionModel != null) {
      yield r'attribution_model';
      yield serializers.serialize(
        object.attributionModel,
        specifiedType: const FullType(AttributionModel),
      );
    }
    if (object.attributionScope != null) {
      yield r'attribution_scope';
      yield serializers.serialize(
        object.attributionScope,
        specifiedType: const FullType(AttributionScope),
      );
    }
    if (object.attributionScore != null) {
      yield r'attribution_score';
      yield serializers.serialize(
        object.attributionScore,
        specifiedType: const FullType(double),
      );
    }
    if (object.campaignId != null) {
      yield r'campaign_id';
      yield serializers.serialize(
        object.campaignId,
        specifiedType: const FullType(String),
      );
    }
    if (object.clickWindow != null) {
      yield r'click_window';
      yield serializers.serialize(
        object.clickWindow,
        specifiedType: const FullType(String),
      );
    }
    if (object.currency != null) {
      yield r'currency';
      yield serializers.serialize(
        object.currency,
        specifiedType: const FullType(Currency),
      );
    }
    yield r'event_id';
    yield serializers.serialize(
      object.eventId,
      specifiedType: const FullType(String),
    );
    yield r'event_name';
    yield serializers.serialize(
      object.eventName,
      specifiedType: const FullType(MsotEventName),
    );
    yield r'event_timestamp';
    yield serializers.serialize(
      object.eventTimestamp,
      specifiedType: const FullType(int),
    );
    if (object.totalEventTouchpoints != null) {
      yield r'total_event_touchpoints';
      yield serializers.serialize(
        object.totalEventTouchpoints,
        specifiedType: const FullType(int),
      );
    }
    if (object.totalEvents != null) {
      yield r'total_events';
      yield serializers.serialize(
        object.totalEvents,
        specifiedType: const FullType(int),
      );
    }
    if (object.totalEventsFractional != null) {
      yield r'total_events_fractional';
      yield serializers.serialize(
        object.totalEventsFractional,
        specifiedType: const FullType(double),
      );
    }
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(double),
      );
    }
    if (object.viewWindow != null) {
      yield r'view_window';
      yield serializers.serialize(
        object.viewWindow,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionMSOTEventsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionMSOTEventsCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'action_timestamps':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(int)]),
          ) as BuiltList<int>?;
          if (valueDes == null) continue;
          result.actionTimestamps.replace(valueDes);
          break;
        case r'ad_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adGroupId = valueDes;
          break;
        case r'attribution_model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AttributionModel),
          ) as AttributionModel?;
          if (valueDes == null) continue;
          result.attributionModel = valueDes;
          break;
        case r'attribution_scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AttributionScope),
          ) as AttributionScope?;
          if (valueDes == null) continue;
          result.attributionScope = valueDes;
          break;
        case r'attribution_score':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.attributionScore = valueDes;
          break;
        case r'campaign_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.campaignId = valueDes;
          break;
        case r'click_window':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.clickWindow = valueDes;
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Currency),
          ) as Currency?;
          if (valueDes == null) continue;
          result.currency = valueDes;
          break;
        case r'event_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.eventId = valueDes;
          break;
        case r'event_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MsotEventName),
          ) as MsotEventName;
          result.eventName = valueDes;
          break;
        case r'event_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.eventTimestamp = valueDes;
          break;
        case r'total_event_touchpoints':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.totalEventTouchpoints = valueDes;
          break;
        case r'total_events':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.totalEvents = valueDes;
          break;
        case r'total_events_fractional':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.totalEventsFractional = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.value = valueDes;
          break;
        case r'view_window':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.viewWindow = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionMSOTEventsCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionMSOTEventsCreateBuilder();
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

