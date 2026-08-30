//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/audience_update_operation_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_segment_update_request_update_with_required_body.g.dart';

/// Resource create or update operation model with required body fields (no OptionalProperties).
///
/// Properties:
/// * [audienceIds] - Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
/// * [id] - Customer segment ID.
/// * [operationType] 
@BuiltValue()
abstract class CustomerSegmentUpdateRequestUpdateWithRequiredBody implements Built<CustomerSegmentUpdateRequestUpdateWithRequiredBody, CustomerSegmentUpdateRequestUpdateWithRequiredBodyBuilder> {
  /// Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
  @BuiltValueField(wireName: r'audience_ids')
  BuiltList<String>? get audienceIds;

  /// Customer segment ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'operation_type')
  AudienceUpdateOperationType get operationType;
  // enum operationTypeEnum {  UPDATE,  REMOVE,  };

  CustomerSegmentUpdateRequestUpdateWithRequiredBody._();

  factory CustomerSegmentUpdateRequestUpdateWithRequiredBody([void updates(CustomerSegmentUpdateRequestUpdateWithRequiredBodyBuilder b)]) = _$CustomerSegmentUpdateRequestUpdateWithRequiredBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerSegmentUpdateRequestUpdateWithRequiredBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerSegmentUpdateRequestUpdateWithRequiredBody> get serializer => _$CustomerSegmentUpdateRequestUpdateWithRequiredBodySerializer();
}

class _$CustomerSegmentUpdateRequestUpdateWithRequiredBodySerializer implements PrimitiveSerializer<CustomerSegmentUpdateRequestUpdateWithRequiredBody> {
  @override
  final Iterable<Type> types = const [CustomerSegmentUpdateRequestUpdateWithRequiredBody, _$CustomerSegmentUpdateRequestUpdateWithRequiredBody];

  @override
  final String wireName = r'CustomerSegmentUpdateRequestUpdateWithRequiredBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerSegmentUpdateRequestUpdateWithRequiredBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.audienceIds != null) {
      yield r'audience_ids';
      yield serializers.serialize(
        object.audienceIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'operation_type';
    yield serializers.serialize(
      object.operationType,
      specifiedType: const FullType(AudienceUpdateOperationType),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerSegmentUpdateRequestUpdateWithRequiredBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerSegmentUpdateRequestUpdateWithRequiredBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'audience_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.audienceIds.replace(valueDes);
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'operation_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceUpdateOperationType),
          ) as AudienceUpdateOperationType;
          result.operationType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomerSegmentUpdateRequestUpdateWithRequiredBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerSegmentUpdateRequestUpdateWithRequiredBodyBuilder();
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

