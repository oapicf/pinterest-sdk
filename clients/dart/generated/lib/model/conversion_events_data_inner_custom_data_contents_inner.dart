//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionEventsDataInnerCustomDataContentsInner {
  /// Returns a new [ConversionEventsDataInnerCustomDataContentsInner] instance.
  ConversionEventsDataInnerCustomDataContentsInner({
    this.id,
    this.itemBrand,
    this.itemCategory,
    this.itemName,
    this.itemPrice,
    this.quantity,
  });

  /// The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// The brand of a product.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemBrand;

  /// The category of a product.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemCategory;

  /// The name of a product.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemName;

  /// The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemPrice;

  /// The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? quantity;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionEventsDataInnerCustomDataContentsInner &&
    other.id == id &&
    other.itemBrand == itemBrand &&
    other.itemCategory == itemCategory &&
    other.itemName == itemName &&
    other.itemPrice == itemPrice &&
    other.quantity == quantity;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (itemBrand == null ? 0 : itemBrand!.hashCode) +
    (itemCategory == null ? 0 : itemCategory!.hashCode) +
    (itemName == null ? 0 : itemName!.hashCode) +
    (itemPrice == null ? 0 : itemPrice!.hashCode) +
    (quantity == null ? 0 : quantity!.hashCode);

  @override
  String toString() => 'ConversionEventsDataInnerCustomDataContentsInner[id=$id, itemBrand=$itemBrand, itemCategory=$itemCategory, itemName=$itemName, itemPrice=$itemPrice, quantity=$quantity]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.itemBrand != null) {
      json[r'item_brand'] = this.itemBrand;
    } else {
      json[r'item_brand'] = null;
    }
    if (this.itemCategory != null) {
      json[r'item_category'] = this.itemCategory;
    } else {
      json[r'item_category'] = null;
    }
    if (this.itemName != null) {
      json[r'item_name'] = this.itemName;
    } else {
      json[r'item_name'] = null;
    }
    if (this.itemPrice != null) {
      json[r'item_price'] = this.itemPrice;
    } else {
      json[r'item_price'] = null;
    }
    if (this.quantity != null) {
      json[r'quantity'] = this.quantity;
    } else {
      json[r'quantity'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionEventsDataInnerCustomDataContentsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionEventsDataInnerCustomDataContentsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionEventsDataInnerCustomDataContentsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionEventsDataInnerCustomDataContentsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionEventsDataInnerCustomDataContentsInner(
        id: mapValueOfType<String>(json, r'id'),
        itemBrand: mapValueOfType<String>(json, r'item_brand'),
        itemCategory: mapValueOfType<String>(json, r'item_category'),
        itemName: mapValueOfType<String>(json, r'item_name'),
        itemPrice: mapValueOfType<String>(json, r'item_price'),
        quantity: mapValueOfType<int>(json, r'quantity'),
      );
    }
    return null;
  }

  static List<ConversionEventsDataInnerCustomDataContentsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventsDataInnerCustomDataContentsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventsDataInnerCustomDataContentsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionEventsDataInnerCustomDataContentsInner> mapFromJson(dynamic json) {
    final map = <String, ConversionEventsDataInnerCustomDataContentsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionEventsDataInnerCustomDataContentsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionEventsDataInnerCustomDataContentsInner-objects as value to a dart map
  static Map<String, List<ConversionEventsDataInnerCustomDataContentsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionEventsDataInnerCustomDataContentsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionEventsDataInnerCustomDataContentsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

