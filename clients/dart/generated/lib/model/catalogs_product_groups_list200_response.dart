//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupsList200Response {
  /// Returns a new [CatalogsProductGroupsList200Response] instance.
  CatalogsProductGroupsList200Response({
    this.bookmark,
    this.items = const [],
  });

  String? bookmark;

  List<CatalogsVerticalProductGroup> items;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupsList200Response &&
    other.bookmark == bookmark &&
    _deepEquality.equals(other.items, items);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bookmark == null ? 0 : bookmark!.hashCode) +
    (items.hashCode);

  @override
  String toString() => 'CatalogsProductGroupsList200Response[bookmark=$bookmark, items=$items]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.bookmark != null) {
      json[r'bookmark'] = this.bookmark;
    } else {
      json[r'bookmark'] = null;
    }
      json[r'items'] = this.items;
    return json;
  }

  /// Returns a new [CatalogsProductGroupsList200Response] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupsList200Response? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'items'), 'Required key "CatalogsProductGroupsList200Response[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "CatalogsProductGroupsList200Response[items]" has a null value in JSON.');
        return true;
      }());

      return CatalogsProductGroupsList200Response(
        bookmark: mapValueOfType<String>(json, r'bookmark'),
        items: CatalogsVerticalProductGroup.listFromJson(json[r'items']),
      );
    }
    return null;
  }

  static List<CatalogsProductGroupsList200Response> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupsList200Response>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupsList200Response.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupsList200Response> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupsList200Response>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupsList200Response.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupsList200Response-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupsList200Response>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupsList200Response>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupsList200Response.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'items',
  };
}

