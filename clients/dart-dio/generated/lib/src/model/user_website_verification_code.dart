//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_website_verification_code.g.dart';

/// UserWebsiteVerificationCode
///
/// Properties:
/// * [dnsTxtRecord] - DNS TXT record to check against for the website to be claimed
/// * [fileContent] - A full html file to upload to the website in order for it to be claimed
/// * [filename] - File expected to find on the website being claimed
/// * [metatag] - Metatag the verification process searchs for the website to be claimed
/// * [verificationCode] - Code to check against the user claiming the website
@BuiltValue()
abstract class UserWebsiteVerificationCode implements Built<UserWebsiteVerificationCode, UserWebsiteVerificationCodeBuilder> {
  /// DNS TXT record to check against for the website to be claimed
  @BuiltValueField(wireName: r'dns_txt_record')
  String? get dnsTxtRecord;

  /// A full html file to upload to the website in order for it to be claimed
  @BuiltValueField(wireName: r'file_content')
  String? get fileContent;

  /// File expected to find on the website being claimed
  @BuiltValueField(wireName: r'filename')
  String? get filename;

  /// Metatag the verification process searchs for the website to be claimed
  @BuiltValueField(wireName: r'metatag')
  String? get metatag;

  /// Code to check against the user claiming the website
  @BuiltValueField(wireName: r'verification_code')
  String? get verificationCode;

  UserWebsiteVerificationCode._();

  factory UserWebsiteVerificationCode([void updates(UserWebsiteVerificationCodeBuilder b)]) = _$UserWebsiteVerificationCode;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserWebsiteVerificationCodeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserWebsiteVerificationCode> get serializer => _$UserWebsiteVerificationCodeSerializer();
}

class _$UserWebsiteVerificationCodeSerializer implements PrimitiveSerializer<UserWebsiteVerificationCode> {
  @override
  final Iterable<Type> types = const [UserWebsiteVerificationCode, _$UserWebsiteVerificationCode];

  @override
  final String wireName = r'UserWebsiteVerificationCode';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserWebsiteVerificationCode object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dnsTxtRecord != null) {
      yield r'dns_txt_record';
      yield serializers.serialize(
        object.dnsTxtRecord,
        specifiedType: const FullType(String),
      );
    }
    if (object.fileContent != null) {
      yield r'file_content';
      yield serializers.serialize(
        object.fileContent,
        specifiedType: const FullType(String),
      );
    }
    if (object.filename != null) {
      yield r'filename';
      yield serializers.serialize(
        object.filename,
        specifiedType: const FullType(String),
      );
    }
    if (object.metatag != null) {
      yield r'metatag';
      yield serializers.serialize(
        object.metatag,
        specifiedType: const FullType(String),
      );
    }
    if (object.verificationCode != null) {
      yield r'verification_code';
      yield serializers.serialize(
        object.verificationCode,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UserWebsiteVerificationCode object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserWebsiteVerificationCodeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'dns_txt_record':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.dnsTxtRecord = valueDes;
          break;
        case r'file_content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.fileContent = valueDes;
          break;
        case r'filename':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.filename = valueDes;
          break;
        case r'metatag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.metatag = valueDes;
          break;
        case r'verification_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.verificationCode = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UserWebsiteVerificationCode deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserWebsiteVerificationCodeBuilder();
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

