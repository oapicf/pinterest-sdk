//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/user_list_operation_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_upload_create_request.g.dart';

/// CustomerListUploadCreateRequest
///
/// Properties:
/// * [operation] 
/// * [totalParts] - Number of parts to upload the file in.
@BuiltValue()
abstract class CustomerListUploadCreateRequest implements Built<CustomerListUploadCreateRequest, CustomerListUploadCreateRequestBuilder> {
  @BuiltValueField(wireName: r'operation')
  UserListOperationType get operation;
  // enum operationEnum {  ADD,  REMOVE,  };

  /// Number of parts to upload the file in.
  @BuiltValueField(wireName: r'total_parts')
  int get totalParts;

  CustomerListUploadCreateRequest._();

  factory CustomerListUploadCreateRequest([void updates(CustomerListUploadCreateRequestBuilder b)]) = _$CustomerListUploadCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListUploadCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListUploadCreateRequest> get serializer => _$CustomerListUploadCreateRequestSerializer();
}

class _$CustomerListUploadCreateRequestSerializer implements PrimitiveSerializer<CustomerListUploadCreateRequest> {
  @override
  final Iterable<Type> types = const [CustomerListUploadCreateRequest, _$CustomerListUploadCreateRequest];

  @override
  final String wireName = r'CustomerListUploadCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListUploadCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(UserListOperationType),
    );
    yield r'total_parts';
    yield serializers.serialize(
      object.totalParts,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerListUploadCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListUploadCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UserListOperationType),
          ) as UserListOperationType;
          result.operation = valueDes;
          break;
        case r'total_parts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.totalParts = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomerListUploadCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListUploadCreateRequestBuilder();
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

