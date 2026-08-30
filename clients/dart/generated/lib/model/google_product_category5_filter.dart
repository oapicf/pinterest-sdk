//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoogleProductCategory5Filter {
  /// Returns a new [GoogleProductCategory5Filter] instance.
  GoogleProductCategory5Filter({
    required this.GOOGLE_PRODUCT_CATEGORY_5,
  });

  CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoogleProductCategory5Filter &&
    other.GOOGLE_PRODUCT_CATEGORY_5 == GOOGLE_PRODUCT_CATEGORY_5;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (GOOGLE_PRODUCT_CATEGORY_5.hashCode);

  @override
  String toString() => 'GoogleProductCategory5Filter[GOOGLE_PRODUCT_CATEGORY_5=$GOOGLE_PRODUCT_CATEGORY_5]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'GOOGLE_PRODUCT_CATEGORY_5'] = this.GOOGLE_PRODUCT_CATEGORY_5;
    return json;
  }

  /// Returns a new [GoogleProductCategory5Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoogleProductCategory5Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'GOOGLE_PRODUCT_CATEGORY_5'), 'Required key "GoogleProductCategory5Filter[GOOGLE_PRODUCT_CATEGORY_5]" is missing from JSON.');
        assert(json[r'GOOGLE_PRODUCT_CATEGORY_5'] != null, 'Required key "GoogleProductCategory5Filter[GOOGLE_PRODUCT_CATEGORY_5]" has a null value in JSON.');
        return true;
      }());

      return GoogleProductCategory5Filter(
        GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'GOOGLE_PRODUCT_CATEGORY_5'])!,
      );
    }
    return null;
  }

  static List<GoogleProductCategory5Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoogleProductCategory5Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoogleProductCategory5Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoogleProductCategory5Filter> mapFromJson(dynamic json) {
    final map = <String, GoogleProductCategory5Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoogleProductCategory5Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoogleProductCategory5Filter-objects as value to a dart map
  static Map<String, List<GoogleProductCategory5Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoogleProductCategory5Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoogleProductCategory5Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'GOOGLE_PRODUCT_CATEGORY_5',
  };
}

