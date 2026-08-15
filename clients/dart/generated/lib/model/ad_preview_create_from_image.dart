//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdPreviewCreateFromImage {
  /// Returns a new [AdPreviewCreateFromImage] instance.
  AdPreviewCreateFromImage({
    required this.imageUrl,
    required this.title,
  });

  /// Image URL.
  String imageUrl;

  /// Title displayed below ad.
  String title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdPreviewCreateFromImage &&
    other.imageUrl == imageUrl &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (imageUrl.hashCode) +
    (title.hashCode);

  @override
  String toString() => 'AdPreviewCreateFromImage[imageUrl=$imageUrl, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'image_url'] = this.imageUrl;
      json[r'title'] = this.title;
    return json;
  }

  /// Returns a new [AdPreviewCreateFromImage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdPreviewCreateFromImage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdPreviewCreateFromImage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdPreviewCreateFromImage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdPreviewCreateFromImage(
        imageUrl: mapValueOfType<String>(json, r'image_url')!,
        title: mapValueOfType<String>(json, r'title')!,
      );
    }
    return null;
  }

  static List<AdPreviewCreateFromImage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPreviewCreateFromImage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPreviewCreateFromImage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdPreviewCreateFromImage> mapFromJson(dynamic json) {
    final map = <String, AdPreviewCreateFromImage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdPreviewCreateFromImage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdPreviewCreateFromImage-objects as value to a dart map
  static Map<String, List<AdPreviewCreateFromImage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdPreviewCreateFromImage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdPreviewCreateFromImage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'image_url',
    'title',
  };
}

