//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ImageSize {
  /// Returns a new [ImageSize] instance.
  ImageSize({
    this.n1200x,
    this.n150x150,
    this.n400x300,
    this.n600x,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ImageDetails? n1200x;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ImageDetails? n150x150;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ImageDetails? n400x300;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ImageDetails? n600x;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ImageSize &&
    other.n1200x == n1200x &&
    other.n150x150 == n150x150 &&
    other.n400x300 == n400x300 &&
    other.n600x == n600x;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (n1200x == null ? 0 : n1200x!.hashCode) +
    (n150x150 == null ? 0 : n150x150!.hashCode) +
    (n400x300 == null ? 0 : n400x300!.hashCode) +
    (n600x == null ? 0 : n600x!.hashCode);

  @override
  String toString() => 'ImageSize[n1200x=$n1200x, n150x150=$n150x150, n400x300=$n400x300, n600x=$n600x]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.n1200x != null) {
      json[r'1200x'] = this.n1200x;
    } else {
      json[r'1200x'] = null;
    }
    if (this.n150x150 != null) {
      json[r'150x150'] = this.n150x150;
    } else {
      json[r'150x150'] = null;
    }
    if (this.n400x300 != null) {
      json[r'400x300'] = this.n400x300;
    } else {
      json[r'400x300'] = null;
    }
    if (this.n600x != null) {
      json[r'600x'] = this.n600x;
    } else {
      json[r'600x'] = null;
    }
    return json;
  }

  /// Returns a new [ImageSize] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ImageSize? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ImageSize(
        n1200x: ImageDetails.fromJson(json[r'1200x']),
        n150x150: ImageDetails.fromJson(json[r'150x150']),
        n400x300: ImageDetails.fromJson(json[r'400x300']),
        n600x: ImageDetails.fromJson(json[r'600x']),
      );
    }
    return null;
  }

  static List<ImageSize> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ImageSize>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ImageSize.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ImageSize> mapFromJson(dynamic json) {
    final map = <String, ImageSize>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ImageSize.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ImageSize-objects as value to a dart map
  static Map<String, List<ImageSize>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ImageSize>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ImageSize.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

