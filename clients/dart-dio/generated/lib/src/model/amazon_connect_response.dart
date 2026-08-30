//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'amazon_connect_response.g.dart';

/// AmazonConnectResponse
///
/// Properties:
/// * [message] - Amazon connect response message
@BuiltValue()
abstract class AmazonConnectResponse implements Built<AmazonConnectResponse, AmazonConnectResponseBuilder> {
  /// Amazon connect response message
  @BuiltValueField(wireName: r'message')
  String? get message;

  AmazonConnectResponse._();

  factory AmazonConnectResponse([void updates(AmazonConnectResponseBuilder b)]) = _$AmazonConnectResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AmazonConnectResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AmazonConnectResponse> get serializer => _$AmazonConnectResponseSerializer();
}

class _$AmazonConnectResponseSerializer implements PrimitiveSerializer<AmazonConnectResponse> {
  @override
  final Iterable<Type> types = const [AmazonConnectResponse, _$AmazonConnectResponse];

  @override
  final String wireName = r'AmazonConnectResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AmazonConnectResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AmazonConnectResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AmazonConnectResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AmazonConnectResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AmazonConnectResponseBuilder();
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

