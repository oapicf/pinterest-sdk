//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'oauth_access_token_request_code.g.dart';

/// OauthAccessTokenRequestCode
///
/// Properties:
/// * [code] 
/// * [redirectUri] 
/// * [grantType] 
@BuiltValue()
abstract class OauthAccessTokenRequestCode implements Built<OauthAccessTokenRequestCode, OauthAccessTokenRequestCodeBuilder> {
  @BuiltValueField(wireName: r'code')
  String get code;

  @BuiltValueField(wireName: r'redirect_uri')
  String get redirectUri;

  @BuiltValueField(wireName: r'grant_type')
  OauthAccessTokenRequestCodeGrantTypeEnum get grantType;
  // enum grantTypeEnum {  authorization_code,  refresh_token,  client_credentials,  };

  OauthAccessTokenRequestCode._();

  factory OauthAccessTokenRequestCode([void updates(OauthAccessTokenRequestCodeBuilder b)]) = _$OauthAccessTokenRequestCode;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OauthAccessTokenRequestCodeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OauthAccessTokenRequestCode> get serializer => _$OauthAccessTokenRequestCodeSerializer();
}

class _$OauthAccessTokenRequestCodeSerializer implements PrimitiveSerializer<OauthAccessTokenRequestCode> {
  @override
  final Iterable<Type> types = const [OauthAccessTokenRequestCode, _$OauthAccessTokenRequestCode];

  @override
  final String wireName = r'OauthAccessTokenRequestCode';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OauthAccessTokenRequestCode object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(String),
    );
    yield r'redirect_uri';
    yield serializers.serialize(
      object.redirectUri,
      specifiedType: const FullType(String),
    );
    yield r'grant_type';
    yield serializers.serialize(
      object.grantType,
      specifiedType: const FullType(OauthAccessTokenRequestCodeGrantTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    OauthAccessTokenRequestCode object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OauthAccessTokenRequestCodeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.code = valueDes;
          break;
        case r'redirect_uri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.redirectUri = valueDes;
          break;
        case r'grant_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OauthAccessTokenRequestCodeGrantTypeEnum),
          ) as OauthAccessTokenRequestCodeGrantTypeEnum;
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
  OauthAccessTokenRequestCode deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OauthAccessTokenRequestCodeBuilder();
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

class OauthAccessTokenRequestCodeGrantTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'authorization_code')
  static const OauthAccessTokenRequestCodeGrantTypeEnum authorizationCode = _$oauthAccessTokenRequestCodeGrantTypeEnum_authorizationCode;
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const OauthAccessTokenRequestCodeGrantTypeEnum refreshToken = _$oauthAccessTokenRequestCodeGrantTypeEnum_refreshToken;
  @BuiltValueEnumConst(wireName: r'client_credentials')
  static const OauthAccessTokenRequestCodeGrantTypeEnum clientCredentials = _$oauthAccessTokenRequestCodeGrantTypeEnum_clientCredentials;

  static Serializer<OauthAccessTokenRequestCodeGrantTypeEnum> get serializer => _$oauthAccessTokenRequestCodeGrantTypeEnumSerializer;

  const OauthAccessTokenRequestCodeGrantTypeEnum._(String name): super(name);

  static BuiltSet<OauthAccessTokenRequestCodeGrantTypeEnum> get values => _$oauthAccessTokenRequestCodeGrantTypeEnumValues;
  static OauthAccessTokenRequestCodeGrantTypeEnum valueOf(String name) => _$oauthAccessTokenRequestCodeGrantTypeEnumValueOf(name);
}

