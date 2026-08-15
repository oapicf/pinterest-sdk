//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationAppType {
  /// Returns a new [TargetingSpecOperationAppType] instance.
  TargetingSpecOperationAppType({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  TargetingSpecOperationAppTypeFieldEnum field;

  TargetingSpecOperationAppTypeOperationEnum operation;

  List<TargetingSpecAppType>? values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationAppType &&
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
  String toString() => 'TargetingSpecOperationAppType[field=$field, operation=$operation, values=$values]';

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

  /// Returns a new [TargetingSpecOperationAppType] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationAppType? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingSpecOperationAppType[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingSpecOperationAppType[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingSpecOperationAppType(
        field: TargetingSpecOperationAppTypeFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecOperationAppTypeOperationEnum.fromJson(json[r'operation'])!,
        values: TargetingSpecAppType.listFromJson(json[r'values']),
      );
    }
    return null;
  }

  static List<TargetingSpecOperationAppType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAppType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAppType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationAppType> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationAppType>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationAppType.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationAppType-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationAppType>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationAppType>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationAppType.listFromJson(entry.value, growable: growable,);
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


class TargetingSpecOperationAppTypeFieldEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationAppTypeFieldEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const APPTYPE = TargetingSpecOperationAppTypeFieldEnum._(r'APPTYPE');

  /// List of all possible values in this [enum][TargetingSpecOperationAppTypeFieldEnum].
  static const values = <TargetingSpecOperationAppTypeFieldEnum>[
    APPTYPE,
  ];

  static TargetingSpecOperationAppTypeFieldEnum? fromJson(dynamic value) => TargetingSpecOperationAppTypeFieldEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationAppTypeFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAppTypeFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAppTypeFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationAppTypeFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationAppTypeFieldEnum].
class TargetingSpecOperationAppTypeFieldEnumTypeTransformer {
  factory TargetingSpecOperationAppTypeFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationAppTypeFieldEnumTypeTransformer._();

  const TargetingSpecOperationAppTypeFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationAppTypeFieldEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationAppTypeFieldEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationAppTypeFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'APPTYPE': return TargetingSpecOperationAppTypeFieldEnum.APPTYPE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationAppTypeFieldEnumTypeTransformer] instance.
  static TargetingSpecOperationAppTypeFieldEnumTypeTransformer? _instance;
}



class TargetingSpecOperationAppTypeOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationAppTypeOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SET = TargetingSpecOperationAppTypeOperationEnum._(r'SET');
  static const ADD = TargetingSpecOperationAppTypeOperationEnum._(r'ADD');
  static const REMOVE = TargetingSpecOperationAppTypeOperationEnum._(r'REMOVE');

  /// List of all possible values in this [enum][TargetingSpecOperationAppTypeOperationEnum].
  static const values = <TargetingSpecOperationAppTypeOperationEnum>[
    SET,
    ADD,
    REMOVE,
  ];

  static TargetingSpecOperationAppTypeOperationEnum? fromJson(dynamic value) => TargetingSpecOperationAppTypeOperationEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationAppTypeOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAppTypeOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAppTypeOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationAppTypeOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationAppTypeOperationEnum].
class TargetingSpecOperationAppTypeOperationEnumTypeTransformer {
  factory TargetingSpecOperationAppTypeOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationAppTypeOperationEnumTypeTransformer._();

  const TargetingSpecOperationAppTypeOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationAppTypeOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationAppTypeOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationAppTypeOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationAppTypeOperationEnum.SET;
        case r'ADD': return TargetingSpecOperationAppTypeOperationEnum.ADD;
        case r'REMOVE': return TargetingSpecOperationAppTypeOperationEnum.REMOVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationAppTypeOperationEnumTypeTransformer] instance.
  static TargetingSpecOperationAppTypeOperationEnumTypeTransformer? _instance;
}


