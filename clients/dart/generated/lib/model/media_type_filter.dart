//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MediaTypeFilter {
  /// Returns a new [MediaTypeFilter] instance.
  MediaTypeFilter({
    required this.MEDIA_TYPE,
  });

  CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MediaTypeFilter &&
    other.MEDIA_TYPE == MEDIA_TYPE;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (MEDIA_TYPE.hashCode);

  @override
  String toString() => 'MediaTypeFilter[MEDIA_TYPE=$MEDIA_TYPE]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'MEDIA_TYPE'] = this.MEDIA_TYPE;
    return json;
  }

  /// Returns a new [MediaTypeFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MediaTypeFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MediaTypeFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MediaTypeFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MediaTypeFilter(
        MEDIA_TYPE: mapValueOfType<CatalogsProductGroupMultipleMediaTypesCriteria>(json, r'MEDIA_TYPE')!,
      );
    }
    return null;
  }

  static List<MediaTypeFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MediaTypeFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MediaTypeFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MediaTypeFilter> mapFromJson(dynamic json) {
    final map = <String, MediaTypeFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MediaTypeFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MediaTypeFilter-objects as value to a dart map
  static Map<String, List<MediaTypeFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MediaTypeFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MediaTypeFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'MEDIA_TYPE',
  };
}

