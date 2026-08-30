//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdsCreditDiscountsResponse {
  /// Returns a new [AdsCreditDiscountsResponse] instance.
  AdsCreditDiscountsResponse({
    this.active,
    this.advertiserId,
    this.discountCurrency,
    this.discountInMicroCurrency,
    this.discountType,
    this.remainingDiscountInMicroCurrency,
    this.title,
  });

  /// True if the offer code is currently active.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? active;

  /// Advertiser ID the offer was applied to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? advertiserId;

  /// Currency value for the discount.
  String? discountCurrency;

  /// The discount applied in the offer's currency value.
  num? discountInMicroCurrency;

  /// The type of discount of this credit
  AdsCreditDiscountType? discountType;

  /// The credits left to spend.
  num? remainingDiscountInMicroCurrency;

  /// Human readable title of the offer code.
  String? title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsCreditDiscountsResponse &&
    other.active == active &&
    other.advertiserId == advertiserId &&
    other.discountCurrency == discountCurrency &&
    other.discountInMicroCurrency == discountInMicroCurrency &&
    other.discountType == discountType &&
    other.remainingDiscountInMicroCurrency == remainingDiscountInMicroCurrency &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (active == null ? 0 : active!.hashCode) +
    (advertiserId == null ? 0 : advertiserId!.hashCode) +
    (discountCurrency == null ? 0 : discountCurrency!.hashCode) +
    (discountInMicroCurrency == null ? 0 : discountInMicroCurrency!.hashCode) +
    (discountType == null ? 0 : discountType!.hashCode) +
    (remainingDiscountInMicroCurrency == null ? 0 : remainingDiscountInMicroCurrency!.hashCode) +
    (title == null ? 0 : title!.hashCode);

  @override
  String toString() => 'AdsCreditDiscountsResponse[active=$active, advertiserId=$advertiserId, discountCurrency=$discountCurrency, discountInMicroCurrency=$discountInMicroCurrency, discountType=$discountType, remainingDiscountInMicroCurrency=$remainingDiscountInMicroCurrency, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.active != null) {
      json[r'active'] = this.active;
    } else {
      json[r'active'] = null;
    }
    if (this.advertiserId != null) {
      json[r'advertiser_id'] = this.advertiserId;
    } else {
      json[r'advertiser_id'] = null;
    }
    if (this.discountCurrency != null) {
      json[r'discountCurrency'] = this.discountCurrency;
    } else {
      json[r'discountCurrency'] = null;
    }
    if (this.discountInMicroCurrency != null) {
      json[r'discountInMicroCurrency'] = this.discountInMicroCurrency;
    } else {
      json[r'discountInMicroCurrency'] = null;
    }
    if (this.discountType != null) {
      json[r'discountType'] = this.discountType;
    } else {
      json[r'discountType'] = null;
    }
    if (this.remainingDiscountInMicroCurrency != null) {
      json[r'remainingDiscountInMicroCurrency'] = this.remainingDiscountInMicroCurrency;
    } else {
      json[r'remainingDiscountInMicroCurrency'] = null;
    }
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
    return json;
  }

  /// Returns a new [AdsCreditDiscountsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdsCreditDiscountsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdsCreditDiscountsResponse(
        active: mapValueOfType<bool>(json, r'active'),
        advertiserId: mapValueOfType<String>(json, r'advertiser_id'),
        discountCurrency: mapValueOfType<String>(json, r'discountCurrency'),
        discountInMicroCurrency: json[r'discountInMicroCurrency'] == null
            ? null
            : num.parse('${json[r'discountInMicroCurrency']}'),
        discountType: AdsCreditDiscountType.fromJson(json[r'discountType']),
        remainingDiscountInMicroCurrency: json[r'remainingDiscountInMicroCurrency'] == null
            ? null
            : num.parse('${json[r'remainingDiscountInMicroCurrency']}'),
        title: mapValueOfType<String>(json, r'title'),
      );
    }
    return null;
  }

  static List<AdsCreditDiscountsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsCreditDiscountsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsCreditDiscountsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdsCreditDiscountsResponse> mapFromJson(dynamic json) {
    final map = <String, AdsCreditDiscountsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdsCreditDiscountsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdsCreditDiscountsResponse-objects as value to a dart map
  static Map<String, List<AdsCreditDiscountsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdsCreditDiscountsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdsCreditDiscountsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

