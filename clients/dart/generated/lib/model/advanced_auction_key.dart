//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvancedAuctionKey {
  /// Returns a new [AdvancedAuctionKey] instance.
  AdvancedAuctionKey({
    required this.country,
    required this.itemId,
    required this.language,
  });

  Country country;

  /// The catalog retail item id in the merchant namespace
  String itemId;

  Language language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionKey &&
    other.country == country &&
    other.itemId == itemId &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country.hashCode) +
    (itemId.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'AdvancedAuctionKey[country=$country, itemId=$itemId, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'item_id'] = this.itemId;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [AdvancedAuctionKey] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvancedAuctionKey? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdvancedAuctionKey[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdvancedAuctionKey[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdvancedAuctionKey(
        country: Country.fromJson(json[r'country'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        language: Language.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<AdvancedAuctionKey> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionKey>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionKey.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvancedAuctionKey> mapFromJson(dynamic json) {
    final map = <String, AdvancedAuctionKey>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvancedAuctionKey.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvancedAuctionKey-objects as value to a dart map
  static Map<String, List<AdvancedAuctionKey>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvancedAuctionKey>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvancedAuctionKey.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'country',
    'item_id',
    'language',
  };
}

