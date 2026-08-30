//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BillingProfilesResponse {
  /// Returns a new [BillingProfilesResponse] instance.
  BillingProfilesResponse({
    this.advertiserId,
    this.billingType,
    this.cardType,
    this.id,
    this.paymentMethodBrand,
    this.status,
  });

  /// Advertiser ID of the billing.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? advertiserId;

  /// Billing type of the advertiser
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BillingType? billingType;

  /// Type of the card.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BillingProfileCardType? cardType;

  /// Billing ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Brand of the payment method.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BillingProfilePaymentMethodBrand? paymentMethodBrand;

  /// Status of the billing.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BillingProfileStatus? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BillingProfilesResponse &&
    other.advertiserId == advertiserId &&
    other.billingType == billingType &&
    other.cardType == cardType &&
    other.id == id &&
    other.paymentMethodBrand == paymentMethodBrand &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (advertiserId == null ? 0 : advertiserId!.hashCode) +
    (billingType == null ? 0 : billingType!.hashCode) +
    (cardType == null ? 0 : cardType!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (paymentMethodBrand == null ? 0 : paymentMethodBrand!.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'BillingProfilesResponse[advertiserId=$advertiserId, billingType=$billingType, cardType=$cardType, id=$id, paymentMethodBrand=$paymentMethodBrand, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.advertiserId != null) {
      json[r'advertiser_id'] = this.advertiserId;
    } else {
      json[r'advertiser_id'] = null;
    }
    if (this.billingType != null) {
      json[r'billing_type'] = this.billingType;
    } else {
      json[r'billing_type'] = null;
    }
    if (this.cardType != null) {
      json[r'card_type'] = this.cardType;
    } else {
      json[r'card_type'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.paymentMethodBrand != null) {
      json[r'payment_method_brand'] = this.paymentMethodBrand;
    } else {
      json[r'payment_method_brand'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [BillingProfilesResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BillingProfilesResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BillingProfilesResponse(
        advertiserId: mapValueOfType<String>(json, r'advertiser_id'),
        billingType: BillingType.fromJson(json[r'billing_type']),
        cardType: BillingProfileCardType.fromJson(json[r'card_type']),
        id: mapValueOfType<String>(json, r'id'),
        paymentMethodBrand: BillingProfilePaymentMethodBrand.fromJson(json[r'payment_method_brand']),
        status: BillingProfileStatus.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<BillingProfilesResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BillingProfilesResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BillingProfilesResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BillingProfilesResponse> mapFromJson(dynamic json) {
    final map = <String, BillingProfilesResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BillingProfilesResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BillingProfilesResponse-objects as value to a dart map
  static Map<String, List<BillingProfilesResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BillingProfilesResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BillingProfilesResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

