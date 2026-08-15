//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsFeedVideoCounts {
  /// Returns a new [CatalogsFeedVideoCounts] instance.
  CatalogsFeedVideoCounts({
    this.ingestedVideos,
    this.notIngestedVideos,
    this.totalVideos,
  });

  /// The number of videos successfully ingested from the feed file.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ingestedVideos;

  /// The number of videos that were not ingested from the feed file.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? notIngestedVideos;

  /// The number of videos in the feed file.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? totalVideos;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsFeedVideoCounts &&
    other.ingestedVideos == ingestedVideos &&
    other.notIngestedVideos == notIngestedVideos &&
    other.totalVideos == totalVideos;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ingestedVideos == null ? 0 : ingestedVideos!.hashCode) +
    (notIngestedVideos == null ? 0 : notIngestedVideos!.hashCode) +
    (totalVideos == null ? 0 : totalVideos!.hashCode);

  @override
  String toString() => 'CatalogsFeedVideoCounts[ingestedVideos=$ingestedVideos, notIngestedVideos=$notIngestedVideos, totalVideos=$totalVideos]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ingestedVideos != null) {
      json[r'ingested_videos'] = this.ingestedVideos;
    } else {
      json[r'ingested_videos'] = null;
    }
    if (this.notIngestedVideos != null) {
      json[r'not_ingested_videos'] = this.notIngestedVideos;
    } else {
      json[r'not_ingested_videos'] = null;
    }
    if (this.totalVideos != null) {
      json[r'total_videos'] = this.totalVideos;
    } else {
      json[r'total_videos'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsFeedVideoCounts] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsFeedVideoCounts? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsFeedVideoCounts[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsFeedVideoCounts[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsFeedVideoCounts(
        ingestedVideos: mapValueOfType<int>(json, r'ingested_videos'),
        notIngestedVideos: mapValueOfType<int>(json, r'not_ingested_videos'),
        totalVideos: mapValueOfType<int>(json, r'total_videos'),
      );
    }
    return null;
  }

  static List<CatalogsFeedVideoCounts> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedVideoCounts>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedVideoCounts.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsFeedVideoCounts> mapFromJson(dynamic json) {
    final map = <String, CatalogsFeedVideoCounts>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsFeedVideoCounts.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsFeedVideoCounts-objects as value to a dart map
  static Map<String, List<CatalogsFeedVideoCounts>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsFeedVideoCounts>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsFeedVideoCounts.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

