//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsFilterValuesMap {
  /// Returns a new [CatalogsCreativeAssetsFilterValuesMap] instance.
  CatalogsCreativeAssetsFilterValuesMap({
    this.customLabel0 = const [],
    this.customLabel1 = const [],
    this.customLabel2 = const [],
    this.customLabel3 = const [],
    this.customLabel4 = const [],
    this.googleProductCategory0 = const [],
    this.googleProductCategory1 = const [],
    this.googleProductCategory2 = const [],
    this.googleProductCategory3 = const [],
    this.googleProductCategory4 = const [],
    this.googleProductCategory5 = const [],
    this.googleProductCategory6 = const [],
    this.mediaType = const [],
  });

  List<String> customLabel0;

  List<String> customLabel1;

  List<String> customLabel2;

  List<String> customLabel3;

  List<String> customLabel4;

  List<String> googleProductCategory0;

  List<String> googleProductCategory1;

  List<String> googleProductCategory2;

  List<String> googleProductCategory3;

  List<String> googleProductCategory4;

  List<String> googleProductCategory5;

  List<String> googleProductCategory6;

  List<CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum> mediaType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsFilterValuesMap &&
    _deepEquality.equals(other.customLabel0, customLabel0) &&
    _deepEquality.equals(other.customLabel1, customLabel1) &&
    _deepEquality.equals(other.customLabel2, customLabel2) &&
    _deepEquality.equals(other.customLabel3, customLabel3) &&
    _deepEquality.equals(other.customLabel4, customLabel4) &&
    _deepEquality.equals(other.googleProductCategory0, googleProductCategory0) &&
    _deepEquality.equals(other.googleProductCategory1, googleProductCategory1) &&
    _deepEquality.equals(other.googleProductCategory2, googleProductCategory2) &&
    _deepEquality.equals(other.googleProductCategory3, googleProductCategory3) &&
    _deepEquality.equals(other.googleProductCategory4, googleProductCategory4) &&
    _deepEquality.equals(other.googleProductCategory5, googleProductCategory5) &&
    _deepEquality.equals(other.googleProductCategory6, googleProductCategory6) &&
    _deepEquality.equals(other.mediaType, mediaType);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (customLabel0.hashCode) +
    (customLabel1.hashCode) +
    (customLabel2.hashCode) +
    (customLabel3.hashCode) +
    (customLabel4.hashCode) +
    (googleProductCategory0.hashCode) +
    (googleProductCategory1.hashCode) +
    (googleProductCategory2.hashCode) +
    (googleProductCategory3.hashCode) +
    (googleProductCategory4.hashCode) +
    (googleProductCategory5.hashCode) +
    (googleProductCategory6.hashCode) +
    (mediaType.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsFilterValuesMap[customLabel0=$customLabel0, customLabel1=$customLabel1, customLabel2=$customLabel2, customLabel3=$customLabel3, customLabel4=$customLabel4, googleProductCategory0=$googleProductCategory0, googleProductCategory1=$googleProductCategory1, googleProductCategory2=$googleProductCategory2, googleProductCategory3=$googleProductCategory3, googleProductCategory4=$googleProductCategory4, googleProductCategory5=$googleProductCategory5, googleProductCategory6=$googleProductCategory6, mediaType=$mediaType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'custom_label_0'] = this.customLabel0;
      json[r'custom_label_1'] = this.customLabel1;
      json[r'custom_label_2'] = this.customLabel2;
      json[r'custom_label_3'] = this.customLabel3;
      json[r'custom_label_4'] = this.customLabel4;
      json[r'google_product_category_0'] = this.googleProductCategory0;
      json[r'google_product_category_1'] = this.googleProductCategory1;
      json[r'google_product_category_2'] = this.googleProductCategory2;
      json[r'google_product_category_3'] = this.googleProductCategory3;
      json[r'google_product_category_4'] = this.googleProductCategory4;
      json[r'google_product_category_5'] = this.googleProductCategory5;
      json[r'google_product_category_6'] = this.googleProductCategory6;
      json[r'media_type'] = this.mediaType;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsFilterValuesMap] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsFilterValuesMap? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsFilterValuesMap[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsFilterValuesMap[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsFilterValuesMap(
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
        mediaType: CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum.listFromJson(json[r'media_type']),
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsFilterValuesMap> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsFilterValuesMap>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsFilterValuesMap.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsFilterValuesMap> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsFilterValuesMap>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsFilterValuesMap.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsFilterValuesMap-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsFilterValuesMap>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsFilterValuesMap>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsFilterValuesMap.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const IMAGE = CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum._(r'IMAGE');
  static const VIDEO = CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum._(r'VIDEO');

  /// List of all possible values in this [enum][CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum].
  static const values = <CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum>[
    IMAGE,
    VIDEO,
  ];

  static CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsFilterValuesMapMediaTypeEnumTypeTransformer().decode(value);

  static List<CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum].
class CatalogsCreativeAssetsFilterValuesMapMediaTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsFilterValuesMapMediaTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsFilterValuesMapMediaTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsFilterValuesMapMediaTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'IMAGE': return CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum.IMAGE;
        case r'VIDEO': return CatalogsCreativeAssetsFilterValuesMapMediaTypeEnum.VIDEO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsCreativeAssetsFilterValuesMapMediaTypeEnumTypeTransformer] instance.
  static CatalogsCreativeAssetsFilterValuesMapMediaTypeEnumTypeTransformer? _instance;
}


