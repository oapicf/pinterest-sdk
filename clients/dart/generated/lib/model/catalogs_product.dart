//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProduct {
  /// Returns a new [CatalogsProduct] instance.
  CatalogsProduct({
    required this.catalogType,
    required this.metadata,
    required this.pin,
  });

  CatalogsType catalogType;

  CatalogsCreativeAssetsProductMetadata metadata;

  Pin pin;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProduct &&
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
  String toString() => 'CatalogsProduct[catalogType=$catalogType, metadata=$metadata, pin=$pin]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'metadata'] = this.metadata;
      json[r'pin'] = this.pin;
    return json;
  }

  /// Returns a new [CatalogsProduct] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProduct? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsProduct[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsProduct[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsProduct(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        metadata: CatalogsCreativeAssetsProductMetadata.fromJson(json[r'metadata'])!,
        pin: Pin.fromJson(json[r'pin'])!,
      );
    }
    return null;
  }

  static List<CatalogsProduct> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProduct>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProduct.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProduct> mapFromJson(dynamic json) {
    final map = <String, CatalogsProduct>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProduct.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProduct-objects as value to a dart map
  static Map<String, List<CatalogsProduct>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProduct>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProduct.listFromJson(entry.value, growable: growable,);
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

