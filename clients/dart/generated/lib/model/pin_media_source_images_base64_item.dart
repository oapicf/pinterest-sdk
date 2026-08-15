//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaSourceImagesBase64Item {
  /// Returns a new [PinMediaSourceImagesBase64Item] instance.
  PinMediaSourceImagesBase64Item({
    required this.contentType,
    required this.data,
    this.description,
    this.link,
    this.title,
  });

  ContentType contentType;

  String data;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? link;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaSourceImagesBase64Item &&
    other.contentType == contentType &&
    other.data == data &&
    other.description == description &&
    other.link == link &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (contentType.hashCode) +
    (data.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (link == null ? 0 : link!.hashCode) +
    (title == null ? 0 : title!.hashCode);

  @override
  String toString() => 'PinMediaSourceImagesBase64Item[contentType=$contentType, data=$data, description=$description, link=$link, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'content_type'] = this.contentType;
      json[r'data'] = this.data;
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.link != null) {
      json[r'link'] = this.link;
    } else {
      json[r'link'] = null;
    }
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
    return json;
  }

  /// Returns a new [PinMediaSourceImagesBase64Item] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaSourceImagesBase64Item? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinMediaSourceImagesBase64Item[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinMediaSourceImagesBase64Item[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinMediaSourceImagesBase64Item(
        contentType: ContentType.fromJson(json[r'content_type'])!,
        data: mapValueOfType<String>(json, r'data')!,
        description: mapValueOfType<String>(json, r'description'),
        link: mapValueOfType<String>(json, r'link'),
        title: mapValueOfType<String>(json, r'title'),
      );
    }
    return null;
  }

  static List<PinMediaSourceImagesBase64Item> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceImagesBase64Item>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceImagesBase64Item.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaSourceImagesBase64Item> mapFromJson(dynamic json) {
    final map = <String, PinMediaSourceImagesBase64Item>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaSourceImagesBase64Item.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaSourceImagesBase64Item-objects as value to a dart map
  static Map<String, List<PinMediaSourceImagesBase64Item>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaSourceImagesBase64Item>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaSourceImagesBase64Item.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'content_type',
    'data',
  };
}

