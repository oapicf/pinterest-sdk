//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsDeleteRetailItem {
  /// Returns a new [CatalogsDeleteRetailItem] instance.
  CatalogsDeleteRetailItem({
    required this.itemId,
    this.lastUpdatedTime,
    required this.operation,
  });

  /// The catalog item id in the merchant namespace
  String itemId;

  /// The millisecond timestamp when the item was lastly modified by the merchant.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lastUpdatedTime;

  CatalogsDeleteRetailItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsDeleteRetailItem &&
    other.itemId == itemId &&
    other.lastUpdatedTime == lastUpdatedTime &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (itemId.hashCode) +
    (lastUpdatedTime == null ? 0 : lastUpdatedTime!.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'CatalogsDeleteRetailItem[itemId=$itemId, lastUpdatedTime=$lastUpdatedTime, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'item_id'] = this.itemId;
    if (this.lastUpdatedTime != null) {
      json[r'last_updated_time'] = this.lastUpdatedTime;
    } else {
      json[r'last_updated_time'] = null;
    }
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsDeleteRetailItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsDeleteRetailItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'item_id'), 'Required key "CatalogsDeleteRetailItem[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "CatalogsDeleteRetailItem[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsDeleteRetailItem[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsDeleteRetailItem[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsDeleteRetailItem(
        itemId: mapValueOfType<String>(json, r'item_id')!,
        lastUpdatedTime: mapValueOfType<int>(json, r'last_updated_time'),
        operation: CatalogsDeleteRetailItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsDeleteRetailItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsDeleteRetailItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsDeleteRetailItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsDeleteRetailItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsDeleteRetailItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsDeleteRetailItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsDeleteRetailItem-objects as value to a dart map
  static Map<String, List<CatalogsDeleteRetailItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsDeleteRetailItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsDeleteRetailItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'item_id',
    'operation',
  };
}


enum CatalogsDeleteRetailItemOperationEnum {
  DELETE._(r'DELETE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsDeleteRetailItemOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsDeleteRetailItemOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsDeleteRetailItemOperationEnum? fromJson(dynamic value) => CatalogsDeleteRetailItemOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsDeleteRetailItemOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsDeleteRetailItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsDeleteRetailItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsDeleteRetailItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsDeleteRetailItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsDeleteRetailItemOperationEnum].
class CatalogsDeleteRetailItemOperationEnumTypeTransformer {
  factory CatalogsDeleteRetailItemOperationEnumTypeTransformer() => _instance ??= const CatalogsDeleteRetailItemOperationEnumTypeTransformer._();

  const CatalogsDeleteRetailItemOperationEnumTypeTransformer._();

  String encode(CatalogsDeleteRetailItemOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsDeleteRetailItemOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsDeleteRetailItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsDeleteRetailItemOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DELETE': return CatalogsDeleteRetailItemOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsDeleteRetailItemOperationEnumTypeTransformer? _instance;
}


