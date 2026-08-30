//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailItemResponse {
  /// Returns a new [CatalogsRetailItemResponse] instance.
  CatalogsRetailItemResponse({
    this.attributes,
    required this.catalogType,
    this.itemId,
    required this.itemResponseKind,
    this.pins = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ItemAttributes? attributes;

  CatalogsRetailItemResponseCatalogTypeEnum catalogType;

  /// The catalog retail item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  CatalogsRetailItemResponseItemResponseKindEnum itemResponseKind;

  /// The pins mapped to the item
  List<Pin>? pins;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailItemResponse &&
    other.attributes == attributes &&
    other.catalogType == catalogType &&
    other.itemId == itemId &&
    other.itemResponseKind == itemResponseKind &&
    _deepEquality.equals(other.pins, pins);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes == null ? 0 : attributes!.hashCode) +
    (catalogType.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode) +
    (itemResponseKind.hashCode) +
    (pins == null ? 0 : pins!.hashCode);

  @override
  String toString() => 'CatalogsRetailItemResponse[attributes=$attributes, catalogType=$catalogType, itemId=$itemId, itemResponseKind=$itemResponseKind, pins=$pins]';

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
    return json;
  }

  /// Returns a new [CatalogsRetailItemResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailItemResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsRetailItemResponse[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsRetailItemResponse[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'item_response_kind'), 'Required key "CatalogsRetailItemResponse[item_response_kind]" is missing from JSON.');
        assert(json[r'item_response_kind'] != null, 'Required key "CatalogsRetailItemResponse[item_response_kind]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailItemResponse(
        attributes: ItemAttributes.fromJson(json[r'attributes']),
        catalogType: CatalogsRetailItemResponseCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        itemId: mapValueOfType<String>(json, r'item_id'),
        itemResponseKind: CatalogsRetailItemResponseItemResponseKindEnum.fromJson(json[r'item_response_kind'])!,
        pins: Pin.listFromJson(json[r'pins']),
      );
    }
    return null;
  }

  static List<CatalogsRetailItemResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailItemResponse> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailItemResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailItemResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailItemResponse-objects as value to a dart map
  static Map<String, List<CatalogsRetailItemResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailItemResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailItemResponse.listFromJson(entry.value, growable: growable,);
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


enum CatalogsRetailItemResponseCatalogTypeEnum {
  RETAIL._(r'RETAIL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailItemResponseCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailItemResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailItemResponseCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailItemResponseCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailItemResponseCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailItemResponseCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemResponseCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemResponseCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailItemResponseCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailItemResponseCatalogTypeEnum].
class CatalogsRetailItemResponseCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailItemResponseCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailItemResponseCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailItemResponseCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailItemResponseCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailItemResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailItemResponseCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailItemResponseCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailItemResponseCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailItemResponseCatalogTypeEnumTypeTransformer? _instance;
}


/// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
enum CatalogsRetailItemResponseItemResponseKindEnum {
  retailItem._(r'retail_item'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailItemResponseItemResponseKindEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailItemResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailItemResponseItemResponseKindEnum? fromJson(dynamic value) => CatalogsRetailItemResponseItemResponseKindEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailItemResponseItemResponseKindEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailItemResponseItemResponseKindEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemResponseItemResponseKindEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemResponseItemResponseKindEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailItemResponseItemResponseKindEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailItemResponseItemResponseKindEnum].
class CatalogsRetailItemResponseItemResponseKindEnumTypeTransformer {
  factory CatalogsRetailItemResponseItemResponseKindEnumTypeTransformer() => _instance ??= const CatalogsRetailItemResponseItemResponseKindEnumTypeTransformer._();

  const CatalogsRetailItemResponseItemResponseKindEnumTypeTransformer._();

  String encode(CatalogsRetailItemResponseItemResponseKindEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailItemResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailItemResponseItemResponseKindEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailItemResponseItemResponseKindEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'retail_item': return CatalogsRetailItemResponseItemResponseKindEnum.retailItem;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailItemResponseItemResponseKindEnumTypeTransformer? _instance;
}


