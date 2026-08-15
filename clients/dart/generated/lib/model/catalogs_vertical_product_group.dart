//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsVerticalProductGroup {
  /// Returns a new [CatalogsVerticalProductGroup] instance.
  CatalogsVerticalProductGroup({
    required this.catalogId,
    required this.catalogType,
    this.country,
    this.createdAt,
    this.description,
    required this.feedId,
    required this.filters,
    required this.id,
    this.isFeatured,
    this.locale,
    this.name,
    this.status,
    required this.type,
    this.updatedAt,
  });

  /// Catalog id pertaining to the creative assets product group.
  String catalogId;

  CatalogsVerticalProductGroupCatalogTypeEnum catalogType;

  String? country;

  /// Unix timestamp in seconds of when catalog product group was created.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdAt;

  String? description;

  /// id of the catalogs feed belonging to this catalog product group
  String? feedId;

  CatalogsCreativeAssetsProductGroupFilters filters;

  /// ID of the creative assets product group.
  String id;

  /// boolean indicator of whether the product group is being featured or not
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isFeatured;

  String? locale;

  /// Name of creative assets product group
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsProductGroupStatus? status;

  CatalogsHotelProductGroupType type;

  /// Unix timestamp in seconds of last time catalog product group was updated.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsVerticalProductGroup &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.country == country &&
    other.createdAt == createdAt &&
    other.description == description &&
    other.feedId == feedId &&
    other.filters == filters &&
    other.id == id &&
    other.isFeatured == isFeatured &&
    other.locale == locale &&
    other.name == name &&
    other.status == status &&
    other.type == type &&
    other.updatedAt == updatedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (country == null ? 0 : country!.hashCode) +
    (createdAt == null ? 0 : createdAt!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (feedId == null ? 0 : feedId!.hashCode) +
    (filters.hashCode) +
    (id.hashCode) +
    (isFeatured == null ? 0 : isFeatured!.hashCode) +
    (locale == null ? 0 : locale!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (type.hashCode) +
    (updatedAt == null ? 0 : updatedAt!.hashCode);

  @override
  String toString() => 'CatalogsVerticalProductGroup[catalogId=$catalogId, catalogType=$catalogType, country=$country, createdAt=$createdAt, description=$description, feedId=$feedId, filters=$filters, id=$id, isFeatured=$isFeatured, locale=$locale, name=$name, status=$status, type=$type, updatedAt=$updatedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
    if (this.country != null) {
      json[r'country'] = this.country;
    } else {
      json[r'country'] = null;
    }
    if (this.createdAt != null) {
      json[r'created_at'] = this.createdAt;
    } else {
      json[r'created_at'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.feedId != null) {
      json[r'feed_id'] = this.feedId;
    } else {
      json[r'feed_id'] = null;
    }
      json[r'filters'] = this.filters;
      json[r'id'] = this.id;
    if (this.isFeatured != null) {
      json[r'is_featured'] = this.isFeatured;
    } else {
      json[r'is_featured'] = null;
    }
    if (this.locale != null) {
      json[r'locale'] = this.locale;
    } else {
      json[r'locale'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
      json[r'type'] = this.type;
    if (this.updatedAt != null) {
      json[r'updated_at'] = this.updatedAt;
    } else {
      json[r'updated_at'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsVerticalProductGroup] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsVerticalProductGroup? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsVerticalProductGroup[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsVerticalProductGroup[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsVerticalProductGroup(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsVerticalProductGroupCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: mapValueOfType<String>(json, r'country'),
        createdAt: mapValueOfType<int>(json, r'created_at'),
        description: mapValueOfType<String>(json, r'description'),
        feedId: mapValueOfType<String>(json, r'feed_id'),
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters'])!,
        id: mapValueOfType<String>(json, r'id')!,
        isFeatured: mapValueOfType<bool>(json, r'is_featured'),
        locale: mapValueOfType<String>(json, r'locale'),
        name: mapValueOfType<String>(json, r'name'),
        status: CatalogsProductGroupStatus.fromJson(json[r'status']),
        type: CatalogsHotelProductGroupType.fromJson(json[r'type'])!,
        updatedAt: mapValueOfType<int>(json, r'updated_at'),
      );
    }
    return null;
  }

  static List<CatalogsVerticalProductGroup> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalProductGroup>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalProductGroup.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsVerticalProductGroup> mapFromJson(dynamic json) {
    final map = <String, CatalogsVerticalProductGroup>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsVerticalProductGroup.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsVerticalProductGroup-objects as value to a dart map
  static Map<String, List<CatalogsVerticalProductGroup>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsVerticalProductGroup>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsVerticalProductGroup.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_id',
    'catalog_type',
    'feed_id',
    'filters',
    'id',
    'type',
  };
}


class CatalogsVerticalProductGroupCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsVerticalProductGroupCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsVerticalProductGroupCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsVerticalProductGroupCatalogTypeEnum].
  static const values = <CatalogsVerticalProductGroupCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsVerticalProductGroupCatalogTypeEnum? fromJson(dynamic value) => CatalogsVerticalProductGroupCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsVerticalProductGroupCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalProductGroupCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalProductGroupCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsVerticalProductGroupCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsVerticalProductGroupCatalogTypeEnum].
class CatalogsVerticalProductGroupCatalogTypeEnumTypeTransformer {
  factory CatalogsVerticalProductGroupCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsVerticalProductGroupCatalogTypeEnumTypeTransformer._();

  const CatalogsVerticalProductGroupCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsVerticalProductGroupCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsVerticalProductGroupCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsVerticalProductGroupCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsVerticalProductGroupCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsVerticalProductGroupCatalogTypeEnumTypeTransformer] instance.
  static CatalogsVerticalProductGroupCatalogTypeEnumTypeTransformer? _instance;
}


