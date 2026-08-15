//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'oauth_access_token_response_code.g.dart';

/// OauthAccessTokenResponseCode
///
/// Properties:
/// * [refreshToken] 
/// * [refreshTokenExpiresAt] 
/// * [refreshTokenExpiresIn] 
/// * [accessToken] 
/// * [expiresIn] 
/// * [responseType] 
/// * [scope] 
/// * [tokenType] 
@BuiltValue()
abstract class OauthAccessTokenResponseCode implements Built<OauthAccessTokenResponseCode, OauthAccessTokenResponseCodeBuilder> {
  @BuiltValueField(wireName: r'refresh_token')
  String? get refreshToken;

  @BuiltValueField(wireName: r'refresh_token_expires_at')
  int? get refreshTokenExpiresAt;

  @BuiltValueField(wireName: r'refresh_token_expires_in')
  int? get refreshTokenExpiresIn;

  @BuiltValueField(wireName: r'access_token')
  String get accessToken;

  @BuiltValueField(wireName: r'expires_in')
  int get expiresIn;

  @BuiltValueField(wireName: r'response_type')
  OauthAccessTokenResponseCodeResponseTypeEnum? get responseType;
  // enum responseTypeEnum {  authorization_code,  refresh_token,  client_credentials,  };

  @BuiltValueField(wireName: r'scope')
  String get scope;

  @BuiltValueField(wireName: r'token_type')
  String get tokenType;

  OauthAccessTokenResponseCode._();

  factory OauthAccessTokenResponseCode([void updates(OauthAccessTokenResponseCodeBuilder b)]) = _$OauthAccessTokenResponseCode;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OauthAccessTokenResponseCodeBuilder b) => b
      ..tokenType = 'bearer';

  @BuiltValueSerializer(custom: true)
  static Serializer<OauthAccessTokenResponseCode> get serializer => _$OauthAccessTokenResponseCodeSerializer();
}

class _$OauthAccessTokenResponseCodeSerializer implements PrimitiveSerializer<OauthAccessTokenResponseCode> {
  @override
  final Iterable<Type> types = const [OauthAccessTokenResponseCode, _$OauthAccessTokenResponseCode];

  @override
  final String wireName = r'OauthAccessTokenResponseCode';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OauthAccessTokenResponseCode object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.refreshToken != null) {
      yield r'refresh_token';
      yield serializers.serialize(
        object.refreshToken,
        specifiedType: const FullType(String),
      );
    }
    if (object.refreshTokenExpiresAt != null) {
      yield r'refresh_token_expires_at';
      yield serializers.serialize(
        object.refreshTokenExpiresAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.refreshTokenExpiresIn != null) {
      yield r'refresh_token_expires_in';
      yield serializers.serialize(
        object.refreshTokenExpiresIn,
        specifiedType: const FullType(int),
      );
    }
    yield r'access_token';
    yield serializers.serialize(
      object.accessToken,
      specifiedType: const FullType(String),
    );
    yield r'expires_in';
    yield serializers.serialize(
      object.expiresIn,
      specifiedType: const FullType(int),
    );
    if (object.responseType != null) {
      yield r'response_type';
      yield serializers.serialize(
        object.responseType,
        specifiedType: const FullType(OauthAccessTokenResponseCodeResponseTypeEnum),
      );
    }
    yield r'scope';
    yield serializers.serialize(
      object.scope,
      specifiedType: const FullType(String),
    );
    yield r'token_type';
    yield serializers.serialize(
      object.tokenType,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    OauthAccessTokenResponseCode object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OauthAccessTokenResponseCodeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'refresh_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.refreshToken = valueDes;
          break;
        case r'refresh_token_expires_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.refreshTokenExpiresAt = valueDes;
          break;
        case r'refresh_token_expires_in':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.refreshTokenExpiresIn = valueDes;
          break;
        case r'access_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.accessToken = valueDes;
          break;
        case r'expires_in':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.expiresIn = valueDes;
          break;
        case r'response_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OauthAccessTokenResponseCodeResponseTypeEnum),
          ) as OauthAccessTokenResponseCodeResponseTypeEnum;
          result.responseType = valueDes;
          break;
        case r'scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.scope = valueDes;
          break;
        case r'token_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.tokenType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OauthAccessTokenResponseCode deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OauthAccessTokenResponseCodeBuilder();
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

class OauthAccessTokenResponseCodeResponseTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'authorization_code')
  static const OauthAccessTokenResponseCodeResponseTypeEnum authorizationCode = _$oauthAccessTokenResponseCodeResponseTypeEnum_authorizationCode;
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const OauthAccessTokenResponseCodeResponseTypeEnum refreshToken = _$oauthAccessTokenResponseCodeResponseTypeEnum_refreshToken;
  @BuiltValueEnumConst(wireName: r'client_credentials')
  static const OauthAccessTokenResponseCodeResponseTypeEnum clientCredentials = _$oauthAccessTokenResponseCodeResponseTypeEnum_clientCredentials;

  static Serializer<OauthAccessTokenResponseCodeResponseTypeEnum> get serializer => _$oauthAccessTokenResponseCodeResponseTypeEnumSerializer;

  const OauthAccessTokenResponseCodeResponseTypeEnum._(String name): super(name);

  static BuiltSet<OauthAccessTokenResponseCodeResponseTypeEnum> get values => _$oauthAccessTokenResponseCodeResponseTypeEnumValues;
  static OauthAccessTokenResponseCodeResponseTypeEnum valueOf(String name) => _$oauthAccessTokenResponseCodeResponseTypeEnumValueOf(name);
}

