//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/promotion_template_value.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/promotion_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'promotion_common.g.dart';

/// PromotionCommon
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
@BuiltValue(instantiable: false)
abstract class PromotionCommon  {
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueField(wireName: r'discount_status')
  PromotionCommonDiscountStatusEnum? get discountStatus;
  // enum discountStatusEnum {  OTHER,  ACTIVE,  PAUSED,  SCHEDULED,  EXPIRED,  };

  /// Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
  @BuiltValueField(wireName: r'end_time')
  int? get endTime;

  /// Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
  @BuiltValueField(wireName: r'external_id')
  String? get externalId;

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
  String? get promotionTitle;

  @BuiltValueField(wireName: r'promotion_type')
  PromotionType? get promotionType;
  // enum promotionTypeEnum {  VARIABLE,  SITEWIDE,  CHECKOUT,  SAVE_X_ON_Y,  BUY_X_GET_Y,  SPEND_X_SAVE_Y,  FREE_SHIPPING,  FREE_SHIPPING_MINIMUM,  FREE_SHIPPING_WITH_DISCOUNT,  SITEWIDE_IN_STORES,  EXTRA_PERCENT_OFF,  GIFT_WITH_PURCHASE,  GIFT_WITH_PURCHASE_MINIMUM,  FIXED,  PERCENT_OFF_CLEARANCE,  X_OFF_Y,  GIFT_WITH_FIRST_PURCHASE,  BUY_X_GET_ONE_FREE,  CASH_BACK,  POINTS_ON_ALL_PURCHASES,  BONUS,  POINTS_WITH_PURCHASE,  CUSTOM,  };

  /// Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  @BuiltValueField(wireName: r'start_time')
  int? get startTime;

  /// List of values to be inserted in the promotion type-specific template.
  @BuiltValueField(wireName: r'template_values')
  BuiltList<PromotionTemplateValue>? get templateValues;

  @BuiltValueSerializer(custom: true)
  static Serializer<PromotionCommon> get serializer => _$PromotionCommonSerializer();
}

class _$PromotionCommonSerializer implements PrimitiveSerializer<PromotionCommon> {
  @override
  final Iterable<Type> types = const [PromotionCommon];

  @override
  final String wireName = r'PromotionCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PromotionCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.discountStatus != null) {
      yield r'discount_status';
      yield serializers.serialize(
        object.discountStatus,
        specifiedType: const FullType(PromotionCommonDiscountStatusEnum),
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
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
        specifiedType: const FullType(int),
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
    PromotionCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  PromotionCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($PromotionCommon)) as $PromotionCommon;
  }
}

/// a concrete implementation of [PromotionCommon], since [PromotionCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $PromotionCommon implements PromotionCommon, Built<$PromotionCommon, $PromotionCommonBuilder> {
  $PromotionCommon._();

  factory $PromotionCommon([void Function($PromotionCommonBuilder)? updates]) = _$$PromotionCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($PromotionCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$PromotionCommon> get serializer => _$$PromotionCommonSerializer();
}

class _$$PromotionCommonSerializer implements PrimitiveSerializer<$PromotionCommon> {
  @override
  final Iterable<Type> types = const [$PromotionCommon, _$$PromotionCommon];

  @override
  final String wireName = r'$PromotionCommon';

  @override
  Object serialize(
    Serializers serializers,
    $PromotionCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(PromotionCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PromotionCommonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'discount_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PromotionCommonDiscountStatusEnum),
          ) as PromotionCommonDiscountStatusEnum;
          result.discountStatus = valueDes;
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.endTime = valueDes;
          break;
        case r'external_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.externalId = valueDes;
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
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.startTime = valueDes;
          break;
        case r'template_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PromotionTemplateValue)]),
          ) as BuiltList<PromotionTemplateValue>;
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
  $PromotionCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $PromotionCommonBuilder();
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

class PromotionCommonDiscountStatusEnum extends EnumClass {

  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const PromotionCommonDiscountStatusEnum OTHER = _$promotionCommonDiscountStatusEnum_OTHER;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const PromotionCommonDiscountStatusEnum ACTIVE = _$promotionCommonDiscountStatusEnum_ACTIVE;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const PromotionCommonDiscountStatusEnum PAUSED = _$promotionCommonDiscountStatusEnum_PAUSED;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'SCHEDULED')
  static const PromotionCommonDiscountStatusEnum SCHEDULED = _$promotionCommonDiscountStatusEnum_SCHEDULED;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'EXPIRED')
  static const PromotionCommonDiscountStatusEnum EXPIRED = _$promotionCommonDiscountStatusEnum_EXPIRED;

  static Serializer<PromotionCommonDiscountStatusEnum> get serializer => _$promotionCommonDiscountStatusEnumSerializer;

  const PromotionCommonDiscountStatusEnum._(String name): super(name);

  static BuiltSet<PromotionCommonDiscountStatusEnum> get values => _$promotionCommonDiscountStatusEnumValues;
  static PromotionCommonDiscountStatusEnum valueOf(String name) => _$promotionCommonDiscountStatusEnumValueOf(name);
}

