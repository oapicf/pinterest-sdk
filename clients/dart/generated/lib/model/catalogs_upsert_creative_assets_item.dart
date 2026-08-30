//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsUpsertCreativeAssetsItem {
  /// Returns a new [CatalogsUpsertCreativeAssetsItem] instance.
  CatalogsUpsertCreativeAssetsItem({
    required this.attributes,
    required this.creativeAssetsId,
    required this.operation,
  });

  CatalogsCreativeAssetsAttributes attributes;

  /// The catalog creative assets id in the merchant namespace
  String creativeAssetsId;

  CatalogsUpsertCreativeAssetsItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsUpsertCreativeAssetsItem &&
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
  String toString() => 'CatalogsUpsertCreativeAssetsItem[attributes=$attributes, creativeAssetsId=$creativeAssetsId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'creative_assets_id'] = this.creativeAssetsId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsUpsertCreativeAssetsItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsUpsertCreativeAssetsItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'attributes'), 'Required key "CatalogsUpsertCreativeAssetsItem[attributes]" is missing from JSON.');
        assert(json[r'attributes'] != null, 'Required key "CatalogsUpsertCreativeAssetsItem[attributes]" has a null value in JSON.');
        assert(json.containsKey(r'creative_assets_id'), 'Required key "CatalogsUpsertCreativeAssetsItem[creative_assets_id]" is missing from JSON.');
        assert(json[r'creative_assets_id'] != null, 'Required key "CatalogsUpsertCreativeAssetsItem[creative_assets_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsUpsertCreativeAssetsItem[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsUpsertCreativeAssetsItem[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsUpsertCreativeAssetsItem(
        attributes: CatalogsCreativeAssetsAttributes.fromJson(json[r'attributes'])!,
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id')!,
        operation: CatalogsUpsertCreativeAssetsItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsUpsertCreativeAssetsItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpsertCreativeAssetsItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpsertCreativeAssetsItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsUpsertCreativeAssetsItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsUpsertCreativeAssetsItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsUpsertCreativeAssetsItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsUpsertCreativeAssetsItem-objects as value to a dart map
  static Map<String, List<CatalogsUpsertCreativeAssetsItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsUpsertCreativeAssetsItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsUpsertCreativeAssetsItem.listFromJson(entry.value, growable: growable,);
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


enum CatalogsUpsertCreativeAssetsItemOperationEnum {
  UPSERT._(r'UPSERT'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsUpsertCreativeAssetsItemOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsUpsertCreativeAssetsItemOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsUpsertCreativeAssetsItemOperationEnum? fromJson(dynamic value) => CatalogsUpsertCreativeAssetsItemOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsUpsertCreativeAssetsItemOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsUpsertCreativeAssetsItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpsertCreativeAssetsItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpsertCreativeAssetsItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsUpsertCreativeAssetsItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsUpsertCreativeAssetsItemOperationEnum].
class CatalogsUpsertCreativeAssetsItemOperationEnumTypeTransformer {
  factory CatalogsUpsertCreativeAssetsItemOperationEnumTypeTransformer() => _instance ??= const CatalogsUpsertCreativeAssetsItemOperationEnumTypeTransformer._();

  const CatalogsUpsertCreativeAssetsItemOperationEnumTypeTransformer._();

  String encode(CatalogsUpsertCreativeAssetsItemOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsUpsertCreativeAssetsItemOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsUpsertCreativeAssetsItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsUpsertCreativeAssetsItemOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UPSERT': return CatalogsUpsertCreativeAssetsItemOperationEnum.UPSERT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsUpsertCreativeAssetsItemOperationEnumTypeTransformer? _instance;
}


