//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailFilterValuesMap {
  /// Returns a new [CatalogsRetailFilterValuesMap] instance.
  CatalogsRetailFilterValuesMap({
    this.adImageTags = const [],
    this.adVideoTags = const [],
    this.availability = const [],
    this.brand = const [],
    this.condition = const [],
    this.customLabel0 = const [],
    this.customLabel1 = const [],
    this.customLabel2 = const [],
    this.customLabel3 = const [],
    this.customLabel4 = const [],
    this.gender = const [],
    this.googleProductCategory0 = const [],
    this.googleProductCategory1 = const [],
    this.googleProductCategory2 = const [],
    this.googleProductCategory3 = const [],
    this.googleProductCategory4 = const [],
    this.googleProductCategory5 = const [],
    this.googleProductCategory6 = const [],
    this.mediaType = const [],
    this.productType0 = const [],
    this.productType1 = const [],
    this.productType2 = const [],
    this.productType3 = const [],
    this.productType4 = const [],
  });

  List<String> adImageTags;

  List<String> adVideoTags;

  List<ProductAvailability> availability;

  List<String> brand;

  List<ProductCondition> condition;

  List<String> customLabel0;

  List<String> customLabel1;

  List<String> customLabel2;

  List<String> customLabel3;

  List<String> customLabel4;

  List<Gender> gender;

  List<String> googleProductCategory0;

  List<String> googleProductCategory1;

  List<String> googleProductCategory2;

  List<String> googleProductCategory3;

  List<String> googleProductCategory4;

  List<String> googleProductCategory5;

  List<String> googleProductCategory6;

  List<MediaType> mediaType;

  List<String> productType0;

  List<String> productType1;

  List<String> productType2;

  List<String> productType3;

  List<String> productType4;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailFilterValuesMap &&
    _deepEquality.equals(other.adImageTags, adImageTags) &&
    _deepEquality.equals(other.adVideoTags, adVideoTags) &&
    _deepEquality.equals(other.availability, availability) &&
    _deepEquality.equals(other.brand, brand) &&
    _deepEquality.equals(other.condition, condition) &&
    _deepEquality.equals(other.customLabel0, customLabel0) &&
    _deepEquality.equals(other.customLabel1, customLabel1) &&
    _deepEquality.equals(other.customLabel2, customLabel2) &&
    _deepEquality.equals(other.customLabel3, customLabel3) &&
    _deepEquality.equals(other.customLabel4, customLabel4) &&
    _deepEquality.equals(other.gender, gender) &&
    _deepEquality.equals(other.googleProductCategory0, googleProductCategory0) &&
    _deepEquality.equals(other.googleProductCategory1, googleProductCategory1) &&
    _deepEquality.equals(other.googleProductCategory2, googleProductCategory2) &&
    _deepEquality.equals(other.googleProductCategory3, googleProductCategory3) &&
    _deepEquality.equals(other.googleProductCategory4, googleProductCategory4) &&
    _deepEquality.equals(other.googleProductCategory5, googleProductCategory5) &&
    _deepEquality.equals(other.googleProductCategory6, googleProductCategory6) &&
    _deepEquality.equals(other.mediaType, mediaType) &&
    _deepEquality.equals(other.productType0, productType0) &&
    _deepEquality.equals(other.productType1, productType1) &&
    _deepEquality.equals(other.productType2, productType2) &&
    _deepEquality.equals(other.productType3, productType3) &&
    _deepEquality.equals(other.productType4, productType4);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adImageTags.hashCode) +
    (adVideoTags.hashCode) +
    (availability.hashCode) +
    (brand.hashCode) +
    (condition.hashCode) +
    (customLabel0.hashCode) +
    (customLabel1.hashCode) +
    (customLabel2.hashCode) +
    (customLabel3.hashCode) +
    (customLabel4.hashCode) +
    (gender.hashCode) +
    (googleProductCategory0.hashCode) +
    (googleProductCategory1.hashCode) +
    (googleProductCategory2.hashCode) +
    (googleProductCategory3.hashCode) +
    (googleProductCategory4.hashCode) +
    (googleProductCategory5.hashCode) +
    (googleProductCategory6.hashCode) +
    (mediaType.hashCode) +
    (productType0.hashCode) +
    (productType1.hashCode) +
    (productType2.hashCode) +
    (productType3.hashCode) +
    (productType4.hashCode);

  @override
  String toString() => 'CatalogsRetailFilterValuesMap[adImageTags=$adImageTags, adVideoTags=$adVideoTags, availability=$availability, brand=$brand, condition=$condition, customLabel0=$customLabel0, customLabel1=$customLabel1, customLabel2=$customLabel2, customLabel3=$customLabel3, customLabel4=$customLabel4, gender=$gender, googleProductCategory0=$googleProductCategory0, googleProductCategory1=$googleProductCategory1, googleProductCategory2=$googleProductCategory2, googleProductCategory3=$googleProductCategory3, googleProductCategory4=$googleProductCategory4, googleProductCategory5=$googleProductCategory5, googleProductCategory6=$googleProductCategory6, mediaType=$mediaType, productType0=$productType0, productType1=$productType1, productType2=$productType2, productType3=$productType3, productType4=$productType4]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_image_tags'] = this.adImageTags;
      json[r'ad_video_tags'] = this.adVideoTags;
      json[r'availability'] = this.availability;
      json[r'brand'] = this.brand;
      json[r'condition'] = this.condition;
      json[r'custom_label_0'] = this.customLabel0;
      json[r'custom_label_1'] = this.customLabel1;
      json[r'custom_label_2'] = this.customLabel2;
      json[r'custom_label_3'] = this.customLabel3;
      json[r'custom_label_4'] = this.customLabel4;
      json[r'gender'] = this.gender;
      json[r'google_product_category_0'] = this.googleProductCategory0;
      json[r'google_product_category_1'] = this.googleProductCategory1;
      json[r'google_product_category_2'] = this.googleProductCategory2;
      json[r'google_product_category_3'] = this.googleProductCategory3;
      json[r'google_product_category_4'] = this.googleProductCategory4;
      json[r'google_product_category_5'] = this.googleProductCategory5;
      json[r'google_product_category_6'] = this.googleProductCategory6;
      json[r'media_type'] = this.mediaType;
      json[r'product_type_0'] = this.productType0;
      json[r'product_type_1'] = this.productType1;
      json[r'product_type_2'] = this.productType2;
      json[r'product_type_3'] = this.productType3;
      json[r'product_type_4'] = this.productType4;
    return json;
  }

  /// Returns a new [CatalogsRetailFilterValuesMap] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailFilterValuesMap? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CatalogsRetailFilterValuesMap(
        adImageTags: json[r'ad_image_tags'] is Iterable
            ? (json[r'ad_image_tags'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        adVideoTags: json[r'ad_video_tags'] is Iterable
            ? (json[r'ad_video_tags'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        availability: ProductAvailability.listFromJson(json[r'availability']),
        brand: json[r'brand'] is Iterable
            ? (json[r'brand'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        condition: ProductCondition.listFromJson(json[r'condition']),
        customLabel0: json[r'custom_label_0'] is Iterable
            ? (json[r'custom_label_0'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customLabel1: json[r'custom_label_1'] is Iterable
            ? (json[r'custom_label_1'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customLabel2: json[r'custom_label_2'] is Iterable
            ? (json[r'custom_label_2'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customLabel3: json[r'custom_label_3'] is Iterable
            ? (json[r'custom_label_3'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customLabel4: json[r'custom_label_4'] is Iterable
            ? (json[r'custom_label_4'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        gender: Gender.listFromJson(json[r'gender']),
        googleProductCategory0: json[r'google_product_category_0'] is Iterable
            ? (json[r'google_product_category_0'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        googleProductCategory1: json[r'google_product_category_1'] is Iterable
            ? (json[r'google_product_category_1'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        googleProductCategory2: json[r'google_product_category_2'] is Iterable
            ? (json[r'google_product_category_2'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        googleProductCategory3: json[r'google_product_category_3'] is Iterable
            ? (json[r'google_product_category_3'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        googleProductCategory4: json[r'google_product_category_4'] is Iterable
            ? (json[r'google_product_category_4'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        googleProductCategory5: json[r'google_product_category_5'] is Iterable
            ? (json[r'google_product_category_5'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        googleProductCategory6: json[r'google_product_category_6'] is Iterable
            ? (json[r'google_product_category_6'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        mediaType: MediaType.listFromJson(json[r'media_type']),
        productType0: json[r'product_type_0'] is Iterable
            ? (json[r'product_type_0'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        productType1: json[r'product_type_1'] is Iterable
            ? (json[r'product_type_1'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        productType2: json[r'product_type_2'] is Iterable
            ? (json[r'product_type_2'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        productType3: json[r'product_type_3'] is Iterable
            ? (json[r'product_type_3'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        productType4: json[r'product_type_4'] is Iterable
            ? (json[r'product_type_4'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsRetailFilterValuesMap> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailFilterValuesMap>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailFilterValuesMap.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailFilterValuesMap> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailFilterValuesMap>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailFilterValuesMap.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailFilterValuesMap-objects as value to a dart map
  static Map<String, List<CatalogsRetailFilterValuesMap>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailFilterValuesMap>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailFilterValuesMap.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

