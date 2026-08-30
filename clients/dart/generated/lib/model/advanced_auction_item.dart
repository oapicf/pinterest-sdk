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
    required this.bidOptions,
    required this.country,
    required this.itemId,
    required this.language,
  });

  AdvancedAuctionBidOptions bidOptions;

  Country country;

  /// The catalog retail item id in the merchant namespace
  String itemId;

  Language language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionItem &&
    other.bidOptions == bidOptions &&
    other.country == country &&
    other.itemId == itemId &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bidOptions.hashCode) +
    (country.hashCode) +
    (itemId.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'AdvancedAuctionItem[bidOptions=$bidOptions, country=$country, itemId=$itemId, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'bid_options'] = this.bidOptions;
      json[r'country'] = this.country;
      json[r'item_id'] = this.itemId;
      json[r'language'] = this.language;
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
        assert(json.containsKey(r'bid_options'), 'Required key "AdvancedAuctionItem[bid_options]" is missing from JSON.');
        assert(json[r'bid_options'] != null, 'Required key "AdvancedAuctionItem[bid_options]" has a null value in JSON.');
        assert(json.containsKey(r'country'), 'Required key "AdvancedAuctionItem[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "AdvancedAuctionItem[country]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "AdvancedAuctionItem[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "AdvancedAuctionItem[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "AdvancedAuctionItem[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "AdvancedAuctionItem[language]" has a null value in JSON.');
        return true;
      }());

      return AdvancedAuctionItem(
        bidOptions: AdvancedAuctionBidOptions.fromJson(json[r'bid_options'])!,
        country: Country.fromJson(json[r'country'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        language: Language.fromJson(json[r'language'])!,
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
    'bid_options',
    'country',
    'item_id',
    'language',
  };
}

