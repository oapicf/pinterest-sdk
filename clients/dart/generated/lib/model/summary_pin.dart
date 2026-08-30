//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SummaryPin {
  /// Returns a new [SummaryPin] instance.
  SummaryPin({
    this.altText,
    this.description,
    required this.id,
    this.link,
    this.media,
    this.title,
  });

  String? altText;

  String? description;

  String id;

  String? link;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PinMedia? media;

  String? title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SummaryPin &&
    other.altText == altText &&
    other.description == description &&
    other.id == id &&
    other.link == link &&
    other.media == media &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (altText == null ? 0 : altText!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (id.hashCode) +
    (link == null ? 0 : link!.hashCode) +
    (media == null ? 0 : media!.hashCode) +
    (title == null ? 0 : title!.hashCode);

  @override
  String toString() => 'SummaryPin[altText=$altText, description=$description, id=$id, link=$link, media=$media, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.altText != null) {
      json[r'alt_text'] = this.altText;
    } else {
      json[r'alt_text'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'id'] = this.id;
    if (this.link != null) {
      json[r'link'] = this.link;
    } else {
      json[r'link'] = null;
    }
    if (this.media != null) {
      json[r'media'] = this.media;
    } else {
      json[r'media'] = null;
    }
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
    return json;
  }

  /// Returns a new [SummaryPin] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SummaryPin? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "SummaryPin[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "SummaryPin[id]" has a null value in JSON.');
        return true;
      }());

      return SummaryPin(
        altText: mapValueOfType<String>(json, r'alt_text'),
        description: mapValueOfType<String>(json, r'description'),
        id: mapValueOfType<String>(json, r'id')!,
        link: mapValueOfType<String>(json, r'link'),
        media: PinMedia.fromJson(json[r'media']),
        title: mapValueOfType<String>(json, r'title'),
      );
    }
    return null;
  }

  static List<SummaryPin> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SummaryPin>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SummaryPin.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SummaryPin> mapFromJson(dynamic json) {
    final map = <String, SummaryPin>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SummaryPin.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SummaryPin-objects as value to a dart map
  static Map<String, List<SummaryPin>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SummaryPin>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SummaryPin.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

