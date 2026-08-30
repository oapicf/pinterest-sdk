//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsItemErrorResponse {
  /// Returns a new [CatalogsCreativeAssetsItemErrorResponse] instance.
  CatalogsCreativeAssetsItemErrorResponse({
    required this.catalogType,
    this.creativeAssetsId,
    this.errors = const [],
    required this.itemResponseKind,
  });

  CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum catalogType;

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

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum itemResponseKind;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsItemErrorResponse &&
    other.catalogType == catalogType &&
    other.creativeAssetsId == creativeAssetsId &&
    _deepEquality.equals(other.errors, errors) &&
    other.itemResponseKind == itemResponseKind;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (creativeAssetsId == null ? 0 : creativeAssetsId!.hashCode) +
    (errors.hashCode) +
    (itemResponseKind.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsItemErrorResponse[catalogType=$catalogType, creativeAssetsId=$creativeAssetsId, errors=$errors, itemResponseKind=$itemResponseKind]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
    if (this.creativeAssetsId != null) {
      json[r'creative_assets_id'] = this.creativeAssetsId;
    } else {
      json[r'creative_assets_id'] = null;
    }
      json[r'errors'] = this.errors;
      json[r'item_response_kind'] = this.itemResponseKind;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsItemErrorResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsItemErrorResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsCreativeAssetsItemErrorResponse[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsCreativeAssetsItemErrorResponse[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'errors'), 'Required key "CatalogsCreativeAssetsItemErrorResponse[errors]" is missing from JSON.');
        assert(json[r'errors'] != null, 'Required key "CatalogsCreativeAssetsItemErrorResponse[errors]" has a null value in JSON.');
        assert(json.containsKey(r'item_response_kind'), 'Required key "CatalogsCreativeAssetsItemErrorResponse[item_response_kind]" is missing from JSON.');
        assert(json[r'item_response_kind'] != null, 'Required key "CatalogsCreativeAssetsItemErrorResponse[item_response_kind]" has a null value in JSON.');
        return true;
      }());

      return CatalogsCreativeAssetsItemErrorResponse(
        catalogType: CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id'),
        errors: ItemValidationEvent.listFromJson(json[r'errors']),
        itemResponseKind: CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum.fromJson(json[r'item_response_kind'])!,
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsItemErrorResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemErrorResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemErrorResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsItemErrorResponse> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsItemErrorResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsItemErrorResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsItemErrorResponse-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsItemErrorResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsItemErrorResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsItemErrorResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'errors',
    'item_response_kind',
  };
}


enum CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum].
class CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreativeAssetsItemErrorResponseCatalogTypeEnumTypeTransformer? _instance;
}


/// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
enum CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum {
  creativeAssetsItemError._(r'creative_assets_item_error'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum? fromJson(dynamic value) => CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum].
class CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnumTypeTransformer {
  factory CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnumTypeTransformer._();

  const CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum data) => data._value;

  /// Returns the instance of [CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'creative_assets_item_error': return CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnum.creativeAssetsItemError;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreativeAssetsItemErrorResponseItemResponseKindEnumTypeTransformer? _instance;
}


