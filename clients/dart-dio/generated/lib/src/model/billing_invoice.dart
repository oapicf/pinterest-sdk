//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/currency.dart';
import 'package:openapi/src/model/billing_invoice_document_type.dart';
import 'package:openapi/src/model/billing_invoice_status.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_invoice.g.dart';

/// A billing invoice in the advertiser account.
///
/// Properties:
/// * [adAccountId] - The ID of the ad account this invoice belongs to
/// * [adAccountName] - The name of the ad account this invoice belongs to
/// * [amountBilledMicroCurrency] - The amount billed in this invoice. Denoted in micro currency
/// * [amountDiscountMicroCurrency] - The discount in this invoice. Denoted in micro currency
/// * [amountNetMicroCurrency] - The net amount in this invoice. Denoted in micro currency
/// * [amountTaxMicroCurrency] - The tax in this invoice. Denoted in micro currency
/// * [billToCountry] - The country of the bill to address
/// * [billingPeriodEndDate] - The end date of the billing period. Format: YYYY-MM-DD
/// * [billingPeriodStartDate] - The start date of the billing period. Format: YYYY-MM-DD
/// * [currency] 
/// * [documentType] - The type of the document
/// * [id] - Unique identifier for the billing invoice
/// * [invoiceDueDate] - The date the invoice is due. Format: YYYY-MM-DD
/// * [paymentTerms] - The payment terms of the invoice
/// * [status] - The status of the invoice
@BuiltValue()
abstract class BillingInvoice implements Built<BillingInvoice, BillingInvoiceBuilder> {
  /// The ID of the ad account this invoice belongs to
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// The name of the ad account this invoice belongs to
  @BuiltValueField(wireName: r'ad_account_name')
  String? get adAccountName;

  /// The amount billed in this invoice. Denoted in micro currency
  @BuiltValueField(wireName: r'amount_billed_micro_currency')
  int? get amountBilledMicroCurrency;

  /// The discount in this invoice. Denoted in micro currency
  @BuiltValueField(wireName: r'amount_discount_micro_currency')
  int? get amountDiscountMicroCurrency;

  /// The net amount in this invoice. Denoted in micro currency
  @BuiltValueField(wireName: r'amount_net_micro_currency')
  int? get amountNetMicroCurrency;

  /// The tax in this invoice. Denoted in micro currency
  @BuiltValueField(wireName: r'amount_tax_micro_currency')
  int? get amountTaxMicroCurrency;

  /// The country of the bill to address
  @BuiltValueField(wireName: r'bill_to_country')
  String? get billToCountry;

  /// The end date of the billing period. Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'billing_period_end_date')
  Date? get billingPeriodEndDate;

  /// The start date of the billing period. Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'billing_period_start_date')
  Date? get billingPeriodStartDate;

  @BuiltValueField(wireName: r'currency')
  Currency? get currency;
  // enum currencyEnum {  UNK,  USD,  GBP,  CAD,  EUR,  AUD,  NZD,  SEK,  ILS,  CHF,  HKD,  JPY,  SGD,  KRW,  NOK,  DKK,  PLN,  RON,  HUF,  CZK,  BRL,  MXN,  ARS,  CLP,  COP,  INR,  TRY,  };

  /// The type of the document
  @BuiltValueField(wireName: r'document_type')
  BillingInvoiceDocumentType? get documentType;
  // enum documentTypeEnum {  INVOICE,  CREDIT_MEMO,  };

  /// Unique identifier for the billing invoice
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The date the invoice is due. Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'invoice_due_date')
  Date? get invoiceDueDate;

  /// The payment terms of the invoice
  @BuiltValueField(wireName: r'payment_terms')
  String? get paymentTerms;

  /// The status of the invoice
  @BuiltValueField(wireName: r'status')
  BillingInvoiceStatus? get status;
  // enum statusEnum {  OPEN,  CLOSED,  };

  BillingInvoice._();

  factory BillingInvoice([void updates(BillingInvoiceBuilder b)]) = _$BillingInvoice;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BillingInvoiceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BillingInvoice> get serializer => _$BillingInvoiceSerializer();
}

class _$BillingInvoiceSerializer implements PrimitiveSerializer<BillingInvoice> {
  @override
  final Iterable<Type> types = const [BillingInvoice, _$BillingInvoice];

  @override
  final String wireName = r'BillingInvoice';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BillingInvoice object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.adAccountName != null) {
      yield r'ad_account_name';
      yield serializers.serialize(
        object.adAccountName,
        specifiedType: const FullType(String),
      );
    }
    if (object.amountBilledMicroCurrency != null) {
      yield r'amount_billed_micro_currency';
      yield serializers.serialize(
        object.amountBilledMicroCurrency,
        specifiedType: const FullType(int),
      );
    }
    if (object.amountDiscountMicroCurrency != null) {
      yield r'amount_discount_micro_currency';
      yield serializers.serialize(
        object.amountDiscountMicroCurrency,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.amountNetMicroCurrency != null) {
      yield r'amount_net_micro_currency';
      yield serializers.serialize(
        object.amountNetMicroCurrency,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.amountTaxMicroCurrency != null) {
      yield r'amount_tax_micro_currency';
      yield serializers.serialize(
        object.amountTaxMicroCurrency,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.billToCountry != null) {
      yield r'bill_to_country';
      yield serializers.serialize(
        object.billToCountry,
        specifiedType: const FullType(String),
      );
    }
    if (object.billingPeriodEndDate != null) {
      yield r'billing_period_end_date';
      yield serializers.serialize(
        object.billingPeriodEndDate,
        specifiedType: const FullType(Date),
      );
    }
    if (object.billingPeriodStartDate != null) {
      yield r'billing_period_start_date';
      yield serializers.serialize(
        object.billingPeriodStartDate,
        specifiedType: const FullType(Date),
      );
    }
    if (object.currency != null) {
      yield r'currency';
      yield serializers.serialize(
        object.currency,
        specifiedType: const FullType(Currency),
      );
    }
    if (object.documentType != null) {
      yield r'document_type';
      yield serializers.serialize(
        object.documentType,
        specifiedType: const FullType(BillingInvoiceDocumentType),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.invoiceDueDate != null) {
      yield r'invoice_due_date';
      yield serializers.serialize(
        object.invoiceDueDate,
        specifiedType: const FullType(Date),
      );
    }
    if (object.paymentTerms != null) {
      yield r'payment_terms';
      yield serializers.serialize(
        object.paymentTerms,
        specifiedType: const FullType(String),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(BillingInvoiceStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BillingInvoice object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BillingInvoiceBuilder result,
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
        case r'ad_account_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adAccountName = valueDes;
          break;
        case r'amount_billed_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.amountBilledMicroCurrency = valueDes;
          break;
        case r'amount_discount_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.amountDiscountMicroCurrency = valueDes;
          break;
        case r'amount_net_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.amountNetMicroCurrency = valueDes;
          break;
        case r'amount_tax_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.amountTaxMicroCurrency = valueDes;
          break;
        case r'bill_to_country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.billToCountry = valueDes;
          break;
        case r'billing_period_end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.billingPeriodEndDate = valueDes;
          break;
        case r'billing_period_start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.billingPeriodStartDate = valueDes;
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Currency),
          ) as Currency?;
          if (valueDes == null) continue;
          result.currency = valueDes;
          break;
        case r'document_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BillingInvoiceDocumentType),
          ) as BillingInvoiceDocumentType?;
          if (valueDes == null) continue;
          result.documentType = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'invoice_due_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.invoiceDueDate = valueDes;
          break;
        case r'payment_terms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.paymentTerms = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BillingInvoiceStatus),
          ) as BillingInvoiceStatus?;
          if (valueDes == null) continue;
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
  BillingInvoice deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BillingInvoiceBuilder();
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

