//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'record_counts.g.dart';

/// RecordCounts
///
/// Properties:
/// * [invalid] - Number of invalid records processed
/// * [processed] - Number of records processed
/// * [valid] - Number of valid records processed
@BuiltValue()
abstract class RecordCounts implements Built<RecordCounts, RecordCountsBuilder> {
  /// Number of invalid records processed
  @BuiltValueField(wireName: r'invalid')
  int get invalid;

  /// Number of records processed
  @BuiltValueField(wireName: r'processed')
  int get processed;

  /// Number of valid records processed
  @BuiltValueField(wireName: r'valid')
  int get valid;

  RecordCounts._();

  factory RecordCounts([void updates(RecordCountsBuilder b)]) = _$RecordCounts;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RecordCountsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RecordCounts> get serializer => _$RecordCountsSerializer();
}

class _$RecordCountsSerializer implements PrimitiveSerializer<RecordCounts> {
  @override
  final Iterable<Type> types = const [RecordCounts, _$RecordCounts];

  @override
  final String wireName = r'RecordCounts';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RecordCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'invalid';
    yield serializers.serialize(
      object.invalid,
      specifiedType: const FullType(int),
    );
    yield r'processed';
    yield serializers.serialize(
      object.processed,
      specifiedType: const FullType(int),
    );
    yield r'valid';
    yield serializers.serialize(
      object.valid,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RecordCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RecordCountsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'invalid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.invalid = valueDes;
          break;
        case r'processed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.processed = valueDes;
          break;
        case r'valid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.valid = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RecordCounts deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RecordCountsBuilder();
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

