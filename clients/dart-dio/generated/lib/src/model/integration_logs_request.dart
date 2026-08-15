//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/integration_log.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_logs_request.g.dart';

/// Batch of logs sent from an integration application.
///
/// Properties:
/// * [logs] 
@BuiltValue()
abstract class IntegrationLogsRequest implements Built<IntegrationLogsRequest, IntegrationLogsRequestBuilder> {
  @BuiltValueField(wireName: r'logs')
  BuiltList<IntegrationLog> get logs;

  IntegrationLogsRequest._();

  factory IntegrationLogsRequest([void updates(IntegrationLogsRequestBuilder b)]) = _$IntegrationLogsRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationLogsRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationLogsRequest> get serializer => _$IntegrationLogsRequestSerializer();
}

class _$IntegrationLogsRequestSerializer implements PrimitiveSerializer<IntegrationLogsRequest> {
  @override
  final Iterable<Type> types = const [IntegrationLogsRequest, _$IntegrationLogsRequest];

  @override
  final String wireName = r'IntegrationLogsRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationLogsRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'logs';
    yield serializers.serialize(
      object.logs,
      specifiedType: const FullType(BuiltList, [FullType(IntegrationLog)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationLogsRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationLogsRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'logs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(IntegrationLog)]),
          ) as BuiltList<IntegrationLog>;
          result.logs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationLogsRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationLogsRequestBuilder();
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

