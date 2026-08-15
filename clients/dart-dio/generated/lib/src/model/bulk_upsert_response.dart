//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_upsert_response.g.dart';

/// ID of the bulk request.
///
/// Properties:
/// * [requestId] 
@BuiltValue()
abstract class BulkUpsertResponse implements Built<BulkUpsertResponse, BulkUpsertResponseBuilder> {
  @BuiltValueField(wireName: r'request_id')
  String? get requestId;

  BulkUpsertResponse._();

  factory BulkUpsertResponse([void updates(BulkUpsertResponseBuilder b)]) = _$BulkUpsertResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkUpsertResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkUpsertResponse> get serializer => _$BulkUpsertResponseSerializer();
}

class _$BulkUpsertResponseSerializer implements PrimitiveSerializer<BulkUpsertResponse> {
  @override
  final Iterable<Type> types = const [BulkUpsertResponse, _$BulkUpsertResponse];

  @override
  final String wireName = r'BulkUpsertResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkUpsertResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.requestId != null) {
      yield r'request_id';
      yield serializers.serialize(
        object.requestId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkUpsertResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkUpsertResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'request_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.requestId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BulkUpsertResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkUpsertResponseBuilder();
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

