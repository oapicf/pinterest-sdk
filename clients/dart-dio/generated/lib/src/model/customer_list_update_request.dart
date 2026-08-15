//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/user_list_operation_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_update_request.g.dart';

/// CustomerListUpdateRequest
///
/// Properties:
/// * [operationType] 
/// * [records] - Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
@BuiltValue()
abstract class CustomerListUpdateRequest implements Built<CustomerListUpdateRequest, CustomerListUpdateRequestBuilder> {
  @BuiltValueField(wireName: r'operation_type')
  UserListOperationType get operationType;
  // enum operationTypeEnum {  ADD,  REMOVE,  };

  /// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  @BuiltValueField(wireName: r'records')
  String get records;

  CustomerListUpdateRequest._();

  factory CustomerListUpdateRequest([void updates(CustomerListUpdateRequestBuilder b)]) = _$CustomerListUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListUpdateRequest> get serializer => _$CustomerListUpdateRequestSerializer();
}

class _$CustomerListUpdateRequestSerializer implements PrimitiveSerializer<CustomerListUpdateRequest> {
  @override
  final Iterable<Type> types = const [CustomerListUpdateRequest, _$CustomerListUpdateRequest];

  @override
  final String wireName = r'CustomerListUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'operation_type';
    yield serializers.serialize(
      object.operationType,
      specifiedType: const FullType(UserListOperationType),
    );
    yield r'records';
    yield serializers.serialize(
      object.records,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerListUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListUpdateRequestBuilder result,
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
            specifiedType: const FullType(String),
          ) as String;
          result.records = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomerListUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListUpdateRequestBuilder();
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

