//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocalInventoryOperationResult {
  /// Returns a new [LocalInventoryOperationResult] instance.
  LocalInventoryOperationResult({
    this.errors = const [],
    required this.itemId,
    required this.status,
    required this.storeCode,
    required this.supplementalType,
    this.warnings = const [],
  });

  /// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  List<SupplementalItemValidationEvent> errors;

  /// Catalog item id in the merchant namespace
  String itemId;

  /// Status of the item processing record
  SupplementalItemProcessingStatus status;

  /// Store code for the local inventory item
  String storeCode;

  LocalInventoryOperationResultSupplementalTypeEnum supplementalType;

  /// Array with the validation warnings for the item processing record
  List<SupplementalItemValidationEvent> warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocalInventoryOperationResult &&
    _deepEquality.equals(other.errors, errors) &&
    other.itemId == itemId &&
    other.status == status &&
    other.storeCode == storeCode &&
    other.supplementalType == supplementalType &&
    _deepEquality.equals(other.warnings, warnings);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errors.hashCode) +
    (itemId.hashCode) +
    (status.hashCode) +
    (storeCode.hashCode) +
    (supplementalType.hashCode) +
    (warnings.hashCode);

  @override
  String toString() => 'LocalInventoryOperationResult[errors=$errors, itemId=$itemId, status=$status, storeCode=$storeCode, supplementalType=$supplementalType, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'errors'] = this.errors;
      json[r'item_id'] = this.itemId;
      json[r'status'] = this.status;
      json[r'store_code'] = this.storeCode;
      json[r'supplemental_type'] = this.supplementalType;
      json[r'warnings'] = this.warnings;
    return json;
  }

  /// Returns a new [LocalInventoryOperationResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocalInventoryOperationResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'item_id'), 'Required key "LocalInventoryOperationResult[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "LocalInventoryOperationResult[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'status'), 'Required key "LocalInventoryOperationResult[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "LocalInventoryOperationResult[status]" has a null value in JSON.');
        assert(json.containsKey(r'store_code'), 'Required key "LocalInventoryOperationResult[store_code]" is missing from JSON.');
        assert(json[r'store_code'] != null, 'Required key "LocalInventoryOperationResult[store_code]" has a null value in JSON.');
        assert(json.containsKey(r'supplemental_type'), 'Required key "LocalInventoryOperationResult[supplemental_type]" is missing from JSON.');
        assert(json[r'supplemental_type'] != null, 'Required key "LocalInventoryOperationResult[supplemental_type]" has a null value in JSON.');
        return true;
      }());

      return LocalInventoryOperationResult(
        errors: SupplementalItemValidationEvent.listFromJson(json[r'errors']),
        itemId: mapValueOfType<String>(json, r'item_id')!,
        status: SupplementalItemProcessingStatus.fromJson(json[r'status'])!,
        storeCode: mapValueOfType<String>(json, r'store_code')!,
        supplementalType: LocalInventoryOperationResultSupplementalTypeEnum.fromJson(json[r'supplemental_type'])!,
        warnings: SupplementalItemValidationEvent.listFromJson(json[r'warnings']),
      );
    }
    return null;
  }

  static List<LocalInventoryOperationResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryOperationResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryOperationResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocalInventoryOperationResult> mapFromJson(dynamic json) {
    final map = <String, LocalInventoryOperationResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocalInventoryOperationResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocalInventoryOperationResult-objects as value to a dart map
  static Map<String, List<LocalInventoryOperationResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocalInventoryOperationResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocalInventoryOperationResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'item_id',
    'status',
    'store_code',
    'supplemental_type',
  };
}


enum LocalInventoryOperationResultSupplementalTypeEnum {
  LOCAL_INVENTORY._(r'LOCAL_INVENTORY'),
  ;

  /// Instantiate a new enum with the provided value.
  const LocalInventoryOperationResultSupplementalTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [LocalInventoryOperationResultSupplementalTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static LocalInventoryOperationResultSupplementalTypeEnum? fromJson(dynamic value) => LocalInventoryOperationResultSupplementalTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [LocalInventoryOperationResultSupplementalTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<LocalInventoryOperationResultSupplementalTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryOperationResultSupplementalTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryOperationResultSupplementalTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LocalInventoryOperationResultSupplementalTypeEnum] to String,
/// and [decode] dynamic data back to [LocalInventoryOperationResultSupplementalTypeEnum].
class LocalInventoryOperationResultSupplementalTypeEnumTypeTransformer {
  factory LocalInventoryOperationResultSupplementalTypeEnumTypeTransformer() => _instance ??= const LocalInventoryOperationResultSupplementalTypeEnumTypeTransformer._();

  const LocalInventoryOperationResultSupplementalTypeEnumTypeTransformer._();

  String encode(LocalInventoryOperationResultSupplementalTypeEnum data) => data._value;

  /// Returns the instance of [LocalInventoryOperationResultSupplementalTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LocalInventoryOperationResultSupplementalTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is LocalInventoryOperationResultSupplementalTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'LOCAL_INVENTORY': return LocalInventoryOperationResultSupplementalTypeEnum.LOCAL_INVENTORY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static LocalInventoryOperationResultSupplementalTypeEnumTypeTransformer? _instance;
}


