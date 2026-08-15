//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsUpsertRetailItem {
  /// Returns a new [CatalogsUpsertRetailItem] instance.
  CatalogsUpsertRetailItem({
    required this.attributes,
    required this.itemId,
    required this.operation,
  });

  ItemAttributesRequest attributes;

  /// The catalog item id in the merchant namespace
  String itemId;

  CatalogsUpsertRetailItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsUpsertRetailItem &&
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
  String toString() => 'CatalogsUpsertRetailItem[attributes=$attributes, itemId=$itemId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'item_id'] = this.itemId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsUpsertRetailItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsUpsertRetailItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsUpsertRetailItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsUpsertRetailItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsUpsertRetailItem(
        attributes: ItemAttributesRequest.fromJson(json[r'attributes'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        operation: CatalogsUpsertRetailItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsUpsertRetailItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpsertRetailItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpsertRetailItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsUpsertRetailItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsUpsertRetailItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsUpsertRetailItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsUpsertRetailItem-objects as value to a dart map
  static Map<String, List<CatalogsUpsertRetailItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsUpsertRetailItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsUpsertRetailItem.listFromJson(entry.value, growable: growable,);
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


class CatalogsUpsertRetailItemOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsUpsertRetailItemOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UPSERT = CatalogsUpsertRetailItemOperationEnum._(r'UPSERT');

  /// List of all possible values in this [enum][CatalogsUpsertRetailItemOperationEnum].
  static const values = <CatalogsUpsertRetailItemOperationEnum>[
    UPSERT,
  ];

  static CatalogsUpsertRetailItemOperationEnum? fromJson(dynamic value) => CatalogsUpsertRetailItemOperationEnumTypeTransformer().decode(value);

  static List<CatalogsUpsertRetailItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpsertRetailItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpsertRetailItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsUpsertRetailItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsUpsertRetailItemOperationEnum].
class CatalogsUpsertRetailItemOperationEnumTypeTransformer {
  factory CatalogsUpsertRetailItemOperationEnumTypeTransformer() => _instance ??= const CatalogsUpsertRetailItemOperationEnumTypeTransformer._();

  const CatalogsUpsertRetailItemOperationEnumTypeTransformer._();

  String encode(CatalogsUpsertRetailItemOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsUpsertRetailItemOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsUpsertRetailItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UPSERT': return CatalogsUpsertRetailItemOperationEnum.UPSERT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsUpsertRetailItemOperationEnumTypeTransformer] instance.
  static CatalogsUpsertRetailItemOperationEnumTypeTransformer? _instance;
}


