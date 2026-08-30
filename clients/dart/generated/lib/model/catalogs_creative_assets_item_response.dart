//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsItemResponse {
  /// Returns a new [CatalogsCreativeAssetsItemResponse] instance.
  CatalogsCreativeAssetsItemResponse({
    this.attributes,
    required this.catalogType,
    this.creativeAssetsId,
    required this.itemResponseKind,
    this.pins = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsCreativeAssetsAttributes? attributes;

  CatalogsCreativeAssetsItemResponseCatalogTypeEnum catalogType;

  /// The catalog creative assets id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? creativeAssetsId;

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  CatalogsCreativeAssetsItemResponseItemResponseKindEnum itemResponseKind;

  /// The pins mapped to the item
  List<Pin>? pins;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsItemResponse &&
    other.attributes == attributes &&
    other.catalogType == catalogType &&
    other.creativeAssetsId == creativeAssetsId &&
    other.itemResponseKind == itemResponseKind &&
    _deepEquality.equals(other.pins, pins);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes == null ? 0 : attributes!.hashCode) +
    (catalogType.hashCode) +
    (creativeAssetsId == null ? 0 : creativeAssetsId!.hashCode) +
    (itemResponseKind.hashCode) +
    (pins == null ? 0 : pins!.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsItemResponse[attributes=$attributes, catalogType=$catalogType, creativeAssetsId=$creativeAssetsId, itemResponseKind=$itemResponseKind, pins=$pins]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attributes != null) {
      json[r'attributes'] = this.attributes;
    } else {
      json[r'attributes'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
    if (this.creativeAssetsId != null) {
      json[r'creative_assets_id'] = this.creativeAssetsId;
    } else {
      json[r'creative_assets_id'] = null;
    }
      json[r'item_response_kind'] = this.itemResponseKind;
    if (this.pins != null) {
      json[r'pins'] = this.pins;
    } else {
      json[r'pins'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsItemResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsItemResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsCreativeAssetsItemResponse[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsCreativeAssetsItemResponse[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'item_response_kind'), 'Required key "CatalogsCreativeAssetsItemResponse[item_response_kind]" is missing from JSON.');
        assert(json[r'item_response_kind'] != null, 'Required key "CatalogsCreativeAssetsItemResponse[item_response_kind]" has a null value in JSON.');
        return true;
      }());

      return CatalogsCreativeAssetsItemResponse(
        attributes: CatalogsCreativeAssetsAttributes.fromJson(json[r'attributes']),
        catalogType: CatalogsCreativeAssetsItemResponseCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id'),
        itemResponseKind: CatalogsCreativeAssetsItemResponseItemResponseKindEnum.fromJson(json[r'item_response_kind'])!,
        pins: Pin.listFromJson(json[r'pins']),
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsItemResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsItemResponse> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsItemResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsItemResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsItemResponse-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsItemResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsItemResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsItemResponse.listFromJson(entry.value, growable: growable,);
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


enum CatalogsCreativeAssetsItemResponseCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreativeAssetsItemResponseCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreativeAssetsItemResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreativeAssetsItemResponseCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsItemResponseCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreativeAssetsItemResponseCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreativeAssetsItemResponseCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemResponseCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemResponseCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsItemResponseCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsItemResponseCatalogTypeEnum].
class CatalogsCreativeAssetsItemResponseCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsItemResponseCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsItemResponseCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsItemResponseCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsItemResponseCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsCreativeAssetsItemResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsItemResponseCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreativeAssetsItemResponseCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsItemResponseCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreativeAssetsItemResponseCatalogTypeEnumTypeTransformer? _instance;
}


/// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
enum CatalogsCreativeAssetsItemResponseItemResponseKindEnum {
  creativeAssetsItem._(r'creative_assets_item'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreativeAssetsItemResponseItemResponseKindEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreativeAssetsItemResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreativeAssetsItemResponseItemResponseKindEnum? fromJson(dynamic value) => CatalogsCreativeAssetsItemResponseItemResponseKindEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreativeAssetsItemResponseItemResponseKindEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreativeAssetsItemResponseItemResponseKindEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemResponseItemResponseKindEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemResponseItemResponseKindEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsItemResponseItemResponseKindEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsItemResponseItemResponseKindEnum].
class CatalogsCreativeAssetsItemResponseItemResponseKindEnumTypeTransformer {
  factory CatalogsCreativeAssetsItemResponseItemResponseKindEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsItemResponseItemResponseKindEnumTypeTransformer._();

  const CatalogsCreativeAssetsItemResponseItemResponseKindEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsItemResponseItemResponseKindEnum data) => data._value;

  /// Returns the instance of [CatalogsCreativeAssetsItemResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsItemResponseItemResponseKindEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreativeAssetsItemResponseItemResponseKindEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'creative_assets_item': return CatalogsCreativeAssetsItemResponseItemResponseKindEnum.creativeAssetsItem;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreativeAssetsItemResponseItemResponseKindEnumTypeTransformer? _instance;
}


