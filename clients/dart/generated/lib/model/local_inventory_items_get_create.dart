//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocalInventoryItemsGetCreate {
  /// Returns a new [LocalInventoryItemsGetCreate] instance.
  LocalInventoryItemsGetCreate({
    this.itemFilters = const [],
  });

  /// Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
  List<ItemIdStoreCodePair> itemFilters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocalInventoryItemsGetCreate &&
    _deepEquality.equals(other.itemFilters, itemFilters);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (itemFilters.hashCode);

  @override
  String toString() => 'LocalInventoryItemsGetCreate[itemFilters=$itemFilters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'item_filters'] = this.itemFilters;
    return json;
  }

  /// Returns a new [LocalInventoryItemsGetCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocalInventoryItemsGetCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'item_filters'), 'Required key "LocalInventoryItemsGetCreate[item_filters]" is missing from JSON.');
        assert(json[r'item_filters'] != null, 'Required key "LocalInventoryItemsGetCreate[item_filters]" has a null value in JSON.');
        return true;
      }());

      return LocalInventoryItemsGetCreate(
        itemFilters: ItemIdStoreCodePair.listFromJson(json[r'item_filters']),
      );
    }
    return null;
  }

  static List<LocalInventoryItemsGetCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryItemsGetCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryItemsGetCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocalInventoryItemsGetCreate> mapFromJson(dynamic json) {
    final map = <String, LocalInventoryItemsGetCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocalInventoryItemsGetCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocalInventoryItemsGetCreate-objects as value to a dart map
  static Map<String, List<LocalInventoryItemsGetCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocalInventoryItemsGetCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocalInventoryItemsGetCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'item_filters',
  };
}

