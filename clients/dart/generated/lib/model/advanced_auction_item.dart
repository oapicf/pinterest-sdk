//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvancedAuctionItem {
  /// Returns a new [AdvancedAuctionItem] instance.
  AdvancedAuctionItem({
    required this.country,
    required this.itemId,
    required this.language,
    required this.bidOptions,
  });

  Country country;

  /// The catalog retail item id in the merchant namespace
  String itemId;

  Language language;

  AdvancedAuctionBidOptions bidOptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionItem &&
    other.country == country &&
    other.itemId == itemId &&
    other.language == language &&
    other.bidOptions == bidOptions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country.hashCode) +
    (itemId.hashCode) +
    (language.hashCode) +
    (bidOptions.hashCode);

  @override
  String toString() => 'AdvancedAuctionItem[country=$country, itemId=$itemId, language=$language, bidOptions=$bidOptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'item_id'] = this.itemId;
      json[r'language'] = this.language;
      json[r'bid_options'] = this.bidOptions;
    return json;
  }

  /// Returns a new [AdvancedAuctionItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvancedAuctionItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdvancedAuctionItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdvancedAuctionItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdvancedAuctionItem(
        country: Country.fromJson(json[r'country'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        language: Language.fromJson(json[r'language'])!,
        bidOptions: AdvancedAuctionBidOptions.fromJson(json[r'bid_options'])!,
      );
    }
    return null;
  }

  static List<AdvancedAuctionItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvancedAuctionItem> mapFromJson(dynamic json) {
    final map = <String, AdvancedAuctionItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvancedAuctionItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvancedAuctionItem-objects as value to a dart map
  static Map<String, List<AdvancedAuctionItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvancedAuctionItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvancedAuctionItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'country',
    'item_id',
    'language',
    'bid_options',
  };
}

