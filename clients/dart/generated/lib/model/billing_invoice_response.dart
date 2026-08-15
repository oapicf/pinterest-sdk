//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BillingInvoiceResponse {
  /// Returns a new [BillingInvoiceResponse] instance.
  BillingInvoiceResponse({
    this.adAccountId,
    this.adAccountName,
    this.amountBilledMicroCurrency,
    this.amountDiscountMicroCurrency,
    this.amountNetMicroCurrency,
    this.amountTaxMicroCurrency,
    this.billToCountry,
    this.billingPeriodEndDate,
    this.billingPeriodStartDate,
    this.currency,
    this.documentType,
    this.id,
    this.invoiceDueDate,
    this.paymentTerms,
    this.status,
  });

  /// The ID of the ad account this invoice belongs to
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// The name of the ad account this invoice belongs to
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountName;

  /// The amount billed in this invoice. Denoted in micro currency
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? amountBilledMicroCurrency;

  /// The discount in this invoice. Denoted in micro currency
  int? amountDiscountMicroCurrency;

  /// The net amount in this invoice. Denoted in micro currency
  int? amountNetMicroCurrency;

  /// The tax in this invoice. Denoted in micro currency
  int? amountTaxMicroCurrency;

  /// The country of the bill to address
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? billToCountry;

  /// The end date of the billing period. Format: YYYY-MM-DD
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? billingPeriodEndDate;

  /// The start date of the billing period. Format: YYYY-MM-DD
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? billingPeriodStartDate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Currency? currency;

  /// The type of the document
  BillingInvoiceResponseDocumentTypeEnum? documentType;

  /// Unique identifier for the billing invoice
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// The date the invoice is due. Format: YYYY-MM-DD
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? invoiceDueDate;

  /// The payment terms of the invoice
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? paymentTerms;

  /// The status of the invoice
  BillingInvoiceResponseStatusEnum? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BillingInvoiceResponse &&
    other.adAccountId == adAccountId &&
    other.adAccountName == adAccountName &&
    other.amountBilledMicroCurrency == amountBilledMicroCurrency &&
    other.amountDiscountMicroCurrency == amountDiscountMicroCurrency &&
    other.amountNetMicroCurrency == amountNetMicroCurrency &&
    other.amountTaxMicroCurrency == amountTaxMicroCurrency &&
    other.billToCountry == billToCountry &&
    other.billingPeriodEndDate == billingPeriodEndDate &&
    other.billingPeriodStartDate == billingPeriodStartDate &&
    other.currency == currency &&
    other.documentType == documentType &&
    other.id == id &&
    other.invoiceDueDate == invoiceDueDate &&
    other.paymentTerms == paymentTerms &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (adAccountName == null ? 0 : adAccountName!.hashCode) +
    (amountBilledMicroCurrency == null ? 0 : amountBilledMicroCurrency!.hashCode) +
    (amountDiscountMicroCurrency == null ? 0 : amountDiscountMicroCurrency!.hashCode) +
    (amountNetMicroCurrency == null ? 0 : amountNetMicroCurrency!.hashCode) +
    (amountTaxMicroCurrency == null ? 0 : amountTaxMicroCurrency!.hashCode) +
    (billToCountry == null ? 0 : billToCountry!.hashCode) +
    (billingPeriodEndDate == null ? 0 : billingPeriodEndDate!.hashCode) +
    (billingPeriodStartDate == null ? 0 : billingPeriodStartDate!.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (documentType == null ? 0 : documentType!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (invoiceDueDate == null ? 0 : invoiceDueDate!.hashCode) +
    (paymentTerms == null ? 0 : paymentTerms!.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'BillingInvoiceResponse[adAccountId=$adAccountId, adAccountName=$adAccountName, amountBilledMicroCurrency=$amountBilledMicroCurrency, amountDiscountMicroCurrency=$amountDiscountMicroCurrency, amountNetMicroCurrency=$amountNetMicroCurrency, amountTaxMicroCurrency=$amountTaxMicroCurrency, billToCountry=$billToCountry, billingPeriodEndDate=$billingPeriodEndDate, billingPeriodStartDate=$billingPeriodStartDate, currency=$currency, documentType=$documentType, id=$id, invoiceDueDate=$invoiceDueDate, paymentTerms=$paymentTerms, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.adAccountName != null) {
      json[r'ad_account_name'] = this.adAccountName;
    } else {
      json[r'ad_account_name'] = null;
    }
    if (this.amountBilledMicroCurrency != null) {
      json[r'amount_billed_micro_currency'] = this.amountBilledMicroCurrency;
    } else {
      json[r'amount_billed_micro_currency'] = null;
    }
    if (this.amountDiscountMicroCurrency != null) {
      json[r'amount_discount_micro_currency'] = this.amountDiscountMicroCurrency;
    } else {
      json[r'amount_discount_micro_currency'] = null;
    }
    if (this.amountNetMicroCurrency != null) {
      json[r'amount_net_micro_currency'] = this.amountNetMicroCurrency;
    } else {
      json[r'amount_net_micro_currency'] = null;
    }
    if (this.amountTaxMicroCurrency != null) {
      json[r'amount_tax_micro_currency'] = this.amountTaxMicroCurrency;
    } else {
      json[r'amount_tax_micro_currency'] = null;
    }
    if (this.billToCountry != null) {
      json[r'bill_to_country'] = this.billToCountry;
    } else {
      json[r'bill_to_country'] = null;
    }
    if (this.billingPeriodEndDate != null) {
      json[r'billing_period_end_date'] = _isEpochMarker(r'/^(\\d{4})-(\\d{2})-(\\d{2})$/')
        ? this.billingPeriodEndDate!.millisecondsSinceEpoch
        : _dateFormatter.format(this.billingPeriodEndDate!.toUtc());
    } else {
      json[r'billing_period_end_date'] = null;
    }
    if (this.billingPeriodStartDate != null) {
      json[r'billing_period_start_date'] = _isEpochMarker(r'/^(\\d{4})-(\\d{2})-(\\d{2})$/')
        ? this.billingPeriodStartDate!.millisecondsSinceEpoch
        : _dateFormatter.format(this.billingPeriodStartDate!.toUtc());
    } else {
      json[r'billing_period_start_date'] = null;
    }
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    if (this.documentType != null) {
      json[r'document_type'] = this.documentType;
    } else {
      json[r'document_type'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.invoiceDueDate != null) {
      json[r'invoice_due_date'] = _isEpochMarker(r'/^(\\d{4})-(\\d{2})-(\\d{2})$/')
        ? this.invoiceDueDate!.millisecondsSinceEpoch
        : _dateFormatter.format(this.invoiceDueDate!.toUtc());
    } else {
      json[r'invoice_due_date'] = null;
    }
    if (this.paymentTerms != null) {
      json[r'payment_terms'] = this.paymentTerms;
    } else {
      json[r'payment_terms'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [BillingInvoiceResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BillingInvoiceResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BillingInvoiceResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BillingInvoiceResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BillingInvoiceResponse(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        adAccountName: mapValueOfType<String>(json, r'ad_account_name'),
        amountBilledMicroCurrency: mapValueOfType<int>(json, r'amount_billed_micro_currency'),
        amountDiscountMicroCurrency: mapValueOfType<int>(json, r'amount_discount_micro_currency'),
        amountNetMicroCurrency: mapValueOfType<int>(json, r'amount_net_micro_currency'),
        amountTaxMicroCurrency: mapValueOfType<int>(json, r'amount_tax_micro_currency'),
        billToCountry: mapValueOfType<String>(json, r'bill_to_country'),
        billingPeriodEndDate: mapDateTime(json, r'billing_period_end_date', r'/^(\\d{4})-(\\d{2})-(\\d{2})$/'),
        billingPeriodStartDate: mapDateTime(json, r'billing_period_start_date', r'/^(\\d{4})-(\\d{2})-(\\d{2})$/'),
        currency: Currency.fromJson(json[r'currency']),
        documentType: BillingInvoiceResponseDocumentTypeEnum.fromJson(json[r'document_type']),
        id: mapValueOfType<String>(json, r'id'),
        invoiceDueDate: mapDateTime(json, r'invoice_due_date', r'/^(\\d{4})-(\\d{2})-(\\d{2})$/'),
        paymentTerms: mapValueOfType<String>(json, r'payment_terms'),
        status: BillingInvoiceResponseStatusEnum.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<BillingInvoiceResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingInvoiceResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingInvoiceResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BillingInvoiceResponse> mapFromJson(dynamic json) {
    final map = <String, BillingInvoiceResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BillingInvoiceResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BillingInvoiceResponse-objects as value to a dart map
  static Map<String, List<BillingInvoiceResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BillingInvoiceResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BillingInvoiceResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The type of the document
class BillingInvoiceResponseDocumentTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const BillingInvoiceResponseDocumentTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const INVOICE = BillingInvoiceResponseDocumentTypeEnum._(r'INVOICE');
  static const CREDIT_MEMO = BillingInvoiceResponseDocumentTypeEnum._(r'CREDIT_MEMO');

  /// List of all possible values in this [enum][BillingInvoiceResponseDocumentTypeEnum].
  static const values = <BillingInvoiceResponseDocumentTypeEnum>[
    INVOICE,
    CREDIT_MEMO,
  ];

  static BillingInvoiceResponseDocumentTypeEnum? fromJson(dynamic value) => BillingInvoiceResponseDocumentTypeEnumTypeTransformer().decode(value);

  static List<BillingInvoiceResponseDocumentTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingInvoiceResponseDocumentTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingInvoiceResponseDocumentTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingInvoiceResponseDocumentTypeEnum] to String,
/// and [decode] dynamic data back to [BillingInvoiceResponseDocumentTypeEnum].
class BillingInvoiceResponseDocumentTypeEnumTypeTransformer {
  factory BillingInvoiceResponseDocumentTypeEnumTypeTransformer() => _instance ??= const BillingInvoiceResponseDocumentTypeEnumTypeTransformer._();

  const BillingInvoiceResponseDocumentTypeEnumTypeTransformer._();

  String encode(BillingInvoiceResponseDocumentTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a BillingInvoiceResponseDocumentTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingInvoiceResponseDocumentTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'INVOICE': return BillingInvoiceResponseDocumentTypeEnum.INVOICE;
        case r'CREDIT_MEMO': return BillingInvoiceResponseDocumentTypeEnum.CREDIT_MEMO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BillingInvoiceResponseDocumentTypeEnumTypeTransformer] instance.
  static BillingInvoiceResponseDocumentTypeEnumTypeTransformer? _instance;
}


/// The status of the invoice
class BillingInvoiceResponseStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const BillingInvoiceResponseStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OPEN = BillingInvoiceResponseStatusEnum._(r'OPEN');
  static const CLOSED = BillingInvoiceResponseStatusEnum._(r'CLOSED');

  /// List of all possible values in this [enum][BillingInvoiceResponseStatusEnum].
  static const values = <BillingInvoiceResponseStatusEnum>[
    OPEN,
    CLOSED,
  ];

  static BillingInvoiceResponseStatusEnum? fromJson(dynamic value) => BillingInvoiceResponseStatusEnumTypeTransformer().decode(value);

  static List<BillingInvoiceResponseStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingInvoiceResponseStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingInvoiceResponseStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BillingInvoiceResponseStatusEnum] to String,
/// and [decode] dynamic data back to [BillingInvoiceResponseStatusEnum].
class BillingInvoiceResponseStatusEnumTypeTransformer {
  factory BillingInvoiceResponseStatusEnumTypeTransformer() => _instance ??= const BillingInvoiceResponseStatusEnumTypeTransformer._();

  const BillingInvoiceResponseStatusEnumTypeTransformer._();

  String encode(BillingInvoiceResponseStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a BillingInvoiceResponseStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BillingInvoiceResponseStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OPEN': return BillingInvoiceResponseStatusEnum.OPEN;
        case r'CLOSED': return BillingInvoiceResponseStatusEnum.CLOSED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BillingInvoiceResponseStatusEnumTypeTransformer] instance.
  static BillingInvoiceResponseStatusEnumTypeTransformer? _instance;
}


