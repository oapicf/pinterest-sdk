//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/customer_list_status.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list.g.dart';

/// CustomerList
///
/// Properties:
/// * [adAccountId] - Associated ad account ID.
/// * [createdTime] - Creation time. Unix timestamp in seconds.
/// * [exceptions] - Customer list errors.
/// * [id] - Customer list ID.
/// * [isNca] - Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
/// * [name] - Customer list name.
/// * [numBatches] - Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
/// * [numRemovedUserRecords] - Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
/// * [numUploadedUserRecords] - Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
/// * [status] - Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
/// * [type] - Always `customerlist`.
/// * [updatedTime] - Last update time. Unix timestamp in seconds.
@BuiltValue()
abstract class CustomerList implements Built<CustomerList, CustomerListBuilder> {
  /// Associated ad account ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// Creation time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'created_time')
  num? get createdTime;

  /// Customer list errors.
  @BuiltValueField(wireName: r'exceptions')
  JsonObject? get exceptions;

  /// Customer list ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
  @BuiltValueField(wireName: r'is_nca')
  bool? get isNca;

  /// Customer list name.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
  @BuiltValueField(wireName: r'num_batches')
  num? get numBatches;

  /// Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
  @BuiltValueField(wireName: r'num_removed_user_records')
  num? get numRemovedUserRecords;

  /// Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
  @BuiltValueField(wireName: r'num_uploaded_user_records')
  num? get numUploadedUserRecords;

  /// Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  @BuiltValueField(wireName: r'status')
  CustomerListStatus? get status;
  // enum statusEnum {  PROCESSING,  READY,  TOO_SMALL,  UPLOADING,  };

  /// Always `customerlist`.
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Last update time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'updated_time')
  num? get updatedTime;

  CustomerList._();

  factory CustomerList([void updates(CustomerListBuilder b)]) = _$CustomerList;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerList> get serializer => _$CustomerListSerializer();
}

class _$CustomerListSerializer implements PrimitiveSerializer<CustomerList> {
  @override
  final Iterable<Type> types = const [CustomerList, _$CustomerList];

  @override
  final String wireName = r'CustomerList';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerList object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(num),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(JsonObject),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.isNca != null) {
      yield r'is_nca';
      yield serializers.serialize(
        object.isNca,
        specifiedType: const FullType(bool),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.numBatches != null) {
      yield r'num_batches';
      yield serializers.serialize(
        object.numBatches,
        specifiedType: const FullType(num),
      );
    }
    if (object.numRemovedUserRecords != null) {
      yield r'num_removed_user_records';
      yield serializers.serialize(
        object.numRemovedUserRecords,
        specifiedType: const FullType(num),
      );
    }
    if (object.numUploadedUserRecords != null) {
      yield r'num_uploaded_user_records';
      yield serializers.serialize(
        object.numUploadedUserRecords,
        specifiedType: const FullType(num),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(CustomerListStatus),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerList object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adAccountId = valueDes;
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.exceptions = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'is_nca':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isNca = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'num_batches':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.numBatches = valueDes;
          break;
        case r'num_removed_user_records':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.numRemovedUserRecords = valueDes;
          break;
        case r'num_uploaded_user_records':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.numUploadedUserRecords = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CustomerListStatus),
          ) as CustomerListStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.type = valueDes;
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
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
  CustomerList deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListBuilder();
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

