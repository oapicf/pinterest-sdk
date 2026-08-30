//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/integration_log.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_logs_request_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [logs] 
@BuiltValue()
abstract class IntegrationLogsRequestCreate implements Built<IntegrationLogsRequestCreate, IntegrationLogsRequestCreateBuilder> {
  @BuiltValueField(wireName: r'logs')
  BuiltList<IntegrationLog> get logs;

  IntegrationLogsRequestCreate._();

  factory IntegrationLogsRequestCreate([void updates(IntegrationLogsRequestCreateBuilder b)]) = _$IntegrationLogsRequestCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationLogsRequestCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationLogsRequestCreate> get serializer => _$IntegrationLogsRequestCreateSerializer();
}

class _$IntegrationLogsRequestCreateSerializer implements PrimitiveSerializer<IntegrationLogsRequestCreate> {
  @override
  final Iterable<Type> types = const [IntegrationLogsRequestCreate, _$IntegrationLogsRequestCreate];

  @override
  final String wireName = r'IntegrationLogsRequestCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationLogsRequestCreate object, {
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
    IntegrationLogsRequestCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationLogsRequestCreateBuilder result,
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
  IntegrationLogsRequestCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationLogsRequestCreateBuilder();
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

