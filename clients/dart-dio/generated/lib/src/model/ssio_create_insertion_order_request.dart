//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/currency.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ssio_insertion_order_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_create_insertion_order_request.g.dart';

/// SSIOCreateInsertionOrderRequest
///
/// Properties:
/// * [agencyLink] - URL link for agency
/// * [billingContactEmail] - The billing contact email
/// * [billingContactFirstname] - The billing contact first name
/// * [billingContactLastname] - The billing contact last name
/// * [budgetAmount] - If Budget order line, the budget amount.
/// * [endDate] - End date of time period. Format: YYYY-MM-DD
/// * [mediaContactEmail] - The media contact email
/// * [mediaContactFirstname] - The media contact first name
/// * [mediaContactLastname] - The media contact last name
/// * [poNumber] - The po number
/// * [startDate] - Starting date of time period. Format: YYYY-MM-DD
/// * [userEmail] - The email of user submitting the insertion order
/// * [acceptedTermsId] - The SFDC id for the terms
/// * [acceptedTermsTime] - The UTC timestamp (to the nearest sec) of when terms were accepted
/// * [billtoBillingAddressId] - The bill-to billing address id
/// * [billtoBusinessAddressId] - The bill-to business address id
/// * [billtoCompanyId] - The bill-to company id
/// * [currencyInfo] 
/// * [estimatedMonthlySpend] - If Ongoing (perpetual) order line, the estimated monthly spend
/// * [orderLineType] - Type can be Budget or Perpetual
/// * [orderName] - The order name
/// * [pmpId] - The pmp id
@BuiltValue()
abstract class SSIOCreateInsertionOrderRequest implements SSIOInsertionOrderCommon, Built<SSIOCreateInsertionOrderRequest, SSIOCreateInsertionOrderRequestBuilder> {
  /// The bill-to company id
  @BuiltValueField(wireName: r'billto_company_id')
  String get billtoCompanyId;

  /// If Ongoing (perpetual) order line, the estimated monthly spend
  @BuiltValueField(wireName: r'estimated_monthly_spend')
  num? get estimatedMonthlySpend;

  /// The pmp id
  @BuiltValueField(wireName: r'pmp_id')
  String get pmpId;

  /// Type can be Budget or Perpetual
  @BuiltValueField(wireName: r'order_line_type')
  SSIOCreateInsertionOrderRequestOrderLineTypeEnum get orderLineType;
  // enum orderLineTypeEnum {  BUDGET,  PERPETUALS,  };

  /// The UTC timestamp (to the nearest sec) of when terms were accepted
  @BuiltValueField(wireName: r'accepted_terms_time')
  int? get acceptedTermsTime;

  /// The SFDC id for the terms
  @BuiltValueField(wireName: r'accepted_terms_id')
  String get acceptedTermsId;

  @BuiltValueField(wireName: r'currency_info')
  Currency get currencyInfo;
  // enum currencyInfoEnum {  UNK,  USD,  GBP,  CAD,  EUR,  AUD,  NZD,  SEK,  ILS,  CHF,  HKD,  JPY,  SGD,  KRW,  NOK,  DKK,  PLN,  RON,  HUF,  CZK,  BRL,  MXN,  ARS,  CLP,  COP,  INR,  TRY,  };

  /// The bill-to business address id
  @BuiltValueField(wireName: r'billto_business_address_id')
  String get billtoBusinessAddressId;

  /// The bill-to billing address id
  @BuiltValueField(wireName: r'billto_billing_address_id')
  String get billtoBillingAddressId;

  /// The order name
  @BuiltValueField(wireName: r'order_name')
  String get orderName;

  SSIOCreateInsertionOrderRequest._();

  factory SSIOCreateInsertionOrderRequest([void updates(SSIOCreateInsertionOrderRequestBuilder b)]) = _$SSIOCreateInsertionOrderRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOCreateInsertionOrderRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOCreateInsertionOrderRequest> get serializer => _$SSIOCreateInsertionOrderRequestSerializer();
}

class _$SSIOCreateInsertionOrderRequestSerializer implements PrimitiveSerializer<SSIOCreateInsertionOrderRequest> {
  @override
  final Iterable<Type> types = const [SSIOCreateInsertionOrderRequest, _$SSIOCreateInsertionOrderRequest];

  @override
  final String wireName = r'SSIOCreateInsertionOrderRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOCreateInsertionOrderRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.agencyLink != null) {
      yield r'agency_link';
      yield serializers.serialize(
        object.agencyLink,
        specifiedType: const FullType(String),
      );
    }
    if (object.estimatedMonthlySpend != null) {
      yield r'estimated_monthly_spend';
      yield serializers.serialize(
        object.estimatedMonthlySpend,
        specifiedType: const FullType(num),
      );
    }
    if (object.endDate != null) {
      yield r'end_date';
      yield serializers.serialize(
        object.endDate,
        specifiedType: const FullType(String),
      );
    }
    if (object.acceptedTermsTime != null) {
      yield r'accepted_terms_time';
      yield serializers.serialize(
        object.acceptedTermsTime,
        specifiedType: const FullType(int),
      );
    }
    yield r'accepted_terms_id';
    yield serializers.serialize(
      object.acceptedTermsId,
      specifiedType: const FullType(String),
    );
    yield r'billto_business_address_id';
    yield serializers.serialize(
      object.billtoBusinessAddressId,
      specifiedType: const FullType(String),
    );
    if (object.billingContactFirstname != null) {
      yield r'billing_contact_firstname';
      yield serializers.serialize(
        object.billingContactFirstname,
        specifiedType: const FullType(String),
      );
    }
    if (object.billingContactLastname != null) {
      yield r'billing_contact_lastname';
      yield serializers.serialize(
        object.billingContactLastname,
        specifiedType: const FullType(String),
      );
    }
    yield r'billto_company_id';
    yield serializers.serialize(
      object.billtoCompanyId,
      specifiedType: const FullType(String),
    );
    yield r'pmp_id';
    yield serializers.serialize(
      object.pmpId,
      specifiedType: const FullType(String),
    );
    yield r'order_line_type';
    yield serializers.serialize(
      object.orderLineType,
      specifiedType: const FullType(SSIOCreateInsertionOrderRequestOrderLineTypeEnum),
    );
    if (object.budgetAmount != null) {
      yield r'budget_amount';
      yield serializers.serialize(
        object.budgetAmount,
        specifiedType: const FullType(num),
      );
    }
    if (object.mediaContactFirstname != null) {
      yield r'media_contact_firstname';
      yield serializers.serialize(
        object.mediaContactFirstname,
        specifiedType: const FullType(String),
      );
    }
    if (object.mediaContactLastname != null) {
      yield r'media_contact_lastname';
      yield serializers.serialize(
        object.mediaContactLastname,
        specifiedType: const FullType(String),
      );
    }
    if (object.mediaContactEmail != null) {
      yield r'media_contact_email';
      yield serializers.serialize(
        object.mediaContactEmail,
        specifiedType: const FullType(String),
      );
    }
    yield r'currency_info';
    yield serializers.serialize(
      object.currencyInfo,
      specifiedType: const FullType(Currency),
    );
    if (object.userEmail != null) {
      yield r'user_email';
      yield serializers.serialize(
        object.userEmail,
        specifiedType: const FullType(String),
      );
    }
    if (object.billingContactEmail != null) {
      yield r'billing_contact_email';
      yield serializers.serialize(
        object.billingContactEmail,
        specifiedType: const FullType(String),
      );
    }
    if (object.poNumber != null) {
      yield r'po_number';
      yield serializers.serialize(
        object.poNumber,
        specifiedType: const FullType(String),
      );
    }
    if (object.startDate != null) {
      yield r'start_date';
      yield serializers.serialize(
        object.startDate,
        specifiedType: const FullType(String),
      );
    }
    yield r'billto_billing_address_id';
    yield serializers.serialize(
      object.billtoBillingAddressId,
      specifiedType: const FullType(String),
    );
    yield r'order_name';
    yield serializers.serialize(
      object.orderName,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOCreateInsertionOrderRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOCreateInsertionOrderRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'agency_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.agencyLink = valueDes;
          break;
        case r'estimated_monthly_spend':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.estimatedMonthlySpend = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endDate = valueDes;
          break;
        case r'accepted_terms_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.acceptedTermsTime = valueDes;
          break;
        case r'accepted_terms_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.acceptedTermsId = valueDes;
          break;
        case r'billto_business_address_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billtoBusinessAddressId = valueDes;
          break;
        case r'billing_contact_firstname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billingContactFirstname = valueDes;
          break;
        case r'billing_contact_lastname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billingContactLastname = valueDes;
          break;
        case r'billto_company_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billtoCompanyId = valueDes;
          break;
        case r'pmp_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pmpId = valueDes;
          break;
        case r'order_line_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(SSIOCreateInsertionOrderRequestOrderLineTypeEnum),
          ) as SSIOCreateInsertionOrderRequestOrderLineTypeEnum;
          result.orderLineType = valueDes;
          break;
        case r'budget_amount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.budgetAmount = valueDes;
          break;
        case r'media_contact_firstname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaContactFirstname = valueDes;
          break;
        case r'media_contact_lastname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaContactLastname = valueDes;
          break;
        case r'media_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaContactEmail = valueDes;
          break;
        case r'currency_info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Currency),
          ) as Currency;
          result.currencyInfo = valueDes;
          break;
        case r'user_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.userEmail = valueDes;
          break;
        case r'billing_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billingContactEmail = valueDes;
          break;
        case r'po_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.poNumber = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startDate = valueDes;
          break;
        case r'billto_billing_address_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billtoBillingAddressId = valueDes;
          break;
        case r'order_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.orderName = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOCreateInsertionOrderRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOCreateInsertionOrderRequestBuilder();
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

class SSIOCreateInsertionOrderRequestOrderLineTypeEnum extends EnumClass {

  /// Type can be Budget or Perpetual
  @BuiltValueEnumConst(wireName: r'BUDGET')
  static const SSIOCreateInsertionOrderRequestOrderLineTypeEnum BUDGET = _$sSIOCreateInsertionOrderRequestOrderLineTypeEnum_BUDGET;
  /// Type can be Budget or Perpetual
  @BuiltValueEnumConst(wireName: r'PERPETUALS')
  static const SSIOCreateInsertionOrderRequestOrderLineTypeEnum PERPETUALS = _$sSIOCreateInsertionOrderRequestOrderLineTypeEnum_PERPETUALS;

  static Serializer<SSIOCreateInsertionOrderRequestOrderLineTypeEnum> get serializer => _$sSIOCreateInsertionOrderRequestOrderLineTypeEnumSerializer;

  const SSIOCreateInsertionOrderRequestOrderLineTypeEnum._(String name): super(name);

  static BuiltSet<SSIOCreateInsertionOrderRequestOrderLineTypeEnum> get values => _$sSIOCreateInsertionOrderRequestOrderLineTypeEnumValues;
  static SSIOCreateInsertionOrderRequestOrderLineTypeEnum valueOf(String name) => _$sSIOCreateInsertionOrderRequestOrderLineTypeEnumValueOf(name);
}

