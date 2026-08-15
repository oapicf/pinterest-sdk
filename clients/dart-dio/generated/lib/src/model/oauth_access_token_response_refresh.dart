//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'oauth_access_token_response_refresh.g.dart';

/// A successful OAuth access token response for the refresh token flow.
///
/// Properties:
/// * [accessToken] 
/// * [expiresIn] 
/// * [responseType] 
/// * [scope] 
/// * [tokenType] 
/// * [refreshToken] 
/// * [refreshTokenExpiresAt] 
/// * [refreshTokenExpiresIn] 
@BuiltValue()
abstract class OauthAccessTokenResponseRefresh implements Built<OauthAccessTokenResponseRefresh, OauthAccessTokenResponseRefreshBuilder> {
  @BuiltValueField(wireName: r'access_token')
  String get accessToken;

  @BuiltValueField(wireName: r'expires_in')
  int get expiresIn;

  @BuiltValueField(wireName: r'response_type')
  OauthAccessTokenResponseRefreshResponseTypeEnum? get responseType;
  // enum responseTypeEnum {  authorization_code,  refresh_token,  client_credentials,  };

  @BuiltValueField(wireName: r'scope')
  String get scope;

  @BuiltValueField(wireName: r'token_type')
  String get tokenType;

  @BuiltValueField(wireName: r'refresh_token')
  String get refreshToken;

  @BuiltValueField(wireName: r'refresh_token_expires_at')
  int get refreshTokenExpiresAt;

  @BuiltValueField(wireName: r'refresh_token_expires_in')
  int get refreshTokenExpiresIn;

  OauthAccessTokenResponseRefresh._();

  factory OauthAccessTokenResponseRefresh([void updates(OauthAccessTokenResponseRefreshBuilder b)]) = _$OauthAccessTokenResponseRefresh;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OauthAccessTokenResponseRefreshBuilder b) => b
      ..tokenType = 'bearer';

  @BuiltValueSerializer(custom: true)
  static Serializer<OauthAccessTokenResponseRefresh> get serializer => _$OauthAccessTokenResponseRefreshSerializer();
}

class _$OauthAccessTokenResponseRefreshSerializer implements PrimitiveSerializer<OauthAccessTokenResponseRefresh> {
  @override
  final Iterable<Type> types = const [OauthAccessTokenResponseRefresh, _$OauthAccessTokenResponseRefresh];

  @override
  final String wireName = r'OauthAccessTokenResponseRefresh';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OauthAccessTokenResponseRefresh object, {
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
    if (object.responseType != null) {
      yield r'response_type';
      yield serializers.serialize(
        object.responseType,
        specifiedType: const FullType(OauthAccessTokenResponseRefreshResponseTypeEnum),
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
    yield r'refresh_token';
    yield serializers.serialize(
      object.refreshToken,
      specifiedType: const FullType(String),
    );
    yield r'refresh_token_expires_at';
    yield serializers.serialize(
      object.refreshTokenExpiresAt,
      specifiedType: const FullType(int),
    );
    yield r'refresh_token_expires_in';
    yield serializers.serialize(
      object.refreshTokenExpiresIn,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    OauthAccessTokenResponseRefresh object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OauthAccessTokenResponseRefreshBuilder result,
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
        case r'response_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OauthAccessTokenResponseRefreshResponseTypeEnum),
          ) as OauthAccessTokenResponseRefreshResponseTypeEnum;
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OauthAccessTokenResponseRefresh deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OauthAccessTokenResponseRefreshBuilder();
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

class OauthAccessTokenResponseRefreshResponseTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'authorization_code')
  static const OauthAccessTokenResponseRefreshResponseTypeEnum authorizationCode = _$oauthAccessTokenResponseRefreshResponseTypeEnum_authorizationCode;
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const OauthAccessTokenResponseRefreshResponseTypeEnum refreshToken = _$oauthAccessTokenResponseRefreshResponseTypeEnum_refreshToken;
  @BuiltValueEnumConst(wireName: r'client_credentials')
  static const OauthAccessTokenResponseRefreshResponseTypeEnum clientCredentials = _$oauthAccessTokenResponseRefreshResponseTypeEnum_clientCredentials;

  static Serializer<OauthAccessTokenResponseRefreshResponseTypeEnum> get serializer => _$oauthAccessTokenResponseRefreshResponseTypeEnumSerializer;

  const OauthAccessTokenResponseRefreshResponseTypeEnum._(String name): super(name);

  static BuiltSet<OauthAccessTokenResponseRefreshResponseTypeEnum> get values => _$oauthAccessTokenResponseRefreshResponseTypeEnumValues;
  static OauthAccessTokenResponseRefreshResponseTypeEnum valueOf(String name) => _$oauthAccessTokenResponseRefreshResponseTypeEnumValueOf(name);
}

