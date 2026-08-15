//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'oauth_access_token_response_integration_refresh.g.dart';

/// OauthAccessTokenResponseIntegrationRefresh
///
/// Properties:
/// * [refreshToken] 
/// * [refreshTokenExpiresIn] 
/// * [accessToken] 
/// * [expiresIn] 
/// * [responseType] 
/// * [scope] 
/// * [tokenType] 
@BuiltValue()
abstract class OauthAccessTokenResponseIntegrationRefresh implements Built<OauthAccessTokenResponseIntegrationRefresh, OauthAccessTokenResponseIntegrationRefreshBuilder> {
  @BuiltValueField(wireName: r'refresh_token')
  String get refreshToken;

  @BuiltValueField(wireName: r'refresh_token_expires_in')
  int get refreshTokenExpiresIn;

  @BuiltValueField(wireName: r'access_token')
  String get accessToken;

  @BuiltValueField(wireName: r'expires_in')
  int get expiresIn;

  @BuiltValueField(wireName: r'response_type')
  OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum? get responseType;
  // enum responseTypeEnum {  authorization_code,  refresh_token,  client_credentials,  };

  @BuiltValueField(wireName: r'scope')
  String get scope;

  @BuiltValueField(wireName: r'token_type')
  String get tokenType;

  OauthAccessTokenResponseIntegrationRefresh._();

  factory OauthAccessTokenResponseIntegrationRefresh([void updates(OauthAccessTokenResponseIntegrationRefreshBuilder b)]) = _$OauthAccessTokenResponseIntegrationRefresh;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OauthAccessTokenResponseIntegrationRefreshBuilder b) => b
      ..tokenType = 'bearer';

  @BuiltValueSerializer(custom: true)
  static Serializer<OauthAccessTokenResponseIntegrationRefresh> get serializer => _$OauthAccessTokenResponseIntegrationRefreshSerializer();
}

class _$OauthAccessTokenResponseIntegrationRefreshSerializer implements PrimitiveSerializer<OauthAccessTokenResponseIntegrationRefresh> {
  @override
  final Iterable<Type> types = const [OauthAccessTokenResponseIntegrationRefresh, _$OauthAccessTokenResponseIntegrationRefresh];

  @override
  final String wireName = r'OauthAccessTokenResponseIntegrationRefresh';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OauthAccessTokenResponseIntegrationRefresh object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'refresh_token';
    yield serializers.serialize(
      object.refreshToken,
      specifiedType: const FullType(String),
    );
    yield r'refresh_token_expires_in';
    yield serializers.serialize(
      object.refreshTokenExpiresIn,
      specifiedType: const FullType(int),
    );
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
        specifiedType: const FullType(OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum),
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
    OauthAccessTokenResponseIntegrationRefresh object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OauthAccessTokenResponseIntegrationRefreshBuilder result,
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
            specifiedType: const FullType(OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum),
          ) as OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum;
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
  OauthAccessTokenResponseIntegrationRefresh deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OauthAccessTokenResponseIntegrationRefreshBuilder();
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

class OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'authorization_code')
  static const OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum authorizationCode = _$oauthAccessTokenResponseIntegrationRefreshResponseTypeEnum_authorizationCode;
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum refreshToken = _$oauthAccessTokenResponseIntegrationRefreshResponseTypeEnum_refreshToken;
  @BuiltValueEnumConst(wireName: r'client_credentials')
  static const OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum clientCredentials = _$oauthAccessTokenResponseIntegrationRefreshResponseTypeEnum_clientCredentials;

  static Serializer<OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum> get serializer => _$oauthAccessTokenResponseIntegrationRefreshResponseTypeEnumSerializer;

  const OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum._(String name): super(name);

  static BuiltSet<OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum> get values => _$oauthAccessTokenResponseIntegrationRefreshResponseTypeEnumValues;
  static OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum valueOf(String name) => _$oauthAccessTokenResponseIntegrationRefreshResponseTypeEnumValueOf(name);
}

