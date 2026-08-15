//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MaxPriceFilter {
  /// Returns a new [MaxPriceFilter] instance.
  MaxPriceFilter({
    required this.MAX_PRICE,
  });

  CatalogsProductGroupPricingCriteria MAX_PRICE;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MaxPriceFilter &&
    other.MAX_PRICE == MAX_PRICE;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (MAX_PRICE.hashCode);

  @override
  String toString() => 'MaxPriceFilter[MAX_PRICE=$MAX_PRICE]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'MAX_PRICE'] = this.MAX_PRICE;
    return json;
  }

  /// Returns a new [MaxPriceFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MaxPriceFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MaxPriceFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MaxPriceFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MaxPriceFilter(
        MAX_PRICE: mapValueOfType<CatalogsProductGroupPricingCriteria>(json, r'MAX_PRICE')!,
      );
    }
    return null;
  }

  static List<MaxPriceFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MaxPriceFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MaxPriceFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MaxPriceFilter> mapFromJson(dynamic json) {
    final map = <String, MaxPriceFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MaxPriceFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MaxPriceFilter-objects as value to a dart map
  static Map<String, List<MaxPriceFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MaxPriceFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MaxPriceFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'MAX_PRICE',
  };
}

