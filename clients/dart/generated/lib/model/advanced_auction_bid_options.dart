//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvancedAuctionBidOptions {
  /// Returns a new [AdvancedAuctionBidOptions] instance.
  AdvancedAuctionBidOptions({
    this.appTypeMultipliers,
    this.bidInMicroCurrency,
    this.placementMultipliers,
  });

  AppTypeMultipliers? appTypeMultipliers;

  /// Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
  int? bidInMicroCurrency;

  PlacementMultipliers? placementMultipliers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionBidOptions &&
    other.appTypeMultipliers == appTypeMultipliers &&
    other.bidInMicroCurrency == bidInMicroCurrency &&
    other.placementMultipliers == placementMultipliers;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (appTypeMultipliers == null ? 0 : appTypeMultipliers!.hashCode) +
    (bidInMicroCurrency == null ? 0 : bidInMicroCurrency!.hashCode) +
    (placementMultipliers == null ? 0 : placementMultipliers!.hashCode);

  @override
  String toString() => 'AdvancedAuctionBidOptions[appTypeMultipliers=$appTypeMultipliers, bidInMicroCurrency=$bidInMicroCurrency, placementMultipliers=$placementMultipliers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.appTypeMultipliers != null) {
      json[r'app_type_multipliers'] = this.appTypeMultipliers;
    } else {
      json[r'app_type_multipliers'] = null;
    }
    if (this.bidInMicroCurrency != null) {
      json[r'bid_in_micro_currency'] = this.bidInMicroCurrency;
    } else {
      json[r'bid_in_micro_currency'] = null;
    }
    if (this.placementMultipliers != null) {
      json[r'placement_multipliers'] = this.placementMultipliers;
    } else {
      json[r'placement_multipliers'] = null;
    }
    return json;
  }

  /// Returns a new [AdvancedAuctionBidOptions] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvancedAuctionBidOptions? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdvancedAuctionBidOptions(
        appTypeMultipliers: AppTypeMultipliers.fromJson(json[r'app_type_multipliers']),
        bidInMicroCurrency: mapValueOfType<int>(json, r'bid_in_micro_currency'),
        placementMultipliers: PlacementMultipliers.fromJson(json[r'placement_multipliers']),
      );
    }
    return null;
  }

  static List<AdvancedAuctionBidOptions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionBidOptions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionBidOptions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvancedAuctionBidOptions> mapFromJson(dynamic json) {
    final map = <String, AdvancedAuctionBidOptions>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvancedAuctionBidOptions.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvancedAuctionBidOptions-objects as value to a dart map
  static Map<String, List<AdvancedAuctionBidOptions>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvancedAuctionBidOptions>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvancedAuctionBidOptions.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

