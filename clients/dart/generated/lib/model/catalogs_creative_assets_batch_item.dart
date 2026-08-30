//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsBatchItem {
  /// Returns a new [CatalogsCreativeAssetsBatchItem] instance.
  CatalogsCreativeAssetsBatchItem({
    required this.attributes,
    required this.creativeAssetsId,
    required this.operation,
  });

  CatalogsUpdatableCreativeAssetsAttributes attributes;

  /// The catalog creative assets id in the merchant namespace
  String creativeAssetsId;

  CatalogsCreativeAssetsBatchItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsBatchItem &&
    other.attributes == attributes &&
    other.creativeAssetsId == creativeAssetsId &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes.hashCode) +
    (creativeAssetsId.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsBatchItem[attributes=$attributes, creativeAssetsId=$creativeAssetsId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'creative_assets_id'] = this.creativeAssetsId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsBatchItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsBatchItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'attributes'), 'Required key "CatalogsCreativeAssetsBatchItem[attributes]" is missing from JSON.');
        assert(json[r'attributes'] != null, 'Required key "CatalogsCreativeAssetsBatchItem[attributes]" has a null value in JSON.');
        assert(json.containsKey(r'creative_assets_id'), 'Required key "CatalogsCreativeAssetsBatchItem[creative_assets_id]" is missing from JSON.');
        assert(json[r'creative_assets_id'] != null, 'Required key "CatalogsCreativeAssetsBatchItem[creative_assets_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsCreativeAssetsBatchItem[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsCreativeAssetsBatchItem[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsCreativeAssetsBatchItem(
        attributes: CatalogsUpdatableCreativeAssetsAttributes.fromJson(json[r'attributes'])!,
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id')!,
        operation: CatalogsCreativeAssetsBatchItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsBatchItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsBatchItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsBatchItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsBatchItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsBatchItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsBatchItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsBatchItem-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsBatchItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsBatchItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsBatchItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'attributes',
    'creative_assets_id',
    'operation',
  };
}


enum CatalogsCreativeAssetsBatchItemOperationEnum {
  DELETE._(r'DELETE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreativeAssetsBatchItemOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreativeAssetsBatchItemOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreativeAssetsBatchItemOperationEnum? fromJson(dynamic value) => CatalogsCreativeAssetsBatchItemOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreativeAssetsBatchItemOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreativeAssetsBatchItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsBatchItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsBatchItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsBatchItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsBatchItemOperationEnum].
class CatalogsCreativeAssetsBatchItemOperationEnumTypeTransformer {
  factory CatalogsCreativeAssetsBatchItemOperationEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsBatchItemOperationEnumTypeTransformer._();

  const CatalogsCreativeAssetsBatchItemOperationEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsBatchItemOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsCreativeAssetsBatchItemOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsBatchItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreativeAssetsBatchItemOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DELETE': return CatalogsCreativeAssetsBatchItemOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreativeAssetsBatchItemOperationEnumTypeTransformer? _instance;
}


