//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreateCreativeAssetsItem {
  /// Returns a new [CatalogsCreateCreativeAssetsItem] instance.
  CatalogsCreateCreativeAssetsItem({
    required this.attributes,
    required this.creativeAssetsId,
    required this.operation,
  });

  CatalogsCreativeAssetsAttributes attributes;

  /// The catalog creative assets id in the merchant namespace
  String creativeAssetsId;

  CatalogsCreateCreativeAssetsItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreateCreativeAssetsItem &&
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
  String toString() => 'CatalogsCreateCreativeAssetsItem[attributes=$attributes, creativeAssetsId=$creativeAssetsId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'creative_assets_id'] = this.creativeAssetsId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsCreateCreativeAssetsItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreateCreativeAssetsItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreateCreativeAssetsItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreateCreativeAssetsItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreateCreativeAssetsItem(
        attributes: CatalogsCreativeAssetsAttributes.fromJson(json[r'attributes'])!,
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id')!,
        operation: CatalogsCreateCreativeAssetsItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsCreateCreativeAssetsItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreateCreativeAssetsItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreateCreativeAssetsItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreateCreativeAssetsItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreateCreativeAssetsItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreateCreativeAssetsItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreateCreativeAssetsItem-objects as value to a dart map
  static Map<String, List<CatalogsCreateCreativeAssetsItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreateCreativeAssetsItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreateCreativeAssetsItem.listFromJson(entry.value, growable: growable,);
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


class CatalogsCreateCreativeAssetsItemOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsCreateCreativeAssetsItemOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATE = CatalogsCreateCreativeAssetsItemOperationEnum._(r'CREATE');

  /// List of all possible values in this [enum][CatalogsCreateCreativeAssetsItemOperationEnum].
  static const values = <CatalogsCreateCreativeAssetsItemOperationEnum>[
    CREATE,
  ];

  static CatalogsCreateCreativeAssetsItemOperationEnum? fromJson(dynamic value) => CatalogsCreateCreativeAssetsItemOperationEnumTypeTransformer().decode(value);

  static List<CatalogsCreateCreativeAssetsItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreateCreativeAssetsItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreateCreativeAssetsItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreateCreativeAssetsItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreateCreativeAssetsItemOperationEnum].
class CatalogsCreateCreativeAssetsItemOperationEnumTypeTransformer {
  factory CatalogsCreateCreativeAssetsItemOperationEnumTypeTransformer() => _instance ??= const CatalogsCreateCreativeAssetsItemOperationEnumTypeTransformer._();

  const CatalogsCreateCreativeAssetsItemOperationEnumTypeTransformer._();

  String encode(CatalogsCreateCreativeAssetsItemOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsCreateCreativeAssetsItemOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreateCreativeAssetsItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATE': return CatalogsCreateCreativeAssetsItemOperationEnum.CREATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsCreateCreativeAssetsItemOperationEnumTypeTransformer] instance.
  static CatalogsCreateCreativeAssetsItemOperationEnumTypeTransformer? _instance;
}


