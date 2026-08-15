//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOInsertionOrderCommon {
  /// Returns a new [SSIOInsertionOrderCommon] instance.
  SSIOInsertionOrderCommon({
    this.agencyLink,
    this.billingContactEmail,
    this.billingContactFirstname,
    this.billingContactLastname,
    this.budgetAmount,
    this.endDate,
    this.mediaContactEmail,
    this.mediaContactFirstname,
    this.mediaContactLastname,
    this.poNumber,
    this.startDate,
    this.userEmail,
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

  /// The po number
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? poNumber;

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
  bool operator ==(Object other) => identical(this, other) || other is SSIOInsertionOrderCommon &&
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
    other.userEmail == userEmail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (agencyLink == null ? 0 : agencyLink!.hashCode) +
    (billingContactEmail == null ? 0 : billingContactEmail!.hashCode) +
    (billingContactFirstname == null ? 0 : billingContactFirstname!.hashCode) +
    (billingContactLastname == null ? 0 : billingContactLastname!.hashCode) +
    (budgetAmount == null ? 0 : budgetAmount!.hashCode) +
    (endDate == null ? 0 : endDate!.hashCode) +
    (mediaContactEmail == null ? 0 : mediaContactEmail!.hashCode) +
    (mediaContactFirstname == null ? 0 : mediaContactFirstname!.hashCode) +
    (mediaContactLastname == null ? 0 : mediaContactLastname!.hashCode) +
    (poNumber == null ? 0 : poNumber!.hashCode) +
    (startDate == null ? 0 : startDate!.hashCode) +
    (userEmail == null ? 0 : userEmail!.hashCode);

  @override
  String toString() => 'SSIOInsertionOrderCommon[agencyLink=$agencyLink, billingContactEmail=$billingContactEmail, billingContactFirstname=$billingContactFirstname, billingContactLastname=$billingContactLastname, budgetAmount=$budgetAmount, endDate=$endDate, mediaContactEmail=$mediaContactEmail, mediaContactFirstname=$mediaContactFirstname, mediaContactLastname=$mediaContactLastname, poNumber=$poNumber, startDate=$startDate, userEmail=$userEmail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
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
    if (this.poNumber != null) {
      json[r'po_number'] = this.poNumber;
    } else {
      json[r'po_number'] = null;
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

  /// Returns a new [SSIOInsertionOrderCommon] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOInsertionOrderCommon? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SSIOInsertionOrderCommon[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SSIOInsertionOrderCommon[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SSIOInsertionOrderCommon(
        agencyLink: mapValueOfType<String>(json, r'agency_link'),
        billingContactEmail: mapValueOfType<String>(json, r'billing_contact_email'),
        billingContactFirstname: mapValueOfType<String>(json, r'billing_contact_firstname'),
        billingContactLastname: mapValueOfType<String>(json, r'billing_contact_lastname'),
        budgetAmount: num.parse('${json[r'budget_amount']}'),
        endDate: mapValueOfType<String>(json, r'end_date'),
        mediaContactEmail: mapValueOfType<String>(json, r'media_contact_email'),
        mediaContactFirstname: mapValueOfType<String>(json, r'media_contact_firstname'),
        mediaContactLastname: mapValueOfType<String>(json, r'media_contact_lastname'),
        poNumber: mapValueOfType<String>(json, r'po_number'),
        startDate: mapValueOfType<String>(json, r'start_date'),
        userEmail: mapValueOfType<String>(json, r'user_email'),
      );
    }
    return null;
  }

  static List<SSIOInsertionOrderCommon> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOInsertionOrderCommon>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOInsertionOrderCommon.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOInsertionOrderCommon> mapFromJson(dynamic json) {
    final map = <String, SSIOInsertionOrderCommon>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOInsertionOrderCommon.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOInsertionOrderCommon-objects as value to a dart map
  static Map<String, List<SSIOInsertionOrderCommon>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOInsertionOrderCommon>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOInsertionOrderCommon.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

