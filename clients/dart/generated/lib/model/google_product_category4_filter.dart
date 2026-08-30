//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoogleProductCategory4Filter {
  /// Returns a new [GoogleProductCategory4Filter] instance.
  GoogleProductCategory4Filter({
    required this.GOOGLE_PRODUCT_CATEGORY_4,
  });

  CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoogleProductCategory4Filter &&
    other.GOOGLE_PRODUCT_CATEGORY_4 == GOOGLE_PRODUCT_CATEGORY_4;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (GOOGLE_PRODUCT_CATEGORY_4.hashCode);

  @override
  String toString() => 'GoogleProductCategory4Filter[GOOGLE_PRODUCT_CATEGORY_4=$GOOGLE_PRODUCT_CATEGORY_4]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'GOOGLE_PRODUCT_CATEGORY_4'] = this.GOOGLE_PRODUCT_CATEGORY_4;
    return json;
  }

  /// Returns a new [GoogleProductCategory4Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoogleProductCategory4Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'GOOGLE_PRODUCT_CATEGORY_4'), 'Required key "GoogleProductCategory4Filter[GOOGLE_PRODUCT_CATEGORY_4]" is missing from JSON.');
        assert(json[r'GOOGLE_PRODUCT_CATEGORY_4'] != null, 'Required key "GoogleProductCategory4Filter[GOOGLE_PRODUCT_CATEGORY_4]" has a null value in JSON.');
        return true;
      }());

      return GoogleProductCategory4Filter(
        GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'GOOGLE_PRODUCT_CATEGORY_4'])!,
      );
    }
    return null;
  }

  static List<GoogleProductCategory4Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoogleProductCategory4Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoogleProductCategory4Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoogleProductCategory4Filter> mapFromJson(dynamic json) {
    final map = <String, GoogleProductCategory4Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoogleProductCategory4Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoogleProductCategory4Filter-objects as value to a dart map
  static Map<String, List<GoogleProductCategory4Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoogleProductCategory4Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoogleProductCategory4Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'GOOGLE_PRODUCT_CATEGORY_4',
  };
}

