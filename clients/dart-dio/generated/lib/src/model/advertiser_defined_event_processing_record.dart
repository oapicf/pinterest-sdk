//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advertiser_defined_event_processing_record.g.dart';

/// Processing record for an advertiser defined event operation
///
/// Properties:
/// * [exceptions] - List of exception messages if the operation failed
/// * [name] - Name of the advertiser defined event
/// * [status] - Processing status (success or failure)
@BuiltValue()
abstract class AdvertiserDefinedEventProcessingRecord implements Built<AdvertiserDefinedEventProcessingRecord, AdvertiserDefinedEventProcessingRecordBuilder> {
  /// List of exception messages if the operation failed
  @BuiltValueField(wireName: r'exceptions')
  BuiltList<String>? get exceptions;

  /// Name of the advertiser defined event
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Processing status (success or failure)
  @BuiltValueField(wireName: r'status')
  String get status;

  AdvertiserDefinedEventProcessingRecord._();

  factory AdvertiserDefinedEventProcessingRecord([void updates(AdvertiserDefinedEventProcessingRecordBuilder b)]) = _$AdvertiserDefinedEventProcessingRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvertiserDefinedEventProcessingRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvertiserDefinedEventProcessingRecord> get serializer => _$AdvertiserDefinedEventProcessingRecordSerializer();
}

class _$AdvertiserDefinedEventProcessingRecordSerializer implements PrimitiveSerializer<AdvertiserDefinedEventProcessingRecord> {
  @override
  final Iterable<Type> types = const [AdvertiserDefinedEventProcessingRecord, _$AdvertiserDefinedEventProcessingRecord];

  @override
  final String wireName = r'AdvertiserDefinedEventProcessingRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvertiserDefinedEventProcessingRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvertiserDefinedEventProcessingRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvertiserDefinedEventProcessingRecordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvertiserDefinedEventProcessingRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvertiserDefinedEventProcessingRecordBuilder();
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

