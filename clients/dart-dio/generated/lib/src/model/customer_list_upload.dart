//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/user_list_operation_type.dart';
import 'package:openapi/src/model/error_detail.dart';
import 'package:openapi/src/model/workload_state.dart';
import 'package:openapi/src/model/record_counts.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_upload.g.dart';

/// CustomerListUpload
///
/// Properties:
/// * [adAccountId] - Advertiser ID.
/// * [creationTime] - Customer List Upload creation_time. Epoch (seconds).
/// * [customerListId] - ID of the customer list associated with this upload.
/// * [errorCounts] - Error counts by error code
/// * [id] - Customer List Upload ID.
/// * [operation] 
/// * [recordCounts] - Record processing counts
/// * [state] 
/// * [updatedTime] - Customer List Upload updated_time. Epoch (seconds).
@BuiltValue()
abstract class CustomerListUpload implements Built<CustomerListUpload, CustomerListUploadBuilder> {
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

  /// Record processing counts
  @BuiltValueField(wireName: r'record_counts')
  RecordCounts? get recordCounts;

  @BuiltValueField(wireName: r'state')
  WorkloadState get state;
  // enum stateEnum {  NOT_STARTED,  RUNNING,  PAUSED,  SUCCEEDED,  FAILED,  };

  /// Customer List Upload updated_time. Epoch (seconds).
  @BuiltValueField(wireName: r'updated_time')
  int get updatedTime;

  CustomerListUpload._();

  factory CustomerListUpload([void updates(CustomerListUploadBuilder b)]) = _$CustomerListUpload;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListUploadBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListUpload> get serializer => _$CustomerListUploadSerializer();
}

class _$CustomerListUploadSerializer implements PrimitiveSerializer<CustomerListUpload> {
  @override
  final Iterable<Type> types = const [CustomerListUpload, _$CustomerListUpload];

  @override
  final String wireName = r'CustomerListUpload';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListUpload object, {
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
        specifiedType: const FullType(RecordCounts),
      );
    }
    yield r'state';
    yield serializers.serialize(
      object.state,
      specifiedType: const FullType(WorkloadState),
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
    CustomerListUpload object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListUploadBuilder result,
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
            specifiedType: const FullType(WorkloadState),
          ) as WorkloadState;
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
  CustomerListUpload deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListUploadBuilder();
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

