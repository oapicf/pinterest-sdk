//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelItemsPostFilter {
  /// Returns a new [CatalogsHotelItemsPostFilter] instance.
  CatalogsHotelItemsPostFilter({
    this.catalogId,
    required this.catalogType,
    this.hotelIds = const [],
  });

  /// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  CatalogsHotelItemsPostFilterCatalogTypeEnum catalogType;

  List<String> hotelIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelItemsPostFilter &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    _deepEquality.equals(other.hotelIds, hotelIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (catalogType.hashCode) +
    (hotelIds.hashCode);

  @override
  String toString() => 'CatalogsHotelItemsPostFilter[catalogId=$catalogId, catalogType=$catalogType, hotelIds=$hotelIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
      json[r'hotel_ids'] = this.hotelIds;
    return json;
  }

  /// Returns a new [CatalogsHotelItemsPostFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelItemsPostFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelItemsPostFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelItemsPostFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelItemsPostFilter(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsHotelItemsPostFilterCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        hotelIds: json[r'hotel_ids'] is Iterable
            ? (json[r'hotel_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsHotelItemsPostFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelItemsPostFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelItemsPostFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelItemsPostFilter> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelItemsPostFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelItemsPostFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelItemsPostFilter-objects as value to a dart map
  static Map<String, List<CatalogsHotelItemsPostFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelItemsPostFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelItemsPostFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'hotel_ids',
  };
}


class CatalogsHotelItemsPostFilterCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsHotelItemsPostFilterCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HOTEL = CatalogsHotelItemsPostFilterCatalogTypeEnum._(r'HOTEL');

  /// List of all possible values in this [enum][CatalogsHotelItemsPostFilterCatalogTypeEnum].
  static const values = <CatalogsHotelItemsPostFilterCatalogTypeEnum>[
    HOTEL,
  ];

  static CatalogsHotelItemsPostFilterCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelItemsPostFilterCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsHotelItemsPostFilterCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelItemsPostFilterCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelItemsPostFilterCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelItemsPostFilterCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelItemsPostFilterCatalogTypeEnum].
class CatalogsHotelItemsPostFilterCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelItemsPostFilterCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelItemsPostFilterCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelItemsPostFilterCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelItemsPostFilterCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsHotelItemsPostFilterCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelItemsPostFilterCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelItemsPostFilterCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsHotelItemsPostFilterCatalogTypeEnumTypeTransformer] instance.
  static CatalogsHotelItemsPostFilterCatalogTypeEnumTypeTransformer? _instance;
}


