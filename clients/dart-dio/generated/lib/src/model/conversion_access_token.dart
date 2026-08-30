//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_access_token.g.dart';

/// A successful conversion access token response.
///
/// Properties:
/// * [accessToken] 
/// * [tokenType] 
@BuiltValue()
abstract class ConversionAccessToken implements Built<ConversionAccessToken, ConversionAccessTokenBuilder> {
  @BuiltValueField(wireName: r'access_token')
  String get accessToken;

  @BuiltValueField(wireName: r'token_type')
  String? get tokenType;

  ConversionAccessToken._();

  factory ConversionAccessToken([void updates(ConversionAccessTokenBuilder b)]) = _$ConversionAccessToken;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionAccessTokenBuilder b) => b
      ..tokenType = 'conversion';

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionAccessToken> get serializer => _$ConversionAccessTokenSerializer();
}

class _$ConversionAccessTokenSerializer implements PrimitiveSerializer<ConversionAccessToken> {
  @override
  final Iterable<Type> types = const [ConversionAccessToken, _$ConversionAccessToken];

  @override
  final String wireName = r'ConversionAccessToken';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionAccessToken object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'access_token';
    yield serializers.serialize(
      object.accessToken,
      specifiedType: const FullType(String),
    );
    if (object.tokenType != null) {
      yield r'token_type';
      yield serializers.serialize(
        object.tokenType,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionAccessToken object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionAccessTokenBuilder result,
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
        case r'token_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  ConversionAccessToken deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionAccessTokenBuilder();
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

