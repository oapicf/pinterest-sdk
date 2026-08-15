//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsUpdatableCreativeAssetsAttributes {
  /// Returns a new [CatalogsUpdatableCreativeAssetsAttributes] instance.
  CatalogsUpdatableCreativeAssetsAttributes({
    this.androidDeepLink,
    this.customLabel0,
    this.customLabel1,
    this.customLabel2,
    this.customLabel3,
    this.customLabel4,
    this.description,
    this.googleProductCategory,
    this.iosDeepLink,
    this.link,
    this.title,
    this.visibility,
  });

  /// Link to the creative assets page.
  String? androidDeepLink;

  /// Custom grouping of creative assets.
  String? customLabel0;

  /// Custom grouping of creative assets.
  String? customLabel1;

  /// Custom grouping of creative assets.
  String? customLabel2;

  /// Custom grouping of creative assets.
  String? customLabel3;

  /// Custom grouping of creative assets.
  String? customLabel4;

  /// Brief description of the creative assets.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  String? googleProductCategory;

  /// IOS deep link to the creative assets page.
  String? iosDeepLink;

  /// Link to the creative assets page.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? link;

  /// The name of the creative assets.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? title;

  /// Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
  String? visibility;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsUpdatableCreativeAssetsAttributes &&
    other.androidDeepLink == androidDeepLink &&
    other.customLabel0 == customLabel0 &&
    other.customLabel1 == customLabel1 &&
    other.customLabel2 == customLabel2 &&
    other.customLabel3 == customLabel3 &&
    other.customLabel4 == customLabel4 &&
    other.description == description &&
    other.googleProductCategory == googleProductCategory &&
    other.iosDeepLink == iosDeepLink &&
    other.link == link &&
    other.title == title &&
    other.visibility == visibility;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (androidDeepLink == null ? 0 : androidDeepLink!.hashCode) +
    (customLabel0 == null ? 0 : customLabel0!.hashCode) +
    (customLabel1 == null ? 0 : customLabel1!.hashCode) +
    (customLabel2 == null ? 0 : customLabel2!.hashCode) +
    (customLabel3 == null ? 0 : customLabel3!.hashCode) +
    (customLabel4 == null ? 0 : customLabel4!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (googleProductCategory == null ? 0 : googleProductCategory!.hashCode) +
    (iosDeepLink == null ? 0 : iosDeepLink!.hashCode) +
    (link == null ? 0 : link!.hashCode) +
    (title == null ? 0 : title!.hashCode) +
    (visibility == null ? 0 : visibility!.hashCode);

  @override
  String toString() => 'CatalogsUpdatableCreativeAssetsAttributes[androidDeepLink=$androidDeepLink, customLabel0=$customLabel0, customLabel1=$customLabel1, customLabel2=$customLabel2, customLabel3=$customLabel3, customLabel4=$customLabel4, description=$description, googleProductCategory=$googleProductCategory, iosDeepLink=$iosDeepLink, link=$link, title=$title, visibility=$visibility]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.androidDeepLink != null) {
      json[r'android_deep_link'] = this.androidDeepLink;
    } else {
      json[r'android_deep_link'] = null;
    }
    if (this.customLabel0 != null) {
      json[r'custom_label_0'] = this.customLabel0;
    } else {
      json[r'custom_label_0'] = null;
    }
    if (this.customLabel1 != null) {
      json[r'custom_label_1'] = this.customLabel1;
    } else {
      json[r'custom_label_1'] = null;
    }
    if (this.customLabel2 != null) {
      json[r'custom_label_2'] = this.customLabel2;
    } else {
      json[r'custom_label_2'] = null;
    }
    if (this.customLabel3 != null) {
      json[r'custom_label_3'] = this.customLabel3;
    } else {
      json[r'custom_label_3'] = null;
    }
    if (this.customLabel4 != null) {
      json[r'custom_label_4'] = this.customLabel4;
    } else {
      json[r'custom_label_4'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.googleProductCategory != null) {
      json[r'google_product_category'] = this.googleProductCategory;
    } else {
      json[r'google_product_category'] = null;
    }
    if (this.iosDeepLink != null) {
      json[r'ios_deep_link'] = this.iosDeepLink;
    } else {
      json[r'ios_deep_link'] = null;
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
    if (this.visibility != null) {
      json[r'visibility'] = this.visibility;
    } else {
      json[r'visibility'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsUpdatableCreativeAssetsAttributes] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsUpdatableCreativeAssetsAttributes? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsUpdatableCreativeAssetsAttributes[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsUpdatableCreativeAssetsAttributes[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsUpdatableCreativeAssetsAttributes(
        androidDeepLink: mapValueOfType<String>(json, r'android_deep_link'),
        customLabel0: mapValueOfType<String>(json, r'custom_label_0'),
        customLabel1: mapValueOfType<String>(json, r'custom_label_1'),
        customLabel2: mapValueOfType<String>(json, r'custom_label_2'),
        customLabel3: mapValueOfType<String>(json, r'custom_label_3'),
        customLabel4: mapValueOfType<String>(json, r'custom_label_4'),
        description: mapValueOfType<String>(json, r'description'),
        googleProductCategory: mapValueOfType<String>(json, r'google_product_category'),
        iosDeepLink: mapValueOfType<String>(json, r'ios_deep_link'),
        link: mapValueOfType<String>(json, r'link'),
        title: mapValueOfType<String>(json, r'title'),
        visibility: mapValueOfType<String>(json, r'visibility'),
      );
    }
    return null;
  }

  static List<CatalogsUpdatableCreativeAssetsAttributes> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpdatableCreativeAssetsAttributes>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpdatableCreativeAssetsAttributes.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsUpdatableCreativeAssetsAttributes> mapFromJson(dynamic json) {
    final map = <String, CatalogsUpdatableCreativeAssetsAttributes>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsUpdatableCreativeAssetsAttributes.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsUpdatableCreativeAssetsAttributes-objects as value to a dart map
  static Map<String, List<CatalogsUpdatableCreativeAssetsAttributes>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsUpdatableCreativeAssetsAttributes>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsUpdatableCreativeAssetsAttributes.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

