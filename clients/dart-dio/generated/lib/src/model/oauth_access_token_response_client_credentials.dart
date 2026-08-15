//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'oauth_access_token_response_client_credentials.g.dart';

/// A successful OAuth client token response for the client token flow.
///
/// Properties:
/// * [accessToken] 
/// * [expiresIn] 
/// * [responseType] 
/// * [scope] 
/// * [tokenType] 
@BuiltValue()
abstract class OauthAccessTokenResponseClientCredentials implements Built<OauthAccessTokenResponseClientCredentials, OauthAccessTokenResponseClientCredentialsBuilder> {
  @BuiltValueField(wireName: r'access_token')
  String get accessToken;

  @BuiltValueField(wireName: r'expires_in')
  int get expiresIn;

  @BuiltValueField(wireName: r'response_type')
  OauthAccessTokenResponseClientCredentialsResponseTypeEnum? get responseType;
  // enum responseTypeEnum {  authorization_code,  refresh_token,  client_credentials,  };

  @BuiltValueField(wireName: r'scope')
  String get scope;

  @BuiltValueField(wireName: r'token_type')
  String get tokenType;

  OauthAccessTokenResponseClientCredentials._();

  factory OauthAccessTokenResponseClientCredentials([void updates(OauthAccessTokenResponseClientCredentialsBuilder b)]) = _$OauthAccessTokenResponseClientCredentials;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OauthAccessTokenResponseClientCredentialsBuilder b) => b
      ..tokenType = 'bearer';

  @BuiltValueSerializer(custom: true)
  static Serializer<OauthAccessTokenResponseClientCredentials> get serializer => _$OauthAccessTokenResponseClientCredentialsSerializer();
}

class _$OauthAccessTokenResponseClientCredentialsSerializer implements PrimitiveSerializer<OauthAccessTokenResponseClientCredentials> {
  @override
  final Iterable<Type> types = const [OauthAccessTokenResponseClientCredentials, _$OauthAccessTokenResponseClientCredentials];

  @override
  final String wireName = r'OauthAccessTokenResponseClientCredentials';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OauthAccessTokenResponseClientCredentials object, {
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
        specifiedType: const FullType(OauthAccessTokenResponseClientCredentialsResponseTypeEnum),
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
    OauthAccessTokenResponseClientCredentials object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OauthAccessTokenResponseClientCredentialsBuilder result,
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
            specifiedType: const FullType(OauthAccessTokenResponseClientCredentialsResponseTypeEnum),
          ) as OauthAccessTokenResponseClientCredentialsResponseTypeEnum;
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
  OauthAccessTokenResponseClientCredentials deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OauthAccessTokenResponseClientCredentialsBuilder();
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

class OauthAccessTokenResponseClientCredentialsResponseTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'authorization_code')
  static const OauthAccessTokenResponseClientCredentialsResponseTypeEnum authorizationCode = _$oauthAccessTokenResponseClientCredentialsResponseTypeEnum_authorizationCode;
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const OauthAccessTokenResponseClientCredentialsResponseTypeEnum refreshToken = _$oauthAccessTokenResponseClientCredentialsResponseTypeEnum_refreshToken;
  @BuiltValueEnumConst(wireName: r'client_credentials')
  static const OauthAccessTokenResponseClientCredentialsResponseTypeEnum clientCredentials = _$oauthAccessTokenResponseClientCredentialsResponseTypeEnum_clientCredentials;

  static Serializer<OauthAccessTokenResponseClientCredentialsResponseTypeEnum> get serializer => _$oauthAccessTokenResponseClientCredentialsResponseTypeEnumSerializer;

  const OauthAccessTokenResponseClientCredentialsResponseTypeEnum._(String name): super(name);

  static BuiltSet<OauthAccessTokenResponseClientCredentialsResponseTypeEnum> get values => _$oauthAccessTokenResponseClientCredentialsResponseTypeEnumValues;
  static OauthAccessTokenResponseClientCredentialsResponseTypeEnum valueOf(String name) => _$oauthAccessTokenResponseClientCredentialsResponseTypeEnumValueOf(name);
}

