//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailItemsPostFilter {
  /// Returns a new [CatalogsRetailItemsPostFilter] instance.
  CatalogsRetailItemsPostFilter({
    this.catalogId,
    required this.catalogType,
    this.itemIds = const [],
  });

  /// Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  CatalogsRetailItemsPostFilterCatalogTypeEnum catalogType;

  List<String> itemIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailItemsPostFilter &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    _deepEquality.equals(other.itemIds, itemIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (catalogType.hashCode) +
    (itemIds.hashCode);

  @override
  String toString() => 'CatalogsRetailItemsPostFilter[catalogId=$catalogId, catalogType=$catalogType, itemIds=$itemIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
      json[r'item_ids'] = this.itemIds;
    return json;
  }

  /// Returns a new [CatalogsRetailItemsPostFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailItemsPostFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsRetailItemsPostFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsRetailItemsPostFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsRetailItemsPostFilter(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsRetailItemsPostFilterCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        itemIds: json[r'item_ids'] is Iterable
            ? (json[r'item_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsRetailItemsPostFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemsPostFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemsPostFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailItemsPostFilter> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailItemsPostFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailItemsPostFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailItemsPostFilter-objects as value to a dart map
  static Map<String, List<CatalogsRetailItemsPostFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailItemsPostFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailItemsPostFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'item_ids',
  };
}


class CatalogsRetailItemsPostFilterCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsRetailItemsPostFilterCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RETAIL = CatalogsRetailItemsPostFilterCatalogTypeEnum._(r'RETAIL');

  /// List of all possible values in this [enum][CatalogsRetailItemsPostFilterCatalogTypeEnum].
  static const values = <CatalogsRetailItemsPostFilterCatalogTypeEnum>[
    RETAIL,
  ];

  static CatalogsRetailItemsPostFilterCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailItemsPostFilterCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsRetailItemsPostFilterCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemsPostFilterCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemsPostFilterCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailItemsPostFilterCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailItemsPostFilterCatalogTypeEnum].
class CatalogsRetailItemsPostFilterCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailItemsPostFilterCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailItemsPostFilterCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailItemsPostFilterCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailItemsPostFilterCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsRetailItemsPostFilterCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailItemsPostFilterCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailItemsPostFilterCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsRetailItemsPostFilterCatalogTypeEnumTypeTransformer] instance.
  static CatalogsRetailItemsPostFilterCatalogTypeEnumTypeTransformer? _instance;
}


