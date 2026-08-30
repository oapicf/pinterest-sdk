//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemResponse {
  /// Returns a new [ItemResponse] instance.
  ItemResponse({
    this.attributes,
    required this.catalogType,
    this.itemId,
    required this.itemResponseKind,
    this.pins = const [],
    this.hotelId,
    this.creativeAssetsId,
    this.errors = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsCreativeAssetsAttributes? attributes;

  ItemResponseCatalogTypeEnum catalogType;

  /// The catalog item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  ItemResponseItemResponseKindEnum itemResponseKind;

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

  /// Array with the errors for the item id requested
  List<ItemValidationEvent> errors;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemResponse &&
    other.attributes == attributes &&
    other.catalogType == catalogType &&
    other.itemId == itemId &&
    other.itemResponseKind == itemResponseKind &&
    _deepEquality.equals(other.pins, pins) &&
    other.hotelId == hotelId &&
    other.creativeAssetsId == creativeAssetsId &&
    _deepEquality.equals(other.errors, errors);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes == null ? 0 : attributes!.hashCode) +
    (catalogType.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode) +
    (itemResponseKind.hashCode) +
    (pins == null ? 0 : pins!.hashCode) +
    (hotelId == null ? 0 : hotelId!.hashCode) +
    (creativeAssetsId == null ? 0 : creativeAssetsId!.hashCode) +
    (errors.hashCode);

  @override
  String toString() => 'ItemResponse[attributes=$attributes, catalogType=$catalogType, itemId=$itemId, itemResponseKind=$itemResponseKind, pins=$pins, hotelId=$hotelId, creativeAssetsId=$creativeAssetsId, errors=$errors]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attributes != null) {
      json[r'attributes'] = this.attributes;
    } else {
      json[r'attributes'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
      json[r'item_response_kind'] = this.itemResponseKind;
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
      json[r'errors'] = this.errors;
    return json;
  }

  /// Returns a new [ItemResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "ItemResponse[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "ItemResponse[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'item_response_kind'), 'Required key "ItemResponse[item_response_kind]" is missing from JSON.');
        assert(json[r'item_response_kind'] != null, 'Required key "ItemResponse[item_response_kind]" has a null value in JSON.');
        assert(json.containsKey(r'errors'), 'Required key "ItemResponse[errors]" is missing from JSON.');
        assert(json[r'errors'] != null, 'Required key "ItemResponse[errors]" has a null value in JSON.');
        return true;
      }());

      return ItemResponse(
        attributes: CatalogsCreativeAssetsAttributes.fromJson(json[r'attributes']),
        catalogType: ItemResponseCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        itemId: mapValueOfType<String>(json, r'item_id'),
        itemResponseKind: ItemResponseItemResponseKindEnum.fromJson(json[r'item_response_kind'])!,
        pins: Pin.listFromJson(json[r'pins']),
        hotelId: mapValueOfType<String>(json, r'hotel_id'),
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id'),
        errors: ItemValidationEvent.listFromJson(json[r'errors']),
      );
    }
    return null;
  }

  static List<ItemResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemResponse> mapFromJson(dynamic json) {
    final map = <String, ItemResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemResponse-objects as value to a dart map
  static Map<String, List<ItemResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'item_response_kind',
    'errors',
  };
}


enum ItemResponseCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const ItemResponseCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ItemResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ItemResponseCatalogTypeEnum? fromJson(dynamic value) => ItemResponseCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ItemResponseCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ItemResponseCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemResponseCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemResponseCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ItemResponseCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [ItemResponseCatalogTypeEnum].
class ItemResponseCatalogTypeEnumTypeTransformer {
  factory ItemResponseCatalogTypeEnumTypeTransformer() => _instance ??= const ItemResponseCatalogTypeEnumTypeTransformer._();

  const ItemResponseCatalogTypeEnumTypeTransformer._();

  String encode(ItemResponseCatalogTypeEnum data) => data._value;

  /// Returns the instance of [ItemResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ItemResponseCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ItemResponseCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return ItemResponseCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ItemResponseCatalogTypeEnumTypeTransformer? _instance;
}


/// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
enum ItemResponseItemResponseKindEnum {
  creativeAssetsItemError._(r'creative_assets_item_error'),
  ;

  /// Instantiate a new enum with the provided value.
  const ItemResponseItemResponseKindEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ItemResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ItemResponseItemResponseKindEnum? fromJson(dynamic value) => ItemResponseItemResponseKindEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ItemResponseItemResponseKindEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ItemResponseItemResponseKindEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemResponseItemResponseKindEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemResponseItemResponseKindEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ItemResponseItemResponseKindEnum] to String,
/// and [decode] dynamic data back to [ItemResponseItemResponseKindEnum].
class ItemResponseItemResponseKindEnumTypeTransformer {
  factory ItemResponseItemResponseKindEnumTypeTransformer() => _instance ??= const ItemResponseItemResponseKindEnumTypeTransformer._();

  const ItemResponseItemResponseKindEnumTypeTransformer._();

  String encode(ItemResponseItemResponseKindEnum data) => data._value;

  /// Returns the instance of [ItemResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ItemResponseItemResponseKindEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ItemResponseItemResponseKindEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'creative_assets_item_error': return ItemResponseItemResponseKindEnum.creativeAssetsItemError;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ItemResponseItemResponseKindEnumTypeTransformer? _instance;
}


