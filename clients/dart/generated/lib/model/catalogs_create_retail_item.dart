//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreateRetailItem {
  /// Returns a new [CatalogsCreateRetailItem] instance.
  CatalogsCreateRetailItem({
    required this.attributes,
    required this.itemId,
    required this.operation,
  });

  ItemAttributesRequest attributes;

  /// The catalog item id in the merchant namespace
  String itemId;

  CatalogsCreateRetailItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreateRetailItem &&
    other.attributes == attributes &&
    other.itemId == itemId &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes.hashCode) +
    (itemId.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'CatalogsCreateRetailItem[attributes=$attributes, itemId=$itemId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'item_id'] = this.itemId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsCreateRetailItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreateRetailItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'attributes'), 'Required key "CatalogsCreateRetailItem[attributes]" is missing from JSON.');
        assert(json[r'attributes'] != null, 'Required key "CatalogsCreateRetailItem[attributes]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "CatalogsCreateRetailItem[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "CatalogsCreateRetailItem[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsCreateRetailItem[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsCreateRetailItem[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsCreateRetailItem(
        attributes: ItemAttributesRequest.fromJson(json[r'attributes'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        operation: CatalogsCreateRetailItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsCreateRetailItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreateRetailItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreateRetailItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreateRetailItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreateRetailItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreateRetailItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreateRetailItem-objects as value to a dart map
  static Map<String, List<CatalogsCreateRetailItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreateRetailItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreateRetailItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'attributes',
    'item_id',
    'operation',
  };
}


enum CatalogsCreateRetailItemOperationEnum {
  CREATE._(r'CREATE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreateRetailItemOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreateRetailItemOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreateRetailItemOperationEnum? fromJson(dynamic value) => CatalogsCreateRetailItemOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreateRetailItemOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreateRetailItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreateRetailItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreateRetailItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreateRetailItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreateRetailItemOperationEnum].
class CatalogsCreateRetailItemOperationEnumTypeTransformer {
  factory CatalogsCreateRetailItemOperationEnumTypeTransformer() => _instance ??= const CatalogsCreateRetailItemOperationEnumTypeTransformer._();

  const CatalogsCreateRetailItemOperationEnumTypeTransformer._();

  String encode(CatalogsCreateRetailItemOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsCreateRetailItemOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreateRetailItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreateRetailItemOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATE': return CatalogsCreateRetailItemOperationEnum.CREATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreateRetailItemOperationEnumTypeTransformer? _instance;
}


