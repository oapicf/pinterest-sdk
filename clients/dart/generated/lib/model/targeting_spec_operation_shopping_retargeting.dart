//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationShoppingRetargeting {
  /// Returns a new [TargetingSpecOperationShoppingRetargeting] instance.
  TargetingSpecOperationShoppingRetargeting({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  TargetingSpecOperationShoppingRetargetingFieldEnum field;

  TargetingSpecOperationShoppingRetargetingOperationEnum operation;

  List<TargetingSpecShoppingRetargeting>? values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationShoppingRetargeting &&
    other.field == field &&
    other.operation == operation &&
    _deepEquality.equals(other.values, values);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (field.hashCode) +
    (operation.hashCode) +
    (values == null ? 0 : values!.hashCode);

  @override
  String toString() => 'TargetingSpecOperationShoppingRetargeting[field=$field, operation=$operation, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operation'] = this.operation;
    if (this.values != null) {
      json[r'values'] = this.values;
    } else {
      json[r'values'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingSpecOperationShoppingRetargeting] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationShoppingRetargeting? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingSpecOperationShoppingRetargeting[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingSpecOperationShoppingRetargeting[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingSpecOperationShoppingRetargeting(
        field: TargetingSpecOperationShoppingRetargetingFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecOperationShoppingRetargetingOperationEnum.fromJson(json[r'operation'])!,
        values: TargetingSpecShoppingRetargeting.listFromJson(json[r'values']),
      );
    }
    return null;
  }

  static List<TargetingSpecOperationShoppingRetargeting> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationShoppingRetargeting>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationShoppingRetargeting.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationShoppingRetargeting> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationShoppingRetargeting>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationShoppingRetargeting.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationShoppingRetargeting-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationShoppingRetargeting>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationShoppingRetargeting>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationShoppingRetargeting.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'field',
    'operation',
    'values',
  };
}


class TargetingSpecOperationShoppingRetargetingFieldEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationShoppingRetargetingFieldEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SHOPPING_RETARGETING = TargetingSpecOperationShoppingRetargetingFieldEnum._(r'SHOPPING_RETARGETING');

  /// List of all possible values in this [enum][TargetingSpecOperationShoppingRetargetingFieldEnum].
  static const values = <TargetingSpecOperationShoppingRetargetingFieldEnum>[
    SHOPPING_RETARGETING,
  ];

  static TargetingSpecOperationShoppingRetargetingFieldEnum? fromJson(dynamic value) => TargetingSpecOperationShoppingRetargetingFieldEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationShoppingRetargetingFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationShoppingRetargetingFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationShoppingRetargetingFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationShoppingRetargetingFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationShoppingRetargetingFieldEnum].
class TargetingSpecOperationShoppingRetargetingFieldEnumTypeTransformer {
  factory TargetingSpecOperationShoppingRetargetingFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationShoppingRetargetingFieldEnumTypeTransformer._();

  const TargetingSpecOperationShoppingRetargetingFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationShoppingRetargetingFieldEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationShoppingRetargetingFieldEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationShoppingRetargetingFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SHOPPING_RETARGETING': return TargetingSpecOperationShoppingRetargetingFieldEnum.SHOPPING_RETARGETING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationShoppingRetargetingFieldEnumTypeTransformer] instance.
  static TargetingSpecOperationShoppingRetargetingFieldEnumTypeTransformer? _instance;
}



class TargetingSpecOperationShoppingRetargetingOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationShoppingRetargetingOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SET = TargetingSpecOperationShoppingRetargetingOperationEnum._(r'SET');

  /// List of all possible values in this [enum][TargetingSpecOperationShoppingRetargetingOperationEnum].
  static const values = <TargetingSpecOperationShoppingRetargetingOperationEnum>[
    SET,
  ];

  static TargetingSpecOperationShoppingRetargetingOperationEnum? fromJson(dynamic value) => TargetingSpecOperationShoppingRetargetingOperationEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationShoppingRetargetingOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationShoppingRetargetingOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationShoppingRetargetingOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationShoppingRetargetingOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationShoppingRetargetingOperationEnum].
class TargetingSpecOperationShoppingRetargetingOperationEnumTypeTransformer {
  factory TargetingSpecOperationShoppingRetargetingOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationShoppingRetargetingOperationEnumTypeTransformer._();

  const TargetingSpecOperationShoppingRetargetingOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationShoppingRetargetingOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationShoppingRetargetingOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationShoppingRetargetingOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationShoppingRetargetingOperationEnum.SET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationShoppingRetargetingOperationEnumTypeTransformer] instance.
  static TargetingSpecOperationShoppingRetargetingOperationEnumTypeTransformer? _instance;
}


