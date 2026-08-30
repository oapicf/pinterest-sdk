//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/user_list_operation_type.dart';
import 'package:openapi/src/model/customer_list_record_row.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_update_with_required_body.g.dart';

/// Resource create or update operation model with required body fields (no OptionalProperties).
///
/// Properties:
/// * [operationType] - Customer list update operation type (add or remove). Only valid in update request body.
/// * [records] - Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
/// * [recordsV2] - Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
@BuiltValue()
abstract class CustomerListUpdateWithRequiredBody implements Built<CustomerListUpdateWithRequiredBody, CustomerListUpdateWithRequiredBodyBuilder> {
  /// Customer list update operation type (add or remove). Only valid in update request body.
  @BuiltValueField(wireName: r'operation_type')
  UserListOperationType get operationType;
  // enum operationTypeEnum {  ADD,  REMOVE,  };

  /// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  @BuiltValueField(wireName: r'records')
  String? get records;

  /// Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
  @BuiltValueField(wireName: r'records_v2')
  BuiltList<CustomerListRecordRow>? get recordsV2;

  CustomerListUpdateWithRequiredBody._();

  factory CustomerListUpdateWithRequiredBody([void updates(CustomerListUpdateWithRequiredBodyBuilder b)]) = _$CustomerListUpdateWithRequiredBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListUpdateWithRequiredBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListUpdateWithRequiredBody> get serializer => _$CustomerListUpdateWithRequiredBodySerializer();
}

class _$CustomerListUpdateWithRequiredBodySerializer implements PrimitiveSerializer<CustomerListUpdateWithRequiredBody> {
  @override
  final Iterable<Type> types = const [CustomerListUpdateWithRequiredBody, _$CustomerListUpdateWithRequiredBody];

  @override
  final String wireName = r'CustomerListUpdateWithRequiredBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListUpdateWithRequiredBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'operation_type';
    yield serializers.serialize(
      object.operationType,
      specifiedType: const FullType(UserListOperationType),
    );
    if (object.records != null) {
      yield r'records';
      yield serializers.serialize(
        object.records,
        specifiedType: const FullType(String),
      );
    }
    if (object.recordsV2 != null) {
      yield r'records_v2';
      yield serializers.serialize(
        object.recordsV2,
        specifiedType: const FullType(BuiltList, [FullType(CustomerListRecordRow)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerListUpdateWithRequiredBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListUpdateWithRequiredBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'operation_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UserListOperationType),
          ) as UserListOperationType;
          result.operationType = valueDes;
          break;
        case r'records':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.records = valueDes;
          break;
        case r'records_v2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CustomerListRecordRow)]),
          ) as BuiltList<CustomerListRecordRow>?;
          if (valueDes == null) continue;
          result.recordsV2.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomerListUpdateWithRequiredBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListUpdateWithRequiredBodyBuilder();
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

