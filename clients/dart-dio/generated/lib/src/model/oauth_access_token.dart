//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/token_grant_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'oauth_access_token.g.dart';

/// Describes the valid schema for possible OAuth access token requests.
///
/// Properties:
/// * [accessToken] 
/// * [expiresIn] 
/// * [refreshToken] 
/// * [refreshTokenExpiresAt] 
/// * [refreshTokenExpiresIn] 
/// * [responseType] 
/// * [scope] 
/// * [tokenType] 
@BuiltValue()
abstract class OauthAccessToken implements Built<OauthAccessToken, OauthAccessTokenBuilder> {
  @BuiltValueField(wireName: r'access_token')
  String get accessToken;

  @BuiltValueField(wireName: r'expires_in')
  int get expiresIn;

  @BuiltValueField(wireName: r'refresh_token')
  String? get refreshToken;

  @BuiltValueField(wireName: r'refresh_token_expires_at')
  int? get refreshTokenExpiresAt;

  @BuiltValueField(wireName: r'refresh_token_expires_in')
  int? get refreshTokenExpiresIn;

  @BuiltValueField(wireName: r'response_type')
  TokenGrantType? get responseType;
  // enum responseTypeEnum {  authorization_code,  refresh_token,  client_credentials,  };

  @BuiltValueField(wireName: r'scope')
  String? get scope;

  @BuiltValueField(wireName: r'token_type')
  String get tokenType;

  OauthAccessToken._();

  factory OauthAccessToken([void updates(OauthAccessTokenBuilder b)]) = _$OauthAccessToken;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OauthAccessTokenBuilder b) => b
      ..tokenType = 'bearer';

  @BuiltValueSerializer(custom: true)
  static Serializer<OauthAccessToken> get serializer => _$OauthAccessTokenSerializer();
}

class _$OauthAccessTokenSerializer implements PrimitiveSerializer<OauthAccessToken> {
  @override
  final Iterable<Type> types = const [OauthAccessToken, _$OauthAccessToken];

  @override
  final String wireName = r'OauthAccessToken';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OauthAccessToken object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    if (object.responseType != null) {
      yield r'response_type';
      yield serializers.serialize(
        object.responseType,
        specifiedType: const FullType(TokenGrantType),
      );
    }
    if (object.scope != null) {
      yield r'scope';
      yield serializers.serialize(
        object.scope,
        specifiedType: const FullType(String),
      );
    }
    yield r'token_type';
    yield serializers.serialize(
      object.tokenType,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    OauthAccessToken object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OauthAccessTokenBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
        case r'refresh_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.refreshToken = valueDes;
          break;
        case r'refresh_token_expires_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.refreshTokenExpiresAt = valueDes;
          break;
        case r'refresh_token_expires_in':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.refreshTokenExpiresIn = valueDes;
          break;
        case r'response_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TokenGrantType),
          ) as TokenGrantType?;
          if (valueDes == null) continue;
          result.responseType = valueDes;
          break;
        case r'scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  OauthAccessToken deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OauthAccessTokenBuilder();
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

