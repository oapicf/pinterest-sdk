//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_credentials.g.dart';

/// This field is **OPTIONAL**. Use this if your feed file requires username and password.
///
/// Properties:
/// * [password] - The required password for downloading a feed.
/// * [username] - The required username for downloading a feed.
@BuiltValue()
abstract class CatalogsFeedCredentials implements Built<CatalogsFeedCredentials, CatalogsFeedCredentialsBuilder> {
  /// The required password for downloading a feed.
  @BuiltValueField(wireName: r'password')
  String get password;

  /// The required username for downloading a feed.
  @BuiltValueField(wireName: r'username')
  String get username;

  CatalogsFeedCredentials._();

  factory CatalogsFeedCredentials([void updates(CatalogsFeedCredentialsBuilder b)]) = _$CatalogsFeedCredentials;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedCredentialsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedCredentials> get serializer => _$CatalogsFeedCredentialsSerializer();
}

class _$CatalogsFeedCredentialsSerializer implements PrimitiveSerializer<CatalogsFeedCredentials> {
  @override
  final Iterable<Type> types = const [CatalogsFeedCredentials, _$CatalogsFeedCredentials];

  @override
  final String wireName = r'CatalogsFeedCredentials';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedCredentials object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'password';
    yield serializers.serialize(
      object.password,
      specifiedType: const FullType(String),
    );
    yield r'username';
    yield serializers.serialize(
      object.username,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedCredentials object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedCredentialsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.password = valueDes;
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.username = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedCredentials deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedCredentialsBuilder();
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

