//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'oauth_access_token_response.g.dart';

/// A successful OAuth access token response.
///
/// Properties:
/// * [accessToken] 
/// * [expiresIn] 
/// * [responseType] 
/// * [scope] 
/// * [tokenType] 
@BuiltValue()
abstract class OauthAccessTokenResponse implements Built<OauthAccessTokenResponse, OauthAccessTokenResponseBuilder> {
  @BuiltValueField(wireName: r'access_token')
  String get accessToken;

  @BuiltValueField(wireName: r'expires_in')
  int get expiresIn;

  @BuiltValueField(wireName: r'response_type')
  OauthAccessTokenResponseResponseTypeEnum? get responseType;
  // enum responseTypeEnum {  authorization_code,  refresh_token,  client_credentials,  };

  @BuiltValueField(wireName: r'scope')
  String get scope;

  @BuiltValueField(wireName: r'token_type')
  String get tokenType;

  OauthAccessTokenResponse._();

  factory OauthAccessTokenResponse([void updates(OauthAccessTokenResponseBuilder b)]) = _$OauthAccessTokenResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OauthAccessTokenResponseBuilder b) => b..responseType=b.discriminatorValue
      ..tokenType = 'bearer';

  @BuiltValueSerializer(custom: true)
  static Serializer<OauthAccessTokenResponse> get serializer => _$OauthAccessTokenResponseSerializer();
}

class _$OauthAccessTokenResponseSerializer implements PrimitiveSerializer<OauthAccessTokenResponse> {
  @override
  final Iterable<Type> types = const [OauthAccessTokenResponse, _$OauthAccessTokenResponse];

  @override
  final String wireName = r'OauthAccessTokenResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OauthAccessTokenResponse object, {
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
        specifiedType: const FullType(OauthAccessTokenResponseResponseTypeEnum),
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
    OauthAccessTokenResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OauthAccessTokenResponseBuilder result,
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
            specifiedType: const FullType(OauthAccessTokenResponseResponseTypeEnum),
          ) as OauthAccessTokenResponseResponseTypeEnum;
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
  OauthAccessTokenResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OauthAccessTokenResponseBuilder();
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

class OauthAccessTokenResponseResponseTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'authorization_code')
  static const OauthAccessTokenResponseResponseTypeEnum authorizationCode = _$oauthAccessTokenResponseResponseTypeEnum_authorizationCode;
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const OauthAccessTokenResponseResponseTypeEnum refreshToken = _$oauthAccessTokenResponseResponseTypeEnum_refreshToken;
  @BuiltValueEnumConst(wireName: r'client_credentials')
  static const OauthAccessTokenResponseResponseTypeEnum clientCredentials = _$oauthAccessTokenResponseResponseTypeEnum_clientCredentials;

  static Serializer<OauthAccessTokenResponseResponseTypeEnum> get serializer => _$oauthAccessTokenResponseResponseTypeEnumSerializer;

  const OauthAccessTokenResponseResponseTypeEnum._(String name): super(name);

  static BuiltSet<OauthAccessTokenResponseResponseTypeEnum> get values => _$oauthAccessTokenResponseResponseTypeEnumValues;
  static OauthAccessTokenResponseResponseTypeEnum valueOf(String name) => _$oauthAccessTokenResponseResponseTypeEnumValueOf(name);
}

