//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_event_app_info.dart';
import 'package:openapi/src/model/conversion_event_device_info.dart';
import 'package:openapi/src/model/conversion_events_user_data.dart';
import 'package:openapi/src/model/conversion_events_data_inner_custom_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_events_data_inner.g.dart';

/// ConversionEventsDataInner
///
/// Properties:
/// * [actionSource] - <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`
/// * [appId] - The app store app ID.
/// * [appInfo] 
/// * [appName] - Name of the app.
/// * [appVersion] - Version of the app.
/// * [customData] 
/// * [deviceBrand] - Brand of the user device.
/// * [deviceCarrier] - User device's mobile carrier.
/// * [deviceInfo] 
/// * [deviceModel] - Model of the user device.
/// * [deviceType] - Type of the user device.
/// * [eventId] - A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
/// * [eventName] - <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`
/// * [eventSourceUrl] - URL of the web conversion event.
/// * [eventTime] - The time when the event happened. Unix timestamp in seconds.
/// * [language] - Two-character ISO-639-1 language code indicating the user's language.
/// * [optOut] - When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
/// * [osVersion] - Version of the device operating system.
/// * [partnerName] - The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
/// * [userData] 
/// * [wifi] - Whether the event occurred when the user device was connected to wifi.
@BuiltValue()
abstract class ConversionEventsDataInner implements Built<ConversionEventsDataInner, ConversionEventsDataInnerBuilder> {
  /// <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`
  @BuiltValueField(wireName: r'action_source')
  String get actionSource;

  /// The app store app ID.
  @BuiltValueField(wireName: r'app_id')
  String? get appId;

  @BuiltValueField(wireName: r'app_info')
  ConversionEventAppInfo? get appInfo;

  /// Name of the app.
  @BuiltValueField(wireName: r'app_name')
  String? get appName;

  /// Version of the app.
  @BuiltValueField(wireName: r'app_version')
  String? get appVersion;

  @BuiltValueField(wireName: r'custom_data')
  ConversionEventsDataInnerCustomData? get customData;

  /// Brand of the user device.
  @BuiltValueField(wireName: r'device_brand')
  String? get deviceBrand;

  /// User device's mobile carrier.
  @BuiltValueField(wireName: r'device_carrier')
  String? get deviceCarrier;

  @BuiltValueField(wireName: r'device_info')
  ConversionEventDeviceInfo? get deviceInfo;

  /// Model of the user device.
  @BuiltValueField(wireName: r'device_model')
  String? get deviceModel;

  /// Type of the user device.
  @BuiltValueField(wireName: r'device_type')
  String? get deviceType;

  /// A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`
  @BuiltValueField(wireName: r'event_name')
  String get eventName;

  /// URL of the web conversion event.
  @BuiltValueField(wireName: r'event_source_url')
  String? get eventSourceUrl;

  /// The time when the event happened. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'event_time')
  int get eventTime;

  /// Two-character ISO-639-1 language code indicating the user's language.
  @BuiltValueField(wireName: r'language')
  String? get language;

  /// When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
  @BuiltValueField(wireName: r'opt_out')
  bool? get optOut;

  /// Version of the device operating system.
  @BuiltValueField(wireName: r'os_version')
  String? get osVersion;

  /// The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
  @BuiltValueField(wireName: r'partner_name')
  String? get partnerName;

  @BuiltValueField(wireName: r'user_data')
  ConversionEventsUserData get userData;

  /// Whether the event occurred when the user device was connected to wifi.
  @BuiltValueField(wireName: r'wifi')
  bool? get wifi;

  ConversionEventsDataInner._();

  factory ConversionEventsDataInner([void updates(ConversionEventsDataInnerBuilder b)]) = _$ConversionEventsDataInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventsDataInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventsDataInner> get serializer => _$ConversionEventsDataInnerSerializer();
}

class _$ConversionEventsDataInnerSerializer implements PrimitiveSerializer<ConversionEventsDataInner> {
  @override
  final Iterable<Type> types = const [ConversionEventsDataInner, _$ConversionEventsDataInner];

  @override
  final String wireName = r'ConversionEventsDataInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventsDataInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'action_source';
    yield serializers.serialize(
      object.actionSource,
      specifiedType: const FullType(String),
    );
    if (object.appId != null) {
      yield r'app_id';
      yield serializers.serialize(
        object.appId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.appInfo != null) {
      yield r'app_info';
      yield serializers.serialize(
        object.appInfo,
        specifiedType: const FullType(ConversionEventAppInfo),
      );
    }
    if (object.appName != null) {
      yield r'app_name';
      yield serializers.serialize(
        object.appName,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.appVersion != null) {
      yield r'app_version';
      yield serializers.serialize(
        object.appVersion,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customData != null) {
      yield r'custom_data';
      yield serializers.serialize(
        object.customData,
        specifiedType: const FullType(ConversionEventsDataInnerCustomData),
      );
    }
    if (object.deviceBrand != null) {
      yield r'device_brand';
      yield serializers.serialize(
        object.deviceBrand,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.deviceCarrier != null) {
      yield r'device_carrier';
      yield serializers.serialize(
        object.deviceCarrier,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.deviceInfo != null) {
      yield r'device_info';
      yield serializers.serialize(
        object.deviceInfo,
        specifiedType: const FullType(ConversionEventDeviceInfo),
      );
    }
    if (object.deviceModel != null) {
      yield r'device_model';
      yield serializers.serialize(
        object.deviceModel,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.deviceType != null) {
      yield r'device_type';
      yield serializers.serialize(
        object.deviceType,
        specifiedType: const FullType.nullable(String),
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
      specifiedType: const FullType(String),
    );
    if (object.eventSourceUrl != null) {
      yield r'event_source_url';
      yield serializers.serialize(
        object.eventSourceUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'event_time';
    yield serializers.serialize(
      object.eventTime,
      specifiedType: const FullType(int),
    );
    if (object.language != null) {
      yield r'language';
      yield serializers.serialize(
        object.language,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.optOut != null) {
      yield r'opt_out';
      yield serializers.serialize(
        object.optOut,
        specifiedType: const FullType(bool),
      );
    }
    if (object.osVersion != null) {
      yield r'os_version';
      yield serializers.serialize(
        object.osVersion,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.partnerName != null) {
      yield r'partner_name';
      yield serializers.serialize(
        object.partnerName,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'user_data';
    yield serializers.serialize(
      object.userData,
      specifiedType: const FullType(ConversionEventsUserData),
    );
    if (object.wifi != null) {
      yield r'wifi';
      yield serializers.serialize(
        object.wifi,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEventsDataInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventsDataInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'action_source':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.actionSource = valueDes;
          break;
        case r'app_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.appId = valueDes;
          break;
        case r'app_info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionEventAppInfo),
          ) as ConversionEventAppInfo;
          result.appInfo.replace(valueDes);
          break;
        case r'app_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.appName = valueDes;
          break;
        case r'app_version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.appVersion = valueDes;
          break;
        case r'custom_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionEventsDataInnerCustomData),
          ) as ConversionEventsDataInnerCustomData;
          result.customData.replace(valueDes);
          break;
        case r'device_brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.deviceBrand = valueDes;
          break;
        case r'device_carrier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.deviceCarrier = valueDes;
          break;
        case r'device_info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionEventDeviceInfo),
          ) as ConversionEventDeviceInfo;
          result.deviceInfo.replace(valueDes);
          break;
        case r'device_model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.deviceModel = valueDes;
          break;
        case r'device_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.deviceType = valueDes;
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
            specifiedType: const FullType(String),
          ) as String;
          result.eventName = valueDes;
          break;
        case r'event_source_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.eventSourceUrl = valueDes;
          break;
        case r'event_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.eventTime = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.language = valueDes;
          break;
        case r'opt_out':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.optOut = valueDes;
          break;
        case r'os_version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.osVersion = valueDes;
          break;
        case r'partner_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.partnerName = valueDes;
          break;
        case r'user_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionEventsUserData),
          ) as ConversionEventsUserData;
          result.userData.replace(valueDes);
          break;
        case r'wifi':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.wifi = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionEventsDataInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventsDataInnerBuilder();
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

