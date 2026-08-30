//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOInsertionOrderUpdate {
  /// Returns a new [SSIOInsertionOrderUpdate] instance.
  SSIOInsertionOrderUpdate({
    this.adsManagerOrderLineId,
    this.agencyLink,
    this.billingContactEmail,
    this.billingContactFirstname,
    this.billingContactLastname,
    this.budgetAmount,
    this.endDate,
    this.mediaContactEmail,
    this.mediaContactFirstname,
    this.mediaContactLastname,
    this.oracleLineId,
    this.poNumber,
    this.salesforceOrderId,
    this.salesforceOrderLineId,
    this.startDate,
    this.userEmail,
  });

  /// Ads manager OrderLineId
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adsManagerOrderLineId;

  /// URL link for agency
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? agencyLink;

  /// The billing contact email
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? billingContactEmail;

  /// The billing contact first name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? billingContactFirstname;

  /// The billing contact last name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? billingContactLastname;

  /// If Budget order line, the budget amount.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? budgetAmount;

  /// End date of time period. Format: YYYY-MM-DD
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? endDate;

  /// The media contact email
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? mediaContactEmail;

  /// The media contact first name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? mediaContactFirstname;

  /// The media contact last name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? mediaContactLastname;

  /// LineId in the Oracle DB
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? oracleLineId;

  /// The po number
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? poNumber;

  /// OrderId in SFDC
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? salesforceOrderId;

  /// OrderLineId in SFDC
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? salesforceOrderLineId;

  /// Starting date of time period. Format: YYYY-MM-DD
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? startDate;

  /// The email of user submitting the insertion order
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? userEmail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SSIOInsertionOrderUpdate &&
    other.adsManagerOrderLineId == adsManagerOrderLineId &&
    other.agencyLink == agencyLink &&
    other.billingContactEmail == billingContactEmail &&
    other.billingContactFirstname == billingContactFirstname &&
    other.billingContactLastname == billingContactLastname &&
    other.budgetAmount == budgetAmount &&
    other.endDate == endDate &&
    other.mediaContactEmail == mediaContactEmail &&
    other.mediaContactFirstname == mediaContactFirstname &&
    other.mediaContactLastname == mediaContactLastname &&
    other.oracleLineId == oracleLineId &&
    other.poNumber == poNumber &&
    other.salesforceOrderId == salesforceOrderId &&
    other.salesforceOrderLineId == salesforceOrderLineId &&
    other.startDate == startDate &&
    other.userEmail == userEmail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adsManagerOrderLineId == null ? 0 : adsManagerOrderLineId!.hashCode) +
    (agencyLink == null ? 0 : agencyLink!.hashCode) +
    (billingContactEmail == null ? 0 : billingContactEmail!.hashCode) +
    (billingContactFirstname == null ? 0 : billingContactFirstname!.hashCode) +
    (billingContactLastname == null ? 0 : billingContactLastname!.hashCode) +
    (budgetAmount == null ? 0 : budgetAmount!.hashCode) +
    (endDate == null ? 0 : endDate!.hashCode) +
    (mediaContactEmail == null ? 0 : mediaContactEmail!.hashCode) +
    (mediaContactFirstname == null ? 0 : mediaContactFirstname!.hashCode) +
    (mediaContactLastname == null ? 0 : mediaContactLastname!.hashCode) +
    (oracleLineId == null ? 0 : oracleLineId!.hashCode) +
    (poNumber == null ? 0 : poNumber!.hashCode) +
    (salesforceOrderId == null ? 0 : salesforceOrderId!.hashCode) +
    (salesforceOrderLineId == null ? 0 : salesforceOrderLineId!.hashCode) +
    (startDate == null ? 0 : startDate!.hashCode) +
    (userEmail == null ? 0 : userEmail!.hashCode);

  @override
  String toString() => 'SSIOInsertionOrderUpdate[adsManagerOrderLineId=$adsManagerOrderLineId, agencyLink=$agencyLink, billingContactEmail=$billingContactEmail, billingContactFirstname=$billingContactFirstname, billingContactLastname=$billingContactLastname, budgetAmount=$budgetAmount, endDate=$endDate, mediaContactEmail=$mediaContactEmail, mediaContactFirstname=$mediaContactFirstname, mediaContactLastname=$mediaContactLastname, oracleLineId=$oracleLineId, poNumber=$poNumber, salesforceOrderId=$salesforceOrderId, salesforceOrderLineId=$salesforceOrderLineId, startDate=$startDate, userEmail=$userEmail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
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
    if (this.endDate != null) {
      json[r'end_date'] = this.endDate;
    } else {
      json[r'end_date'] = null;
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
    if (this.oracleLineId != null) {
      json[r'oracle_line_id'] = this.oracleLineId;
    } else {
      json[r'oracle_line_id'] = null;
    }
    if (this.poNumber != null) {
      json[r'po_number'] = this.poNumber;
    } else {
      json[r'po_number'] = null;
    }
    if (this.salesforceOrderId != null) {
      json[r'salesforce_order_id'] = this.salesforceOrderId;
    } else {
      json[r'salesforce_order_id'] = null;
    }
    if (this.salesforceOrderLineId != null) {
      json[r'salesforce_order_line_id'] = this.salesforceOrderLineId;
    } else {
      json[r'salesforce_order_line_id'] = null;
    }
    if (this.startDate != null) {
      json[r'start_date'] = this.startDate;
    } else {
      json[r'start_date'] = null;
    }
    if (this.userEmail != null) {
      json[r'user_email'] = this.userEmail;
    } else {
      json[r'user_email'] = null;
    }
    return json;
  }

  /// Returns a new [SSIOInsertionOrderUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOInsertionOrderUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return SSIOInsertionOrderUpdate(
        adsManagerOrderLineId: mapValueOfType<String>(json, r'ads_manager_order_line_id'),
        agencyLink: mapValueOfType<String>(json, r'agency_link'),
        billingContactEmail: mapValueOfType<String>(json, r'billing_contact_email'),
        billingContactFirstname: mapValueOfType<String>(json, r'billing_contact_firstname'),
        billingContactLastname: mapValueOfType<String>(json, r'billing_contact_lastname'),
        budgetAmount: mapValueOfType<double>(json, r'budget_amount'),
        endDate: mapValueOfType<String>(json, r'end_date'),
        mediaContactEmail: mapValueOfType<String>(json, r'media_contact_email'),
        mediaContactFirstname: mapValueOfType<String>(json, r'media_contact_firstname'),
        mediaContactLastname: mapValueOfType<String>(json, r'media_contact_lastname'),
        oracleLineId: mapValueOfType<String>(json, r'oracle_line_id'),
        poNumber: mapValueOfType<String>(json, r'po_number'),
        salesforceOrderId: mapValueOfType<String>(json, r'salesforce_order_id'),
        salesforceOrderLineId: mapValueOfType<String>(json, r'salesforce_order_line_id'),
        startDate: mapValueOfType<String>(json, r'start_date'),
        userEmail: mapValueOfType<String>(json, r'user_email'),
      );
    }
    return null;
  }

  static List<SSIOInsertionOrderUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOInsertionOrderUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOInsertionOrderUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOInsertionOrderUpdate> mapFromJson(dynamic json) {
    final map = <String, SSIOInsertionOrderUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOInsertionOrderUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOInsertionOrderUpdate-objects as value to a dart map
  static Map<String, List<SSIOInsertionOrderUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOInsertionOrderUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOInsertionOrderUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

