//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvancedAuctionItemsSubmitUpsertRecord {
  /// Returns a new [AdvancedAuctionItemsSubmitUpsertRecord] instance.
  AdvancedAuctionItemsSubmitUpsertRecord({
    required this.country,
    required this.itemId,
    required this.language,
    required this.bidOptions,
    this.errors = const [],
    this.updateMask = const [],
  });

  Country country;

  /// The catalog retail item id in the merchant namespace
  String itemId;

  Language language;

  AdvancedAuctionBidOptions bidOptions;

  /// Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  List<AdvancedAuctionOperationError> errors;

  /// The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  List<UpdateMaskBidOptionField>? updateMask;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionItemsSubmitUpsertRecord &&
    other.country == country &&
    other.itemId == itemId &&
    other.language == language &&
    other.bidOptions == bidOptions &&
    _deepEquality.equals(other.errors, errors) &&
    _deepEquality.equals(other.updateMask, updateMask);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country.hashCode) +
    (itemId.hashCode) +
    (language.hashCode) +
    (bidOptions.hashCode) +
    (errors.hashCode) +
    (updateMask == null ? 0 : updateMask!.hashCode);

  @override
  String toString() => 'AdvancedAuctionItemsSubmitUpsertRecord[country=$country, itemId=$itemId, language=$language, bidOptions=$bidOptions, errors=$errors, updateMask=$updateMask]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'item_id'] = this.itemId;
      json[r'language'] = this.language;
      json[r'bid_options'] = this.bidOptions;
      json[r'errors'] = this.errors;
    if (this.updateMask != null) {
      json[r'update_mask'] = this.updateMask;
    } else {
      json[r'update_mask'] = null;
    }
    return json;
  }

  /// Returns a new [AdvancedAuctionItemsSubmitUpsertRecord] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvancedAuctionItemsSubmitUpsertRecord? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdvancedAuctionItemsSubmitUpsertRecord(
        country: Country.fromJson(json[r'country'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        language: Language.fromJson(json[r'language'])!,
        bidOptions: AdvancedAuctionBidOptions.fromJson(json[r'bid_options'])!,
        errors: AdvancedAuctionOperationError.listFromJson(json[r'errors']),
        updateMask: UpdateMaskBidOptionField.listFromJson(json[r'update_mask']),
      );
    }
    return null;
  }

  static List<AdvancedAuctionItemsSubmitUpsertRecord> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionItemsSubmitUpsertRecord>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionItemsSubmitUpsertRecord.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvancedAuctionItemsSubmitUpsertRecord> mapFromJson(dynamic json) {
    final map = <String, AdvancedAuctionItemsSubmitUpsertRecord>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvancedAuctionItemsSubmitUpsertRecord.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvancedAuctionItemsSubmitUpsertRecord-objects as value to a dart map
  static Map<String, List<AdvancedAuctionItemsSubmitUpsertRecord>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvancedAuctionItemsSubmitUpsertRecord>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvancedAuctionItemsSubmitUpsertRecord.listFromJson(entry.value, growable: growable,);
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
    'update_mask',
  };
}

