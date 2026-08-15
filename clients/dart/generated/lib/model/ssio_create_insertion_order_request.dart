//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOCreateInsertionOrderRequest {
  /// Returns a new [SSIOCreateInsertionOrderRequest] instance.
  SSIOCreateInsertionOrderRequest({
    this.agencyLink,
    required this.billingContactEmail,
    required this.billingContactFirstname,
    required this.billingContactLastname,
    this.budgetAmount,
    this.endDate,
    required this.mediaContactEmail,
    required this.mediaContactFirstname,
    required this.mediaContactLastname,
    required this.poNumber,
    required this.startDate,
    this.userEmail,
    required this.acceptedTermsId,
    this.acceptedTermsTime,
    required this.billtoBillingAddressId,
    required this.billtoBusinessAddressId,
    required this.billtoCompanyId,
    required this.currencyInfo,
    this.estimatedMonthlySpend,
    required this.orderLineType,
    required this.orderName,
    required this.pmpId,
  });

  /// URL link for agency
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? agencyLink;

  /// The billing contact email
  String billingContactEmail;

  /// The billing contact first name
  String billingContactFirstname;

  /// The billing contact last name
  String billingContactLastname;

  /// If Budget order line, the budget amount.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? budgetAmount;

  /// End date of time period. Format: YYYY-MM-DD
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? endDate;

  /// The media contact email
  String mediaContactEmail;

  /// The media contact first name
  String mediaContactFirstname;

  /// The media contact last name
  String mediaContactLastname;

  /// The po number
  String poNumber;

  /// Starting date of time period. Format: YYYY-MM-DD
  String startDate;

  /// The email of user submitting the insertion order
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? userEmail;

  /// The SFDC id for the terms
  String acceptedTermsId;

  /// The UTC timestamp (to the nearest sec) of when terms were accepted
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? acceptedTermsTime;

  /// The bill-to billing address id
  String billtoBillingAddressId;

  /// The bill-to business address id
  String billtoBusinessAddressId;

  /// The bill-to company id
  String billtoCompanyId;

  Currency currencyInfo;

  /// If Ongoing (perpetual) order line, the estimated monthly spend
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? estimatedMonthlySpend;

  /// Type can be Budget or Perpetual
  SSIOCreateInsertionOrderRequestOrderLineTypeEnum orderLineType;

  /// The order name
  String orderName;

  /// The pmp id
  String pmpId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SSIOCreateInsertionOrderRequest &&
    other.agencyLink == agencyLink &&
    other.billingContactEmail == billingContactEmail &&
    other.billingContactFirstname == billingContactFirstname &&
    other.billingContactLastname == billingContactLastname &&
    other.budgetAmount == budgetAmount &&
    other.endDate == endDate &&
    other.mediaContactEmail == mediaContactEmail &&
    other.mediaContactFirstname == mediaContactFirstname &&
    other.mediaContactLastname == mediaContactLastname &&
    other.poNumber == poNumber &&
    other.startDate == startDate &&
    other.userEmail == userEmail &&
    other.acceptedTermsId == acceptedTermsId &&
    other.acceptedTermsTime == acceptedTermsTime &&
    other.billtoBillingAddressId == billtoBillingAddressId &&
    other.billtoBusinessAddressId == billtoBusinessAddressId &&
    other.billtoCompanyId == billtoCompanyId &&
    other.currencyInfo == currencyInfo &&
    other.estimatedMonthlySpend == estimatedMonthlySpend &&
    other.orderLineType == orderLineType &&
    other.orderName == orderName &&
    other.pmpId == pmpId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (agencyLink == null ? 0 : agencyLink!.hashCode) +
    (billingContactEmail.hashCode) +
    (billingContactFirstname.hashCode) +
    (billingContactLastname.hashCode) +
    (budgetAmount == null ? 0 : budgetAmount!.hashCode) +
    (endDate == null ? 0 : endDate!.hashCode) +
    (mediaContactEmail.hashCode) +
    (mediaContactFirstname.hashCode) +
    (mediaContactLastname.hashCode) +
    (poNumber.hashCode) +
    (startDate.hashCode) +
    (userEmail == null ? 0 : userEmail!.hashCode) +
    (acceptedTermsId.hashCode) +
    (acceptedTermsTime == null ? 0 : acceptedTermsTime!.hashCode) +
    (billtoBillingAddressId.hashCode) +
    (billtoBusinessAddressId.hashCode) +
    (billtoCompanyId.hashCode) +
    (currencyInfo.hashCode) +
    (estimatedMonthlySpend == null ? 0 : estimatedMonthlySpend!.hashCode) +
    (orderLineType.hashCode) +
    (orderName.hashCode) +
    (pmpId.hashCode);

  @override
  String toString() => 'SSIOCreateInsertionOrderRequest[agencyLink=$agencyLink, billingContactEmail=$billingContactEmail, billingContactFirstname=$billingContactFirstname, billingContactLastname=$billingContactLastname, budgetAmount=$budgetAmount, endDate=$endDate, mediaContactEmail=$mediaContactEmail, mediaContactFirstname=$mediaContactFirstname, mediaContactLastname=$mediaContactLastname, poNumber=$poNumber, startDate=$startDate, userEmail=$userEmail, acceptedTermsId=$acceptedTermsId, acceptedTermsTime=$acceptedTermsTime, billtoBillingAddressId=$billtoBillingAddressId, billtoBusinessAddressId=$billtoBusinessAddressId, billtoCompanyId=$billtoCompanyId, currencyInfo=$currencyInfo, estimatedMonthlySpend=$estimatedMonthlySpend, orderLineType=$orderLineType, orderName=$orderName, pmpId=$pmpId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.agencyLink != null) {
      json[r'agency_link'] = this.agencyLink;
    } else {
      json[r'agency_link'] = null;
    }
      json[r'billing_contact_email'] = this.billingContactEmail;
      json[r'billing_contact_firstname'] = this.billingContactFirstname;
      json[r'billing_contact_lastname'] = this.billingContactLastname;
    if (this.budgetAmount != null) {
      json[r'budget_amount'] = this.budgetAmount;
    } else {
      json[r'budget_amount'] = null;
    }
    if (this.endDate != null) {
      json[r'end_date'] = this.endDate;
    } else {
      json[r'end_date'] = null;
    }
      json[r'media_contact_email'] = this.mediaContactEmail;
      json[r'media_contact_firstname'] = this.mediaContactFirstname;
      json[r'media_contact_lastname'] = this.mediaContactLastname;
      json[r'po_number'] = this.poNumber;
      json[r'start_date'] = this.startDate;
    if (this.userEmail != null) {
      json[r'user_email'] = this.userEmail;
    } else {
      json[r'user_email'] = null;
    }
      json[r'accepted_terms_id'] = this.acceptedTermsId;
    if (this.acceptedTermsTime != null) {
      json[r'accepted_terms_time'] = this.acceptedTermsTime;
    } else {
      json[r'accepted_terms_time'] = null;
    }
      json[r'billto_billing_address_id'] = this.billtoBillingAddressId;
      json[r'billto_business_address_id'] = this.billtoBusinessAddressId;
      json[r'billto_company_id'] = this.billtoCompanyId;
      json[r'currency_info'] = this.currencyInfo;
    if (this.estimatedMonthlySpend != null) {
      json[r'estimated_monthly_spend'] = this.estimatedMonthlySpend;
    } else {
      json[r'estimated_monthly_spend'] = null;
    }
      json[r'order_line_type'] = this.orderLineType;
      json[r'order_name'] = this.orderName;
      json[r'pmp_id'] = this.pmpId;
    return json;
  }

  /// Returns a new [SSIOCreateInsertionOrderRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOCreateInsertionOrderRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SSIOCreateInsertionOrderRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SSIOCreateInsertionOrderRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SSIOCreateInsertionOrderRequest(
        agencyLink: mapValueOfType<String>(json, r'agency_link'),
        billingContactEmail: mapValueOfType<String>(json, r'billing_contact_email')!,
        billingContactFirstname: mapValueOfType<String>(json, r'billing_contact_firstname')!,
        billingContactLastname: mapValueOfType<String>(json, r'billing_contact_lastname')!,
        budgetAmount: num.parse('${json[r'budget_amount']}'),
        endDate: mapValueOfType<String>(json, r'end_date'),
        mediaContactEmail: mapValueOfType<String>(json, r'media_contact_email')!,
        mediaContactFirstname: mapValueOfType<String>(json, r'media_contact_firstname')!,
        mediaContactLastname: mapValueOfType<String>(json, r'media_contact_lastname')!,
        poNumber: mapValueOfType<String>(json, r'po_number')!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
        userEmail: mapValueOfType<String>(json, r'user_email'),
        acceptedTermsId: mapValueOfType<String>(json, r'accepted_terms_id')!,
        acceptedTermsTime: mapValueOfType<int>(json, r'accepted_terms_time'),
        billtoBillingAddressId: mapValueOfType<String>(json, r'billto_billing_address_id')!,
        billtoBusinessAddressId: mapValueOfType<String>(json, r'billto_business_address_id')!,
        billtoCompanyId: mapValueOfType<String>(json, r'billto_company_id')!,
        currencyInfo: Currency.fromJson(json[r'currency_info'])!,
        estimatedMonthlySpend: num.parse('${json[r'estimated_monthly_spend']}'),
        orderLineType: SSIOCreateInsertionOrderRequestOrderLineTypeEnum.fromJson(json[r'order_line_type'])!,
        orderName: mapValueOfType<String>(json, r'order_name')!,
        pmpId: mapValueOfType<String>(json, r'pmp_id')!,
      );
    }
    return null;
  }

  static List<SSIOCreateInsertionOrderRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOCreateInsertionOrderRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOCreateInsertionOrderRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOCreateInsertionOrderRequest> mapFromJson(dynamic json) {
    final map = <String, SSIOCreateInsertionOrderRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOCreateInsertionOrderRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOCreateInsertionOrderRequest-objects as value to a dart map
  static Map<String, List<SSIOCreateInsertionOrderRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOCreateInsertionOrderRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOCreateInsertionOrderRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'billing_contact_email',
    'billing_contact_firstname',
    'billing_contact_lastname',
    'media_contact_email',
    'media_contact_firstname',
    'media_contact_lastname',
    'po_number',
    'start_date',
    'accepted_terms_id',
    'billto_billing_address_id',
    'billto_business_address_id',
    'billto_company_id',
    'currency_info',
    'order_line_type',
    'order_name',
    'pmp_id',
  };
}

/// Type can be Budget or Perpetual
class SSIOCreateInsertionOrderRequestOrderLineTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const SSIOCreateInsertionOrderRequestOrderLineTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BUDGET = SSIOCreateInsertionOrderRequestOrderLineTypeEnum._(r'BUDGET');
  static const PERPETUALS = SSIOCreateInsertionOrderRequestOrderLineTypeEnum._(r'PERPETUALS');

  /// List of all possible values in this [enum][SSIOCreateInsertionOrderRequestOrderLineTypeEnum].
  static const values = <SSIOCreateInsertionOrderRequestOrderLineTypeEnum>[
    BUDGET,
    PERPETUALS,
  ];

  static SSIOCreateInsertionOrderRequestOrderLineTypeEnum? fromJson(dynamic value) => SSIOCreateInsertionOrderRequestOrderLineTypeEnumTypeTransformer().decode(value);

  static List<SSIOCreateInsertionOrderRequestOrderLineTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOCreateInsertionOrderRequestOrderLineTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOCreateInsertionOrderRequestOrderLineTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [SSIOCreateInsertionOrderRequestOrderLineTypeEnum] to String,
/// and [decode] dynamic data back to [SSIOCreateInsertionOrderRequestOrderLineTypeEnum].
class SSIOCreateInsertionOrderRequestOrderLineTypeEnumTypeTransformer {
  factory SSIOCreateInsertionOrderRequestOrderLineTypeEnumTypeTransformer() => _instance ??= const SSIOCreateInsertionOrderRequestOrderLineTypeEnumTypeTransformer._();

  const SSIOCreateInsertionOrderRequestOrderLineTypeEnumTypeTransformer._();

  String encode(SSIOCreateInsertionOrderRequestOrderLineTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a SSIOCreateInsertionOrderRequestOrderLineTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  SSIOCreateInsertionOrderRequestOrderLineTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'BUDGET': return SSIOCreateInsertionOrderRequestOrderLineTypeEnum.BUDGET;
        case r'PERPETUALS': return SSIOCreateInsertionOrderRequestOrderLineTypeEnum.PERPETUALS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [SSIOCreateInsertionOrderRequestOrderLineTypeEnumTypeTransformer] instance.
  static SSIOCreateInsertionOrderRequestOrderLineTypeEnumTypeTransformer? _instance;
}


