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
    this.errors = const [],
    required this.itemId,
    required this.language,
    required this.operation,
  });

  Country country;

  /// Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  List<AdvancedAuctionOperationError> errors;

  /// The catalog retail item id in the merchant namespace
  String itemId;

  Language language;

  AdvancedAuctionItemsSubmitDeleteRecordOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionItemsSubmitDeleteRecord &&
    other.country == country &&
    _deepEquality.equals(other.errors, errors) &&
    other.itemId == itemId &&
    other.language == language &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country.hashCode) +
    (errors.hashCode) +
    (itemId.hashCode) +
    (language.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'AdvancedAuctionItemsSubmitDeleteRecord[country=$country, errors=$errors, itemId=$itemId, language=$language, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'errors'] = this.errors;
      json[r'item_id'] = this.itemId;
      json[r'language'] = this.language;
      json[r'operation'] = this.operation;
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
        assert(json.containsKey(r'country'), 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[country]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[language]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "AdvancedAuctionItemsSubmitDeleteRecord[operation]" has a null value in JSON.');
        return true;
      }());

      return AdvancedAuctionItemsSubmitDeleteRecord(
        country: Country.fromJson(json[r'country'])!,
        errors: AdvancedAuctionOperationError.listFromJson(json[r'errors']),
        itemId: mapValueOfType<String>(json, r'item_id')!,
        language: Language.fromJson(json[r'language'])!,
        operation: AdvancedAuctionItemsSubmitDeleteRecordOperationEnum.fromJson(json[r'operation'])!,
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
    'operation',
  };
}


enum AdvancedAuctionItemsSubmitDeleteRecordOperationEnum {
  DELETE._(r'DELETE'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdvancedAuctionItemsSubmitDeleteRecordOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdvancedAuctionItemsSubmitDeleteRecordOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdvancedAuctionItemsSubmitDeleteRecordOperationEnum? fromJson(dynamic value) => AdvancedAuctionItemsSubmitDeleteRecordOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdvancedAuctionItemsSubmitDeleteRecordOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdvancedAuctionItemsSubmitDeleteRecordOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionItemsSubmitDeleteRecordOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionItemsSubmitDeleteRecordOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdvancedAuctionItemsSubmitDeleteRecordOperationEnum] to String,
/// and [decode] dynamic data back to [AdvancedAuctionItemsSubmitDeleteRecordOperationEnum].
class AdvancedAuctionItemsSubmitDeleteRecordOperationEnumTypeTransformer {
  factory AdvancedAuctionItemsSubmitDeleteRecordOperationEnumTypeTransformer() => _instance ??= const AdvancedAuctionItemsSubmitDeleteRecordOperationEnumTypeTransformer._();

  const AdvancedAuctionItemsSubmitDeleteRecordOperationEnumTypeTransformer._();

  String encode(AdvancedAuctionItemsSubmitDeleteRecordOperationEnum data) => data._value;

  /// Returns the instance of [AdvancedAuctionItemsSubmitDeleteRecordOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdvancedAuctionItemsSubmitDeleteRecordOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdvancedAuctionItemsSubmitDeleteRecordOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DELETE': return AdvancedAuctionItemsSubmitDeleteRecordOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdvancedAuctionItemsSubmitDeleteRecordOperationEnumTypeTransformer? _instance;
}


