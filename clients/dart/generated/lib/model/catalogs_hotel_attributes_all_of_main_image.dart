//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelAttributesAllOfMainImage {
  /// Returns a new [CatalogsHotelAttributesAllOfMainImage] instance.
  CatalogsHotelAttributesAllOfMainImage({
    this.link,
    this.tag = const [],
  });

  /// <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? link;

  /// Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
  List<String>? tag;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelAttributesAllOfMainImage &&
    other.link == link &&
    _deepEquality.equals(other.tag, tag);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (link == null ? 0 : link!.hashCode) +
    (tag == null ? 0 : tag!.hashCode);

  @override
  String toString() => 'CatalogsHotelAttributesAllOfMainImage[link=$link, tag=$tag]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.link != null) {
      json[r'link'] = this.link;
    } else {
      json[r'link'] = null;
    }
    if (this.tag != null) {
      json[r'tag'] = this.tag;
    } else {
      json[r'tag'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsHotelAttributesAllOfMainImage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelAttributesAllOfMainImage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelAttributesAllOfMainImage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelAttributesAllOfMainImage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelAttributesAllOfMainImage(
        link: mapValueOfType<String>(json, r'link'),
        tag: json[r'tag'] is Iterable
            ? (json[r'tag'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsHotelAttributesAllOfMainImage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelAttributesAllOfMainImage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelAttributesAllOfMainImage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelAttributesAllOfMainImage> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelAttributesAllOfMainImage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelAttributesAllOfMainImage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelAttributesAllOfMainImage-objects as value to a dart map
  static Map<String, List<CatalogsHotelAttributesAllOfMainImage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelAttributesAllOfMainImage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelAttributesAllOfMainImage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

