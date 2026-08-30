//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailProduct {
  /// Returns a new [CatalogsRetailProduct] instance.
  CatalogsRetailProduct({
    required this.catalogType,
    required this.metadata,
    required this.pin,
  });

  CatalogsRetailProductCatalogTypeEnum catalogType;

  CatalogsRetailProductMetadata metadata;

  Pin pin;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailProduct &&
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
  String toString() => 'CatalogsRetailProduct[catalogType=$catalogType, metadata=$metadata, pin=$pin]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'metadata'] = this.metadata;
      json[r'pin'] = this.pin;
    return json;
  }

  /// Returns a new [CatalogsRetailProduct] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailProduct? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsRetailProduct[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsRetailProduct[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'metadata'), 'Required key "CatalogsRetailProduct[metadata]" is missing from JSON.');
        assert(json[r'metadata'] != null, 'Required key "CatalogsRetailProduct[metadata]" has a null value in JSON.');
        assert(json.containsKey(r'pin'), 'Required key "CatalogsRetailProduct[pin]" is missing from JSON.');
        assert(json[r'pin'] != null, 'Required key "CatalogsRetailProduct[pin]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailProduct(
        catalogType: CatalogsRetailProductCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        metadata: CatalogsRetailProductMetadata.fromJson(json[r'metadata'])!,
        pin: Pin.fromJson(json[r'pin'])!,
      );
    }
    return null;
  }

  static List<CatalogsRetailProduct> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailProduct>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailProduct.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailProduct> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailProduct>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailProduct.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailProduct-objects as value to a dart map
  static Map<String, List<CatalogsRetailProduct>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailProduct>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailProduct.listFromJson(entry.value, growable: growable,);
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


enum CatalogsRetailProductCatalogTypeEnum {
  RETAIL._(r'RETAIL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailProductCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailProductCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailProductCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailProductCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailProductCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailProductCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailProductCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailProductCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailProductCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailProductCatalogTypeEnum].
class CatalogsRetailProductCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailProductCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailProductCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailProductCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailProductCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailProductCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailProductCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailProductCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailProductCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailProductCatalogTypeEnumTypeTransformer? _instance;
}


