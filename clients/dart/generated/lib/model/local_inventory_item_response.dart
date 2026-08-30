//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocalInventoryItemResponse {
  /// Returns a new [LocalInventoryItemResponse] instance.
  LocalInventoryItemResponse({
    this.adLink,
    this.availability,
    required this.createdAt,
    required this.itemId,
    required this.lastUpdatedTime,
    this.price,
    this.salePrice,
    required this.storeMetadata,
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
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ItemAvailability? availability;

  /// The millisecond timestamp when the local inventory item was created
  int createdAt;

  /// The catalog item id in the merchant namespace
  String itemId;

  /// The millisecond timestamp when the local inventory item was lastly modified by the merchant.
  int lastUpdatedTime;

  /// The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? price;

  /// The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? salePrice;

  /// Store metadata for this local inventory item
  StoreMetadata storeMetadata;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocalInventoryItemResponse &&
    other.adLink == adLink &&
    other.availability == availability &&
    other.createdAt == createdAt &&
    other.itemId == itemId &&
    other.lastUpdatedTime == lastUpdatedTime &&
    other.price == price &&
    other.salePrice == salePrice &&
    other.storeMetadata == storeMetadata;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adLink == null ? 0 : adLink!.hashCode) +
    (availability == null ? 0 : availability!.hashCode) +
    (createdAt.hashCode) +
    (itemId.hashCode) +
    (lastUpdatedTime.hashCode) +
    (price == null ? 0 : price!.hashCode) +
    (salePrice == null ? 0 : salePrice!.hashCode) +
    (storeMetadata.hashCode);

  @override
  String toString() => 'LocalInventoryItemResponse[adLink=$adLink, availability=$availability, createdAt=$createdAt, itemId=$itemId, lastUpdatedTime=$lastUpdatedTime, price=$price, salePrice=$salePrice, storeMetadata=$storeMetadata]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adLink != null) {
      json[r'ad_link'] = this.adLink;
    } else {
      json[r'ad_link'] = null;
    }
    if (this.availability != null) {
      json[r'availability'] = this.availability;
    } else {
      json[r'availability'] = null;
    }
      json[r'created_at'] = this.createdAt;
      json[r'item_id'] = this.itemId;
      json[r'last_updated_time'] = this.lastUpdatedTime;
    if (this.price != null) {
      json[r'price'] = this.price;
    } else {
      json[r'price'] = null;
    }
    if (this.salePrice != null) {
      json[r'sale_price'] = this.salePrice;
    } else {
      json[r'sale_price'] = null;
    }
      json[r'store_metadata'] = this.storeMetadata;
    return json;
  }

  /// Returns a new [LocalInventoryItemResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocalInventoryItemResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'created_at'), 'Required key "LocalInventoryItemResponse[created_at]" is missing from JSON.');
        assert(json[r'created_at'] != null, 'Required key "LocalInventoryItemResponse[created_at]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "LocalInventoryItemResponse[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "LocalInventoryItemResponse[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'last_updated_time'), 'Required key "LocalInventoryItemResponse[last_updated_time]" is missing from JSON.');
        assert(json[r'last_updated_time'] != null, 'Required key "LocalInventoryItemResponse[last_updated_time]" has a null value in JSON.');
        assert(json.containsKey(r'store_metadata'), 'Required key "LocalInventoryItemResponse[store_metadata]" is missing from JSON.');
        assert(json[r'store_metadata'] != null, 'Required key "LocalInventoryItemResponse[store_metadata]" has a null value in JSON.');
        return true;
      }());

      return LocalInventoryItemResponse(
        adLink: mapValueOfType<String>(json, r'ad_link'),
        availability: ItemAvailability.fromJson(json[r'availability']),
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        lastUpdatedTime: mapValueOfType<int>(json, r'last_updated_time')!,
        price: mapValueOfType<String>(json, r'price'),
        salePrice: mapValueOfType<String>(json, r'sale_price'),
        storeMetadata: StoreMetadata.fromJson(json[r'store_metadata'])!,
      );
    }
    return null;
  }

  static List<LocalInventoryItemResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryItemResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryItemResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocalInventoryItemResponse> mapFromJson(dynamic json) {
    final map = <String, LocalInventoryItemResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocalInventoryItemResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocalInventoryItemResponse-objects as value to a dart map
  static Map<String, List<LocalInventoryItemResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocalInventoryItemResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocalInventoryItemResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'created_at',
    'item_id',
    'last_updated_time',
    'store_metadata',
  };
}

