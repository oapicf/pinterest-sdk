//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsProductMetadata {
  /// Returns a new [CatalogsCreativeAssetsProductMetadata] instance.
  CatalogsCreativeAssetsProductMetadata({
    required this.creativeAssetsId,
    required this.visibility,
  });

  /// The user-created unique ID that represents the creative assets item.
  String creativeAssetsId;

  CreativeAssetsVisibilityType visibility;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsProductMetadata &&
    other.creativeAssetsId == creativeAssetsId &&
    other.visibility == visibility;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (creativeAssetsId.hashCode) +
    (visibility.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsProductMetadata[creativeAssetsId=$creativeAssetsId, visibility=$visibility]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'creative_assets_id'] = this.creativeAssetsId;
      json[r'visibility'] = this.visibility;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsProductMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsProductMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'creative_assets_id'), 'Required key "CatalogsCreativeAssetsProductMetadata[creative_assets_id]" is missing from JSON.');
        assert(json[r'creative_assets_id'] != null, 'Required key "CatalogsCreativeAssetsProductMetadata[creative_assets_id]" has a null value in JSON.');
        assert(json.containsKey(r'visibility'), 'Required key "CatalogsCreativeAssetsProductMetadata[visibility]" is missing from JSON.');
        assert(json[r'visibility'] != null, 'Required key "CatalogsCreativeAssetsProductMetadata[visibility]" has a null value in JSON.');
        return true;
      }());

      return CatalogsCreativeAssetsProductMetadata(
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id')!,
        visibility: CreativeAssetsVisibilityType.fromJson(json[r'visibility'])!,
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsProductMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsProductMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsProductMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsProductMetadata> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsProductMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsProductMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsProductMetadata-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsProductMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsProductMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsProductMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'creative_assets_id',
    'visibility',
  };
}

