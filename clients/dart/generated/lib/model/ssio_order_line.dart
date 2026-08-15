//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOOrderLine {
  /// Returns a new [SSIOOrderLine] instance.
  SSIOOrderLine({
    this.acceptedTermsId,
    this.acceptedTermsTime,
    this.adsManagerOrderLineId,
    this.agencyLink,
    this.billToCompanyName,
    this.billingContactEmail,
    this.billingContactFirstname,
    this.billingContactLastname,
    this.budgetAmount,
    this.currencyInfo,
    this.endDate,
    this.estimatedMonthlySpend,
    this.lastModifiedDateTime,
    this.mediaContactEmail,
    this.mediaContactFirstname,
    this.mediaContactLastname,
    this.orderName,
    this.pinOrderId,
    this.pmpName,
    this.poNumber,
    this.salesforceOrderLineId,
    this.startDate,
  });

  /// The SFDC id for the terms
  String? acceptedTermsId;

  /// The UTC timestamp (to the nearest sec) of when terms were accepted
  String? acceptedTermsTime;

  /// Ads manager OrderLineId
  String? adsManagerOrderLineId;

  /// Agency link
  String? agencyLink;

  /// Bill To Company name
  String? billToCompanyName;

  /// Billing contact email
  String? billingContactEmail;

  /// Billing contact first name
  String? billingContactFirstname;

  /// Billing contact last name
  String? billingContactLastname;

  /// If Budget order line, the budget amount.
  num? budgetAmount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Currency? currencyInfo;

  /// End date of the order line.
  DateTime? endDate;

  /// If Ongoing (perpetual) order line, the estimated monthly spend
  num? estimatedMonthlySpend;

  /// Last modified date.
  String? lastModifiedDateTime;

  /// Billing media email
  String? mediaContactEmail;

  /// Billing contact first name
  String? mediaContactFirstname;

  /// Billing contact first name
  String? mediaContactLastname;

  /// The order name
  String? orderName;

  /// The pin order id associated with the order line in SFDC
  String? pinOrderId;

  /// The Pinterest marketing partner name
  String? pmpName;

  /// The po number
  String? poNumber;

  /// OrderLineId in SFDC
  String? salesforceOrderLineId;

  /// Start date of the order line.
  DateTime? startDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SSIOOrderLine &&
    other.acceptedTermsId == acceptedTermsId &&
    other.acceptedTermsTime == acceptedTermsTime &&
    other.adsManagerOrderLineId == adsManagerOrderLineId &&
    other.agencyLink == agencyLink &&
    other.billToCompanyName == billToCompanyName &&
    other.billingContactEmail == billingContactEmail &&
    other.billingContactFirstname == billingContactFirstname &&
    other.billingContactLastname == billingContactLastname &&
    other.budgetAmount == budgetAmount &&
    other.currencyInfo == currencyInfo &&
    other.endDate == endDate &&
    other.estimatedMonthlySpend == estimatedMonthlySpend &&
    other.lastModifiedDateTime == lastModifiedDateTime &&
    other.mediaContactEmail == mediaContactEmail &&
    other.mediaContactFirstname == mediaContactFirstname &&
    other.mediaContactLastname == mediaContactLastname &&
    other.orderName == orderName &&
    other.pinOrderId == pinOrderId &&
    other.pmpName == pmpName &&
    other.poNumber == poNumber &&
    other.salesforceOrderLineId == salesforceOrderLineId &&
    other.startDate == startDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (acceptedTermsId == null ? 0 : acceptedTermsId!.hashCode) +
    (acceptedTermsTime == null ? 0 : acceptedTermsTime!.hashCode) +
    (adsManagerOrderLineId == null ? 0 : adsManagerOrderLineId!.hashCode) +
    (agencyLink == null ? 0 : agencyLink!.hashCode) +
    (billToCompanyName == null ? 0 : billToCompanyName!.hashCode) +
    (billingContactEmail == null ? 0 : billingContactEmail!.hashCode) +
    (billingContactFirstname == null ? 0 : billingContactFirstname!.hashCode) +
    (billingContactLastname == null ? 0 : billingContactLastname!.hashCode) +
    (budgetAmount == null ? 0 : budgetAmount!.hashCode) +
    (currencyInfo == null ? 0 : currencyInfo!.hashCode) +
    (endDate == null ? 0 : endDate!.hashCode) +
    (estimatedMonthlySpend == null ? 0 : estimatedMonthlySpend!.hashCode) +
    (lastModifiedDateTime == null ? 0 : lastModifiedDateTime!.hashCode) +
    (mediaContactEmail == null ? 0 : mediaContactEmail!.hashCode) +
    (mediaContactFirstname == null ? 0 : mediaContactFirstname!.hashCode) +
    (mediaContactLastname == null ? 0 : mediaContactLastname!.hashCode) +
    (orderName == null ? 0 : orderName!.hashCode) +
    (pinOrderId == null ? 0 : pinOrderId!.hashCode) +
    (pmpName == null ? 0 : pmpName!.hashCode) +
    (poNumber == null ? 0 : poNumber!.hashCode) +
    (salesforceOrderLineId == null ? 0 : salesforceOrderLineId!.hashCode) +
    (startDate == null ? 0 : startDate!.hashCode);

  @override
  String toString() => 'SSIOOrderLine[acceptedTermsId=$acceptedTermsId, acceptedTermsTime=$acceptedTermsTime, adsManagerOrderLineId=$adsManagerOrderLineId, agencyLink=$agencyLink, billToCompanyName=$billToCompanyName, billingContactEmail=$billingContactEmail, billingContactFirstname=$billingContactFirstname, billingContactLastname=$billingContactLastname, budgetAmount=$budgetAmount, currencyInfo=$currencyInfo, endDate=$endDate, estimatedMonthlySpend=$estimatedMonthlySpend, lastModifiedDateTime=$lastModifiedDateTime, mediaContactEmail=$mediaContactEmail, mediaContactFirstname=$mediaContactFirstname, mediaContactLastname=$mediaContactLastname, orderName=$orderName, pinOrderId=$pinOrderId, pmpName=$pmpName, poNumber=$poNumber, salesforceOrderLineId=$salesforceOrderLineId, startDate=$startDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.acceptedTermsId != null) {
      json[r'accepted_terms_id'] = this.acceptedTermsId;
    } else {
      json[r'accepted_terms_id'] = null;
    }
    if (this.acceptedTermsTime != null) {
      json[r'accepted_terms_time'] = this.acceptedTermsTime;
    } else {
      json[r'accepted_terms_time'] = null;
    }
    if (this.adsManagerOrderLineId != null) {
      json[r'ads_manager_order_line_id'] = this.adsManagerOrderLineId;
    } else {
      json[r'ads_manager_order_line_id'] = null;
    }
    if (this.agencyLink != null) {
      json[r'agency_link'] = this.agencyLink;
    } else {
      json[r'agency_link'] = null;
    }
    if (this.billToCompanyName != null) {
      json[r'bill_to_company_name'] = this.billToCompanyName;
    } else {
      json[r'bill_to_company_name'] = null;
    }
    if (this.billingContactEmail != null) {
      json[r'billing_contact_email'] = this.billingContactEmail;
    } else {
      json[r'billing_contact_email'] = null;
    }
    if (this.billingContactFirstname != null) {
      json[r'billing_contact_firstname'] = this.billingContactFirstname;
    } else {
      json[r'billing_contact_firstname'] = null;
    }
    if (this.billingContactLastname != null) {
      json[r'billing_contact_lastname'] = this.billingContactLastname;
    } else {
      json[r'billing_contact_lastname'] = null;
    }
    if (this.budgetAmount != null) {
      json[r'budget_amount'] = this.budgetAmount;
    } else {
      json[r'budget_amount'] = null;
    }
    if (this.currencyInfo != null) {
      json[r'currency_info'] = this.currencyInfo;
    } else {
      json[r'currency_info'] = null;
    }
    if (this.endDate != null) {
      json[r'end_date'] = _dateFormatter.format(this.endDate!.toUtc());
    } else {
      json[r'end_date'] = null;
    }
    if (this.estimatedMonthlySpend != null) {
      json[r'estimated_monthly_spend'] = this.estimatedMonthlySpend;
    } else {
      json[r'estimated_monthly_spend'] = null;
    }
    if (this.lastModifiedDateTime != null) {
      json[r'last_modified_date_time'] = this.lastModifiedDateTime;
    } else {
      json[r'last_modified_date_time'] = null;
    }
    if (this.mediaContactEmail != null) {
      json[r'media_contact_email'] = this.mediaContactEmail;
    } else {
      json[r'media_contact_email'] = null;
    }
    if (this.mediaContactFirstname != null) {
      json[r'media_contact_firstname'] = this.mediaContactFirstname;
    } else {
      json[r'media_contact_firstname'] = null;
    }
    if (this.mediaContactLastname != null) {
      json[r'media_contact_lastname'] = this.mediaContactLastname;
    } else {
      json[r'media_contact_lastname'] = null;
    }
    if (this.orderName != null) {
      json[r'order_name'] = this.orderName;
    } else {
      json[r'order_name'] = null;
    }
    if (this.pinOrderId != null) {
      json[r'pin_order_id'] = this.pinOrderId;
    } else {
      json[r'pin_order_id'] = null;
    }
    if (this.pmpName != null) {
      json[r'pmp_name'] = this.pmpName;
    } else {
      json[r'pmp_name'] = null;
    }
    if (this.poNumber != null) {
      json[r'po_number'] = this.poNumber;
    } else {
      json[r'po_number'] = null;
    }
    if (this.salesforceOrderLineId != null) {
      json[r'salesforce_order_line_id'] = this.salesforceOrderLineId;
    } else {
      json[r'salesforce_order_line_id'] = null;
    }
    if (this.startDate != null) {
      json[r'start_date'] = _dateFormatter.format(this.startDate!.toUtc());
    } else {
      json[r'start_date'] = null;
    }
    return json;
  }

  /// Returns a new [SSIOOrderLine] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOOrderLine? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SSIOOrderLine[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SSIOOrderLine[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SSIOOrderLine(
        acceptedTermsId: mapValueOfType<String>(json, r'accepted_terms_id'),
        acceptedTermsTime: mapValueOfType<String>(json, r'accepted_terms_time'),
        adsManagerOrderLineId: mapValueOfType<String>(json, r'ads_manager_order_line_id'),
        agencyLink: mapValueOfType<String>(json, r'agency_link'),
        billToCompanyName: mapValueOfType<String>(json, r'bill_to_company_name'),
        billingContactEmail: mapValueOfType<String>(json, r'billing_contact_email'),
        billingContactFirstname: mapValueOfType<String>(json, r'billing_contact_firstname'),
        billingContactLastname: mapValueOfType<String>(json, r'billing_contact_lastname'),
        budgetAmount: json[r'budget_amount'] == null
            ? null
            : num.parse('${json[r'budget_amount']}'),
        currencyInfo: Currency.fromJson(json[r'currency_info']),
        endDate: mapDateTime(json, r'end_date', r''),
        estimatedMonthlySpend: json[r'estimated_monthly_spend'] == null
            ? null
            : num.parse('${json[r'estimated_monthly_spend']}'),
        lastModifiedDateTime: mapValueOfType<String>(json, r'last_modified_date_time'),
        mediaContactEmail: mapValueOfType<String>(json, r'media_contact_email'),
        mediaContactFirstname: mapValueOfType<String>(json, r'media_contact_firstname'),
        mediaContactLastname: mapValueOfType<String>(json, r'media_contact_lastname'),
        orderName: mapValueOfType<String>(json, r'order_name'),
        pinOrderId: mapValueOfType<String>(json, r'pin_order_id'),
        pmpName: mapValueOfType<String>(json, r'pmp_name'),
        poNumber: mapValueOfType<String>(json, r'po_number'),
        salesforceOrderLineId: mapValueOfType<String>(json, r'salesforce_order_line_id'),
        startDate: mapDateTime(json, r'start_date', r''),
      );
    }
    return null;
  }

  static List<SSIOOrderLine> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOOrderLine>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOOrderLine.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOOrderLine> mapFromJson(dynamic json) {
    final map = <String, SSIOOrderLine>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOOrderLine.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOOrderLine-objects as value to a dart map
  static Map<String, List<SSIOOrderLine>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOOrderLine>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOOrderLine.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

