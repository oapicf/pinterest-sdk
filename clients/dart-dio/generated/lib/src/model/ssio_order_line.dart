//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/currency.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_order_line.g.dart';

/// A Salesforce SSIO order line.
///
/// Properties:
/// * [acceptedTermsId] - The SFDC id for the terms
/// * [acceptedTermsTime] - The UTC timestamp (to the nearest second) when terms were accepted.
/// * [adsManagerOrderLineId] - Ads manager order line id
/// * [agencyLink] - Agency link
/// * [billToCompanyName] - Bill-to company name
/// * [billingContactEmail] - Billing contact email
/// * [billingContactFirstname] - Billing contact first name
/// * [billingContactLastname] - Billing contact last name
/// * [budgetAmount] - If budget order line, the budget amount.
/// * [currencyInfo] 
/// * [endDate] - End date of the order line.
/// * [estimatedMonthlySpend] - If ongoing (perpetual) order line, the estimated monthly spend.
/// * [lastModifiedDateTime] - Last modified date.
/// * [mediaContactEmail] - Billing media email
/// * [mediaContactFirstname] - Billing media contact first name
/// * [mediaContactLastname] - Billing media contact last name
/// * [orderName] - The order name
/// * [pinOrderId] - The pin order id associated with the order line in SFDC
/// * [pmpName] - The Pinterest marketing partner name
/// * [poNumber] - The PO number
/// * [salesforceOrderLineId] - Order line id in SFDC
/// * [startDate] - Start date of the order line.
@BuiltValue()
abstract class SSIOOrderLine implements Built<SSIOOrderLine, SSIOOrderLineBuilder> {
  /// The SFDC id for the terms
  @BuiltValueField(wireName: r'accepted_terms_id')
  String? get acceptedTermsId;

  /// The UTC timestamp (to the nearest second) when terms were accepted.
  @BuiltValueField(wireName: r'accepted_terms_time')
  String? get acceptedTermsTime;

  /// Ads manager order line id
  @BuiltValueField(wireName: r'ads_manager_order_line_id')
  String? get adsManagerOrderLineId;

  /// Agency link
  @BuiltValueField(wireName: r'agency_link')
  String? get agencyLink;

  /// Bill-to company name
  @BuiltValueField(wireName: r'bill_to_company_name')
  String? get billToCompanyName;

  /// Billing contact email
  @BuiltValueField(wireName: r'billing_contact_email')
  String? get billingContactEmail;

  /// Billing contact first name
  @BuiltValueField(wireName: r'billing_contact_firstname')
  String? get billingContactFirstname;

  /// Billing contact last name
  @BuiltValueField(wireName: r'billing_contact_lastname')
  String? get billingContactLastname;

  /// If budget order line, the budget amount.
  @BuiltValueField(wireName: r'budget_amount')
  num? get budgetAmount;

  @BuiltValueField(wireName: r'currency_info')
  Currency? get currencyInfo;
  // enum currencyInfoEnum {  UNK,  USD,  GBP,  CAD,  EUR,  AUD,  NZD,  SEK,  ILS,  CHF,  HKD,  JPY,  SGD,  KRW,  NOK,  DKK,  PLN,  RON,  HUF,  CZK,  BRL,  MXN,  ARS,  CLP,  COP,  INR,  TRY,  };

  /// End date of the order line.
  @BuiltValueField(wireName: r'end_date')
  Date? get endDate;

  /// If ongoing (perpetual) order line, the estimated monthly spend.
  @BuiltValueField(wireName: r'estimated_monthly_spend')
  num? get estimatedMonthlySpend;

  /// Last modified date.
  @BuiltValueField(wireName: r'last_modified_date_time')
  String? get lastModifiedDateTime;

  /// Billing media email
  @BuiltValueField(wireName: r'media_contact_email')
  String? get mediaContactEmail;

  /// Billing media contact first name
  @BuiltValueField(wireName: r'media_contact_firstname')
  String? get mediaContactFirstname;

  /// Billing media contact last name
  @BuiltValueField(wireName: r'media_contact_lastname')
  String? get mediaContactLastname;

  /// The order name
  @BuiltValueField(wireName: r'order_name')
  String? get orderName;

  /// The pin order id associated with the order line in SFDC
  @BuiltValueField(wireName: r'pin_order_id')
  String? get pinOrderId;

  /// The Pinterest marketing partner name
  @BuiltValueField(wireName: r'pmp_name')
  String? get pmpName;

  /// The PO number
  @BuiltValueField(wireName: r'po_number')
  String? get poNumber;

  /// Order line id in SFDC
  @BuiltValueField(wireName: r'salesforce_order_line_id')
  String? get salesforceOrderLineId;

  /// Start date of the order line.
  @BuiltValueField(wireName: r'start_date')
  Date? get startDate;

  SSIOOrderLine._();

  factory SSIOOrderLine([void updates(SSIOOrderLineBuilder b)]) = _$SSIOOrderLine;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOOrderLineBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOOrderLine> get serializer => _$SSIOOrderLineSerializer();
}

class _$SSIOOrderLineSerializer implements PrimitiveSerializer<SSIOOrderLine> {
  @override
  final Iterable<Type> types = const [SSIOOrderLine, _$SSIOOrderLine];

  @override
  final String wireName = r'SSIOOrderLine';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOOrderLine object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.acceptedTermsId != null) {
      yield r'accepted_terms_id';
      yield serializers.serialize(
        object.acceptedTermsId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.acceptedTermsTime != null) {
      yield r'accepted_terms_time';
      yield serializers.serialize(
        object.acceptedTermsTime,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.adsManagerOrderLineId != null) {
      yield r'ads_manager_order_line_id';
      yield serializers.serialize(
        object.adsManagerOrderLineId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.agencyLink != null) {
      yield r'agency_link';
      yield serializers.serialize(
        object.agencyLink,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.billToCompanyName != null) {
      yield r'bill_to_company_name';
      yield serializers.serialize(
        object.billToCompanyName,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.billingContactEmail != null) {
      yield r'billing_contact_email';
      yield serializers.serialize(
        object.billingContactEmail,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.billingContactFirstname != null) {
      yield r'billing_contact_firstname';
      yield serializers.serialize(
        object.billingContactFirstname,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.billingContactLastname != null) {
      yield r'billing_contact_lastname';
      yield serializers.serialize(
        object.billingContactLastname,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.budgetAmount != null) {
      yield r'budget_amount';
      yield serializers.serialize(
        object.budgetAmount,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.currencyInfo != null) {
      yield r'currency_info';
      yield serializers.serialize(
        object.currencyInfo,
        specifiedType: const FullType(Currency),
      );
    }
    if (object.endDate != null) {
      yield r'end_date';
      yield serializers.serialize(
        object.endDate,
        specifiedType: const FullType.nullable(Date),
      );
    }
    if (object.estimatedMonthlySpend != null) {
      yield r'estimated_monthly_spend';
      yield serializers.serialize(
        object.estimatedMonthlySpend,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.lastModifiedDateTime != null) {
      yield r'last_modified_date_time';
      yield serializers.serialize(
        object.lastModifiedDateTime,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.mediaContactEmail != null) {
      yield r'media_contact_email';
      yield serializers.serialize(
        object.mediaContactEmail,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.mediaContactFirstname != null) {
      yield r'media_contact_firstname';
      yield serializers.serialize(
        object.mediaContactFirstname,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.mediaContactLastname != null) {
      yield r'media_contact_lastname';
      yield serializers.serialize(
        object.mediaContactLastname,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.orderName != null) {
      yield r'order_name';
      yield serializers.serialize(
        object.orderName,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.pinOrderId != null) {
      yield r'pin_order_id';
      yield serializers.serialize(
        object.pinOrderId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.pmpName != null) {
      yield r'pmp_name';
      yield serializers.serialize(
        object.pmpName,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.poNumber != null) {
      yield r'po_number';
      yield serializers.serialize(
        object.poNumber,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.salesforceOrderLineId != null) {
      yield r'salesforce_order_line_id';
      yield serializers.serialize(
        object.salesforceOrderLineId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.startDate != null) {
      yield r'start_date';
      yield serializers.serialize(
        object.startDate,
        specifiedType: const FullType.nullable(Date),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOOrderLine object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOOrderLineBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accepted_terms_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.acceptedTermsId = valueDes;
          break;
        case r'accepted_terms_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.acceptedTermsTime = valueDes;
          break;
        case r'ads_manager_order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adsManagerOrderLineId = valueDes;
          break;
        case r'agency_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.agencyLink = valueDes;
          break;
        case r'bill_to_company_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.billToCompanyName = valueDes;
          break;
        case r'billing_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.billingContactEmail = valueDes;
          break;
        case r'billing_contact_firstname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.billingContactFirstname = valueDes;
          break;
        case r'billing_contact_lastname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.billingContactLastname = valueDes;
          break;
        case r'budget_amount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.budgetAmount = valueDes;
          break;
        case r'currency_info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Currency),
          ) as Currency?;
          if (valueDes == null) continue;
          result.currencyInfo = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.endDate = valueDes;
          break;
        case r'estimated_monthly_spend':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.estimatedMonthlySpend = valueDes;
          break;
        case r'last_modified_date_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.lastModifiedDateTime = valueDes;
          break;
        case r'media_contact_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.mediaContactEmail = valueDes;
          break;
        case r'media_contact_firstname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.mediaContactFirstname = valueDes;
          break;
        case r'media_contact_lastname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.mediaContactLastname = valueDes;
          break;
        case r'order_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.orderName = valueDes;
          break;
        case r'pin_order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pinOrderId = valueDes;
          break;
        case r'pmp_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pmpName = valueDes;
          break;
        case r'po_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.poNumber = valueDes;
          break;
        case r'salesforce_order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.salesforceOrderLineId = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.startDate = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOOrderLine deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOOrderLineBuilder();
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

