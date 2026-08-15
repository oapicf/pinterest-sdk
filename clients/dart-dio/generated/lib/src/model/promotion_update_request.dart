//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/promotion_template_value.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/promotion_type.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/promotion_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'promotion_update_request.g.dart';

/// PromotionUpdateRequest
///
/// Properties:
/// * [discountStatus] - Discount status based on the current time and start and end time of discount
/// * [endTime] - Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
/// * [externalId] - Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
/// * [platformType] - The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
/// * [promotionCode] - Code that can be used to redeem a promotion.
/// * [promotionCustomId] - An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
/// * [promotionTitle] - Internal name for the promotion.
/// * [promotionType] 
/// * [startTime] - Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
/// * [templateValues] - List of values to be inserted in the promotion type-specific template.
/// * [id] - Promotion ID
/// * [status] 
@BuiltValue()
abstract class PromotionUpdateRequest implements PromotionCommon, Built<PromotionUpdateRequest, PromotionUpdateRequestBuilder> {
  /// Promotion ID
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  PromotionUpdateRequest._();

  factory PromotionUpdateRequest([void updates(PromotionUpdateRequestBuilder b)]) = _$PromotionUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PromotionUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PromotionUpdateRequest> get serializer => _$PromotionUpdateRequestSerializer();
}

class _$PromotionUpdateRequestSerializer implements PrimitiveSerializer<PromotionUpdateRequest> {
  @override
  final Iterable<Type> types = const [PromotionUpdateRequest, _$PromotionUpdateRequest];

  @override
  final String wireName = r'PromotionUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PromotionUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.promotionCustomId != null) {
      yield r'promotion_custom_id';
      yield serializers.serialize(
        object.promotionCustomId,
        specifiedType: const FullType(String),
      );
    }
    if (object.promotionTitle != null) {
      yield r'promotion_title';
      yield serializers.serialize(
        object.promotionTitle,
        specifiedType: const FullType(String),
      );
    }
    if (object.promotionType != null) {
      yield r'promotion_type';
      yield serializers.serialize(
        object.promotionType,
        specifiedType: const FullType(PromotionType),
      );
    }
    if (object.discountStatus != null) {
      yield r'discount_status';
      yield serializers.serialize(
        object.discountStatus,
        specifiedType: const FullType(PromotionCommonDiscountStatusEnum),
      );
    }
    if (object.platformType != null) {
      yield r'platform_type';
      yield serializers.serialize(
        object.platformType,
        specifiedType: const FullType(String),
      );
    }
    if (object.promotionCode != null) {
      yield r'promotion_code';
      yield serializers.serialize(
        object.promotionCode,
        specifiedType: const FullType(String),
      );
    }
    if (object.templateValues != null) {
      yield r'template_values';
      yield serializers.serialize(
        object.templateValues,
        specifiedType: const FullType(BuiltList, [FullType(PromotionTemplateValue)]),
      );
    }
    if (object.externalId != null) {
      yield r'external_id';
      yield serializers.serialize(
        object.externalId,
        specifiedType: const FullType(String),
      );
    }
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
        specifiedType: const FullType(int),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.endTime != null) {
      yield r'end_time';
      yield serializers.serialize(
        object.endTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(EntityStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PromotionUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PromotionUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'promotion_custom_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.promotionCustomId = valueDes;
          break;
        case r'promotion_title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.promotionTitle = valueDes;
          break;
        case r'promotion_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PromotionType),
          ) as PromotionType;
          result.promotionType = valueDes;
          break;
        case r'discount_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PromotionCommonDiscountStatusEnum),
          ) as PromotionCommonDiscountStatusEnum;
          result.discountStatus = valueDes;
          break;
        case r'platform_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.platformType = valueDes;
          break;
        case r'promotion_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.promotionCode = valueDes;
          break;
        case r'template_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PromotionTemplateValue)]),
          ) as BuiltList<PromotionTemplateValue>;
          result.templateValues.replace(valueDes);
          break;
        case r'external_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.externalId = valueDes;
          break;
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.startTime = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.endTime = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EntityStatus),
          ) as EntityStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PromotionUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PromotionUpdateRequestBuilder();
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

class PromotionUpdateRequestDiscountStatusEnum extends EnumClass {

  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const PromotionUpdateRequestDiscountStatusEnum OTHER = _$promotionUpdateRequestDiscountStatusEnum_OTHER;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const PromotionUpdateRequestDiscountStatusEnum ACTIVE = _$promotionUpdateRequestDiscountStatusEnum_ACTIVE;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const PromotionUpdateRequestDiscountStatusEnum PAUSED = _$promotionUpdateRequestDiscountStatusEnum_PAUSED;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'SCHEDULED')
  static const PromotionUpdateRequestDiscountStatusEnum SCHEDULED = _$promotionUpdateRequestDiscountStatusEnum_SCHEDULED;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'EXPIRED')
  static const PromotionUpdateRequestDiscountStatusEnum EXPIRED = _$promotionUpdateRequestDiscountStatusEnum_EXPIRED;

  static Serializer<PromotionUpdateRequestDiscountStatusEnum> get serializer => _$promotionUpdateRequestDiscountStatusEnumSerializer;

  const PromotionUpdateRequestDiscountStatusEnum._(String name): super(name);

  static BuiltSet<PromotionUpdateRequestDiscountStatusEnum> get values => _$promotionUpdateRequestDiscountStatusEnumValues;
  static PromotionUpdateRequestDiscountStatusEnum valueOf(String name) => _$promotionUpdateRequestDiscountStatusEnumValueOf(name);
}

