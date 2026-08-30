//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TrendingPin {
  /// Returns a new [TrendingPin] instance.
  TrendingPin({
    required this.color,
    required this.height,
    required this.id,
    required this.src,
    this.verticalOffset,
    required this.width,
  });

  /// Dominant color of the pin image in hex format
  String color;

  /// Height of the pin image in pixels
  int height;

  /// Unique identifier for the pin
  String id;

  /// URL of the pin image
  String src;

  /// The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? verticalOffset;

  /// Width of the pin image in pixels
  int width;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendingPin &&
    other.color == color &&
    other.height == height &&
    other.id == id &&
    other.src == src &&
    other.verticalOffset == verticalOffset &&
    other.width == width;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (color.hashCode) +
    (height.hashCode) +
    (id.hashCode) +
    (src.hashCode) +
    (verticalOffset == null ? 0 : verticalOffset!.hashCode) +
    (width.hashCode);

  @override
  String toString() => 'TrendingPin[color=$color, height=$height, id=$id, src=$src, verticalOffset=$verticalOffset, width=$width]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'color'] = this.color;
      json[r'height'] = this.height;
      json[r'id'] = this.id;
      json[r'src'] = this.src;
    if (this.verticalOffset != null) {
      json[r'vertical_offset'] = this.verticalOffset;
    } else {
      json[r'vertical_offset'] = null;
    }
      json[r'width'] = this.width;
    return json;
  }

  /// Returns a new [TrendingPin] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TrendingPin? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'color'), 'Required key "TrendingPin[color]" is missing from JSON.');
        assert(json[r'color'] != null, 'Required key "TrendingPin[color]" has a null value in JSON.');
        assert(json.containsKey(r'height'), 'Required key "TrendingPin[height]" is missing from JSON.');
        assert(json[r'height'] != null, 'Required key "TrendingPin[height]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "TrendingPin[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "TrendingPin[id]" has a null value in JSON.');
        assert(json.containsKey(r'src'), 'Required key "TrendingPin[src]" is missing from JSON.');
        assert(json[r'src'] != null, 'Required key "TrendingPin[src]" has a null value in JSON.');
        assert(json.containsKey(r'width'), 'Required key "TrendingPin[width]" is missing from JSON.');
        assert(json[r'width'] != null, 'Required key "TrendingPin[width]" has a null value in JSON.');
        return true;
      }());

      return TrendingPin(
        color: mapValueOfType<String>(json, r'color')!,
        height: mapValueOfType<int>(json, r'height')!,
        id: mapValueOfType<String>(json, r'id')!,
        src: mapValueOfType<String>(json, r'src')!,
        verticalOffset: mapValueOfType<double>(json, r'vertical_offset'),
        width: mapValueOfType<int>(json, r'width')!,
      );
    }
    return null;
  }

  static List<TrendingPin> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendingPin>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendingPin.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TrendingPin> mapFromJson(dynamic json) {
    final map = <String, TrendingPin>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TrendingPin.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TrendingPin-objects as value to a dart map
  static Map<String, List<TrendingPin>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TrendingPin>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TrendingPin.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'color',
    'height',
    'id',
    'src',
    'width',
  };
}

