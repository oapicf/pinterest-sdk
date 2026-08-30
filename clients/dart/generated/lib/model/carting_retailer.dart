//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CartingRetailer {
  /// Returns a new [CartingRetailer] instance.
  CartingRetailer({
    required this.retailerId,
    required this.retailerName,
  });

  /// Unique identifier for the retailer
  String retailerId;

  /// Name of the retailer
  String retailerName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CartingRetailer &&
    other.retailerId == retailerId &&
    other.retailerName == retailerName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (retailerId.hashCode) +
    (retailerName.hashCode);

  @override
  String toString() => 'CartingRetailer[retailerId=$retailerId, retailerName=$retailerName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'retailer_id'] = this.retailerId;
      json[r'retailer_name'] = this.retailerName;
    return json;
  }

  /// Returns a new [CartingRetailer] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CartingRetailer? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'retailer_id'), 'Required key "CartingRetailer[retailer_id]" is missing from JSON.');
        assert(json[r'retailer_id'] != null, 'Required key "CartingRetailer[retailer_id]" has a null value in JSON.');
        assert(json.containsKey(r'retailer_name'), 'Required key "CartingRetailer[retailer_name]" is missing from JSON.');
        assert(json[r'retailer_name'] != null, 'Required key "CartingRetailer[retailer_name]" has a null value in JSON.');
        return true;
      }());

      return CartingRetailer(
        retailerId: mapValueOfType<String>(json, r'retailer_id')!,
        retailerName: mapValueOfType<String>(json, r'retailer_name')!,
      );
    }
    return null;
  }

  static List<CartingRetailer> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CartingRetailer>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CartingRetailer.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CartingRetailer> mapFromJson(dynamic json) {
    final map = <String, CartingRetailer>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CartingRetailer.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CartingRetailer-objects as value to a dart map
  static Map<String, List<CartingRetailer>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CartingRetailer>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CartingRetailer.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'retailer_id',
    'retailer_name',
  };
}

