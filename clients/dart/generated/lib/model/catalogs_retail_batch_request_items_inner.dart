//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailBatchRequestItemsInner {
  /// Returns a new [CatalogsRetailBatchRequestItemsInner] instance.
  CatalogsRetailBatchRequestItemsInner({
    required this.attributes,
    required this.itemId,
    required this.operation,
    this.updateMask = const [],
    this.lastUpdatedTime,
  });

  ItemAttributesRequest attributes;

  /// The catalog item id in the merchant namespace
  String itemId;

  CatalogsRetailBatchRequestItemsInnerOperationEnum operation;

  /// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  List<UpdateMaskFieldType>? updateMask;

  /// The millisecond timestamp when the item was lastly modified by the merchant.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lastUpdatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailBatchRequestItemsInner &&
    other.attributes == attributes &&
    other.itemId == itemId &&
    other.operation == operation &&
    _deepEquality.equals(other.updateMask, updateMask) &&
    other.lastUpdatedTime == lastUpdatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes.hashCode) +
    (itemId.hashCode) +
    (operation.hashCode) +
    (updateMask == null ? 0 : updateMask!.hashCode) +
    (lastUpdatedTime == null ? 0 : lastUpdatedTime!.hashCode);

  @override
  String toString() => 'CatalogsRetailBatchRequestItemsInner[attributes=$attributes, itemId=$itemId, operation=$operation, updateMask=$updateMask, lastUpdatedTime=$lastUpdatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'item_id'] = this.itemId;
      json[r'operation'] = this.operation;
    if (this.updateMask != null) {
      json[r'update_mask'] = this.updateMask;
    } else {
      json[r'update_mask'] = null;
    }
    if (this.lastUpdatedTime != null) {
      json[r'last_updated_time'] = this.lastUpdatedTime;
    } else {
      json[r'last_updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsRetailBatchRequestItemsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailBatchRequestItemsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsRetailBatchRequestItemsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsRetailBatchRequestItemsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsRetailBatchRequestItemsInner(
        attributes: ItemAttributesRequest.fromJson(json[r'attributes'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        operation: CatalogsRetailBatchRequestItemsInnerOperationEnum.fromJson(json[r'operation'])!,
        updateMask: UpdateMaskFieldType.listFromJson(json[r'update_mask']),
        lastUpdatedTime: mapValueOfType<int>(json, r'last_updated_time'),
      );
    }
    return null;
  }

  static List<CatalogsRetailBatchRequestItemsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailBatchRequestItemsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailBatchRequestItemsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailBatchRequestItemsInner> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailBatchRequestItemsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailBatchRequestItemsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailBatchRequestItemsInner-objects as value to a dart map
  static Map<String, List<CatalogsRetailBatchRequestItemsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailBatchRequestItemsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailBatchRequestItemsInner.listFromJson(entry.value, growable: growable,);
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


class CatalogsRetailBatchRequestItemsInnerOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsRetailBatchRequestItemsInnerOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DELETE = CatalogsRetailBatchRequestItemsInnerOperationEnum._(r'DELETE');

  /// List of all possible values in this [enum][CatalogsRetailBatchRequestItemsInnerOperationEnum].
  static const values = <CatalogsRetailBatchRequestItemsInnerOperationEnum>[
    DELETE,
  ];

  static CatalogsRetailBatchRequestItemsInnerOperationEnum? fromJson(dynamic value) => CatalogsRetailBatchRequestItemsInnerOperationEnumTypeTransformer().decode(value);

  static List<CatalogsRetailBatchRequestItemsInnerOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailBatchRequestItemsInnerOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailBatchRequestItemsInnerOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailBatchRequestItemsInnerOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailBatchRequestItemsInnerOperationEnum].
class CatalogsRetailBatchRequestItemsInnerOperationEnumTypeTransformer {
  factory CatalogsRetailBatchRequestItemsInnerOperationEnumTypeTransformer() => _instance ??= const CatalogsRetailBatchRequestItemsInnerOperationEnumTypeTransformer._();

  const CatalogsRetailBatchRequestItemsInnerOperationEnumTypeTransformer._();

  String encode(CatalogsRetailBatchRequestItemsInnerOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsRetailBatchRequestItemsInnerOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailBatchRequestItemsInnerOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DELETE': return CatalogsRetailBatchRequestItemsInnerOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsRetailBatchRequestItemsInnerOperationEnumTypeTransformer] instance.
  static CatalogsRetailBatchRequestItemsInnerOperationEnumTypeTransformer? _instance;
}


