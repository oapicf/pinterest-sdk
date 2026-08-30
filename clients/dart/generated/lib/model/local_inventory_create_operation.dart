//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocalInventoryCreateOperation {
  /// Returns a new [LocalInventoryCreateOperation] instance.
  LocalInventoryCreateOperation({
    required this.attributes,
    required this.itemId,
    required this.operation,
    required this.storeCode,
  });

  RetailLocalInventoryItemAttributes attributes;

  /// Catalog item id in the merchant namespace
  String itemId;

  LocalInventoryCreateOperationOperationEnum operation;

  /// Store code for the local inventory item
  String storeCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocalInventoryCreateOperation &&
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
  String toString() => 'LocalInventoryCreateOperation[attributes=$attributes, itemId=$itemId, operation=$operation, storeCode=$storeCode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'item_id'] = this.itemId;
      json[r'operation'] = this.operation;
      json[r'store_code'] = this.storeCode;
    return json;
  }

  /// Returns a new [LocalInventoryCreateOperation] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocalInventoryCreateOperation? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'attributes'), 'Required key "LocalInventoryCreateOperation[attributes]" is missing from JSON.');
        assert(json[r'attributes'] != null, 'Required key "LocalInventoryCreateOperation[attributes]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "LocalInventoryCreateOperation[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "LocalInventoryCreateOperation[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "LocalInventoryCreateOperation[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "LocalInventoryCreateOperation[operation]" has a null value in JSON.');
        assert(json.containsKey(r'store_code'), 'Required key "LocalInventoryCreateOperation[store_code]" is missing from JSON.');
        assert(json[r'store_code'] != null, 'Required key "LocalInventoryCreateOperation[store_code]" has a null value in JSON.');
        return true;
      }());

      return LocalInventoryCreateOperation(
        attributes: RetailLocalInventoryItemAttributes.fromJson(json[r'attributes'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        operation: LocalInventoryCreateOperationOperationEnum.fromJson(json[r'operation'])!,
        storeCode: mapValueOfType<String>(json, r'store_code')!,
      );
    }
    return null;
  }

  static List<LocalInventoryCreateOperation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryCreateOperation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryCreateOperation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocalInventoryCreateOperation> mapFromJson(dynamic json) {
    final map = <String, LocalInventoryCreateOperation>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocalInventoryCreateOperation.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocalInventoryCreateOperation-objects as value to a dart map
  static Map<String, List<LocalInventoryCreateOperation>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocalInventoryCreateOperation>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocalInventoryCreateOperation.listFromJson(entry.value, growable: growable,);
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


enum LocalInventoryCreateOperationOperationEnum {
  CREATE._(r'CREATE'),
  ;

  /// Instantiate a new enum with the provided value.
  const LocalInventoryCreateOperationOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [LocalInventoryCreateOperationOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static LocalInventoryCreateOperationOperationEnum? fromJson(dynamic value) => LocalInventoryCreateOperationOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [LocalInventoryCreateOperationOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<LocalInventoryCreateOperationOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryCreateOperationOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryCreateOperationOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LocalInventoryCreateOperationOperationEnum] to String,
/// and [decode] dynamic data back to [LocalInventoryCreateOperationOperationEnum].
class LocalInventoryCreateOperationOperationEnumTypeTransformer {
  factory LocalInventoryCreateOperationOperationEnumTypeTransformer() => _instance ??= const LocalInventoryCreateOperationOperationEnumTypeTransformer._();

  const LocalInventoryCreateOperationOperationEnumTypeTransformer._();

  String encode(LocalInventoryCreateOperationOperationEnum data) => data._value;

  /// Returns the instance of [LocalInventoryCreateOperationOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LocalInventoryCreateOperationOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is LocalInventoryCreateOperationOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATE': return LocalInventoryCreateOperationOperationEnum.CREATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static LocalInventoryCreateOperationOperationEnumTypeTransformer? _instance;
}


