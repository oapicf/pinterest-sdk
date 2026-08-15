//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelProduct {
  /// Returns a new [CatalogsHotelProduct] instance.
  CatalogsHotelProduct({
    required this.catalogType,
    required this.metadata,
    required this.pin,
  });

  CatalogsHotelProductCatalogTypeEnum catalogType;

  CatalogsHotelProductMetadata metadata;

  Pin pin;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelProduct &&
    other.catalogType == catalogType &&
    other.metadata == metadata &&
    other.pin == pin;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (metadata.hashCode) +
    (pin.hashCode);

  @override
  String toString() => 'CatalogsHotelProduct[catalogType=$catalogType, metadata=$metadata, pin=$pin]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'metadata'] = this.metadata;
      json[r'pin'] = this.pin;
    return json;
  }

  /// Returns a new [CatalogsHotelProduct] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelProduct? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelProduct[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelProduct[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelProduct(
        catalogType: CatalogsHotelProductCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        metadata: CatalogsHotelProductMetadata.fromJson(json[r'metadata'])!,
        pin: Pin.fromJson(json[r'pin'])!,
      );
    }
    return null;
  }

  static List<CatalogsHotelProduct> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProduct>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProduct.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelProduct> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelProduct>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelProduct.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelProduct-objects as value to a dart map
  static Map<String, List<CatalogsHotelProduct>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelProduct>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelProduct.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'metadata',
    'pin',
  };
}


class CatalogsHotelProductCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsHotelProductCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HOTEL = CatalogsHotelProductCatalogTypeEnum._(r'HOTEL');

  /// List of all possible values in this [enum][CatalogsHotelProductCatalogTypeEnum].
  static const values = <CatalogsHotelProductCatalogTypeEnum>[
    HOTEL,
  ];

  static CatalogsHotelProductCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelProductCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsHotelProductCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelProductCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelProductCatalogTypeEnum].
class CatalogsHotelProductCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelProductCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelProductCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelProductCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelProductCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsHotelProductCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelProductCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelProductCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsHotelProductCatalogTypeEnumTypeTransformer] instance.
  static CatalogsHotelProductCatalogTypeEnumTypeTransformer? _instance;
}


