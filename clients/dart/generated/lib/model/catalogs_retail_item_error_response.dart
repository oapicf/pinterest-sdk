//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailItemErrorResponse {
  /// Returns a new [CatalogsRetailItemErrorResponse] instance.
  CatalogsRetailItemErrorResponse({
    required this.catalogType,
    this.errors = const [],
    this.itemId,
    required this.itemResponseKind,
  });

  CatalogsRetailItemErrorResponseCatalogTypeEnum catalogType;

  /// Array with the errors for the item id requested
  List<ItemValidationEvent> errors;

  /// The catalog item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  CatalogsRetailItemErrorResponseItemResponseKindEnum itemResponseKind;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailItemErrorResponse &&
    other.catalogType == catalogType &&
    _deepEquality.equals(other.errors, errors) &&
    other.itemId == itemId &&
    other.itemResponseKind == itemResponseKind;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (errors.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode) +
    (itemResponseKind.hashCode);

  @override
  String toString() => 'CatalogsRetailItemErrorResponse[catalogType=$catalogType, errors=$errors, itemId=$itemId, itemResponseKind=$itemResponseKind]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'errors'] = this.errors;
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
      json[r'item_response_kind'] = this.itemResponseKind;
    return json;
  }

  /// Returns a new [CatalogsRetailItemErrorResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailItemErrorResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsRetailItemErrorResponse[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsRetailItemErrorResponse[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'errors'), 'Required key "CatalogsRetailItemErrorResponse[errors]" is missing from JSON.');
        assert(json[r'errors'] != null, 'Required key "CatalogsRetailItemErrorResponse[errors]" has a null value in JSON.');
        assert(json.containsKey(r'item_response_kind'), 'Required key "CatalogsRetailItemErrorResponse[item_response_kind]" is missing from JSON.');
        assert(json[r'item_response_kind'] != null, 'Required key "CatalogsRetailItemErrorResponse[item_response_kind]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailItemErrorResponse(
        catalogType: CatalogsRetailItemErrorResponseCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        errors: ItemValidationEvent.listFromJson(json[r'errors']),
        itemId: mapValueOfType<String>(json, r'item_id'),
        itemResponseKind: CatalogsRetailItemErrorResponseItemResponseKindEnum.fromJson(json[r'item_response_kind'])!,
      );
    }
    return null;
  }

  static List<CatalogsRetailItemErrorResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemErrorResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemErrorResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailItemErrorResponse> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailItemErrorResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailItemErrorResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailItemErrorResponse-objects as value to a dart map
  static Map<String, List<CatalogsRetailItemErrorResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailItemErrorResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailItemErrorResponse.listFromJson(entry.value, growable: growable,);
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


enum CatalogsRetailItemErrorResponseCatalogTypeEnum {
  RETAIL._(r'RETAIL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailItemErrorResponseCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailItemErrorResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailItemErrorResponseCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailItemErrorResponseCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailItemErrorResponseCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailItemErrorResponseCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemErrorResponseCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemErrorResponseCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailItemErrorResponseCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailItemErrorResponseCatalogTypeEnum].
class CatalogsRetailItemErrorResponseCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailItemErrorResponseCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailItemErrorResponseCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailItemErrorResponseCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailItemErrorResponseCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailItemErrorResponseCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailItemErrorResponseCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailItemErrorResponseCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailItemErrorResponseCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailItemErrorResponseCatalogTypeEnumTypeTransformer? _instance;
}


/// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
enum CatalogsRetailItemErrorResponseItemResponseKindEnum {
  retailItemError._(r'retail_item_error'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailItemErrorResponseItemResponseKindEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailItemErrorResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailItemErrorResponseItemResponseKindEnum? fromJson(dynamic value) => CatalogsRetailItemErrorResponseItemResponseKindEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailItemErrorResponseItemResponseKindEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailItemErrorResponseItemResponseKindEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailItemErrorResponseItemResponseKindEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailItemErrorResponseItemResponseKindEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailItemErrorResponseItemResponseKindEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailItemErrorResponseItemResponseKindEnum].
class CatalogsRetailItemErrorResponseItemResponseKindEnumTypeTransformer {
  factory CatalogsRetailItemErrorResponseItemResponseKindEnumTypeTransformer() => _instance ??= const CatalogsRetailItemErrorResponseItemResponseKindEnumTypeTransformer._();

  const CatalogsRetailItemErrorResponseItemResponseKindEnumTypeTransformer._();

  String encode(CatalogsRetailItemErrorResponseItemResponseKindEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailItemErrorResponseItemResponseKindEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailItemErrorResponseItemResponseKindEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailItemErrorResponseItemResponseKindEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'retail_item_error': return CatalogsRetailItemErrorResponseItemResponseKindEnum.retailItemError;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailItemErrorResponseItemResponseKindEnumTypeTransformer? _instance;
}


