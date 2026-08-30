//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/website_verification_method.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_website_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [verificationMethod] - Method used to verify website ownership.
/// * [website] - Website with path or domain only
@BuiltValue()
abstract class UserWebsiteCreate implements Built<UserWebsiteCreate, UserWebsiteCreateBuilder> {
  /// Method used to verify website ownership.
  @BuiltValueField(wireName: r'verification_method')
  WebsiteVerificationMethod? get verificationMethod;
  // enum verificationMethodEnum {  FILENAME,  METATAG,  DNSTXT,  };

  /// Website with path or domain only
  @BuiltValueField(wireName: r'website')
  String? get website;

  UserWebsiteCreate._();

  factory UserWebsiteCreate([void updates(UserWebsiteCreateBuilder b)]) = _$UserWebsiteCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserWebsiteCreateBuilder b) => b
      ..verificationMethod = WebsiteVerificationMethod.METATAG;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserWebsiteCreate> get serializer => _$UserWebsiteCreateSerializer();
}

class _$UserWebsiteCreateSerializer implements PrimitiveSerializer<UserWebsiteCreate> {
  @override
  final Iterable<Type> types = const [UserWebsiteCreate, _$UserWebsiteCreate];

  @override
  final String wireName = r'UserWebsiteCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserWebsiteCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.verificationMethod != null) {
      yield r'verification_method';
      yield serializers.serialize(
        object.verificationMethod,
        specifiedType: const FullType(WebsiteVerificationMethod),
      );
    }
    if (object.website != null) {
      yield r'website';
      yield serializers.serialize(
        object.website,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UserWebsiteCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserWebsiteCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'verification_method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(WebsiteVerificationMethod),
          ) as WebsiteVerificationMethod?;
          if (valueDes == null) continue;
          result.verificationMethod = valueDes;
          break;
        case r'website':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.website = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UserWebsiteCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserWebsiteCreateBuilder();
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

