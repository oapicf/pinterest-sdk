//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsItemsPostFilter {
  /// Returns a new [CatalogsCreativeAssetsItemsPostFilter] instance.
  CatalogsCreativeAssetsItemsPostFilter({
    this.catalogId,
    required this.catalogType,
    this.creativeAssetsIds = const [],
  });

  /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum catalogType;

  List<String> creativeAssetsIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsItemsPostFilter &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    _deepEquality.equals(other.creativeAssetsIds, creativeAssetsIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (catalogType.hashCode) +
    (creativeAssetsIds.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsItemsPostFilter[catalogId=$catalogId, catalogType=$catalogType, creativeAssetsIds=$creativeAssetsIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
      json[r'creative_assets_ids'] = this.creativeAssetsIds;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsItemsPostFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsItemsPostFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsItemsPostFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsItemsPostFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsItemsPostFilter(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        creativeAssetsIds: json[r'creative_assets_ids'] is Iterable
            ? (json[r'creative_assets_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsItemsPostFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemsPostFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemsPostFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsItemsPostFilter> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsItemsPostFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsItemsPostFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsItemsPostFilter-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsItemsPostFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsItemsPostFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsItemsPostFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'creative_assets_ids',
  };
}


class CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum].
  static const values = <CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum].
class CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnumTypeTransformer] instance.
  static CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnumTypeTransformer? _instance;
}


