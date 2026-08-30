//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/user_list_type.dart';
import 'package:openapi/src/model/customer_list_record_row.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [isNca] - Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
/// * [listType] - Type of customer list (e.g., EMAIL, IDFA, MAID).
/// * [name] - Customer list name.
/// * [records] - Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
/// * [recordsV2] - Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
@BuiltValue()
abstract class CustomerListCreate implements Built<CustomerListCreate, CustomerListCreateBuilder> {
  /// Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
  @BuiltValueField(wireName: r'is_nca')
  bool? get isNca;

  /// Type of customer list (e.g., EMAIL, IDFA, MAID).
  @BuiltValueField(wireName: r'list_type')
  UserListType? get listType;
  // enum listTypeEnum {  EMAIL,  IDFA,  MAID,  LR_ID,  DLX_ID,  HASHED_PINNER_ID,  };

  /// Customer list name.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  @BuiltValueField(wireName: r'records')
  String? get records;

  /// Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
  @BuiltValueField(wireName: r'records_v2')
  BuiltList<CustomerListRecordRow>? get recordsV2;

  CustomerListCreate._();

  factory CustomerListCreate([void updates(CustomerListCreateBuilder b)]) = _$CustomerListCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListCreateBuilder b) => b
      ..listType = UserListType.EMAIL;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListCreate> get serializer => _$CustomerListCreateSerializer();
}

class _$CustomerListCreateSerializer implements PrimitiveSerializer<CustomerListCreate> {
  @override
  final Iterable<Type> types = const [CustomerListCreate, _$CustomerListCreate];

  @override
  final String wireName = r'CustomerListCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isNca != null) {
      yield r'is_nca';
      yield serializers.serialize(
        object.isNca,
        specifiedType: const FullType(bool),
      );
    }
    if (object.listType != null) {
      yield r'list_type';
      yield serializers.serialize(
        object.listType,
        specifiedType: const FullType(UserListType),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
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
    CustomerListCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_nca':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isNca = valueDes;
          break;
        case r'list_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(UserListType),
          ) as UserListType?;
          if (valueDes == null) continue;
          result.listType = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
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
  CustomerListCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListCreateBuilder();
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

