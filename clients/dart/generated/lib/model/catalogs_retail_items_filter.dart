//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailItemsFilter {
  /// Returns a new [CatalogsRetailItemsFilter] instance.
  CatalogsRetailItemsFilter({
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

  CatalogsRetailItemsFilterCatalogTypeEnum catalogType;

  List<String> itemIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailItemsFilter &&
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
  String toString() => 'CatalogsRetailItemsFilter[catalogId=$catalogId, catalogType=$catalogType, itemIds=$itemIds]';

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

  /// Returns a new [CatalogsRetailItemsFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailItemsFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsRetailItemsFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsRetailItemsFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsRetailItemsFilter(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsRetailItemsFilterCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        itemIds: json[r'item_ids'] is Iterable
            ? (json[r'item_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsRetailItemsFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemsFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemsFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailItemsFilter> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailItemsFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailItemsFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailItemsFilter-objects as value to a dart map
  static Map<String, List<CatalogsRetailItemsFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailItemsFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailItemsFilter.listFromJson(entry.value, growable: growable,);
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


class CatalogsRetailItemsFilterCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsRetailItemsFilterCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RETAIL = CatalogsRetailItemsFilterCatalogTypeEnum._(r'RETAIL');

  /// List of all possible values in this [enum][CatalogsRetailItemsFilterCatalogTypeEnum].
  static const values = <CatalogsRetailItemsFilterCatalogTypeEnum>[
    RETAIL,
  ];

  static CatalogsRetailItemsFilterCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailItemsFilterCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsRetailItemsFilterCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemsFilterCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemsFilterCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailItemsFilterCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailItemsFilterCatalogTypeEnum].
class CatalogsRetailItemsFilterCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailItemsFilterCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailItemsFilterCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailItemsFilterCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailItemsFilterCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsRetailItemsFilterCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailItemsFilterCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailItemsFilterCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsRetailItemsFilterCatalogTypeEnumTypeTransformer] instance.
  static CatalogsRetailItemsFilterCatalogTypeEnumTypeTransformer? _instance;
}


