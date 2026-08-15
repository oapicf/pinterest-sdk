//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/integration_logs_invalid_log_response_rejected_logs_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_logs_invalid_log_response.g.dart';

/// Schema describing the response when a log has invalid fields.
///
/// Properties:
/// * [rejectedLogs] 
@BuiltValue()
abstract class IntegrationLogsInvalidLogResponse implements Built<IntegrationLogsInvalidLogResponse, IntegrationLogsInvalidLogResponseBuilder> {
  @BuiltValueField(wireName: r'rejected_logs')
  BuiltList<IntegrationLogsInvalidLogResponseRejectedLogsInner>? get rejectedLogs;

  IntegrationLogsInvalidLogResponse._();

  factory IntegrationLogsInvalidLogResponse([void updates(IntegrationLogsInvalidLogResponseBuilder b)]) = _$IntegrationLogsInvalidLogResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationLogsInvalidLogResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationLogsInvalidLogResponse> get serializer => _$IntegrationLogsInvalidLogResponseSerializer();
}

class _$IntegrationLogsInvalidLogResponseSerializer implements PrimitiveSerializer<IntegrationLogsInvalidLogResponse> {
  @override
  final Iterable<Type> types = const [IntegrationLogsInvalidLogResponse, _$IntegrationLogsInvalidLogResponse];

  @override
  final String wireName = r'IntegrationLogsInvalidLogResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationLogsInvalidLogResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.rejectedLogs != null) {
      yield r'rejected_logs';
      yield serializers.serialize(
        object.rejectedLogs,
        specifiedType: const FullType(BuiltList, [FullType(IntegrationLogsInvalidLogResponseRejectedLogsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationLogsInvalidLogResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationLogsInvalidLogResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'rejected_logs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(IntegrationLogsInvalidLogResponseRejectedLogsInner)]),
          ) as BuiltList<IntegrationLogsInvalidLogResponseRejectedLogsInner>;
          result.rejectedLogs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationLogsInvalidLogResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationLogsInvalidLogResponseBuilder();
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

