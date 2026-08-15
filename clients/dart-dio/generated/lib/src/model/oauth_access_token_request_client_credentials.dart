//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'oauth_access_token_request_client_credentials.g.dart';

/// OauthAccessTokenRequestClientCredentials
///
/// Properties:
/// * [scope] 
/// * [grantType] 
@BuiltValue()
abstract class OauthAccessTokenRequestClientCredentials implements Built<OauthAccessTokenRequestClientCredentials, OauthAccessTokenRequestClientCredentialsBuilder> {
  @BuiltValueField(wireName: r'scope')
  String get scope;

  @BuiltValueField(wireName: r'grant_type')
  OauthAccessTokenRequestClientCredentialsGrantTypeEnum get grantType;
  // enum grantTypeEnum {  authorization_code,  refresh_token,  client_credentials,  };

  OauthAccessTokenRequestClientCredentials._();

  factory OauthAccessTokenRequestClientCredentials([void updates(OauthAccessTokenRequestClientCredentialsBuilder b)]) = _$OauthAccessTokenRequestClientCredentials;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OauthAccessTokenRequestClientCredentialsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OauthAccessTokenRequestClientCredentials> get serializer => _$OauthAccessTokenRequestClientCredentialsSerializer();
}

class _$OauthAccessTokenRequestClientCredentialsSerializer implements PrimitiveSerializer<OauthAccessTokenRequestClientCredentials> {
  @override
  final Iterable<Type> types = const [OauthAccessTokenRequestClientCredentials, _$OauthAccessTokenRequestClientCredentials];

  @override
  final String wireName = r'OauthAccessTokenRequestClientCredentials';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OauthAccessTokenRequestClientCredentials object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'scope';
    yield serializers.serialize(
      object.scope,
      specifiedType: const FullType(String),
    );
    yield r'grant_type';
    yield serializers.serialize(
      object.grantType,
      specifiedType: const FullType(OauthAccessTokenRequestClientCredentialsGrantTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    OauthAccessTokenRequestClientCredentials object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OauthAccessTokenRequestClientCredentialsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.scope = valueDes;
          break;
        case r'grant_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OauthAccessTokenRequestClientCredentialsGrantTypeEnum),
          ) as OauthAccessTokenRequestClientCredentialsGrantTypeEnum;
          result.grantType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OauthAccessTokenRequestClientCredentials deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OauthAccessTokenRequestClientCredentialsBuilder();
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

class OauthAccessTokenRequestClientCredentialsGrantTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'authorization_code')
  static const OauthAccessTokenRequestClientCredentialsGrantTypeEnum authorizationCode = _$oauthAccessTokenRequestClientCredentialsGrantTypeEnum_authorizationCode;
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const OauthAccessTokenRequestClientCredentialsGrantTypeEnum refreshToken = _$oauthAccessTokenRequestClientCredentialsGrantTypeEnum_refreshToken;
  @BuiltValueEnumConst(wireName: r'client_credentials')
  static const OauthAccessTokenRequestClientCredentialsGrantTypeEnum clientCredentials = _$oauthAccessTokenRequestClientCredentialsGrantTypeEnum_clientCredentials;

  static Serializer<OauthAccessTokenRequestClientCredentialsGrantTypeEnum> get serializer => _$oauthAccessTokenRequestClientCredentialsGrantTypeEnumSerializer;

  const OauthAccessTokenRequestClientCredentialsGrantTypeEnum._(String name): super(name);

  static BuiltSet<OauthAccessTokenRequestClientCredentialsGrantTypeEnum> get values => _$oauthAccessTokenRequestClientCredentialsGrantTypeEnumValues;
  static OauthAccessTokenRequestClientCredentialsGrantTypeEnum valueOf(String name) => _$oauthAccessTokenRequestClientCredentialsGrantTypeEnumValueOf(name);
}

