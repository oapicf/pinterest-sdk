//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ImageDetails {
  /// Returns a new [ImageDetails] instance.
  ImageDetails({
    required this.height,
    required this.url,
    required this.width,
  });

  int? height;

  String url;

  int? width;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ImageDetails &&
    other.height == height &&
    other.url == url &&
    other.width == width;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (height == null ? 0 : height!.hashCode) +
    (url.hashCode) +
    (width == null ? 0 : width!.hashCode);

  @override
  String toString() => 'ImageDetails[height=$height, url=$url, width=$width]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.height != null) {
      json[r'height'] = this.height;
    } else {
      json[r'height'] = null;
    }
      json[r'url'] = this.url;
    if (this.width != null) {
      json[r'width'] = this.width;
    } else {
      json[r'width'] = null;
    }
    return json;
  }

  /// Returns a new [ImageDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ImageDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'height'), 'Required key "ImageDetails[height]" is missing from JSON.');
        assert(json.containsKey(r'url'), 'Required key "ImageDetails[url]" is missing from JSON.');
        assert(json[r'url'] != null, 'Required key "ImageDetails[url]" has a null value in JSON.');
        assert(json.containsKey(r'width'), 'Required key "ImageDetails[width]" is missing from JSON.');
        return true;
      }());

      return ImageDetails(
        height: mapValueOfType<int>(json, r'height'),
        url: mapValueOfType<String>(json, r'url')!,
        width: mapValueOfType<int>(json, r'width'),
      );
    }
    return null;
  }

  static List<ImageDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ImageDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ImageDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ImageDetails> mapFromJson(dynamic json) {
    final map = <String, ImageDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ImageDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ImageDetails-objects as value to a dart map
  static Map<String, List<ImageDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ImageDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ImageDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'height',
    'url',
    'width',
  };
}

