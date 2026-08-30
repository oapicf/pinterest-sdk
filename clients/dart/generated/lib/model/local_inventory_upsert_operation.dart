//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocalInventoryUpsertOperation {
  /// Returns a new [LocalInventoryUpsertOperation] instance.
  LocalInventoryUpsertOperation({
    required this.attributes,
    required this.itemId,
    required this.operation,
    required this.storeCode,
  });

  RetailLocalInventoryItemAttributes attributes;

  /// Catalog item id in the merchant namespace
  String itemId;

  LocalInventoryUpsertOperationOperationEnum operation;

  /// Store code for the local inventory item
  String storeCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocalInventoryUpsertOperation &&
    other.attributes == attributes &&
    other.itemId == itemId &&
    other.operation == operation &&
    other.storeCode == storeCode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes.hashCode) +
    (itemId.hashCode) +
    (operation.hashCode) +
    (storeCode.hashCode);

  @override
  String toString() => 'LocalInventoryUpsertOperation[attributes=$attributes, itemId=$itemId, operation=$operation, storeCode=$storeCode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'item_id'] = this.itemId;
      json[r'operation'] = this.operation;
      json[r'store_code'] = this.storeCode;
    return json;
  }

  /// Returns a new [LocalInventoryUpsertOperation] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocalInventoryUpsertOperation? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'attributes'), 'Required key "LocalInventoryUpsertOperation[attributes]" is missing from JSON.');
        assert(json[r'attributes'] != null, 'Required key "LocalInventoryUpsertOperation[attributes]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "LocalInventoryUpsertOperation[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "LocalInventoryUpsertOperation[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "LocalInventoryUpsertOperation[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "LocalInventoryUpsertOperation[operation]" has a null value in JSON.');
        assert(json.containsKey(r'store_code'), 'Required key "LocalInventoryUpsertOperation[store_code]" is missing from JSON.');
        assert(json[r'store_code'] != null, 'Required key "LocalInventoryUpsertOperation[store_code]" has a null value in JSON.');
        return true;
      }());

      return LocalInventoryUpsertOperation(
        attributes: RetailLocalInventoryItemAttributes.fromJson(json[r'attributes'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        operation: LocalInventoryUpsertOperationOperationEnum.fromJson(json[r'operation'])!,
        storeCode: mapValueOfType<String>(json, r'store_code')!,
      );
    }
    return null;
  }

  static List<LocalInventoryUpsertOperation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryUpsertOperation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryUpsertOperation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocalInventoryUpsertOperation> mapFromJson(dynamic json) {
    final map = <String, LocalInventoryUpsertOperation>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocalInventoryUpsertOperation.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocalInventoryUpsertOperation-objects as value to a dart map
  static Map<String, List<LocalInventoryUpsertOperation>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocalInventoryUpsertOperation>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocalInventoryUpsertOperation.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'attributes',
    'item_id',
    'operation',
    'store_code',
  };
}


enum LocalInventoryUpsertOperationOperationEnum {
  UPSERT._(r'UPSERT'),
  ;

  /// Instantiate a new enum with the provided value.
  const LocalInventoryUpsertOperationOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [LocalInventoryUpsertOperationOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static LocalInventoryUpsertOperationOperationEnum? fromJson(dynamic value) => LocalInventoryUpsertOperationOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [LocalInventoryUpsertOperationOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<LocalInventoryUpsertOperationOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryUpsertOperationOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryUpsertOperationOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LocalInventoryUpsertOperationOperationEnum] to String,
/// and [decode] dynamic data back to [LocalInventoryUpsertOperationOperationEnum].
class LocalInventoryUpsertOperationOperationEnumTypeTransformer {
  factory LocalInventoryUpsertOperationOperationEnumTypeTransformer() => _instance ??= const LocalInventoryUpsertOperationOperationEnumTypeTransformer._();

  const LocalInventoryUpsertOperationOperationEnumTypeTransformer._();

  String encode(LocalInventoryUpsertOperationOperationEnum data) => data._value;

  /// Returns the instance of [LocalInventoryUpsertOperationOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LocalInventoryUpsertOperationOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is LocalInventoryUpsertOperationOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UPSERT': return LocalInventoryUpsertOperationOperationEnum.UPSERT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static LocalInventoryUpsertOperationOperationEnumTypeTransformer? _instance;
}


