//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_access_token_response.g.dart';

/// A successful conversion access token response.
///
/// Properties:
/// * [accessToken] 
/// * [tokenType] 
@BuiltValue()
abstract class ConversionAccessTokenResponse implements Built<ConversionAccessTokenResponse, ConversionAccessTokenResponseBuilder> {
  @BuiltValueField(wireName: r'access_token')
  String get accessToken;

  @BuiltValueField(wireName: r'token_type')
  String? get tokenType;

  ConversionAccessTokenResponse._();

  factory ConversionAccessTokenResponse([void updates(ConversionAccessTokenResponseBuilder b)]) = _$ConversionAccessTokenResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionAccessTokenResponseBuilder b) => b
      ..tokenType = 'conversion';

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionAccessTokenResponse> get serializer => _$ConversionAccessTokenResponseSerializer();
}

class _$ConversionAccessTokenResponseSerializer implements PrimitiveSerializer<ConversionAccessTokenResponse> {
  @override
  final Iterable<Type> types = const [ConversionAccessTokenResponse, _$ConversionAccessTokenResponse];

  @override
  final String wireName = r'ConversionAccessTokenResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionAccessTokenResponse object, {
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
    ConversionAccessTokenResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionAccessTokenResponseBuilder result,
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
  ConversionAccessTokenResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionAccessTokenResponseBuilder();
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

