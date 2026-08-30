//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LinkFilter {
  /// Returns a new [LinkFilter] instance.
  LinkFilter({
    required this.LINK,
  });

  CatalogsProductGroupFilterOperatorTypeCriteria LINK;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LinkFilter &&
    other.LINK == LINK;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (LINK.hashCode);

  @override
  String toString() => 'LinkFilter[LINK=$LINK]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'LINK'] = this.LINK;
    return json;
  }

  /// Returns a new [LinkFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LinkFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'LINK'), 'Required key "LinkFilter[LINK]" is missing from JSON.');
        assert(json[r'LINK'] != null, 'Required key "LinkFilter[LINK]" has a null value in JSON.');
        return true;
      }());

      return LinkFilter(
        LINK: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'LINK'])!,
      );
    }
    return null;
  }

  static List<LinkFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LinkFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LinkFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LinkFilter> mapFromJson(dynamic json) {
    final map = <String, LinkFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LinkFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LinkFilter-objects as value to a dart map
  static Map<String, List<LinkFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LinkFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LinkFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'LINK',
  };
}

