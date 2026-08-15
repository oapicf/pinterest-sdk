//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsDeleteCreativeAssetsItem {
  /// Returns a new [CatalogsDeleteCreativeAssetsItem] instance.
  CatalogsDeleteCreativeAssetsItem({
    required this.creativeAssetsId,
    required this.operation,
  });

  /// The catalog creative assets id in the merchant namespace
  String creativeAssetsId;

  CatalogsDeleteCreativeAssetsItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsDeleteCreativeAssetsItem &&
    other.creativeAssetsId == creativeAssetsId &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (creativeAssetsId.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'CatalogsDeleteCreativeAssetsItem[creativeAssetsId=$creativeAssetsId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'creative_assets_id'] = this.creativeAssetsId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsDeleteCreativeAssetsItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsDeleteCreativeAssetsItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsDeleteCreativeAssetsItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsDeleteCreativeAssetsItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsDeleteCreativeAssetsItem(
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id')!,
        operation: CatalogsDeleteCreativeAssetsItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsDeleteCreativeAssetsItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsDeleteCreativeAssetsItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsDeleteCreativeAssetsItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsDeleteCreativeAssetsItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsDeleteCreativeAssetsItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsDeleteCreativeAssetsItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsDeleteCreativeAssetsItem-objects as value to a dart map
  static Map<String, List<CatalogsDeleteCreativeAssetsItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsDeleteCreativeAssetsItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsDeleteCreativeAssetsItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'creative_assets_id',
    'operation',
  };
}


class CatalogsDeleteCreativeAssetsItemOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsDeleteCreativeAssetsItemOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DELETE = CatalogsDeleteCreativeAssetsItemOperationEnum._(r'DELETE');

  /// List of all possible values in this [enum][CatalogsDeleteCreativeAssetsItemOperationEnum].
  static const values = <CatalogsDeleteCreativeAssetsItemOperationEnum>[
    DELETE,
  ];

  static CatalogsDeleteCreativeAssetsItemOperationEnum? fromJson(dynamic value) => CatalogsDeleteCreativeAssetsItemOperationEnumTypeTransformer().decode(value);

  static List<CatalogsDeleteCreativeAssetsItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsDeleteCreativeAssetsItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsDeleteCreativeAssetsItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsDeleteCreativeAssetsItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsDeleteCreativeAssetsItemOperationEnum].
class CatalogsDeleteCreativeAssetsItemOperationEnumTypeTransformer {
  factory CatalogsDeleteCreativeAssetsItemOperationEnumTypeTransformer() => _instance ??= const CatalogsDeleteCreativeAssetsItemOperationEnumTypeTransformer._();

  const CatalogsDeleteCreativeAssetsItemOperationEnumTypeTransformer._();

  String encode(CatalogsDeleteCreativeAssetsItemOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsDeleteCreativeAssetsItemOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsDeleteCreativeAssetsItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DELETE': return CatalogsDeleteCreativeAssetsItemOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsDeleteCreativeAssetsItemOperationEnumTypeTransformer] instance.
  static CatalogsDeleteCreativeAssetsItemOperationEnumTypeTransformer? _instance;
}


