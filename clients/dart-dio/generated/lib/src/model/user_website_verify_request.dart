//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_website_verify_request.g.dart';

/// User website verification request
///
/// Properties:
/// * [verificationMethod] 
/// * [website] 
@BuiltValue()
abstract class UserWebsiteVerifyRequest implements Built<UserWebsiteVerifyRequest, UserWebsiteVerifyRequestBuilder> {
  @BuiltValueField(wireName: r'verification_method')
  UserWebsiteVerifyRequestVerificationMethodEnum? get verificationMethod;
  // enum verificationMethodEnum {  FILENAME,  METATAG,  DNSTXT,  };

  @BuiltValueField(wireName: r'website')
  String? get website;

  UserWebsiteVerifyRequest._();

  factory UserWebsiteVerifyRequest([void updates(UserWebsiteVerifyRequestBuilder b)]) = _$UserWebsiteVerifyRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserWebsiteVerifyRequestBuilder b) => b
      ..verificationMethod = UserWebsiteVerifyRequestVerificationMethodEnum.valueOf('METATAG');

  @BuiltValueSerializer(custom: true)
  static Serializer<UserWebsiteVerifyRequest> get serializer => _$UserWebsiteVerifyRequestSerializer();
}

class _$UserWebsiteVerifyRequestSerializer implements PrimitiveSerializer<UserWebsiteVerifyRequest> {
  @override
  final Iterable<Type> types = const [UserWebsiteVerifyRequest, _$UserWebsiteVerifyRequest];

  @override
  final String wireName = r'UserWebsiteVerifyRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserWebsiteVerifyRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.verificationMethod != null) {
      yield r'verification_method';
      yield serializers.serialize(
        object.verificationMethod,
        specifiedType: const FullType(UserWebsiteVerifyRequestVerificationMethodEnum),
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
    UserWebsiteVerifyRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserWebsiteVerifyRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'verification_method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UserWebsiteVerifyRequestVerificationMethodEnum),
          ) as UserWebsiteVerifyRequestVerificationMethodEnum;
          result.verificationMethod = valueDes;
          break;
        case r'website':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  UserWebsiteVerifyRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserWebsiteVerifyRequestBuilder();
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

class UserWebsiteVerifyRequestVerificationMethodEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'FILENAME')
  static const UserWebsiteVerifyRequestVerificationMethodEnum FILENAME = _$userWebsiteVerifyRequestVerificationMethodEnum_FILENAME;
  @BuiltValueEnumConst(wireName: r'METATAG')
  static const UserWebsiteVerifyRequestVerificationMethodEnum METATAG = _$userWebsiteVerifyRequestVerificationMethodEnum_METATAG;
  @BuiltValueEnumConst(wireName: r'DNSTXT')
  static const UserWebsiteVerifyRequestVerificationMethodEnum DNSTXT = _$userWebsiteVerifyRequestVerificationMethodEnum_DNSTXT;

  static Serializer<UserWebsiteVerifyRequestVerificationMethodEnum> get serializer => _$userWebsiteVerifyRequestVerificationMethodEnumSerializer;

  const UserWebsiteVerifyRequestVerificationMethodEnum._(String name): super(name);

  static BuiltSet<UserWebsiteVerifyRequestVerificationMethodEnum> get values => _$userWebsiteVerifyRequestVerificationMethodEnumValues;
  static UserWebsiteVerifyRequestVerificationMethodEnum valueOf(String name) => _$userWebsiteVerifyRequestVerificationMethodEnumValueOf(name);
}

