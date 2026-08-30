//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/discount_status.dart';
import 'package:openapi/src/model/promotion_template_value.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/promotion_type.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'promotion.g.dart';

/// Promotion
///
/// Properties:
/// * [adAccountId] - The Ad Account ID that this promotion belongs to.
/// * [discountStatus] 
/// * [endTime] - Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
/// * [externalId] - Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
/// * [id] - Promotion ID
/// * [platformType] - The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
/// * [promotionCode] - Code that can be used to redeem a promotion.
/// * [promotionCustomId] - An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
/// * [promotionTitle] - Internal name for the promotion.
/// * [promotionType] 
/// * [startTime] - Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
/// * [status] 
/// * [templateValues] - List of values to be inserted in the promotion type-specific template.
@BuiltValue()
abstract class Promotion implements Built<Promotion, PromotionBuilder> {
  /// The Ad Account ID that this promotion belongs to.
  @BuiltValueField(wireName: r'ad_account_id')
  String get adAccountId;

  @BuiltValueField(wireName: r'discount_status')
  DiscountStatus? get discountStatus;
  // enum discountStatusEnum {  OTHER,  ACTIVE,  PAUSED,  SCHEDULED,  EXPIRED,  };

  /// Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
  @BuiltValueField(wireName: r'end_time')
  int? get endTime;

  /// Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
  @BuiltValueField(wireName: r'external_id')
  String? get externalId;

  /// Promotion ID
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
  @BuiltValueField(wireName: r'platform_type')
  String? get platformType;

  /// Code that can be used to redeem a promotion.
  @BuiltValueField(wireName: r'promotion_code')
  String? get promotionCode;

  /// An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
  @BuiltValueField(wireName: r'promotion_custom_id')
  String? get promotionCustomId;

  /// Internal name for the promotion.
  @BuiltValueField(wireName: r'promotion_title')
  String get promotionTitle;

  @BuiltValueField(wireName: r'promotion_type')
  PromotionType get promotionType;
  // enum promotionTypeEnum {  VARIABLE,  SITEWIDE,  CHECKOUT,  SAVE_X_ON_Y,  BUY_X_GET_Y,  SPEND_X_SAVE_Y,  FREE_SHIPPING,  FREE_SHIPPING_MINIMUM,  FREE_SHIPPING_WITH_DISCOUNT,  SITEWIDE_IN_STORES,  EXTRA_PERCENT_OFF,  GIFT_WITH_PURCHASE,  GIFT_WITH_PURCHASE_MINIMUM,  FIXED,  PERCENT_OFF_CLEARANCE,  X_OFF_Y,  GIFT_WITH_FIRST_PURCHASE,  BUY_X_GET_ONE_FREE,  CASH_BACK,  POINTS_ON_ALL_PURCHASES,  BONUS,  POINTS_WITH_PURCHASE,  CUSTOM,  };

  /// Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  @BuiltValueField(wireName: r'start_time')
  int? get startTime;

  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  /// List of values to be inserted in the promotion type-specific template.
  @BuiltValueField(wireName: r'template_values')
  BuiltList<PromotionTemplateValue>? get templateValues;

  Promotion._();

  factory Promotion([void updates(PromotionBuilder b)]) = _$Promotion;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PromotionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Promotion> get serializer => _$PromotionSerializer();
}

class _$PromotionSerializer implements PrimitiveSerializer<Promotion> {
  @override
  final Iterable<Type> types = const [Promotion, _$Promotion];

  @override
  final String wireName = r'Promotion';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Promotion object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ad_account_id';
    yield serializers.serialize(
      object.adAccountId,
      specifiedType: const FullType(String),
    );
    if (object.discountStatus != null) {
      yield r'discount_status';
      yield serializers.serialize(
        object.discountStatus,
        specifiedType: const FullType(DiscountStatus),
      );
    }
    if (object.endTime != null) {
      yield r'end_time';
      yield serializers.serialize(
        object.endTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.externalId != null) {
      yield r'external_id';
      yield serializers.serialize(
        object.externalId,
        specifiedType: const FullType(String),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
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
    if (object.promotionCustomId != null) {
      yield r'promotion_custom_id';
      yield serializers.serialize(
        object.promotionCustomId,
        specifiedType: const FullType(String),
      );
    }
    yield r'promotion_title';
    yield serializers.serialize(
      object.promotionTitle,
      specifiedType: const FullType(String),
    );
    yield r'promotion_type';
    yield serializers.serialize(
      object.promotionType,
      specifiedType: const FullType(PromotionType),
    );
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
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
    if (object.templateValues != null) {
      yield r'template_values';
      yield serializers.serialize(
        object.templateValues,
        specifiedType: const FullType(BuiltList, [FullType(PromotionTemplateValue)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Promotion object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PromotionBuilder result,
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
        case r'discount_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DiscountStatus),
          ) as DiscountStatus?;
          if (valueDes == null) continue;
          result.discountStatus = valueDes;
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.endTime = valueDes;
          break;
        case r'external_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.externalId = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'platform_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.platformType = valueDes;
          break;
        case r'promotion_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.promotionCode = valueDes;
          break;
        case r'promotion_custom_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.startTime = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EntityStatus),
          ) as EntityStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'template_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(PromotionTemplateValue)]),
          ) as BuiltList<PromotionTemplateValue>?;
          if (valueDes == null) continue;
          result.templateValues.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Promotion deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PromotionBuilder();
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

