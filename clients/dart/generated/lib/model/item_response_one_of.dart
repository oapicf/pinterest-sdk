//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemResponseOneOf {
  /// Returns a new [ItemResponseOneOf] instance.
  ItemResponseOneOf({
    required this.catalogType,
    this.attributes,
    this.itemId,
    this.pins = const [],
    this.hotelId,
    this.creativeAssetsId,
  });

  CatalogsType catalogType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsCreativeAssetsAttributes? attributes;

  /// The catalog retail item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  /// The pins mapped to the item
  List<Pin>? pins;

  /// The catalog hotel id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? hotelId;

  /// The catalog creative assets id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? creativeAssetsId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemResponseOneOf &&
    other.catalogType == catalogType &&
    other.attributes == attributes &&
    other.itemId == itemId &&
    _deepEquality.equals(other.pins, pins) &&
    other.hotelId == hotelId &&
    other.creativeAssetsId == creativeAssetsId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (attributes == null ? 0 : attributes!.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode) +
    (pins == null ? 0 : pins!.hashCode) +
    (hotelId == null ? 0 : hotelId!.hashCode) +
    (creativeAssetsId == null ? 0 : creativeAssetsId!.hashCode);

  @override
  String toString() => 'ItemResponseOneOf[catalogType=$catalogType, attributes=$attributes, itemId=$itemId, pins=$pins, hotelId=$hotelId, creativeAssetsId=$creativeAssetsId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
    if (this.attributes != null) {
      json[r'attributes'] = this.attributes;
    } else {
      json[r'attributes'] = null;
    }
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
    if (this.pins != null) {
      json[r'pins'] = this.pins;
    } else {
      json[r'pins'] = null;
    }
    if (this.hotelId != null) {
      json[r'hotel_id'] = this.hotelId;
    } else {
      json[r'hotel_id'] = null;
    }
    if (this.creativeAssetsId != null) {
      json[r'creative_assets_id'] = this.creativeAssetsId;
    } else {
      json[r'creative_assets_id'] = null;
    }
    return json;
  }

  /// Returns a new [ItemResponseOneOf] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemResponseOneOf? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemResponseOneOf[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemResponseOneOf[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemResponseOneOf(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        attributes: CatalogsCreativeAssetsAttributes.fromJson(json[r'attributes']),
        itemId: mapValueOfType<String>(json, r'item_id'),
        pins: Pin.listFromJson(json[r'pins']),
        hotelId: mapValueOfType<String>(json, r'hotel_id'),
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id'),
      );
    }
    return null;
  }

  static List<ItemResponseOneOf> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemResponseOneOf>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemResponseOneOf.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemResponseOneOf> mapFromJson(dynamic json) {
    final map = <String, ItemResponseOneOf>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemResponseOneOf.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemResponseOneOf-objects as value to a dart map
  static Map<String, List<ItemResponseOneOf>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemResponseOneOf>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemResponseOneOf.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
  };
}

