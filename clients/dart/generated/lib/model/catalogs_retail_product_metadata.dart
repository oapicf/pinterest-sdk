//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailProductMetadata {
  /// Returns a new [CatalogsRetailProductMetadata] instance.
  CatalogsRetailProductMetadata({
    required this.availability,
    required this.currency,
    required this.itemGroupId,
    required this.itemId,
    required this.price,
    required this.salePrice,
  });

  NonNullableProductAvailabilityType availability;

  NonNullableCatalogsCurrency currency;

  /// The parent ID of the product.
  String? itemGroupId;

  /// The user-created unique ID that represents the product.
  String itemId;

  /// The price of the product.
  num price;

  /// The discounted price of the product.
  num? salePrice;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailProductMetadata &&
    other.availability == availability &&
    other.currency == currency &&
    other.itemGroupId == itemGroupId &&
    other.itemId == itemId &&
    other.price == price &&
    other.salePrice == salePrice;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (availability.hashCode) +
    (currency.hashCode) +
    (itemGroupId == null ? 0 : itemGroupId!.hashCode) +
    (itemId.hashCode) +
    (price.hashCode) +
    (salePrice == null ? 0 : salePrice!.hashCode);

  @override
  String toString() => 'CatalogsRetailProductMetadata[availability=$availability, currency=$currency, itemGroupId=$itemGroupId, itemId=$itemId, price=$price, salePrice=$salePrice]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'availability'] = this.availability;
      json[r'currency'] = this.currency;
    if (this.itemGroupId != null) {
      json[r'item_group_id'] = this.itemGroupId;
    } else {
      json[r'item_group_id'] = null;
    }
      json[r'item_id'] = this.itemId;
      json[r'price'] = this.price;
    if (this.salePrice != null) {
      json[r'sale_price'] = this.salePrice;
    } else {
      json[r'sale_price'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsRetailProductMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailProductMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsRetailProductMetadata[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsRetailProductMetadata[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsRetailProductMetadata(
        availability: NonNullableProductAvailabilityType.fromJson(json[r'availability'])!,
        currency: NonNullableCatalogsCurrency.fromJson(json[r'currency'])!,
        itemGroupId: mapValueOfType<String>(json, r'item_group_id'),
        itemId: mapValueOfType<String>(json, r'item_id')!,
        price: num.parse('${json[r'price']}'),
        salePrice: json[r'sale_price'] == null
            ? null
            : num.parse('${json[r'sale_price']}'),
      );
    }
    return null;
  }

  static List<CatalogsRetailProductMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailProductMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailProductMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailProductMetadata> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailProductMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailProductMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailProductMetadata-objects as value to a dart map
  static Map<String, List<CatalogsRetailProductMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailProductMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailProductMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'availability',
    'currency',
    'item_group_id',
    'item_id',
    'price',
    'sale_price',
  };
}

