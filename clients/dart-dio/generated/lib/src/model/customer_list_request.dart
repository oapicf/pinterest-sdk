//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/user_list_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_request.g.dart';

/// CustomerListRequest
///
/// Properties:
/// * [listType] 
/// * [name] - Customer list name.
/// * [records] - Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
@BuiltValue()
abstract class CustomerListRequest implements Built<CustomerListRequest, CustomerListRequestBuilder> {
  @BuiltValueField(wireName: r'list_type')
  UserListType? get listType;
  // enum listTypeEnum {  EMAIL,  IDFA,  MAID,  LR_ID,  DLX_ID,  HASHED_PINNER_ID,  };

  /// Customer list name.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  @BuiltValueField(wireName: r'records')
  String get records;

  CustomerListRequest._();

  factory CustomerListRequest([void updates(CustomerListRequestBuilder b)]) = _$CustomerListRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListRequestBuilder b) => b
      ..listType = 'EMAIL';

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListRequest> get serializer => _$CustomerListRequestSerializer();
}

class _$CustomerListRequestSerializer implements PrimitiveSerializer<CustomerListRequest> {
  @override
  final Iterable<Type> types = const [CustomerListRequest, _$CustomerListRequest];

  @override
  final String wireName = r'CustomerListRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    yield r'records';
    yield serializers.serialize(
      object.records,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerListRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'list_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UserListType),
          ) as UserListType;
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
  CustomerListRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListRequestBuilder();
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

