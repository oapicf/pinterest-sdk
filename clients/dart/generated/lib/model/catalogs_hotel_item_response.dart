//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelItemResponse {
  /// Returns a new [CatalogsHotelItemResponse] instance.
  CatalogsHotelItemResponse({
    this.attributes,
    required this.catalogType,
    this.hotelId,
    required this.itemResponseKind,
    this.pins = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsHotelAttributes? attributes;

  CatalogsHotelItemResponseCatalogTypeEnum catalogType;

  /// The catalog hotel id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? hotelId;

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  CatalogsHotelItemResponseItemResponseKindEnum itemResponseKind;

  /// The pins mapped to the item
  List<Pin>? pins;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelItemResponse &&
    other.attributes == attributes &&
    other.catalogType == catalogType &&
    other.hotelId == hotelId &&
    other.itemResponseKind == itemResponseKind &&
    _deepEquality.equals(other.pins, pins);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes == null ? 0 : attributes!.hashCode) +
    (catalogType.hashCode) +
    (hotelId == null ? 0 : hotelId!.hashCode) +
    (itemResponseKind.hashCode) +
    (pins == null ? 0 : pins!.hashCode);

  @override
  String toString() => 'CatalogsHotelItemResponse[attributes=$attributes, catalogType=$catalogType, hotelId=$hotelId, itemResponseKind=$itemResponseKind, pins=$pins]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attributes != null) {
      json[r'attributes'] = this.attributes;
    } else {
      json[r'attributes'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
    if (this.hotelId != null) {
      json[r'hotel_id'] = this.hotelId;
    } else {
      json[r'hotel_id'] = null;
    }
      json[r'item_response_kind'] = this.itemResponseKind;
    if (this.pins != null) {
      json[r'pins'] = this.pins;
    } else {
      json[r'pins'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsHotelItemResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelItemResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsHotelItemResponse[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsHotelItemResponse[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'item_response_kind'), 'Required key "CatalogsHotelItemResponse[item_response_kind]" is missing from JSON.');
        assert(json[r'item_response_kind'] != null, 'Required key "CatalogsHotelItemResponse[item_response_kind]" has a null value in JSON.');
        return true;
      }());

      return CatalogsHotelItemResponse(
        attributes: CatalogsHotelAttributes.fromJson(json[r'attributes']),
        catalogType: CatalogsHotelItemResponseCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        hotelId: mapValueOfType<String>(json, r'hotel_id'),
        itemResponseKind: CatalogsHotelItemResponseItemResponseKindEnum.fromJson(json[r'item_response_kind'])!,
        pins: Pin.listFromJson(json[r'pins']),
      );
    }
    return null;
  }

  static List<CatalogsHotelItemResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelItemResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelItemResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelItemResponse> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelItemResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelItemResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelItemResponse-objects as value to a dart map
  static Map<String, List<CatalogsHotelItemResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelItemResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelItemResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'item_response_kind',
  };
}


enum CatalogsHotelItemResponseCatalogTypeEnum {
  HOTEL._(r'HOTEL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsHotelItemResponseCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsHotelItemResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsHotelItemResponseCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelItemResponseCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsHotelItemResponseCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsHotelItemResponseCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelItemResponseCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelItemResponseCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelItemResponseCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelItemResponseCatalogTypeEnum].
class CatalogsHotelItemResponseCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelItemResponseCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelItemResponseCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelItemResponseCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelItemResponseCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsHotelItemResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelItemResponseCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsHotelItemResponseCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelItemResponseCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsHotelItemResponseCatalogTypeEnumTypeTransformer? _instance;
}


/// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
enum CatalogsHotelItemResponseItemResponseKindEnum {
  hotelItem._(r'hotel_item'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsHotelItemResponseItemResponseKindEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsHotelItemResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsHotelItemResponseItemResponseKindEnum? fromJson(dynamic value) => CatalogsHotelItemResponseItemResponseKindEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsHotelItemResponseItemResponseKindEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsHotelItemResponseItemResponseKindEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelItemResponseItemResponseKindEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelItemResponseItemResponseKindEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelItemResponseItemResponseKindEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelItemResponseItemResponseKindEnum].
class CatalogsHotelItemResponseItemResponseKindEnumTypeTransformer {
  factory CatalogsHotelItemResponseItemResponseKindEnumTypeTransformer() => _instance ??= const CatalogsHotelItemResponseItemResponseKindEnumTypeTransformer._();

  const CatalogsHotelItemResponseItemResponseKindEnumTypeTransformer._();

  String encode(CatalogsHotelItemResponseItemResponseKindEnum data) => data._value;

  /// Returns the instance of [CatalogsHotelItemResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelItemResponseItemResponseKindEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsHotelItemResponseItemResponseKindEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'hotel_item': return CatalogsHotelItemResponseItemResponseKindEnum.hotelItem;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsHotelItemResponseItemResponseKindEnumTypeTransformer? _instance;
}


