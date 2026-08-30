//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailBatchRequestItemsItems {
  /// Returns a new [CatalogsRetailBatchRequestItemsItems] instance.
  CatalogsRetailBatchRequestItemsItems({
    required this.attributes,
    required this.itemId,
    required this.operation,
    this.updateMask = const [],
    this.lastUpdatedTime,
  });

  ItemAttributesRequest attributes;

  /// The catalog item id in the merchant namespace
  String itemId;

  CatalogsRetailBatchRequestItemsItemsOperationEnum operation;

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
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailBatchRequestItemsItems &&
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
  String toString() => 'CatalogsRetailBatchRequestItemsItems[attributes=$attributes, itemId=$itemId, operation=$operation, updateMask=$updateMask, lastUpdatedTime=$lastUpdatedTime]';

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

  /// Returns a new [CatalogsRetailBatchRequestItemsItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailBatchRequestItemsItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'attributes'), 'Required key "CatalogsRetailBatchRequestItemsItems[attributes]" is missing from JSON.');
        assert(json[r'attributes'] != null, 'Required key "CatalogsRetailBatchRequestItemsItems[attributes]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "CatalogsRetailBatchRequestItemsItems[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "CatalogsRetailBatchRequestItemsItems[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsRetailBatchRequestItemsItems[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsRetailBatchRequestItemsItems[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailBatchRequestItemsItems(
        attributes: ItemAttributesRequest.fromJson(json[r'attributes'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        operation: CatalogsRetailBatchRequestItemsItemsOperationEnum.fromJson(json[r'operation'])!,
        updateMask: UpdateMaskFieldType.listFromJson(json[r'update_mask']),
        lastUpdatedTime: mapValueOfType<int>(json, r'last_updated_time'),
      );
    }
    return null;
  }

  static List<CatalogsRetailBatchRequestItemsItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailBatchRequestItemsItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailBatchRequestItemsItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailBatchRequestItemsItems> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailBatchRequestItemsItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailBatchRequestItemsItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailBatchRequestItemsItems-objects as value to a dart map
  static Map<String, List<CatalogsRetailBatchRequestItemsItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailBatchRequestItemsItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailBatchRequestItemsItems.listFromJson(entry.value, growable: growable,);
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


enum CatalogsRetailBatchRequestItemsItemsOperationEnum {
  DELETE._(r'DELETE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailBatchRequestItemsItemsOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailBatchRequestItemsItemsOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailBatchRequestItemsItemsOperationEnum? fromJson(dynamic value) => CatalogsRetailBatchRequestItemsItemsOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailBatchRequestItemsItemsOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailBatchRequestItemsItemsOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailBatchRequestItemsItemsOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailBatchRequestItemsItemsOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailBatchRequestItemsItemsOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailBatchRequestItemsItemsOperationEnum].
class CatalogsRetailBatchRequestItemsItemsOperationEnumTypeTransformer {
  factory CatalogsRetailBatchRequestItemsItemsOperationEnumTypeTransformer() => _instance ??= const CatalogsRetailBatchRequestItemsItemsOperationEnumTypeTransformer._();

  const CatalogsRetailBatchRequestItemsItemsOperationEnumTypeTransformer._();

  String encode(CatalogsRetailBatchRequestItemsItemsOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailBatchRequestItemsItemsOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailBatchRequestItemsItemsOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailBatchRequestItemsItemsOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DELETE': return CatalogsRetailBatchRequestItemsItemsOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailBatchRequestItemsItemsOperationEnumTypeTransformer? _instance;
}


