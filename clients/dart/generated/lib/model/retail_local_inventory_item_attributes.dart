//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RetailLocalInventoryItemAttributes {
  /// Returns a new [RetailLocalInventoryItemAttributes] instance.
  RetailLocalInventoryItemAttributes({
    this.adLink,
    required this.availability,
    required this.price,
    this.salePrice,
  });

  /// Ad link for the item
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adLink;

  /// Availability status of the item
  ItemAvailability availability;

  /// The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
  String price;

  /// The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? salePrice;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RetailLocalInventoryItemAttributes &&
    other.adLink == adLink &&
    other.availability == availability &&
    other.price == price &&
    other.salePrice == salePrice;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adLink == null ? 0 : adLink!.hashCode) +
    (availability.hashCode) +
    (price.hashCode) +
    (salePrice == null ? 0 : salePrice!.hashCode);

  @override
  String toString() => 'RetailLocalInventoryItemAttributes[adLink=$adLink, availability=$availability, price=$price, salePrice=$salePrice]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adLink != null) {
      json[r'ad_link'] = this.adLink;
    } else {
      json[r'ad_link'] = null;
    }
      json[r'availability'] = this.availability;
      json[r'price'] = this.price;
    if (this.salePrice != null) {
      json[r'sale_price'] = this.salePrice;
    } else {
      json[r'sale_price'] = null;
    }
    return json;
  }

  /// Returns a new [RetailLocalInventoryItemAttributes] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RetailLocalInventoryItemAttributes? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'availability'), 'Required key "RetailLocalInventoryItemAttributes[availability]" is missing from JSON.');
        assert(json[r'availability'] != null, 'Required key "RetailLocalInventoryItemAttributes[availability]" has a null value in JSON.');
        assert(json.containsKey(r'price'), 'Required key "RetailLocalInventoryItemAttributes[price]" is missing from JSON.');
        assert(json[r'price'] != null, 'Required key "RetailLocalInventoryItemAttributes[price]" has a null value in JSON.');
        return true;
      }());

      return RetailLocalInventoryItemAttributes(
        adLink: mapValueOfType<String>(json, r'ad_link'),
        availability: ItemAvailability.fromJson(json[r'availability'])!,
        price: mapValueOfType<String>(json, r'price')!,
        salePrice: mapValueOfType<String>(json, r'sale_price'),
      );
    }
    return null;
  }

  static List<RetailLocalInventoryItemAttributes> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RetailLocalInventoryItemAttributes>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RetailLocalInventoryItemAttributes.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RetailLocalInventoryItemAttributes> mapFromJson(dynamic json) {
    final map = <String, RetailLocalInventoryItemAttributes>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RetailLocalInventoryItemAttributes.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RetailLocalInventoryItemAttributes-objects as value to a dart map
  static Map<String, List<RetailLocalInventoryItemAttributes>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RetailLocalInventoryItemAttributes>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RetailLocalInventoryItemAttributes.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'availability',
    'price',
  };
}

