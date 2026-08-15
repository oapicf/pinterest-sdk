//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_upsert_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_upsert_status_response.g.dart';

/// ID of the bulk request.
///
/// Properties:
/// * [resultUrl] 
/// * [status] 
@BuiltValue()
abstract class BulkUpsertStatusResponse implements Built<BulkUpsertStatusResponse, BulkUpsertStatusResponseBuilder> {
  @BuiltValueField(wireName: r'result_url')
  String? get resultUrl;

  @BuiltValueField(wireName: r'status')
  BulkUpsertStatus? get status;
  // enum statusEnum {  RUNNING,  SUCCEEDED,  FAILED,  };

  BulkUpsertStatusResponse._();

  factory BulkUpsertStatusResponse([void updates(BulkUpsertStatusResponseBuilder b)]) = _$BulkUpsertStatusResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkUpsertStatusResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkUpsertStatusResponse> get serializer => _$BulkUpsertStatusResponseSerializer();
}

class _$BulkUpsertStatusResponseSerializer implements PrimitiveSerializer<BulkUpsertStatusResponse> {
  @override
  final Iterable<Type> types = const [BulkUpsertStatusResponse, _$BulkUpsertStatusResponse];

  @override
  final String wireName = r'BulkUpsertStatusResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkUpsertStatusResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.resultUrl != null) {
      yield r'result_url';
      yield serializers.serialize(
        object.resultUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(BulkUpsertStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkUpsertStatusResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkUpsertStatusResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'result_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.resultUrl = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BulkUpsertStatus),
          ) as BulkUpsertStatus;
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
  BulkUpsertStatusResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkUpsertStatusResponseBuilder();
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

