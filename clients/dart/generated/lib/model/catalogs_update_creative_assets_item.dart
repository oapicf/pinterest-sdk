//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsUpdateCreativeAssetsItem {
  /// Returns a new [CatalogsUpdateCreativeAssetsItem] instance.
  CatalogsUpdateCreativeAssetsItem({
    required this.attributes,
    required this.creativeAssetsId,
    required this.operation,
  });

  CatalogsUpdatableCreativeAssetsAttributes attributes;

  /// The catalog creative assets item id in the merchant namespace
  String creativeAssetsId;

  CatalogsUpdateCreativeAssetsItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsUpdateCreativeAssetsItem &&
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
  String toString() => 'CatalogsUpdateCreativeAssetsItem[attributes=$attributes, creativeAssetsId=$creativeAssetsId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'creative_assets_id'] = this.creativeAssetsId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsUpdateCreativeAssetsItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsUpdateCreativeAssetsItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsUpdateCreativeAssetsItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsUpdateCreativeAssetsItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsUpdateCreativeAssetsItem(
        attributes: CatalogsUpdatableCreativeAssetsAttributes.fromJson(json[r'attributes'])!,
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id')!,
        operation: CatalogsUpdateCreativeAssetsItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsUpdateCreativeAssetsItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpdateCreativeAssetsItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpdateCreativeAssetsItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsUpdateCreativeAssetsItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsUpdateCreativeAssetsItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsUpdateCreativeAssetsItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsUpdateCreativeAssetsItem-objects as value to a dart map
  static Map<String, List<CatalogsUpdateCreativeAssetsItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsUpdateCreativeAssetsItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsUpdateCreativeAssetsItem.listFromJson(entry.value, growable: growable,);
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


class CatalogsUpdateCreativeAssetsItemOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsUpdateCreativeAssetsItemOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UPDATE = CatalogsUpdateCreativeAssetsItemOperationEnum._(r'UPDATE');

  /// List of all possible values in this [enum][CatalogsUpdateCreativeAssetsItemOperationEnum].
  static const values = <CatalogsUpdateCreativeAssetsItemOperationEnum>[
    UPDATE,
  ];

  static CatalogsUpdateCreativeAssetsItemOperationEnum? fromJson(dynamic value) => CatalogsUpdateCreativeAssetsItemOperationEnumTypeTransformer().decode(value);

  static List<CatalogsUpdateCreativeAssetsItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpdateCreativeAssetsItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpdateCreativeAssetsItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsUpdateCreativeAssetsItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsUpdateCreativeAssetsItemOperationEnum].
class CatalogsUpdateCreativeAssetsItemOperationEnumTypeTransformer {
  factory CatalogsUpdateCreativeAssetsItemOperationEnumTypeTransformer() => _instance ??= const CatalogsUpdateCreativeAssetsItemOperationEnumTypeTransformer._();

  const CatalogsUpdateCreativeAssetsItemOperationEnumTypeTransformer._();

  String encode(CatalogsUpdateCreativeAssetsItemOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsUpdateCreativeAssetsItemOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsUpdateCreativeAssetsItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UPDATE': return CatalogsUpdateCreativeAssetsItemOperationEnum.UPDATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsUpdateCreativeAssetsItemOperationEnumTypeTransformer] instance.
  static CatalogsUpdateCreativeAssetsItemOperationEnumTypeTransformer? _instance;
}


