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
    required this.height,
    required this.id,
    required this.src,
    required this.width,
  });

  /// Height of the pin image in pixels
  int height;

  /// Unique identifier for the pin
  String id;

  /// URL of the pin image
  String src;

  /// Width of the pin image in pixels
  int width;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendingPin &&
    other.height == height &&
    other.id == id &&
    other.src == src &&
    other.width == width;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (height.hashCode) +
    (id.hashCode) +
    (src.hashCode) +
    (width.hashCode);

  @override
  String toString() => 'TrendingPin[height=$height, id=$id, src=$src, width=$width]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'height'] = this.height;
      json[r'id'] = this.id;
      json[r'src'] = this.src;
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
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TrendingPin[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TrendingPin[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TrendingPin(
        height: mapValueOfType<int>(json, r'height')!,
        id: mapValueOfType<String>(json, r'id')!,
        src: mapValueOfType<String>(json, r'src')!,
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
    'height',
    'id',
    'src',
    'width',
  };
}

