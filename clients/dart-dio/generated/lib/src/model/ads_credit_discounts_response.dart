//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_credit_discounts_response.g.dart';

/// AdsCreditDiscountsResponse
///
/// Properties:
/// * [active] - True if the offer code is currently active.
/// * [advertiserId] - Advertiser ID the offer was applied to.
/// * [discountCurrency] - Currency value for the discount.
/// * [discountInMicroCurrency] - The discount applied in the offer’s currency value.
/// * [discountType] - The type of discount of this credit
/// * [remainingDiscountInMicroCurrency] - The credits left to spend.
/// * [title] - Human readable title of the offer code.
@BuiltValue()
abstract class AdsCreditDiscountsResponse implements Built<AdsCreditDiscountsResponse, AdsCreditDiscountsResponseBuilder> {
  /// True if the offer code is currently active.
  @BuiltValueField(wireName: r'active')
  bool? get active;

  /// Advertiser ID the offer was applied to.
  @BuiltValueField(wireName: r'advertiser_id')
  String? get advertiserId;

  /// Currency value for the discount.
  @BuiltValueField(wireName: r'discountCurrency')
  String? get discountCurrency;

  /// The discount applied in the offer’s currency value.
  @BuiltValueField(wireName: r'discountInMicroCurrency')
  num? get discountInMicroCurrency;

  /// The type of discount of this credit
  @BuiltValueField(wireName: r'discountType')
  AdsCreditDiscountsResponseDiscountTypeEnum? get discountType;
  // enum discountTypeEnum {  COUPON,  CREDIT,  COUPON_APPLIED,  CREDIT_APPLIED,  MARKETING_OFFER_CREDIT,  MARKETING_OFFER_CREDIT_APPLIED,  GOODWILL_CREDIT,  GOODWILL_CREDIT_APPLIED,  INTERNAL_CREDIT,  INTERNAL_CREDIT_APPLIED,  PREPAID_CREDIT,  PREPAID_CREDIT_APPLIED,  SALES_INCENTIVE_CREDIT,  SALES_INCENTIVE_CREDIT_APPLIED,  CREDIT_EXPIRED,  FUTURE_CREDIT,  REFERRAL_CREDIT,  INVOICE_SALES_INCENTIVE_CREDIT,  INVOICE_SALES_INCENTIVE_CREDIT_APPLIED,  PREPAID_CREDIT_REFUND,  ,  };

  /// The credits left to spend.
  @BuiltValueField(wireName: r'remainingDiscountInMicroCurrency')
  num? get remainingDiscountInMicroCurrency;

  /// Human readable title of the offer code.
  @BuiltValueField(wireName: r'title')
  String? get title;

  AdsCreditDiscountsResponse._();

  factory AdsCreditDiscountsResponse([void updates(AdsCreditDiscountsResponseBuilder b)]) = _$AdsCreditDiscountsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsCreditDiscountsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsCreditDiscountsResponse> get serializer => _$AdsCreditDiscountsResponseSerializer();
}

class _$AdsCreditDiscountsResponseSerializer implements PrimitiveSerializer<AdsCreditDiscountsResponse> {
  @override
  final Iterable<Type> types = const [AdsCreditDiscountsResponse, _$AdsCreditDiscountsResponse];

  @override
  final String wireName = r'AdsCreditDiscountsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsCreditDiscountsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.active != null) {
      yield r'active';
      yield serializers.serialize(
        object.active,
        specifiedType: const FullType(bool),
      );
    }
    if (object.advertiserId != null) {
      yield r'advertiser_id';
      yield serializers.serialize(
        object.advertiserId,
        specifiedType: const FullType(String),
      );
    }
    if (object.discountCurrency != null) {
      yield r'discountCurrency';
      yield serializers.serialize(
        object.discountCurrency,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.discountInMicroCurrency != null) {
      yield r'discountInMicroCurrency';
      yield serializers.serialize(
        object.discountInMicroCurrency,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.discountType != null) {
      yield r'discountType';
      yield serializers.serialize(
        object.discountType,
        specifiedType: const FullType.nullable(AdsCreditDiscountsResponseDiscountTypeEnum),
      );
    }
    if (object.remainingDiscountInMicroCurrency != null) {
      yield r'remainingDiscountInMicroCurrency';
      yield serializers.serialize(
        object.remainingDiscountInMicroCurrency,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdsCreditDiscountsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsCreditDiscountsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'active':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.active = valueDes;
          break;
        case r'advertiser_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.advertiserId = valueDes;
          break;
        case r'discountCurrency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.discountCurrency = valueDes;
          break;
        case r'discountInMicroCurrency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.discountInMicroCurrency = valueDes;
          break;
        case r'discountType':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdsCreditDiscountsResponseDiscountTypeEnum),
          ) as AdsCreditDiscountsResponseDiscountTypeEnum?;
          if (valueDes == null) continue;
          result.discountType = valueDes;
          break;
        case r'remainingDiscountInMicroCurrency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.remainingDiscountInMicroCurrency = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdsCreditDiscountsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsCreditDiscountsResponseBuilder();
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

class AdsCreditDiscountsResponseDiscountTypeEnum extends EnumClass {

  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'COUPON')
  static const AdsCreditDiscountsResponseDiscountTypeEnum COUPON = _$adsCreditDiscountsResponseDiscountTypeEnum_COUPON;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'CREDIT')
  static const AdsCreditDiscountsResponseDiscountTypeEnum CREDIT = _$adsCreditDiscountsResponseDiscountTypeEnum_CREDIT;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'COUPON_APPLIED')
  static const AdsCreditDiscountsResponseDiscountTypeEnum COUPON_APPLIED = _$adsCreditDiscountsResponseDiscountTypeEnum_COUPON_APPLIED;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'CREDIT_APPLIED')
  static const AdsCreditDiscountsResponseDiscountTypeEnum CREDIT_APPLIED = _$adsCreditDiscountsResponseDiscountTypeEnum_CREDIT_APPLIED;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'MARKETING_OFFER_CREDIT')
  static const AdsCreditDiscountsResponseDiscountTypeEnum MARKETING_OFFER_CREDIT = _$adsCreditDiscountsResponseDiscountTypeEnum_MARKETING_OFFER_CREDIT;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'MARKETING_OFFER_CREDIT_APPLIED')
  static const AdsCreditDiscountsResponseDiscountTypeEnum MARKETING_OFFER_CREDIT_APPLIED = _$adsCreditDiscountsResponseDiscountTypeEnum_MARKETING_OFFER_CREDIT_APPLIED;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'GOODWILL_CREDIT')
  static const AdsCreditDiscountsResponseDiscountTypeEnum GOODWILL_CREDIT = _$adsCreditDiscountsResponseDiscountTypeEnum_GOODWILL_CREDIT;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'GOODWILL_CREDIT_APPLIED')
  static const AdsCreditDiscountsResponseDiscountTypeEnum GOODWILL_CREDIT_APPLIED = _$adsCreditDiscountsResponseDiscountTypeEnum_GOODWILL_CREDIT_APPLIED;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'INTERNAL_CREDIT')
  static const AdsCreditDiscountsResponseDiscountTypeEnum INTERNAL_CREDIT = _$adsCreditDiscountsResponseDiscountTypeEnum_INTERNAL_CREDIT;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'INTERNAL_CREDIT_APPLIED')
  static const AdsCreditDiscountsResponseDiscountTypeEnum INTERNAL_CREDIT_APPLIED = _$adsCreditDiscountsResponseDiscountTypeEnum_INTERNAL_CREDIT_APPLIED;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'PREPAID_CREDIT')
  static const AdsCreditDiscountsResponseDiscountTypeEnum PREPAID_CREDIT = _$adsCreditDiscountsResponseDiscountTypeEnum_PREPAID_CREDIT;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'PREPAID_CREDIT_APPLIED')
  static const AdsCreditDiscountsResponseDiscountTypeEnum PREPAID_CREDIT_APPLIED = _$adsCreditDiscountsResponseDiscountTypeEnum_PREPAID_CREDIT_APPLIED;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'SALES_INCENTIVE_CREDIT')
  static const AdsCreditDiscountsResponseDiscountTypeEnum SALES_INCENTIVE_CREDIT = _$adsCreditDiscountsResponseDiscountTypeEnum_SALES_INCENTIVE_CREDIT;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'SALES_INCENTIVE_CREDIT_APPLIED')
  static const AdsCreditDiscountsResponseDiscountTypeEnum SALES_INCENTIVE_CREDIT_APPLIED = _$adsCreditDiscountsResponseDiscountTypeEnum_SALES_INCENTIVE_CREDIT_APPLIED;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'CREDIT_EXPIRED')
  static const AdsCreditDiscountsResponseDiscountTypeEnum CREDIT_EXPIRED = _$adsCreditDiscountsResponseDiscountTypeEnum_CREDIT_EXPIRED;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'FUTURE_CREDIT')
  static const AdsCreditDiscountsResponseDiscountTypeEnum FUTURE_CREDIT = _$adsCreditDiscountsResponseDiscountTypeEnum_FUTURE_CREDIT;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'REFERRAL_CREDIT')
  static const AdsCreditDiscountsResponseDiscountTypeEnum REFERRAL_CREDIT = _$adsCreditDiscountsResponseDiscountTypeEnum_REFERRAL_CREDIT;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'INVOICE_SALES_INCENTIVE_CREDIT')
  static const AdsCreditDiscountsResponseDiscountTypeEnum INVOICE_SALES_INCENTIVE_CREDIT = _$adsCreditDiscountsResponseDiscountTypeEnum_INVOICE_SALES_INCENTIVE_CREDIT;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED')
  static const AdsCreditDiscountsResponseDiscountTypeEnum INVOICE_SALES_INCENTIVE_CREDIT_APPLIED = _$adsCreditDiscountsResponseDiscountTypeEnum_INVOICE_SALES_INCENTIVE_CREDIT_APPLIED;
  /// The type of discount of this credit
  @BuiltValueEnumConst(wireName: r'PREPAID_CREDIT_REFUND')
  static const AdsCreditDiscountsResponseDiscountTypeEnum PREPAID_CREDIT_REFUND = _$adsCreditDiscountsResponseDiscountTypeEnum_PREPAID_CREDIT_REFUND;

  static Serializer<AdsCreditDiscountsResponseDiscountTypeEnum> get serializer => _$adsCreditDiscountsResponseDiscountTypeEnumSerializer;

  const AdsCreditDiscountsResponseDiscountTypeEnum._(String name): super(name);

  static BuiltSet<AdsCreditDiscountsResponseDiscountTypeEnum> get values => _$adsCreditDiscountsResponseDiscountTypeEnumValues;
  static AdsCreditDiscountsResponseDiscountTypeEnum valueOf(String name) => _$adsCreditDiscountsResponseDiscountTypeEnumValueOf(name);
}

