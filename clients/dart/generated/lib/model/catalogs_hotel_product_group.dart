//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelProductGroup {
  /// Returns a new [CatalogsHotelProductGroup] instance.
  CatalogsHotelProductGroup({
    required this.catalogId,
    required this.catalogType,
    this.createdAt,
    this.description,
    required this.filters,
    required this.id,
    this.name,
    required this.type,
    this.updatedAt,
  });

  /// Catalog id pertaining to the hotel product group.
  String catalogId;

  CatalogsHotelProductGroupCatalogTypeEnum catalogType;

  /// Unix timestamp in seconds of when catalog product group was created.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdAt;

  String? description;

  CatalogsHotelProductGroupFilters filters;

  /// ID of the hotel product group.
  String id;

  /// Name of hotel product group
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

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
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelProductGroup &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.createdAt == createdAt &&
    other.description == description &&
    other.filters == filters &&
    other.id == id &&
    other.name == name &&
    other.type == type &&
    other.updatedAt == updatedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (createdAt == null ? 0 : createdAt!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (filters.hashCode) +
    (id.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (type.hashCode) +
    (updatedAt == null ? 0 : updatedAt!.hashCode);

  @override
  String toString() => 'CatalogsHotelProductGroup[catalogId=$catalogId, catalogType=$catalogType, createdAt=$createdAt, description=$description, filters=$filters, id=$id, name=$name, type=$type, updatedAt=$updatedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
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
      json[r'filters'] = this.filters;
      json[r'id'] = this.id;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
      json[r'type'] = this.type;
    if (this.updatedAt != null) {
      json[r'updated_at'] = this.updatedAt;
    } else {
      json[r'updated_at'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsHotelProductGroup] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelProductGroup? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelProductGroup[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelProductGroup[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelProductGroup(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsHotelProductGroupCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        createdAt: mapValueOfType<int>(json, r'created_at'),
        description: mapValueOfType<String>(json, r'description'),
        filters: CatalogsHotelProductGroupFilters.fromJson(json[r'filters'])!,
        id: mapValueOfType<String>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name'),
        type: CatalogsHotelProductGroupType.fromJson(json[r'type'])!,
        updatedAt: mapValueOfType<int>(json, r'updated_at'),
      );
    }
    return null;
  }

  static List<CatalogsHotelProductGroup> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroup>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroup.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelProductGroup> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelProductGroup>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelProductGroup.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelProductGroup-objects as value to a dart map
  static Map<String, List<CatalogsHotelProductGroup>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelProductGroup>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelProductGroup.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_id',
    'catalog_type',
    'filters',
    'id',
    'type',
  };
}


class CatalogsHotelProductGroupCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsHotelProductGroupCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HOTEL = CatalogsHotelProductGroupCatalogTypeEnum._(r'HOTEL');

  /// List of all possible values in this [enum][CatalogsHotelProductGroupCatalogTypeEnum].
  static const values = <CatalogsHotelProductGroupCatalogTypeEnum>[
    HOTEL,
  ];

  static CatalogsHotelProductGroupCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelProductGroupCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsHotelProductGroupCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelProductGroupCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelProductGroupCatalogTypeEnum].
class CatalogsHotelProductGroupCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelProductGroupCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelProductGroupCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelProductGroupCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelProductGroupCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsHotelProductGroupCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelProductGroupCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelProductGroupCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsHotelProductGroupCatalogTypeEnumTypeTransformer] instance.
  static CatalogsHotelProductGroupCatalogTypeEnumTypeTransformer? _instance;
}


