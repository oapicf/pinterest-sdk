//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/currency.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_msot_events.g.dart';

/// Object containing the MSOT conversion events.
///
/// Properties:
/// * [actionTimestamps] - Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
/// * [adGroupId] - The ID of the ad group that was attributed to the conversion event.
/// * [attributionModel] - The attribution model used to attribute the conversion event.
/// * [attributionScope] - Ad event type.
/// * [attributionScore] - Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
/// * [campaignId] - The ID of the campaign that was attributed to the conversion event.
/// * [currency] 
/// * [eventId] - A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
/// * [eventName] - Type of user event.
/// * [eventTimestamp] - The time when the event occurred. Unix timestamp in seconds.
/// * [totalEventTouchpoints] - Total number of ad events including other non-Pinterest ad platforms.
/// * [totalEvents] - Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
/// * [value] - Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
@BuiltValue()
abstract class ConversionMSOTEvents implements Built<ConversionMSOTEvents, ConversionMSOTEventsBuilder> {
  /// Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'action_timestamps')
  BuiltList<int>? get actionTimestamps;

  /// The ID of the ad group that was attributed to the conversion event.
  @BuiltValueField(wireName: r'ad_group_id')
  String get adGroupId;

  /// The attribution model used to attribute the conversion event.
  @BuiltValueField(wireName: r'attribution_model')
  ConversionMSOTEventsAttributionModelEnum? get attributionModel;
  // enum attributionModelEnum {  first_touch,  last_touch,  multi_touch,  };

  /// Ad event type.
  @BuiltValueField(wireName: r'attribution_scope')
  ConversionMSOTEventsAttributionScopeEnum get attributionScope;
  // enum attributionScopeEnum {  view,  engagement,  click,  };

  /// Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
  @BuiltValueField(wireName: r'attribution_score')
  double? get attributionScore;

  /// The ID of the campaign that was attributed to the conversion event.
  @BuiltValueField(wireName: r'campaign_id')
  String? get campaignId;

  @BuiltValueField(wireName: r'currency')
  Currency? get currency;

  /// A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// Type of user event.
  @BuiltValueField(wireName: r'event_name')
  ConversionMSOTEventsEventNameEnum get eventName;
  // enum eventNameEnum {  add_to_cart,  checkout,  lead,  signup,  };

  /// The time when the event occurred. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'event_timestamp')
  int get eventTimestamp;

  /// Total number of ad events including other non-Pinterest ad platforms.
  @BuiltValueField(wireName: r'total_event_touchpoints')
  int? get totalEventTouchpoints;

  /// Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
  @BuiltValueField(wireName: r'total_events')
  int? get totalEvents;

  /// Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
  @BuiltValueField(wireName: r'value')
  double? get value;

  ConversionMSOTEvents._();

  factory ConversionMSOTEvents([void updates(ConversionMSOTEventsBuilder b)]) = _$ConversionMSOTEvents;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionMSOTEventsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionMSOTEvents> get serializer => _$ConversionMSOTEventsSerializer();
}

class _$ConversionMSOTEventsSerializer implements PrimitiveSerializer<ConversionMSOTEvents> {
  @override
  final Iterable<Type> types = const [ConversionMSOTEvents, _$ConversionMSOTEvents];

  @override
  final String wireName = r'ConversionMSOTEvents';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionMSOTEvents object, {
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
        specifiedType: const FullType(ConversionMSOTEventsAttributionModelEnum),
      );
    }
    yield r'attribution_scope';
    yield serializers.serialize(
      object.attributionScope,
      specifiedType: const FullType(ConversionMSOTEventsAttributionScopeEnum),
    );
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
      specifiedType: const FullType(ConversionMSOTEventsEventNameEnum),
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
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(double),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionMSOTEvents object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionMSOTEventsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'action_timestamps':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(int)]),
          ) as BuiltList<int>;
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
            specifiedType: const FullType(ConversionMSOTEventsAttributionModelEnum),
          ) as ConversionMSOTEventsAttributionModelEnum;
          result.attributionModel = valueDes;
          break;
        case r'attribution_scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionMSOTEventsAttributionScopeEnum),
          ) as ConversionMSOTEventsAttributionScopeEnum;
          result.attributionScope = valueDes;
          break;
        case r'attribution_score':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(double),
          ) as double;
          result.attributionScore = valueDes;
          break;
        case r'campaign_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.campaignId = valueDes;
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Currency),
          ) as Currency;
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
            specifiedType: const FullType(ConversionMSOTEventsEventNameEnum),
          ) as ConversionMSOTEventsEventNameEnum;
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
            specifiedType: const FullType(int),
          ) as int;
          result.totalEventTouchpoints = valueDes;
          break;
        case r'total_events':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.totalEvents = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(double),
          ) as double;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionMSOTEvents deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionMSOTEventsBuilder();
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

class ConversionMSOTEventsAttributionModelEnum extends EnumClass {

  /// The attribution model used to attribute the conversion event.
  @BuiltValueEnumConst(wireName: r'first_touch')
  static const ConversionMSOTEventsAttributionModelEnum firstTouch = _$conversionMSOTEventsAttributionModelEnum_firstTouch;
  /// The attribution model used to attribute the conversion event.
  @BuiltValueEnumConst(wireName: r'last_touch')
  static const ConversionMSOTEventsAttributionModelEnum lastTouch = _$conversionMSOTEventsAttributionModelEnum_lastTouch;
  /// The attribution model used to attribute the conversion event.
  @BuiltValueEnumConst(wireName: r'multi_touch')
  static const ConversionMSOTEventsAttributionModelEnum multiTouch = _$conversionMSOTEventsAttributionModelEnum_multiTouch;

  static Serializer<ConversionMSOTEventsAttributionModelEnum> get serializer => _$conversionMSOTEventsAttributionModelEnumSerializer;

  const ConversionMSOTEventsAttributionModelEnum._(String name): super(name);

  static BuiltSet<ConversionMSOTEventsAttributionModelEnum> get values => _$conversionMSOTEventsAttributionModelEnumValues;
  static ConversionMSOTEventsAttributionModelEnum valueOf(String name) => _$conversionMSOTEventsAttributionModelEnumValueOf(name);
}

class ConversionMSOTEventsAttributionScopeEnum extends EnumClass {

  /// Ad event type.
  @BuiltValueEnumConst(wireName: r'view')
  static const ConversionMSOTEventsAttributionScopeEnum view = _$conversionMSOTEventsAttributionScopeEnum_view;
  /// Ad event type.
  @BuiltValueEnumConst(wireName: r'engagement')
  static const ConversionMSOTEventsAttributionScopeEnum engagement = _$conversionMSOTEventsAttributionScopeEnum_engagement;
  /// Ad event type.
  @BuiltValueEnumConst(wireName: r'click')
  static const ConversionMSOTEventsAttributionScopeEnum click = _$conversionMSOTEventsAttributionScopeEnum_click;

  static Serializer<ConversionMSOTEventsAttributionScopeEnum> get serializer => _$conversionMSOTEventsAttributionScopeEnumSerializer;

  const ConversionMSOTEventsAttributionScopeEnum._(String name): super(name);

  static BuiltSet<ConversionMSOTEventsAttributionScopeEnum> get values => _$conversionMSOTEventsAttributionScopeEnumValues;
  static ConversionMSOTEventsAttributionScopeEnum valueOf(String name) => _$conversionMSOTEventsAttributionScopeEnumValueOf(name);
}

class ConversionMSOTEventsEventNameEnum extends EnumClass {

  /// Type of user event.
  @BuiltValueEnumConst(wireName: r'add_to_cart')
  static const ConversionMSOTEventsEventNameEnum addToCart = _$conversionMSOTEventsEventNameEnum_addToCart;
  /// Type of user event.
  @BuiltValueEnumConst(wireName: r'checkout')
  static const ConversionMSOTEventsEventNameEnum checkout = _$conversionMSOTEventsEventNameEnum_checkout;
  /// Type of user event.
  @BuiltValueEnumConst(wireName: r'lead')
  static const ConversionMSOTEventsEventNameEnum lead = _$conversionMSOTEventsEventNameEnum_lead;
  /// Type of user event.
  @BuiltValueEnumConst(wireName: r'signup')
  static const ConversionMSOTEventsEventNameEnum signup = _$conversionMSOTEventsEventNameEnum_signup;

  static Serializer<ConversionMSOTEventsEventNameEnum> get serializer => _$conversionMSOTEventsEventNameEnumSerializer;

  const ConversionMSOTEventsEventNameEnum._(String name): super(name);

  static BuiltSet<ConversionMSOTEventsEventNameEnum> get values => _$conversionMSOTEventsEventNameEnumValues;
  static ConversionMSOTEventsEventNameEnum valueOf(String name) => _$conversionMSOTEventsEventNameEnumValueOf(name);
}

