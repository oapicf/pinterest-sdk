//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_upsert_request_update.dart';
import 'package:openapi/src/model/bulk_upsert_request_create.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_upsert_request.g.dart';

/// Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
///
/// Properties:
/// * [create] 
/// * [update] 
@BuiltValue()
abstract class BulkUpsertRequest implements Built<BulkUpsertRequest, BulkUpsertRequestBuilder> {
  @BuiltValueField(wireName: r'create')
  BulkUpsertRequestCreate? get create;

  @BuiltValueField(wireName: r'update')
  BulkUpsertRequestUpdate? get update;

  BulkUpsertRequest._();

  factory BulkUpsertRequest([void updates(BulkUpsertRequestBuilder b)]) = _$BulkUpsertRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkUpsertRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkUpsertRequest> get serializer => _$BulkUpsertRequestSerializer();
}

class _$BulkUpsertRequestSerializer implements PrimitiveSerializer<BulkUpsertRequest> {
  @override
  final Iterable<Type> types = const [BulkUpsertRequest, _$BulkUpsertRequest];

  @override
  final String wireName = r'BulkUpsertRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkUpsertRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.create != null) {
      yield r'create';
      yield serializers.serialize(
        object.create,
        specifiedType: const FullType(BulkUpsertRequestCreate),
      );
    }
    if (object.update != null) {
      yield r'update';
      yield serializers.serialize(
        object.update,
        specifiedType: const FullType(BulkUpsertRequestUpdate),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkUpsertRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkUpsertRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'create':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BulkUpsertRequestCreate),
          ) as BulkUpsertRequestCreate?;
          if (valueDes == null) continue;
          result.create.replace(valueDes);
          break;
        case r'update':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BulkUpsertRequestUpdate),
          ) as BulkUpsertRequestUpdate?;
          if (valueDes == null) continue;
          result.update.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BulkUpsertRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkUpsertRequestBuilder();
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

