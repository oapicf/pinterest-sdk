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
    required this.bidOptions,
    required this.country,
    this.errors = const [],
    required this.itemId,
    required this.language,
    required this.operation,
    this.updateMask = const [],
  });

  AdvancedAuctionBidOptions bidOptions;

  Country country;

  /// Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  List<AdvancedAuctionOperationError> errors;

  /// The catalog retail item id in the merchant namespace
  String itemId;

  Language language;

  AdvancedAuctionItemsSubmitUpsertRecordOperationEnum operation;

  /// The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  List<UpdateMaskBidOptionField>? updateMask;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionItemsSubmitUpsertRecord &&
    other.bidOptions == bidOptions &&
    other.country == country &&
    _deepEquality.equals(other.errors, errors) &&
    other.itemId == itemId &&
    other.language == language &&
    other.operation == operation &&
    _deepEquality.equals(other.updateMask, updateMask);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bidOptions.hashCode) +
    (country.hashCode) +
    (errors.hashCode) +
    (itemId.hashCode) +
    (language.hashCode) +
    (operation.hashCode) +
    (updateMask == null ? 0 : updateMask!.hashCode);

  @override
  String toString() => 'AdvancedAuctionItemsSubmitUpsertRecord[bidOptions=$bidOptions, country=$country, errors=$errors, itemId=$itemId, language=$language, operation=$operation, updateMask=$updateMask]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'bid_options'] = this.bidOptions;
      json[r'country'] = this.country;
      json[r'errors'] = this.errors;
      json[r'item_id'] = this.itemId;
      json[r'language'] = this.language;
      json[r'operation'] = this.operation;
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
        assert(json.containsKey(r'bid_options'), 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[bid_options]" is missing from JSON.');
        assert(json[r'bid_options'] != null, 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[bid_options]" has a null value in JSON.');
        assert(json.containsKey(r'country'), 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[country]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[language]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[operation]" has a null value in JSON.');
        assert(json.containsKey(r'update_mask'), 'Required key "AdvancedAuctionItemsSubmitUpsertRecord[update_mask]" is missing from JSON.');
        return true;
      }());

      return AdvancedAuctionItemsSubmitUpsertRecord(
        bidOptions: AdvancedAuctionBidOptions.fromJson(json[r'bid_options'])!,
        country: Country.fromJson(json[r'country'])!,
        errors: AdvancedAuctionOperationError.listFromJson(json[r'errors']),
        itemId: mapValueOfType<String>(json, r'item_id')!,
        language: Language.fromJson(json[r'language'])!,
        operation: AdvancedAuctionItemsSubmitUpsertRecordOperationEnum.fromJson(json[r'operation'])!,
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
    'bid_options',
    'country',
    'item_id',
    'language',
    'operation',
    'update_mask',
  };
}


enum AdvancedAuctionItemsSubmitUpsertRecordOperationEnum {
  UPSERT._(r'UPSERT'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdvancedAuctionItemsSubmitUpsertRecordOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdvancedAuctionItemsSubmitUpsertRecordOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdvancedAuctionItemsSubmitUpsertRecordOperationEnum? fromJson(dynamic value) => AdvancedAuctionItemsSubmitUpsertRecordOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdvancedAuctionItemsSubmitUpsertRecordOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdvancedAuctionItemsSubmitUpsertRecordOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionItemsSubmitUpsertRecordOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionItemsSubmitUpsertRecordOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdvancedAuctionItemsSubmitUpsertRecordOperationEnum] to String,
/// and [decode] dynamic data back to [AdvancedAuctionItemsSubmitUpsertRecordOperationEnum].
class AdvancedAuctionItemsSubmitUpsertRecordOperationEnumTypeTransformer {
  factory AdvancedAuctionItemsSubmitUpsertRecordOperationEnumTypeTransformer() => _instance ??= const AdvancedAuctionItemsSubmitUpsertRecordOperationEnumTypeTransformer._();

  const AdvancedAuctionItemsSubmitUpsertRecordOperationEnumTypeTransformer._();

  String encode(AdvancedAuctionItemsSubmitUpsertRecordOperationEnum data) => data._value;

  /// Returns the instance of [AdvancedAuctionItemsSubmitUpsertRecordOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdvancedAuctionItemsSubmitUpsertRecordOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdvancedAuctionItemsSubmitUpsertRecordOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UPSERT': return AdvancedAuctionItemsSubmitUpsertRecordOperationEnum.UPSERT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdvancedAuctionItemsSubmitUpsertRecordOperationEnumTypeTransformer? _instance;
}


