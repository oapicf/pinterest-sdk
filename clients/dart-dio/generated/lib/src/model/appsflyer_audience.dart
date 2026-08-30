//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/appsflyer_platform.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'appsflyer_audience.g.dart';

/// Request model for creating an AppsFlyer audience
///
/// Properties:
/// * [containerId] - The ID of the audience container
/// * [name] - The name of the audience
/// * [platform] - The platform of the audience
@BuiltValue()
abstract class AppsflyerAudience implements Built<AppsflyerAudience, AppsflyerAudienceBuilder> {
  /// The ID of the audience container
  @BuiltValueField(wireName: r'container_id')
  String get containerId;

  /// The name of the audience
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The platform of the audience
  @BuiltValueField(wireName: r'platform')
  AppsflyerPlatform get platform;
  // enum platformEnum {  android,  ios,  };

  AppsflyerAudience._();

  factory AppsflyerAudience([void updates(AppsflyerAudienceBuilder b)]) = _$AppsflyerAudience;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AppsflyerAudienceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AppsflyerAudience> get serializer => _$AppsflyerAudienceSerializer();
}

class _$AppsflyerAudienceSerializer implements PrimitiveSerializer<AppsflyerAudience> {
  @override
  final Iterable<Type> types = const [AppsflyerAudience, _$AppsflyerAudience];

  @override
  final String wireName = r'AppsflyerAudience';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AppsflyerAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'container_id';
    yield serializers.serialize(
      object.containerId,
      specifiedType: const FullType(String),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'platform';
    yield serializers.serialize(
      object.platform,
      specifiedType: const FullType(AppsflyerPlatform),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AppsflyerAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AppsflyerAudienceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'container_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.containerId = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'platform':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AppsflyerPlatform),
          ) as AppsflyerPlatform;
          result.platform = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AppsflyerAudience deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AppsflyerAudienceBuilder();
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

