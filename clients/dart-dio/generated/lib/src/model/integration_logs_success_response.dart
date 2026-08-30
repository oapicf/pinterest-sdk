//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_logs_success_response.g.dart';

/// Response when logs are successfully processed.
///
/// Properties:
/// * [message] 
@BuiltValue()
abstract class IntegrationLogsSuccessResponse implements Built<IntegrationLogsSuccessResponse, IntegrationLogsSuccessResponseBuilder> {
  @BuiltValueField(wireName: r'message')
  String? get message;

  IntegrationLogsSuccessResponse._();

  factory IntegrationLogsSuccessResponse([void updates(IntegrationLogsSuccessResponseBuilder b)]) = _$IntegrationLogsSuccessResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationLogsSuccessResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationLogsSuccessResponse> get serializer => _$IntegrationLogsSuccessResponseSerializer();
}

class _$IntegrationLogsSuccessResponseSerializer implements PrimitiveSerializer<IntegrationLogsSuccessResponse> {
  @override
  final Iterable<Type> types = const [IntegrationLogsSuccessResponse, _$IntegrationLogsSuccessResponse];

  @override
  final String wireName = r'IntegrationLogsSuccessResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationLogsSuccessResponse object, {
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
    IntegrationLogsSuccessResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationLogsSuccessResponseBuilder result,
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
  IntegrationLogsSuccessResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationLogsSuccessResponseBuilder();
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

