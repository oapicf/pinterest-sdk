//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupCreateRequestAllOf1 {
  /// Returns a new [AdGroupCreateRequestAllOf1] instance.
  AdGroupCreateRequestAllOf1({
    this.autoTargetingEnabled,
    this.bidMultiplier,
    this.budgetType = BudgetType.DAILY,
    this.pacingDeliveryType = PacingDeliveryType.STANDARD,
  });

  /// Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? autoTargetingEnabled;

  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
  ///
  /// Minimum value: 0
  /// Maximum value: 10
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? bidMultiplier;

  BudgetType budgetType;

  PacingDeliveryType pacingDeliveryType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupCreateRequestAllOf1 &&
    other.autoTargetingEnabled == autoTargetingEnabled &&
    other.bidMultiplier == bidMultiplier &&
    other.budgetType == budgetType &&
    other.pacingDeliveryType == pacingDeliveryType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (autoTargetingEnabled == null ? 0 : autoTargetingEnabled!.hashCode) +
    (bidMultiplier == null ? 0 : bidMultiplier!.hashCode) +
    (budgetType.hashCode) +
    (pacingDeliveryType.hashCode);

  @override
  String toString() => 'AdGroupCreateRequestAllOf1[autoTargetingEnabled=$autoTargetingEnabled, bidMultiplier=$bidMultiplier, budgetType=$budgetType, pacingDeliveryType=$pacingDeliveryType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.autoTargetingEnabled != null) {
      json[r'auto_targeting_enabled'] = this.autoTargetingEnabled;
    } else {
      json[r'auto_targeting_enabled'] = null;
    }
    if (this.bidMultiplier != null) {
      json[r'bid_multiplier'] = this.bidMultiplier;
    } else {
      json[r'bid_multiplier'] = null;
    }
      json[r'budget_type'] = this.budgetType;
      json[r'pacing_delivery_type'] = this.pacingDeliveryType;
    return json;
  }

  /// Returns a new [AdGroupCreateRequestAllOf1] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupCreateRequestAllOf1? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdGroupCreateRequestAllOf1(
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled'),
        bidMultiplier: num.parse('${json[r'bid_multiplier']}'),
        budgetType: BudgetType.fromJson(json[r'budget_type']) ?? BudgetType.DAILY,
        pacingDeliveryType: PacingDeliveryType.fromJson(json[r'pacing_delivery_type']) ?? PacingDeliveryType.STANDARD,
      );
    }
    return null;
  }

  static List<AdGroupCreateRequestAllOf1> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupCreateRequestAllOf1>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupCreateRequestAllOf1.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupCreateRequestAllOf1> mapFromJson(dynamic json) {
    final map = <String, AdGroupCreateRequestAllOf1>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupCreateRequestAllOf1.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupCreateRequestAllOf1-objects as value to a dart map
  static Map<String, List<AdGroupCreateRequestAllOf1>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupCreateRequestAllOf1>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupCreateRequestAllOf1.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

