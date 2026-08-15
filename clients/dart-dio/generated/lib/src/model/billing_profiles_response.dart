//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_profiles_response.g.dart';

/// BillingProfilesResponse
///
/// Properties:
/// * [advertiserId] - Advertiser ID of the billing.
/// * [billingType] - Billing type of the advertiser
/// * [cardType] - Type of the card.
/// * [id] - Billing ID.
/// * [paymentMethodBrand] - Brand of the payment method.
/// * [status] - Status of the billing.
@BuiltValue()
abstract class BillingProfilesResponse implements Built<BillingProfilesResponse, BillingProfilesResponseBuilder> {
  /// Advertiser ID of the billing.
  @BuiltValueField(wireName: r'advertiser_id')
  String? get advertiserId;

  /// Billing type of the advertiser
  @BuiltValueField(wireName: r'billing_type')
  BillingProfilesResponseBillingTypeEnum? get billingType;
  // enum billingTypeEnum {  CREDIT_CARD,  INVOICE,  INTERNAL,  RECURRING,  PREPAID,  };

  /// Type of the card.
  @BuiltValueField(wireName: r'card_type')
  BillingProfilesResponseCardTypeEnum? get cardType;
  // enum cardTypeEnum {  UNKNOWN,  VISA,  MASTERCARD,  AMERICAN_EXPRESS,  DISCOVER,  ELO,  };

  /// Billing ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Brand of the payment method.
  @BuiltValueField(wireName: r'payment_method_brand')
  BillingProfilesResponsePaymentMethodBrandEnum? get paymentMethodBrand;
  // enum paymentMethodBrandEnum {  UNKNOWN,  VISA,  MASTERCARD,  AMERICAN_EXPRESS,  DISCOVER,  SOFORT,  DINERS_CLUB,  ELO,  CARTE_BANCAIRE,  };

  /// Status of the billing.
  @BuiltValueField(wireName: r'status')
  BillingProfilesResponseStatusEnum? get status;
  // enum statusEnum {  UNSPECIFIED,  VALID,  INVALID,  PENDING,  DELETED,  SECONDARY,  PENDING_SECONDARY,  };

  BillingProfilesResponse._();

  factory BillingProfilesResponse([void updates(BillingProfilesResponseBuilder b)]) = _$BillingProfilesResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BillingProfilesResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BillingProfilesResponse> get serializer => _$BillingProfilesResponseSerializer();
}

class _$BillingProfilesResponseSerializer implements PrimitiveSerializer<BillingProfilesResponse> {
  @override
  final Iterable<Type> types = const [BillingProfilesResponse, _$BillingProfilesResponse];

  @override
  final String wireName = r'BillingProfilesResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BillingProfilesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.advertiserId != null) {
      yield r'advertiser_id';
      yield serializers.serialize(
        object.advertiserId,
        specifiedType: const FullType(String),
      );
    }
    if (object.billingType != null) {
      yield r'billing_type';
      yield serializers.serialize(
        object.billingType,
        specifiedType: const FullType(BillingProfilesResponseBillingTypeEnum),
      );
    }
    if (object.cardType != null) {
      yield r'card_type';
      yield serializers.serialize(
        object.cardType,
        specifiedType: const FullType(BillingProfilesResponseCardTypeEnum),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.paymentMethodBrand != null) {
      yield r'payment_method_brand';
      yield serializers.serialize(
        object.paymentMethodBrand,
        specifiedType: const FullType(BillingProfilesResponsePaymentMethodBrandEnum),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(BillingProfilesResponseStatusEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BillingProfilesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BillingProfilesResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'advertiser_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.advertiserId = valueDes;
          break;
        case r'billing_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BillingProfilesResponseBillingTypeEnum),
          ) as BillingProfilesResponseBillingTypeEnum;
          result.billingType = valueDes;
          break;
        case r'card_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BillingProfilesResponseCardTypeEnum),
          ) as BillingProfilesResponseCardTypeEnum;
          result.cardType = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'payment_method_brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BillingProfilesResponsePaymentMethodBrandEnum),
          ) as BillingProfilesResponsePaymentMethodBrandEnum;
          result.paymentMethodBrand = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BillingProfilesResponseStatusEnum),
          ) as BillingProfilesResponseStatusEnum;
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
  BillingProfilesResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BillingProfilesResponseBuilder();
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

class BillingProfilesResponseBillingTypeEnum extends EnumClass {

  /// Billing type of the advertiser
  @BuiltValueEnumConst(wireName: r'CREDIT_CARD')
  static const BillingProfilesResponseBillingTypeEnum CREDIT_CARD = _$billingProfilesResponseBillingTypeEnum_CREDIT_CARD;
  /// Billing type of the advertiser
  @BuiltValueEnumConst(wireName: r'INVOICE')
  static const BillingProfilesResponseBillingTypeEnum INVOICE = _$billingProfilesResponseBillingTypeEnum_INVOICE;
  /// Billing type of the advertiser
  @BuiltValueEnumConst(wireName: r'INTERNAL')
  static const BillingProfilesResponseBillingTypeEnum INTERNAL = _$billingProfilesResponseBillingTypeEnum_INTERNAL;
  /// Billing type of the advertiser
  @BuiltValueEnumConst(wireName: r'RECURRING')
  static const BillingProfilesResponseBillingTypeEnum RECURRING = _$billingProfilesResponseBillingTypeEnum_RECURRING;
  /// Billing type of the advertiser
  @BuiltValueEnumConst(wireName: r'PREPAID')
  static const BillingProfilesResponseBillingTypeEnum PREPAID = _$billingProfilesResponseBillingTypeEnum_PREPAID;

  static Serializer<BillingProfilesResponseBillingTypeEnum> get serializer => _$billingProfilesResponseBillingTypeEnumSerializer;

  const BillingProfilesResponseBillingTypeEnum._(String name): super(name);

  static BuiltSet<BillingProfilesResponseBillingTypeEnum> get values => _$billingProfilesResponseBillingTypeEnumValues;
  static BillingProfilesResponseBillingTypeEnum valueOf(String name) => _$billingProfilesResponseBillingTypeEnumValueOf(name);
}

class BillingProfilesResponseCardTypeEnum extends EnumClass {

  /// Type of the card.
  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const BillingProfilesResponseCardTypeEnum UNKNOWN = _$billingProfilesResponseCardTypeEnum_UNKNOWN;
  /// Type of the card.
  @BuiltValueEnumConst(wireName: r'VISA')
  static const BillingProfilesResponseCardTypeEnum VISA = _$billingProfilesResponseCardTypeEnum_VISA;
  /// Type of the card.
  @BuiltValueEnumConst(wireName: r'MASTERCARD')
  static const BillingProfilesResponseCardTypeEnum MASTERCARD = _$billingProfilesResponseCardTypeEnum_MASTERCARD;
  /// Type of the card.
  @BuiltValueEnumConst(wireName: r'AMERICAN_EXPRESS')
  static const BillingProfilesResponseCardTypeEnum AMERICAN_EXPRESS = _$billingProfilesResponseCardTypeEnum_AMERICAN_EXPRESS;
  /// Type of the card.
  @BuiltValueEnumConst(wireName: r'DISCOVER')
  static const BillingProfilesResponseCardTypeEnum DISCOVER = _$billingProfilesResponseCardTypeEnum_DISCOVER;
  /// Type of the card.
  @BuiltValueEnumConst(wireName: r'ELO')
  static const BillingProfilesResponseCardTypeEnum ELO = _$billingProfilesResponseCardTypeEnum_ELO;

  static Serializer<BillingProfilesResponseCardTypeEnum> get serializer => _$billingProfilesResponseCardTypeEnumSerializer;

  const BillingProfilesResponseCardTypeEnum._(String name): super(name);

  static BuiltSet<BillingProfilesResponseCardTypeEnum> get values => _$billingProfilesResponseCardTypeEnumValues;
  static BillingProfilesResponseCardTypeEnum valueOf(String name) => _$billingProfilesResponseCardTypeEnumValueOf(name);
}

class BillingProfilesResponsePaymentMethodBrandEnum extends EnumClass {

  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const BillingProfilesResponsePaymentMethodBrandEnum UNKNOWN = _$billingProfilesResponsePaymentMethodBrandEnum_UNKNOWN;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'VISA')
  static const BillingProfilesResponsePaymentMethodBrandEnum VISA = _$billingProfilesResponsePaymentMethodBrandEnum_VISA;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'MASTERCARD')
  static const BillingProfilesResponsePaymentMethodBrandEnum MASTERCARD = _$billingProfilesResponsePaymentMethodBrandEnum_MASTERCARD;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'AMERICAN_EXPRESS')
  static const BillingProfilesResponsePaymentMethodBrandEnum AMERICAN_EXPRESS = _$billingProfilesResponsePaymentMethodBrandEnum_AMERICAN_EXPRESS;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'DISCOVER')
  static const BillingProfilesResponsePaymentMethodBrandEnum DISCOVER = _$billingProfilesResponsePaymentMethodBrandEnum_DISCOVER;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'SOFORT')
  static const BillingProfilesResponsePaymentMethodBrandEnum SOFORT = _$billingProfilesResponsePaymentMethodBrandEnum_SOFORT;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'DINERS_CLUB')
  static const BillingProfilesResponsePaymentMethodBrandEnum DINERS_CLUB = _$billingProfilesResponsePaymentMethodBrandEnum_DINERS_CLUB;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'ELO')
  static const BillingProfilesResponsePaymentMethodBrandEnum ELO = _$billingProfilesResponsePaymentMethodBrandEnum_ELO;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'CARTE_BANCAIRE')
  static const BillingProfilesResponsePaymentMethodBrandEnum CARTE_BANCAIRE = _$billingProfilesResponsePaymentMethodBrandEnum_CARTE_BANCAIRE;

  static Serializer<BillingProfilesResponsePaymentMethodBrandEnum> get serializer => _$billingProfilesResponsePaymentMethodBrandEnumSerializer;

  const BillingProfilesResponsePaymentMethodBrandEnum._(String name): super(name);

  static BuiltSet<BillingProfilesResponsePaymentMethodBrandEnum> get values => _$billingProfilesResponsePaymentMethodBrandEnumValues;
  static BillingProfilesResponsePaymentMethodBrandEnum valueOf(String name) => _$billingProfilesResponsePaymentMethodBrandEnumValueOf(name);
}

class BillingProfilesResponseStatusEnum extends EnumClass {

  /// Status of the billing.
  @BuiltValueEnumConst(wireName: r'UNSPECIFIED')
  static const BillingProfilesResponseStatusEnum UNSPECIFIED = _$billingProfilesResponseStatusEnum_UNSPECIFIED;
  /// Status of the billing.
  @BuiltValueEnumConst(wireName: r'VALID')
  static const BillingProfilesResponseStatusEnum VALID = _$billingProfilesResponseStatusEnum_VALID;
  /// Status of the billing.
  @BuiltValueEnumConst(wireName: r'INVALID')
  static const BillingProfilesResponseStatusEnum INVALID = _$billingProfilesResponseStatusEnum_INVALID;
  /// Status of the billing.
  @BuiltValueEnumConst(wireName: r'PENDING')
  static const BillingProfilesResponseStatusEnum PENDING = _$billingProfilesResponseStatusEnum_PENDING;
  /// Status of the billing.
  @BuiltValueEnumConst(wireName: r'DELETED')
  static const BillingProfilesResponseStatusEnum DELETED = _$billingProfilesResponseStatusEnum_DELETED;
  /// Status of the billing.
  @BuiltValueEnumConst(wireName: r'SECONDARY')
  static const BillingProfilesResponseStatusEnum SECONDARY = _$billingProfilesResponseStatusEnum_SECONDARY;
  /// Status of the billing.
  @BuiltValueEnumConst(wireName: r'PENDING_SECONDARY')
  static const BillingProfilesResponseStatusEnum PENDING_SECONDARY = _$billingProfilesResponseStatusEnum_PENDING_SECONDARY;

  static Serializer<BillingProfilesResponseStatusEnum> get serializer => _$billingProfilesResponseStatusEnumSerializer;

  const BillingProfilesResponseStatusEnum._(String name): super(name);

  static BuiltSet<BillingProfilesResponseStatusEnum> get values => _$billingProfilesResponseStatusEnumValues;
  static BillingProfilesResponseStatusEnum valueOf(String name) => _$billingProfilesResponseStatusEnumValueOf(name);
}

