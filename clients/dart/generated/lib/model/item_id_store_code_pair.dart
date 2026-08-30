//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemIdStoreCodePair {
  /// Returns a new [ItemIdStoreCodePair] instance.
  ItemIdStoreCodePair({
    required this.itemId,
    required this.storeCode,
  });

  /// Catalog item id in the merchant namespace
  String itemId;

  /// Store code for the local inventory item
  String storeCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemIdStoreCodePair &&
    other.itemId == itemId &&
    other.storeCode == storeCode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (itemId.hashCode) +
    (storeCode.hashCode);

  @override
  String toString() => 'ItemIdStoreCodePair[itemId=$itemId, storeCode=$storeCode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'item_id'] = this.itemId;
      json[r'store_code'] = this.storeCode;
    return json;
  }

  /// Returns a new [ItemIdStoreCodePair] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemIdStoreCodePair? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'item_id'), 'Required key "ItemIdStoreCodePair[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "ItemIdStoreCodePair[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'store_code'), 'Required key "ItemIdStoreCodePair[store_code]" is missing from JSON.');
        assert(json[r'store_code'] != null, 'Required key "ItemIdStoreCodePair[store_code]" has a null value in JSON.');
        return true;
      }());

      return ItemIdStoreCodePair(
        itemId: mapValueOfType<String>(json, r'item_id')!,
        storeCode: mapValueOfType<String>(json, r'store_code')!,
      );
    }
    return null;
  }

  static List<ItemIdStoreCodePair> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemIdStoreCodePair>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemIdStoreCodePair.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemIdStoreCodePair> mapFromJson(dynamic json) {
    final map = <String, ItemIdStoreCodePair>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemIdStoreCodePair.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemIdStoreCodePair-objects as value to a dart map
  static Map<String, List<ItemIdStoreCodePair>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemIdStoreCodePair>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemIdStoreCodePair.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'item_id',
    'store_code',
  };
}

