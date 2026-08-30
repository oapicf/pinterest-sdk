//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/currency.dart';
import 'package:openapi/src/model/ssio_order_line_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_insertion_order_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [acceptedTermsId] - The SFDC id for the terms
/// * [acceptedTermsTime] - The UTC timestamp (to the nearest sec) of when terms were accepted
/// * [agencyLink] - URL link for agency
/// * [billingContactEmail] - The billing contact email
/// * [billingContactFirstname] - The billing contact first name
/// * [billingContactLastname] - The billing contact last name
/// * [billtoBillingAddressId] - The bill-to billing address id
/// * [billtoBusinessAddressId] - The bill-to business address id
/// * [billtoCompanyId] - The bill-to company id
/// * [budgetAmount] - If Budget order line, the budget amount.
/// * [currencyInfo] 
/// * [endDate] - End date of time period. Format: YYYY-MM-DD
/// * [estimatedMonthlySpend] - If Ongoing (perpetual) order line, the estimated monthly spend
/// * [mediaContactEmail] - The media contact email
/// * [mediaContactFirstname] - The media contact first name
/// * [mediaContactLastname] - The media contact last name
/// * [orderLineType] - Type can be Budget or Perpetual
/// * [orderName] - The order name
/// * [pmpId] - The pmp id
/// * [poNumber] - The po number
/// * [startDate] - Starting date of time period. Format: YYYY-MM-DD
/// * [userEmail] - The email of user submitting the insertion order
@BuiltValue()
abstract class SSIOInsertionOrderCreate implements Built<SSIOInsertionOrderCreate, SSIOInsertionOrderCreateBuilder> {
  /// The SFDC id for the terms
  @BuiltValueField(wireName: r'accepted_terms_id')
  String get acceptedTermsId;

  /// The UTC timestamp (to the nearest sec) of when terms were accepted
  @BuiltValueField(wireName: r'accepted_terms_time')
  int? get acceptedTermsTime;

  /// URL link for agency
  @BuiltValueField(wireName: r'agency_link')
  String? get agencyLink;

  /// The billing contact email
  @BuiltValueField(wireName: r'billing_contact_email')
  String get billingContactEmail;

  /// The billing contact first name
  @BuiltValueField(wireName: r'billing_contact_firstname')
  String get billingContactFirstname;

  /// The billing contact last name
  @BuiltValueField(wireName: r'billing_contact_lastname')
  String get billingContactLastname;

  /// The bill-to billing address id
  @BuiltValueField(wireName: r'billto_billing_address_id')
  String get billtoBillingAddressId;

  /// The bill-to business address id
  @BuiltValueField(wireName: r'billto_business_address_id')
  String get billtoBusinessAddressId;

  /// The bill-to company id
  @BuiltValueField(wireName: r'billto_company_id')
  String get billtoCompanyId;

  /// If Budget order line, the budget amount.
  @BuiltValueField(wireName: r'budget_amount')
  double? get budgetAmount;

  @BuiltValueField(wireName: r'currency_info')
  Currency get currencyInfo;
  // enum currencyInfoEnum {  UNK,  USD,  GBP,  CAD,  EUR,  AUD,  NZD,  SEK,  ILS,  CHF,  HKD,  JPY,  SGD,  KRW,  NOK,  DKK,  PLN,  RON,  HUF,  CZK,  BRL,  MXN,  ARS,  CLP,  COP,  INR,  TRY,  };

  /// End date of time period. Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'end_date')
  String? get endDate;

  /// If Ongoing (perpetual) order line, the estimated monthly spend
  @BuiltValueField(wireName: r'estimated_monthly_spend')
  double? get estimatedMonthlySpend;

  /// The media contact email
  @BuiltValueField(wireName: r'media_contact_email')
  String get mediaContactEmail;

  /// The media contact first name
  @BuiltValueField(wireName: r'media_contact_firstname')
  String get mediaContactFirstname;

  /// The media contact last name
  @BuiltValueField(wireName: r'media_contact_lastname')
  String get mediaContactLastname;

  /// Type can be Budget or Perpetual
  @BuiltValueField(wireName: r'order_line_type')
  SSIOOrderLineType get orderLineType;
  // enum orderLineTypeEnum {  BUDGET,  PERPETUALS,  };

  /// The order name
  @BuiltValueField(wireName: r'order_name')
  String get orderName;

  /// The pmp id
  @BuiltValueField(wireName: r'pmp_id')
  String get pmpId;

  /// The po number
  @BuiltValueField(wireName: r'po_number')
  String get poNumber;

  /// Starting date of time period. Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'start_date')
  String get startDate;

  /// The email of user submitting the insertion order
  @BuiltValueField(wireName: r'user_email')
  String? get userEmail;

  SSIOInsertionOrderCreate._();

  factory SSIOInsertionOrderCreate([void updates(SSIOInsertionOrderCreateBuilder b)]) = _$SSIOInsertionOrderCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOInsertionOrderCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOInsertionOrderCreate> get serializer => _$SSIOInsertionOrderCreateSerializer();
}

class _$SSIOInsertionOrderCreateSerializer implements PrimitiveSerializer<SSIOInsertionOrderCreate> {
  @override
  final Iterable<Type> types = const [SSIOInsertionOrderCreate, _$SSIOInsertionOrderCreate];

  @override
  final String wireName = r'SSIOInsertionOrderCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOInsertionOrderCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'accepted_terms_id';
    yield serializers.serialize(
      object.acceptedTermsId,
      specifiedType: const FullType(String),
    );
    if (object.acceptedTermsTime != null) {
      yield r'accepted_terms_time';
      yield serializers.serialize(
        object.acceptedTermsTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.agencyLink != null) {
      yield r'agency_link';
      yield serializers.serialize(
        object.agencyLink,
        specifiedType: const FullType(String),
      );
    }
    yield r'billing_contact_email';
    yield serializers.serialize(
      object.billingContactEmail,
      specifiedType: const FullType(String),
    );
    yield r'billing_contact_firstname';
    yield serializers.serialize(
      object.billingContactFirstname,
      specifiedType: const FullType(String),
    );
    yield r'billing_contact_lastname';
    yield serializers.serialize(
      object.billingContactLastname,
      specifiedType: const FullType(String),
    );
    yield r'billto_billing_address_id';
    yield serializers.serialize(
      object.billtoBillingAddressId,
      specifiedType: const FullType(String),
    );
    yield r'billto_business_address_id';
    yield serializers.serialize(
      object.billtoBusinessAddressId,
      specifiedType: const FullType(String),
    );
    yield r'billto_company_id';
    yield serializers.serialize(
      object.billtoCompanyId,
      specifiedType: const FullType(String),
    );
    if (object.budgetAmount != null) {
      yield r'budget_amount';
      yield serializers.serialize(
        object.budgetAmount,
        specifiedType: const FullType(double),
      );
    }
    yield r'currency_info';
    yield serializers.serialize(
      object.currencyInfo,
      specifiedType: const FullType(Currency),
    );
    if (object.endDate != null) {
      yield r'end_date';
      yield serializers.serialize(
        object.endDate,
        specifiedType: const FullType(String),
      );
    }
    if (object.estimatedMonthlySpend != null) {
      yield r'estimated_monthly_spend';
      yield serializers.serialize(
        object.estimatedMonthlySpend,
        specifiedType: const FullType(double),
      );
    }
    yield r'media_contact_email';
    yield serializers.serialize(
      object.mediaContactEmail,
      specifiedType: const FullType(String),
    );
    yield r'media_contact_firstname';
    yield serializers.serialize(
      object.mediaContactFirstname,
      specifiedType: const FullType(String),
    );
    yield r'media_contact_lastname';
    yield serializers.serialize(
      object.mediaContactLastname,
      specifiedType: const FullType(String),
    );
    yield r'order_line_type';
    yield serializers.serialize(
      object.orderLineType,
      specifiedType: const FullType(SSIOOrderLineType),
    );
    yield r'order_name';
    yield serializers.serialize(
      object.orderName,
      specifiedType: const FullType(String),
    );
    yield r'pmp_id';
    yield serializers.serialize(
      object.pmpId,
      specifiedType: const FullType(String),
    );
    yield r'po_number';
    yield serializers.serialize(
      object.poNumber,
      specifiedType: const FullType(String),
    );
    yield r'start_date';
    yield serializers.serialize(
      object.startDate,
      specifiedType: const FullType(String),
    );
    if (object.userEmail != null) {
      yield r'user_email';
      yield serializers.serialize(
        object.userEmail,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOInsertionOrderCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOInsertionOrderCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accepted_terms_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.acceptedTermsId = valueDes;
          break;
        case r'accepted_terms_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.acceptedTermsTime = valueDes;
          break;
        case r'agency_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.agencyLink = valueDes;
          break;
        case r'billing_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billingContactEmail = valueDes;
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
        case r'billto_billing_address_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billtoBillingAddressId = valueDes;
          break;
        case r'billto_business_address_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billtoBusinessAddressId = valueDes;
          break;
        case r'billto_company_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.billtoCompanyId = valueDes;
          break;
        case r'budget_amount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.budgetAmount = valueDes;
          break;
        case r'currency_info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Currency),
          ) as Currency;
          result.currencyInfo = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.endDate = valueDes;
          break;
        case r'estimated_monthly_spend':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.estimatedMonthlySpend = valueDes;
          break;
        case r'media_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mediaContactEmail = valueDes;
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
        case r'order_line_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(SSIOOrderLineType),
          ) as SSIOOrderLineType;
          result.orderLineType = valueDes;
          break;
        case r'order_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.orderName = valueDes;
          break;
        case r'pmp_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pmpId = valueDes;
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
        case r'user_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.userEmail = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOInsertionOrderCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOInsertionOrderCreateBuilder();
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

