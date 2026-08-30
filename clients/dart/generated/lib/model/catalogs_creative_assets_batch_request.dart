//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsBatchRequest {
  /// Returns a new [CatalogsCreativeAssetsBatchRequest] instance.
  CatalogsCreativeAssetsBatchRequest({
    this.catalogId,
    required this.catalogType,
    required this.country,
    this.items = const [],
    required this.language,
  });

  /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  CatalogsCreativeAssetsBatchRequestCatalogTypeEnum catalogType;

  Country country;

  /// Array with creative assets item operations
  List<CatalogsCreativeAssetsBatchItem> items;

  /// We recommend using the CatalogsLocale values.
  LanguageEnum language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsBatchRequest &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.country == country &&
    _deepEquality.equals(other.items, items) &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (catalogType.hashCode) +
    (country.hashCode) +
    (items.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsBatchRequest[catalogId=$catalogId, catalogType=$catalogType, country=$country, items=$items, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
      json[r'country'] = this.country;
      json[r'items'] = this.items;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsBatchRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsBatchRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsCreativeAssetsBatchRequest[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsCreativeAssetsBatchRequest[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'country'), 'Required key "CatalogsCreativeAssetsBatchRequest[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "CatalogsCreativeAssetsBatchRequest[country]" has a null value in JSON.');
        assert(json.containsKey(r'items'), 'Required key "CatalogsCreativeAssetsBatchRequest[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "CatalogsCreativeAssetsBatchRequest[items]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "CatalogsCreativeAssetsBatchRequest[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "CatalogsCreativeAssetsBatchRequest[language]" has a null value in JSON.');
        return true;
      }());

      return CatalogsCreativeAssetsBatchRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsCreativeAssetsBatchRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country'])!,
        items: CatalogsCreativeAssetsBatchItem.listFromJson(json[r'items']),
        language: LanguageEnum.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsBatchRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsBatchRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsBatchRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsBatchRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsBatchRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsBatchRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsBatchRequest-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsBatchRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsBatchRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsBatchRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'country',
    'items',
    'language',
  };
}


enum CatalogsCreativeAssetsBatchRequestCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreativeAssetsBatchRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreativeAssetsBatchRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreativeAssetsBatchRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsBatchRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreativeAssetsBatchRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreativeAssetsBatchRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsBatchRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsBatchRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsBatchRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsBatchRequestCatalogTypeEnum].
class CatalogsCreativeAssetsBatchRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsBatchRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsBatchRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsBatchRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsBatchRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsCreativeAssetsBatchRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsBatchRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreativeAssetsBatchRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsBatchRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreativeAssetsBatchRequestCatalogTypeEnumTypeTransformer? _instance;
}


