//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_tag_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_event_response.g.dart';

/// ConversionEventResponse
///
/// Properties:
/// * [adAccountId] - Id of the ad account.
/// * [conversionEvent] 
/// * [conversionTagId] - Id of the tag.
/// * [createdTime] - Creation date in epoch format.
/// * [reportingConversionEvent] - For advertiser-defined events, the reporting event label shown in optimization UIs.
@BuiltValue()
abstract class ConversionEventResponse implements Built<ConversionEventResponse, ConversionEventResponseBuilder> {
  /// Id of the ad account.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  @BuiltValueField(wireName: r'conversion_event')
  ConversionTagType? get conversionEvent;
  // enum conversionEventEnum {  PAGE_LOAD,  UNKNOWN,  INITIALIZED,  PAGE_VISIT,  SIGNUP,  CHECKOUT,  CUSTOM,  VIEW_CATEGORY,  SEARCH,  ADD_TO_CART,  WATCH_VIDEO,  LEAD,  APP_INSTALL,  WEB_SESSION,  EXTERNAL_MEASUREMENT,  ADD_PAYMENT_INFO,  ADD_TO_WISHLIST,  INITIATE_CHECKOUT,  SUBSCRIBE,  VIEW_CONTENT,  ADVERTISER_DEFINED_EVENT,  APP_OPEN,  CONTACT,  SCHEDULE,  FIND_LOCATION,  CUSTOMIZE_PRODUCT,  SUBMIT_APPLICATION,  START_TRIAL,  };

  /// Id of the tag.
  @BuiltValueField(wireName: r'conversion_tag_id')
  String? get conversionTagId;

  /// Creation date in epoch format.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// For advertiser-defined events, the reporting event label shown in optimization UIs.
  @BuiltValueField(wireName: r'reporting_conversion_event')
  String? get reportingConversionEvent;

  ConversionEventResponse._();

  factory ConversionEventResponse([void updates(ConversionEventResponseBuilder b)]) = _$ConversionEventResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventResponse> get serializer => _$ConversionEventResponseSerializer();
}

class _$ConversionEventResponseSerializer implements PrimitiveSerializer<ConversionEventResponse> {
  @override
  final Iterable<Type> types = const [ConversionEventResponse, _$ConversionEventResponse];

  @override
  final String wireName = r'ConversionEventResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.conversionEvent != null) {
      yield r'conversion_event';
      yield serializers.serialize(
        object.conversionEvent,
        specifiedType: const FullType(ConversionTagType),
      );
    }
    if (object.conversionTagId != null) {
      yield r'conversion_tag_id';
      yield serializers.serialize(
        object.conversionTagId,
        specifiedType: const FullType(String),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.reportingConversionEvent != null) {
      yield r'reporting_conversion_event';
      yield serializers.serialize(
        object.reportingConversionEvent,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEventResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adAccountId = valueDes;
          break;
        case r'conversion_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionTagType),
          ) as ConversionTagType?;
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
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'reporting_conversion_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.reportingConversionEvent = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionEventResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventResponseBuilder();
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

