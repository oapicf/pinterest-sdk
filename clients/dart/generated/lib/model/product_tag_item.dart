//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductTagItem {
  /// Returns a new [ProductTagItem] instance.
  ProductTagItem({
    required this.pinId,
  });

  /// Pin ID of the product pin to tag onto the hero pin.
  String pinId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductTagItem &&
    other.pinId == pinId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pinId.hashCode);

  @override
  String toString() => 'ProductTagItem[pinId=$pinId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'pin_id'] = this.pinId;
    return json;
  }

  /// Returns a new [ProductTagItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductTagItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'pin_id'), 'Required key "ProductTagItem[pin_id]" is missing from JSON.');
        assert(json[r'pin_id'] != null, 'Required key "ProductTagItem[pin_id]" has a null value in JSON.');
        return true;
      }());

      return ProductTagItem(
        pinId: mapValueOfType<String>(json, r'pin_id')!,
      );
    }
    return null;
  }

  static List<ProductTagItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductTagItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductTagItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductTagItem> mapFromJson(dynamic json) {
    final map = <String, ProductTagItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductTagItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductTagItem-objects as value to a dart map
  static Map<String, List<ProductTagItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductTagItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductTagItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'pin_id',
  };
}

