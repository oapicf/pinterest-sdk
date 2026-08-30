//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/appsflyer_platform.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'appsflyer_audience_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [name] - The name of the audience
/// * [platform] - The platform of the audience
@BuiltValue()
abstract class AppsflyerAudienceCreate implements Built<AppsflyerAudienceCreate, AppsflyerAudienceCreateBuilder> {
  /// The name of the audience
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The platform of the audience
  @BuiltValueField(wireName: r'platform')
  AppsflyerPlatform get platform;
  // enum platformEnum {  android,  ios,  };

  AppsflyerAudienceCreate._();

  factory AppsflyerAudienceCreate([void updates(AppsflyerAudienceCreateBuilder b)]) = _$AppsflyerAudienceCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AppsflyerAudienceCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AppsflyerAudienceCreate> get serializer => _$AppsflyerAudienceCreateSerializer();
}

class _$AppsflyerAudienceCreateSerializer implements PrimitiveSerializer<AppsflyerAudienceCreate> {
  @override
  final Iterable<Type> types = const [AppsflyerAudienceCreate, _$AppsflyerAudienceCreate];

  @override
  final String wireName = r'AppsflyerAudienceCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AppsflyerAudienceCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    AppsflyerAudienceCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AppsflyerAudienceCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  AppsflyerAudienceCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AppsflyerAudienceCreateBuilder();
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

