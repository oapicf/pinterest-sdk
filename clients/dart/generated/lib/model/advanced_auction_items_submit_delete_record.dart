//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvancedAuctionItemsSubmitDeleteRecord {
  /// Returns a new [AdvancedAuctionItemsSubmitDeleteRecord] instance.
  AdvancedAuctionItemsSubmitDeleteRecord({
    required this.country,
    required this.itemId,
    required this.language,
    this.errors = const [],
  });

  Country country;

  /// The catalog retail item id in the merchant namespace
  String itemId;

  Language language;

  /// Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  List<AdvancedAuctionOperationError> errors;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionItemsSubmitDeleteRecord &&
    other.country == country &&
    other.itemId == itemId &&
    other.language == language &&
    _deepEquality.equals(other.errors, errors);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country.hashCode) +
    (itemId.hashCode) +
    (language.hashCode) +
    (errors.hashCode);

  @override
  String toString() => 'AdvancedAuctionItemsSubmitDeleteRecord[country=$country, itemId=$itemId, language=$language, errors=$errors]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'item_id'] = this.itemId;
      json[r'language'] = this.language;
      json[r'errors'] = this.errors;
    return json;
  }

  /// Returns a new [AdvancedAuctionItemsSubmitDeleteRecord] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvancedAuctionItemsSubmitDeleteRecord? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdvancedAuctionItemsSubmitDeleteRecord(
        country: Country.fromJson(json[r'country'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        language: Language.fromJson(json[r'language'])!,
        errors: AdvancedAuctionOperationError.listFromJson(json[r'errors']),
      );
    }
    return null;
  }

  static List<AdvancedAuctionItemsSubmitDeleteRecord> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionItemsSubmitDeleteRecord>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionItemsSubmitDeleteRecord.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvancedAuctionItemsSubmitDeleteRecord> mapFromJson(dynamic json) {
    final map = <String, AdvancedAuctionItemsSubmitDeleteRecord>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvancedAuctionItemsSubmitDeleteRecord.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvancedAuctionItemsSubmitDeleteRecord-objects as value to a dart map
  static Map<String, List<AdvancedAuctionItemsSubmitDeleteRecord>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvancedAuctionItemsSubmitDeleteRecord>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvancedAuctionItemsSubmitDeleteRecord.listFromJson(entry.value, growable: growable,);
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

