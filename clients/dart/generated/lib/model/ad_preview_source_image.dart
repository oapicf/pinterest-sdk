//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdPreviewSourceImage {
  /// Returns a new [AdPreviewSourceImage] instance.
  AdPreviewSourceImage({
    required this.imageUrl,
    this.promotionId,
    required this.title,
  });

  /// Image URL.
  String imageUrl;

  /// Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? promotionId;

  /// Title displayed below ad.
  String title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdPreviewSourceImage &&
    other.imageUrl == imageUrl &&
    other.promotionId == promotionId &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (imageUrl.hashCode) +
    (promotionId == null ? 0 : promotionId!.hashCode) +
    (title.hashCode);

  @override
  String toString() => 'AdPreviewSourceImage[imageUrl=$imageUrl, promotionId=$promotionId, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'image_url'] = this.imageUrl;
    if (this.promotionId != null) {
      json[r'promotion_id'] = this.promotionId;
    } else {
      json[r'promotion_id'] = null;
    }
      json[r'title'] = this.title;
    return json;
  }

  /// Returns a new [AdPreviewSourceImage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdPreviewSourceImage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'image_url'), 'Required key "AdPreviewSourceImage[image_url]" is missing from JSON.');
        assert(json[r'image_url'] != null, 'Required key "AdPreviewSourceImage[image_url]" has a null value in JSON.');
        assert(json.containsKey(r'title'), 'Required key "AdPreviewSourceImage[title]" is missing from JSON.');
        assert(json[r'title'] != null, 'Required key "AdPreviewSourceImage[title]" has a null value in JSON.');
        return true;
      }());

      return AdPreviewSourceImage(
        imageUrl: mapValueOfType<String>(json, r'image_url')!,
        promotionId: mapValueOfType<String>(json, r'promotion_id'),
        title: mapValueOfType<String>(json, r'title')!,
      );
    }
    return null;
  }

  static List<AdPreviewSourceImage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPreviewSourceImage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPreviewSourceImage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdPreviewSourceImage> mapFromJson(dynamic json) {
    final map = <String, AdPreviewSourceImage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdPreviewSourceImage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdPreviewSourceImage-objects as value to a dart map
  static Map<String, List<AdPreviewSourceImage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdPreviewSourceImage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdPreviewSourceImage.listFromJson(entry.value, growable: growable,);
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

