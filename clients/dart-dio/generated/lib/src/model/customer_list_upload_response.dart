//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/user_list_operation_type.dart';
import 'package:openapi/src/model/error_detail.dart';
import 'package:openapi/src/model/record_counts.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_upload_response.g.dart';

/// CustomerListUploadResponse
///
/// Properties:
/// * [adAccountId] - Advertiser ID.
/// * [creationTime] - Customer List Upload creation_time. Epoch (seconds).
/// * [customerListId] - ID of the customer list associated with this upload.
/// * [errorCounts] - Error counts by error code
/// * [id] - Customer List Upload ID.
/// * [operation] 
/// * [recordCounts] 
/// * [state] - Workload processing state
/// * [updatedTime] - Customer List Upload updated_time. Epoch (seconds).
@BuiltValue()
abstract class CustomerListUploadResponse implements Built<CustomerListUploadResponse, CustomerListUploadResponseBuilder> {
  /// Advertiser ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String get adAccountId;

  /// Customer List Upload creation_time. Epoch (seconds).
  @BuiltValueField(wireName: r'creation_time')
  int get creationTime;

  /// ID of the customer list associated with this upload.
  @BuiltValueField(wireName: r'customer_list_id')
  String get customerListId;

  /// Error counts by error code
  @BuiltValueField(wireName: r'error_counts')
  BuiltList<ErrorDetail>? get errorCounts;

  /// Customer List Upload ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'operation')
  UserListOperationType get operation;
  // enum operationEnum {  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'record_counts')
  RecordCounts? get recordCounts;

  /// Workload processing state
  @BuiltValueField(wireName: r'state')
  CustomerListUploadResponseStateEnum get state;
  // enum stateEnum {  NOT_STARTED,  RUNNING,  PAUSED,  SUCCEEDED,  FAILED,  };

  /// Customer List Upload updated_time. Epoch (seconds).
  @BuiltValueField(wireName: r'updated_time')
  int get updatedTime;

  CustomerListUploadResponse._();

  factory CustomerListUploadResponse([void updates(CustomerListUploadResponseBuilder b)]) = _$CustomerListUploadResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListUploadResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListUploadResponse> get serializer => _$CustomerListUploadResponseSerializer();
}

class _$CustomerListUploadResponseSerializer implements PrimitiveSerializer<CustomerListUploadResponse> {
  @override
  final Iterable<Type> types = const [CustomerListUploadResponse, _$CustomerListUploadResponse];

  @override
  final String wireName = r'CustomerListUploadResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListUploadResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ad_account_id';
    yield serializers.serialize(
      object.adAccountId,
      specifiedType: const FullType(String),
    );
    yield r'creation_time';
    yield serializers.serialize(
      object.creationTime,
      specifiedType: const FullType(int),
    );
    yield r'customer_list_id';
    yield serializers.serialize(
      object.customerListId,
      specifiedType: const FullType(String),
    );
    if (object.errorCounts != null) {
      yield r'error_counts';
      yield serializers.serialize(
        object.errorCounts,
        specifiedType: const FullType.nullable(BuiltList, [FullType(ErrorDetail)]),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(UserListOperationType),
    );
    if (object.recordCounts != null) {
      yield r'record_counts';
      yield serializers.serialize(
        object.recordCounts,
        specifiedType: const FullType.nullable(RecordCounts),
      );
    }
    yield r'state';
    yield serializers.serialize(
      object.state,
      specifiedType: const FullType(CustomerListUploadResponseStateEnum),
    );
    yield r'updated_time';
    yield serializers.serialize(
      object.updatedTime,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerListUploadResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListUploadResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'creation_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.creationTime = valueDes;
          break;
        case r'customer_list_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.customerListId = valueDes;
          break;
        case r'error_counts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ErrorDetail)]),
          ) as BuiltList<ErrorDetail>?;
          if (valueDes == null) continue;
          result.errorCounts.replace(valueDes);
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UserListOperationType),
          ) as UserListOperationType;
          result.operation = valueDes;
          break;
        case r'record_counts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(RecordCounts),
          ) as RecordCounts?;
          if (valueDes == null) continue;
          result.recordCounts.replace(valueDes);
          break;
        case r'state':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CustomerListUploadResponseStateEnum),
          ) as CustomerListUploadResponseStateEnum;
          result.state = valueDes;
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.updatedTime = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomerListUploadResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListUploadResponseBuilder();
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

class CustomerListUploadResponseStateEnum extends EnumClass {

  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'NOT_STARTED')
  static const CustomerListUploadResponseStateEnum NOT_STARTED = _$customerListUploadResponseStateEnum_NOT_STARTED;
  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'RUNNING')
  static const CustomerListUploadResponseStateEnum RUNNING = _$customerListUploadResponseStateEnum_RUNNING;
  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const CustomerListUploadResponseStateEnum PAUSED = _$customerListUploadResponseStateEnum_PAUSED;
  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'SUCCEEDED')
  static const CustomerListUploadResponseStateEnum SUCCEEDED = _$customerListUploadResponseStateEnum_SUCCEEDED;
  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const CustomerListUploadResponseStateEnum FAILED = _$customerListUploadResponseStateEnum_FAILED;

  static Serializer<CustomerListUploadResponseStateEnum> get serializer => _$customerListUploadResponseStateEnumSerializer;

  const CustomerListUploadResponseStateEnum._(String name): super(name);

  static BuiltSet<CustomerListUploadResponseStateEnum> get values => _$customerListUploadResponseStateEnumValues;
  static CustomerListUploadResponseStateEnum valueOf(String name) => _$customerListUploadResponseStateEnumValueOf(name);
}

