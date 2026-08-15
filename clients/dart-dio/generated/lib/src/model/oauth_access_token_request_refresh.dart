//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'oauth_access_token_request_refresh.g.dart';

/// OauthAccessTokenRequestRefresh
///
/// Properties:
/// * [refreshToken] 
/// * [scope] 
/// * [grantType] 
@BuiltValue()
abstract class OauthAccessTokenRequestRefresh implements Built<OauthAccessTokenRequestRefresh, OauthAccessTokenRequestRefreshBuilder> {
  @BuiltValueField(wireName: r'refresh_token')
  String get refreshToken;

  @BuiltValueField(wireName: r'scope')
  String? get scope;

  @BuiltValueField(wireName: r'grant_type')
  OauthAccessTokenRequestRefreshGrantTypeEnum get grantType;
  // enum grantTypeEnum {  authorization_code,  refresh_token,  client_credentials,  };

  OauthAccessTokenRequestRefresh._();

  factory OauthAccessTokenRequestRefresh([void updates(OauthAccessTokenRequestRefreshBuilder b)]) = _$OauthAccessTokenRequestRefresh;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OauthAccessTokenRequestRefreshBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OauthAccessTokenRequestRefresh> get serializer => _$OauthAccessTokenRequestRefreshSerializer();
}

class _$OauthAccessTokenRequestRefreshSerializer implements PrimitiveSerializer<OauthAccessTokenRequestRefresh> {
  @override
  final Iterable<Type> types = const [OauthAccessTokenRequestRefresh, _$OauthAccessTokenRequestRefresh];

  @override
  final String wireName = r'OauthAccessTokenRequestRefresh';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OauthAccessTokenRequestRefresh object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'refresh_token';
    yield serializers.serialize(
      object.refreshToken,
      specifiedType: const FullType(String),
    );
    if (object.scope != null) {
      yield r'scope';
      yield serializers.serialize(
        object.scope,
        specifiedType: const FullType(String),
      );
    }
    yield r'grant_type';
    yield serializers.serialize(
      object.grantType,
      specifiedType: const FullType(OauthAccessTokenRequestRefreshGrantTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    OauthAccessTokenRequestRefresh object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OauthAccessTokenRequestRefreshBuilder result,
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
            specifiedType: const FullType(OauthAccessTokenRequestRefreshGrantTypeEnum),
          ) as OauthAccessTokenRequestRefreshGrantTypeEnum;
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
  OauthAccessTokenRequestRefresh deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OauthAccessTokenRequestRefreshBuilder();
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

class OauthAccessTokenRequestRefreshGrantTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'authorization_code')
  static const OauthAccessTokenRequestRefreshGrantTypeEnum authorizationCode = _$oauthAccessTokenRequestRefreshGrantTypeEnum_authorizationCode;
  @BuiltValueEnumConst(wireName: r'refresh_token')
  static const OauthAccessTokenRequestRefreshGrantTypeEnum refreshToken = _$oauthAccessTokenRequestRefreshGrantTypeEnum_refreshToken;
  @BuiltValueEnumConst(wireName: r'client_credentials')
  static const OauthAccessTokenRequestRefreshGrantTypeEnum clientCredentials = _$oauthAccessTokenRequestRefreshGrantTypeEnum_clientCredentials;

  static Serializer<OauthAccessTokenRequestRefreshGrantTypeEnum> get serializer => _$oauthAccessTokenRequestRefreshGrantTypeEnumSerializer;

  const OauthAccessTokenRequestRefreshGrantTypeEnum._(String name): super(name);

  static BuiltSet<OauthAccessTokenRequestRefreshGrantTypeEnum> get values => _$oauthAccessTokenRequestRefreshGrantTypeEnumValues;
  static OauthAccessTokenRequestRefreshGrantTypeEnum valueOf(String name) => _$oauthAccessTokenRequestRefreshGrantTypeEnumValueOf(name);
}

