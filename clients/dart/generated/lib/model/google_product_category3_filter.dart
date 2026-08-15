//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoogleProductCategory3Filter {
  /// Returns a new [GoogleProductCategory3Filter] instance.
  GoogleProductCategory3Filter({
    required this.gOOGLEPRODUCTCATEGORY3,
  });

  CatalogsProductGroupMultipleStringListCriteria gOOGLEPRODUCTCATEGORY3;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoogleProductCategory3Filter &&
    other.gOOGLEPRODUCTCATEGORY3 == gOOGLEPRODUCTCATEGORY3;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (gOOGLEPRODUCTCATEGORY3.hashCode);

  @override
  String toString() => 'GoogleProductCategory3Filter[gOOGLEPRODUCTCATEGORY3=$gOOGLEPRODUCTCATEGORY3]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'GOOGLE_PRODUCT_CATEGORY_3'] = this.gOOGLEPRODUCTCATEGORY3;
    return json;
  }

  /// Returns a new [GoogleProductCategory3Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoogleProductCategory3Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GoogleProductCategory3Filter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GoogleProductCategory3Filter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GoogleProductCategory3Filter(
        gOOGLEPRODUCTCATEGORY3: mapValueOfType<CatalogsProductGroupMultipleStringListCriteria>(json, r'GOOGLE_PRODUCT_CATEGORY_3')!,
      );
    }
    return null;
  }

  static List<GoogleProductCategory3Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoogleProductCategory3Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoogleProductCategory3Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoogleProductCategory3Filter> mapFromJson(dynamic json) {
    final map = <String, GoogleProductCategory3Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoogleProductCategory3Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoogleProductCategory3Filter-objects as value to a dart map
  static Map<String, List<GoogleProductCategory3Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoogleProductCategory3Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoogleProductCategory3Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'GOOGLE_PRODUCT_CATEGORY_3',
  };
}

