//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_logs_invalid_log_response_rejected_logs_items.g.dart';

/// IntegrationLogsInvalidLogResponseRejectedLogsItems
///
/// Properties:
/// * [field] - The field name containing an invalid value.
/// * [logIndex] - Index of the log in the batch.
/// * [reason] - The reason the value is invalid.
/// * [value] - The value that is invalid.
@BuiltValue()
abstract class IntegrationLogsInvalidLogResponseRejectedLogsItems implements Built<IntegrationLogsInvalidLogResponseRejectedLogsItems, IntegrationLogsInvalidLogResponseRejectedLogsItemsBuilder> {
  /// The field name containing an invalid value.
  @BuiltValueField(wireName: r'field')
  String get field;

  /// Index of the log in the batch.
  @BuiltValueField(wireName: r'log_index')
  int? get logIndex;

  /// The reason the value is invalid.
  @BuiltValueField(wireName: r'reason')
  String get reason;

  /// The value that is invalid.
  @BuiltValueField(wireName: r'value')
  String get value;

  IntegrationLogsInvalidLogResponseRejectedLogsItems._();

  factory IntegrationLogsInvalidLogResponseRejectedLogsItems([void updates(IntegrationLogsInvalidLogResponseRejectedLogsItemsBuilder b)]) = _$IntegrationLogsInvalidLogResponseRejectedLogsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationLogsInvalidLogResponseRejectedLogsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationLogsInvalidLogResponseRejectedLogsItems> get serializer => _$IntegrationLogsInvalidLogResponseRejectedLogsItemsSerializer();
}

class _$IntegrationLogsInvalidLogResponseRejectedLogsItemsSerializer implements PrimitiveSerializer<IntegrationLogsInvalidLogResponseRejectedLogsItems> {
  @override
  final Iterable<Type> types = const [IntegrationLogsInvalidLogResponseRejectedLogsItems, _$IntegrationLogsInvalidLogResponseRejectedLogsItems];

  @override
  final String wireName = r'IntegrationLogsInvalidLogResponseRejectedLogsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationLogsInvalidLogResponseRejectedLogsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(String),
    );
    if (object.logIndex != null) {
      yield r'log_index';
      yield serializers.serialize(
        object.logIndex,
        specifiedType: const FullType(int),
      );
    }
    yield r'reason';
    yield serializers.serialize(
      object.reason,
      specifiedType: const FullType(String),
    );
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationLogsInvalidLogResponseRejectedLogsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationLogsInvalidLogResponseRejectedLogsItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.field = valueDes;
          break;
        case r'log_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.logIndex = valueDes;
          break;
        case r'reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.reason = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationLogsInvalidLogResponseRejectedLogsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationLogsInvalidLogResponseRejectedLogsItemsBuilder();
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

