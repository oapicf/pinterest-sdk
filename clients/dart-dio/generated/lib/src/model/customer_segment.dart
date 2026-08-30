//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_template_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_segment.g.dart';

/// CustomerSegment
///
/// Properties:
/// * [adAccountId] - The ID of the ad account that this customer segment belongs to.
/// * [audienceIds] - Audience IDs included in the customer segment.
/// * [createdTime] - Customer segment created time. Unix timestamp in seconds.
/// * [id] - Customer segment ID.
/// * [name] - Customer segment name.
/// * [status] - Indicates whether the customer segment is active or deleted.
/// * [updatedTime] - Customer segment updated time. Unix timestamp in seconds.
@BuiltValue()
abstract class CustomerSegment implements Built<CustomerSegment, CustomerSegmentBuilder> {
  /// The ID of the ad account that this customer segment belongs to.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// Audience IDs included in the customer segment.
  @BuiltValueField(wireName: r'audience_ids')
  BuiltList<String> get audienceIds;

  /// Customer segment created time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Customer segment ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Customer segment name.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Indicates whether the customer segment is active or deleted.
  @BuiltValueField(wireName: r'status')
  TargetingTemplateStatus? get status;
  // enum statusEnum {  ACTIVE,  DELETED,  };

  /// Customer segment updated time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'updated_time')
  int? get updatedTime;

  CustomerSegment._();

  factory CustomerSegment([void updates(CustomerSegmentBuilder b)]) = _$CustomerSegment;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerSegmentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerSegment> get serializer => _$CustomerSegmentSerializer();
}

class _$CustomerSegmentSerializer implements PrimitiveSerializer<CustomerSegment> {
  @override
  final Iterable<Type> types = const [CustomerSegment, _$CustomerSegment];

  @override
  final String wireName = r'CustomerSegment';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerSegment object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    yield r'audience_ids';
    yield serializers.serialize(
      object.audienceIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(TargetingTemplateStatus),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerSegment object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerSegmentBuilder result,
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
        case r'audience_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.audienceIds.replace(valueDes);
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingTemplateStatus),
          ) as TargetingTemplateStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
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
  CustomerSegment deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerSegmentBuilder();
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

