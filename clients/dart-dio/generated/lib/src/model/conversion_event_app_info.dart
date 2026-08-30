//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_event_app_info.g.dart';

/// Object containing information about the application where event occurred.
///
/// Properties:
/// * [appId] - App ID in Google Play Store, AppStore or other stores.
/// * [appName] - Name of the app. Primarily used for Mobile Apps.
/// * [appPackageName] - App package name
/// * [appStore] - The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
/// * [appVersion] - App version. Primarily used for mobile apps
/// * [installTime] - App install time. Unix timestamp in seconds
/// * [userAgent] - User Agent request header. Primarily used for Web events
/// * [windowHeight] - Inner height of the window or viewport.
/// * [windowWidth] - Inner width of the window or viewport.
@BuiltValue()
abstract class ConversionEventAppInfo implements Built<ConversionEventAppInfo, ConversionEventAppInfoBuilder> {
  /// App ID in Google Play Store, AppStore or other stores.
  @BuiltValueField(wireName: r'app_id')
  String? get appId;

  /// Name of the app. Primarily used for Mobile Apps.
  @BuiltValueField(wireName: r'app_name')
  String? get appName;

  /// App package name
  @BuiltValueField(wireName: r'app_package_name')
  String? get appPackageName;

  /// The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
  @BuiltValueField(wireName: r'app_store')
  String? get appStore;

  /// App version. Primarily used for mobile apps
  @BuiltValueField(wireName: r'app_version')
  String? get appVersion;

  /// App install time. Unix timestamp in seconds
  @BuiltValueField(wireName: r'install_time')
  int? get installTime;

  /// User Agent request header. Primarily used for Web events
  @BuiltValueField(wireName: r'user_agent')
  String? get userAgent;

  /// Inner height of the window or viewport.
  @BuiltValueField(wireName: r'window_height')
  int? get windowHeight;

  /// Inner width of the window or viewport.
  @BuiltValueField(wireName: r'window_width')
  int? get windowWidth;

  ConversionEventAppInfo._();

  factory ConversionEventAppInfo([void updates(ConversionEventAppInfoBuilder b)]) = _$ConversionEventAppInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventAppInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventAppInfo> get serializer => _$ConversionEventAppInfoSerializer();
}

class _$ConversionEventAppInfoSerializer implements PrimitiveSerializer<ConversionEventAppInfo> {
  @override
  final Iterable<Type> types = const [ConversionEventAppInfo, _$ConversionEventAppInfo];

  @override
  final String wireName = r'ConversionEventAppInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventAppInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.appId != null) {
      yield r'app_id';
      yield serializers.serialize(
        object.appId,
        specifiedType: const FullType(String),
      );
    }
    if (object.appName != null) {
      yield r'app_name';
      yield serializers.serialize(
        object.appName,
        specifiedType: const FullType(String),
      );
    }
    if (object.appPackageName != null) {
      yield r'app_package_name';
      yield serializers.serialize(
        object.appPackageName,
        specifiedType: const FullType(String),
      );
    }
    if (object.appStore != null) {
      yield r'app_store';
      yield serializers.serialize(
        object.appStore,
        specifiedType: const FullType(String),
      );
    }
    if (object.appVersion != null) {
      yield r'app_version';
      yield serializers.serialize(
        object.appVersion,
        specifiedType: const FullType(String),
      );
    }
    if (object.installTime != null) {
      yield r'install_time';
      yield serializers.serialize(
        object.installTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.userAgent != null) {
      yield r'user_agent';
      yield serializers.serialize(
        object.userAgent,
        specifiedType: const FullType(String),
      );
    }
    if (object.windowHeight != null) {
      yield r'window_height';
      yield serializers.serialize(
        object.windowHeight,
        specifiedType: const FullType(int),
      );
    }
    if (object.windowWidth != null) {
      yield r'window_width';
      yield serializers.serialize(
        object.windowWidth,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEventAppInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventAppInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'app_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.appId = valueDes;
          break;
        case r'app_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.appName = valueDes;
          break;
        case r'app_package_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.appPackageName = valueDes;
          break;
        case r'app_store':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.appStore = valueDes;
          break;
        case r'app_version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.appVersion = valueDes;
          break;
        case r'install_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.installTime = valueDes;
          break;
        case r'user_agent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.userAgent = valueDes;
          break;
        case r'window_height':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.windowHeight = valueDes;
          break;
        case r'window_width':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.windowWidth = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionEventAppInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventAppInfoBuilder();
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

