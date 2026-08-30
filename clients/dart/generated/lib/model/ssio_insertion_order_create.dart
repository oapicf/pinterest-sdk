//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOInsertionOrderCreate {
  /// Returns a new [SSIOInsertionOrderCreate] instance.
  SSIOInsertionOrderCreate({
    required this.acceptedTermsId,
    this.acceptedTermsTime,
    this.agencyLink,
    required this.billingContactEmail,
    required this.billingContactFirstname,
    required this.billingContactLastname,
    required this.billtoBillingAddressId,
    required this.billtoBusinessAddressId,
    required this.billtoCompanyId,
    this.budgetAmount,
    required this.currencyInfo,
    this.endDate,
    this.estimatedMonthlySpend,
    required this.mediaContactEmail,
    required this.mediaContactFirstname,
    required this.mediaContactLastname,
    required this.orderLineType,
    required this.orderName,
    required this.pmpId,
    required this.poNumber,
    required this.startDate,
    this.userEmail,
  });

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

  /// The bill-to billing address id
  String billtoBillingAddressId;

  /// The bill-to business address id
  String billtoBusinessAddressId;

  /// The bill-to company id
  String billtoCompanyId;

  /// If Budget order line, the budget amount.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? budgetAmount;

  Currency currencyInfo;

  /// End date of time period. Format: YYYY-MM-DD
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? endDate;

  /// If Ongoing (perpetual) order line, the estimated monthly spend
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? estimatedMonthlySpend;

  /// The media contact email
  String mediaContactEmail;

  /// The media contact first name
  String mediaContactFirstname;

  /// The media contact last name
  String mediaContactLastname;

  /// Type can be Budget or Perpetual
  SSIOOrderLineType orderLineType;

  /// The order name
  String orderName;

  /// The pmp id
  String pmpId;

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is SSIOInsertionOrderCreate &&
    other.acceptedTermsId == acceptedTermsId &&
    other.acceptedTermsTime == acceptedTermsTime &&
    other.agencyLink == agencyLink &&
    other.billingContactEmail == billingContactEmail &&
    other.billingContactFirstname == billingContactFirstname &&
    other.billingContactLastname == billingContactLastname &&
    other.billtoBillingAddressId == billtoBillingAddressId &&
    other.billtoBusinessAddressId == billtoBusinessAddressId &&
    other.billtoCompanyId == billtoCompanyId &&
    other.budgetAmount == budgetAmount &&
    other.currencyInfo == currencyInfo &&
    other.endDate == endDate &&
    other.estimatedMonthlySpend == estimatedMonthlySpend &&
    other.mediaContactEmail == mediaContactEmail &&
    other.mediaContactFirstname == mediaContactFirstname &&
    other.mediaContactLastname == mediaContactLastname &&
    other.orderLineType == orderLineType &&
    other.orderName == orderName &&
    other.pmpId == pmpId &&
    other.poNumber == poNumber &&
    other.startDate == startDate &&
    other.userEmail == userEmail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (acceptedTermsId.hashCode) +
    (acceptedTermsTime == null ? 0 : acceptedTermsTime!.hashCode) +
    (agencyLink == null ? 0 : agencyLink!.hashCode) +
    (billingContactEmail.hashCode) +
    (billingContactFirstname.hashCode) +
    (billingContactLastname.hashCode) +
    (billtoBillingAddressId.hashCode) +
    (billtoBusinessAddressId.hashCode) +
    (billtoCompanyId.hashCode) +
    (budgetAmount == null ? 0 : budgetAmount!.hashCode) +
    (currencyInfo.hashCode) +
    (endDate == null ? 0 : endDate!.hashCode) +
    (estimatedMonthlySpend == null ? 0 : estimatedMonthlySpend!.hashCode) +
    (mediaContactEmail.hashCode) +
    (mediaContactFirstname.hashCode) +
    (mediaContactLastname.hashCode) +
    (orderLineType.hashCode) +
    (orderName.hashCode) +
    (pmpId.hashCode) +
    (poNumber.hashCode) +
    (startDate.hashCode) +
    (userEmail == null ? 0 : userEmail!.hashCode);

  @override
  String toString() => 'SSIOInsertionOrderCreate[acceptedTermsId=$acceptedTermsId, acceptedTermsTime=$acceptedTermsTime, agencyLink=$agencyLink, billingContactEmail=$billingContactEmail, billingContactFirstname=$billingContactFirstname, billingContactLastname=$billingContactLastname, billtoBillingAddressId=$billtoBillingAddressId, billtoBusinessAddressId=$billtoBusinessAddressId, billtoCompanyId=$billtoCompanyId, budgetAmount=$budgetAmount, currencyInfo=$currencyInfo, endDate=$endDate, estimatedMonthlySpend=$estimatedMonthlySpend, mediaContactEmail=$mediaContactEmail, mediaContactFirstname=$mediaContactFirstname, mediaContactLastname=$mediaContactLastname, orderLineType=$orderLineType, orderName=$orderName, pmpId=$pmpId, poNumber=$poNumber, startDate=$startDate, userEmail=$userEmail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'accepted_terms_id'] = this.acceptedTermsId;
    if (this.acceptedTermsTime != null) {
      json[r'accepted_terms_time'] = this.acceptedTermsTime;
    } else {
      json[r'accepted_terms_time'] = null;
    }
    if (this.agencyLink != null) {
      json[r'agency_link'] = this.agencyLink;
    } else {
      json[r'agency_link'] = null;
    }
      json[r'billing_contact_email'] = this.billingContactEmail;
      json[r'billing_contact_firstname'] = this.billingContactFirstname;
      json[r'billing_contact_lastname'] = this.billingContactLastname;
      json[r'billto_billing_address_id'] = this.billtoBillingAddressId;
      json[r'billto_business_address_id'] = this.billtoBusinessAddressId;
      json[r'billto_company_id'] = this.billtoCompanyId;
    if (this.budgetAmount != null) {
      json[r'budget_amount'] = this.budgetAmount;
    } else {
      json[r'budget_amount'] = null;
    }
      json[r'currency_info'] = this.currencyInfo;
    if (this.endDate != null) {
      json[r'end_date'] = this.endDate;
    } else {
      json[r'end_date'] = null;
    }
    if (this.estimatedMonthlySpend != null) {
      json[r'estimated_monthly_spend'] = this.estimatedMonthlySpend;
    } else {
      json[r'estimated_monthly_spend'] = null;
    }
      json[r'media_contact_email'] = this.mediaContactEmail;
      json[r'media_contact_firstname'] = this.mediaContactFirstname;
      json[r'media_contact_lastname'] = this.mediaContactLastname;
      json[r'order_line_type'] = this.orderLineType;
      json[r'order_name'] = this.orderName;
      json[r'pmp_id'] = this.pmpId;
      json[r'po_number'] = this.poNumber;
      json[r'start_date'] = this.startDate;
    if (this.userEmail != null) {
      json[r'user_email'] = this.userEmail;
    } else {
      json[r'user_email'] = null;
    }
    return json;
  }

  /// Returns a new [SSIOInsertionOrderCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOInsertionOrderCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'accepted_terms_id'), 'Required key "SSIOInsertionOrderCreate[accepted_terms_id]" is missing from JSON.');
        assert(json[r'accepted_terms_id'] != null, 'Required key "SSIOInsertionOrderCreate[accepted_terms_id]" has a null value in JSON.');
        assert(json.containsKey(r'billing_contact_email'), 'Required key "SSIOInsertionOrderCreate[billing_contact_email]" is missing from JSON.');
        assert(json[r'billing_contact_email'] != null, 'Required key "SSIOInsertionOrderCreate[billing_contact_email]" has a null value in JSON.');
        assert(json.containsKey(r'billing_contact_firstname'), 'Required key "SSIOInsertionOrderCreate[billing_contact_firstname]" is missing from JSON.');
        assert(json[r'billing_contact_firstname'] != null, 'Required key "SSIOInsertionOrderCreate[billing_contact_firstname]" has a null value in JSON.');
        assert(json.containsKey(r'billing_contact_lastname'), 'Required key "SSIOInsertionOrderCreate[billing_contact_lastname]" is missing from JSON.');
        assert(json[r'billing_contact_lastname'] != null, 'Required key "SSIOInsertionOrderCreate[billing_contact_lastname]" has a null value in JSON.');
        assert(json.containsKey(r'billto_billing_address_id'), 'Required key "SSIOInsertionOrderCreate[billto_billing_address_id]" is missing from JSON.');
        assert(json[r'billto_billing_address_id'] != null, 'Required key "SSIOInsertionOrderCreate[billto_billing_address_id]" has a null value in JSON.');
        assert(json.containsKey(r'billto_business_address_id'), 'Required key "SSIOInsertionOrderCreate[billto_business_address_id]" is missing from JSON.');
        assert(json[r'billto_business_address_id'] != null, 'Required key "SSIOInsertionOrderCreate[billto_business_address_id]" has a null value in JSON.');
        assert(json.containsKey(r'billto_company_id'), 'Required key "SSIOInsertionOrderCreate[billto_company_id]" is missing from JSON.');
        assert(json[r'billto_company_id'] != null, 'Required key "SSIOInsertionOrderCreate[billto_company_id]" has a null value in JSON.');
        assert(json.containsKey(r'currency_info'), 'Required key "SSIOInsertionOrderCreate[currency_info]" is missing from JSON.');
        assert(json[r'currency_info'] != null, 'Required key "SSIOInsertionOrderCreate[currency_info]" has a null value in JSON.');
        assert(json.containsKey(r'media_contact_email'), 'Required key "SSIOInsertionOrderCreate[media_contact_email]" is missing from JSON.');
        assert(json[r'media_contact_email'] != null, 'Required key "SSIOInsertionOrderCreate[media_contact_email]" has a null value in JSON.');
        assert(json.containsKey(r'media_contact_firstname'), 'Required key "SSIOInsertionOrderCreate[media_contact_firstname]" is missing from JSON.');
        assert(json[r'media_contact_firstname'] != null, 'Required key "SSIOInsertionOrderCreate[media_contact_firstname]" has a null value in JSON.');
        assert(json.containsKey(r'media_contact_lastname'), 'Required key "SSIOInsertionOrderCreate[media_contact_lastname]" is missing from JSON.');
        assert(json[r'media_contact_lastname'] != null, 'Required key "SSIOInsertionOrderCreate[media_contact_lastname]" has a null value in JSON.');
        assert(json.containsKey(r'order_line_type'), 'Required key "SSIOInsertionOrderCreate[order_line_type]" is missing from JSON.');
        assert(json[r'order_line_type'] != null, 'Required key "SSIOInsertionOrderCreate[order_line_type]" has a null value in JSON.');
        assert(json.containsKey(r'order_name'), 'Required key "SSIOInsertionOrderCreate[order_name]" is missing from JSON.');
        assert(json[r'order_name'] != null, 'Required key "SSIOInsertionOrderCreate[order_name]" has a null value in JSON.');
        assert(json.containsKey(r'pmp_id'), 'Required key "SSIOInsertionOrderCreate[pmp_id]" is missing from JSON.');
        assert(json[r'pmp_id'] != null, 'Required key "SSIOInsertionOrderCreate[pmp_id]" has a null value in JSON.');
        assert(json.containsKey(r'po_number'), 'Required key "SSIOInsertionOrderCreate[po_number]" is missing from JSON.');
        assert(json[r'po_number'] != null, 'Required key "SSIOInsertionOrderCreate[po_number]" has a null value in JSON.');
        assert(json.containsKey(r'start_date'), 'Required key "SSIOInsertionOrderCreate[start_date]" is missing from JSON.');
        assert(json[r'start_date'] != null, 'Required key "SSIOInsertionOrderCreate[start_date]" has a null value in JSON.');
        return true;
      }());

      return SSIOInsertionOrderCreate(
        acceptedTermsId: mapValueOfType<String>(json, r'accepted_terms_id')!,
        acceptedTermsTime: mapValueOfType<int>(json, r'accepted_terms_time'),
        agencyLink: mapValueOfType<String>(json, r'agency_link'),
        billingContactEmail: mapValueOfType<String>(json, r'billing_contact_email')!,
        billingContactFirstname: mapValueOfType<String>(json, r'billing_contact_firstname')!,
        billingContactLastname: mapValueOfType<String>(json, r'billing_contact_lastname')!,
        billtoBillingAddressId: mapValueOfType<String>(json, r'billto_billing_address_id')!,
        billtoBusinessAddressId: mapValueOfType<String>(json, r'billto_business_address_id')!,
        billtoCompanyId: mapValueOfType<String>(json, r'billto_company_id')!,
        budgetAmount: mapValueOfType<double>(json, r'budget_amount'),
        currencyInfo: Currency.fromJson(json[r'currency_info'])!,
        endDate: mapValueOfType<String>(json, r'end_date'),
        estimatedMonthlySpend: mapValueOfType<double>(json, r'estimated_monthly_spend'),
        mediaContactEmail: mapValueOfType<String>(json, r'media_contact_email')!,
        mediaContactFirstname: mapValueOfType<String>(json, r'media_contact_firstname')!,
        mediaContactLastname: mapValueOfType<String>(json, r'media_contact_lastname')!,
        orderLineType: SSIOOrderLineType.fromJson(json[r'order_line_type'])!,
        orderName: mapValueOfType<String>(json, r'order_name')!,
        pmpId: mapValueOfType<String>(json, r'pmp_id')!,
        poNumber: mapValueOfType<String>(json, r'po_number')!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
        userEmail: mapValueOfType<String>(json, r'user_email'),
      );
    }
    return null;
  }

  static List<SSIOInsertionOrderCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOInsertionOrderCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOInsertionOrderCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOInsertionOrderCreate> mapFromJson(dynamic json) {
    final map = <String, SSIOInsertionOrderCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOInsertionOrderCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOInsertionOrderCreate-objects as value to a dart map
  static Map<String, List<SSIOInsertionOrderCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOInsertionOrderCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOInsertionOrderCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'accepted_terms_id',
    'billing_contact_email',
    'billing_contact_firstname',
    'billing_contact_lastname',
    'billto_billing_address_id',
    'billto_business_address_id',
    'billto_company_id',
    'currency_info',
    'media_contact_email',
    'media_contact_firstname',
    'media_contact_lastname',
    'order_line_type',
    'order_name',
    'pmp_id',
    'po_number',
    'start_date',
  };
}

