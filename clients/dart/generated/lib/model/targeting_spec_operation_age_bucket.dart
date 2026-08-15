//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationAgeBucket {
  /// Returns a new [TargetingSpecOperationAgeBucket] instance.
  TargetingSpecOperationAgeBucket({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  TargetingSpecOperationAgeBucketFieldEnum field;

  TargetingSpecOperationAgeBucketOperationEnum operation;

  List<TargetingSpecAgeBucket>? values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationAgeBucket &&
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
  String toString() => 'TargetingSpecOperationAgeBucket[field=$field, operation=$operation, values=$values]';

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

  /// Returns a new [TargetingSpecOperationAgeBucket] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationAgeBucket? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingSpecOperationAgeBucket[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingSpecOperationAgeBucket[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingSpecOperationAgeBucket(
        field: TargetingSpecOperationAgeBucketFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecOperationAgeBucketOperationEnum.fromJson(json[r'operation'])!,
        values: TargetingSpecAgeBucket.listFromJson(json[r'values']),
      );
    }
    return null;
  }

  static List<TargetingSpecOperationAgeBucket> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAgeBucket>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAgeBucket.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationAgeBucket> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationAgeBucket>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationAgeBucket.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationAgeBucket-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationAgeBucket>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationAgeBucket>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationAgeBucket.listFromJson(entry.value, growable: growable,);
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


class TargetingSpecOperationAgeBucketFieldEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationAgeBucketFieldEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AGE_BUCKET = TargetingSpecOperationAgeBucketFieldEnum._(r'AGE_BUCKET');

  /// List of all possible values in this [enum][TargetingSpecOperationAgeBucketFieldEnum].
  static const values = <TargetingSpecOperationAgeBucketFieldEnum>[
    AGE_BUCKET,
  ];

  static TargetingSpecOperationAgeBucketFieldEnum? fromJson(dynamic value) => TargetingSpecOperationAgeBucketFieldEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationAgeBucketFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAgeBucketFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAgeBucketFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationAgeBucketFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationAgeBucketFieldEnum].
class TargetingSpecOperationAgeBucketFieldEnumTypeTransformer {
  factory TargetingSpecOperationAgeBucketFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationAgeBucketFieldEnumTypeTransformer._();

  const TargetingSpecOperationAgeBucketFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationAgeBucketFieldEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationAgeBucketFieldEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationAgeBucketFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AGE_BUCKET': return TargetingSpecOperationAgeBucketFieldEnum.AGE_BUCKET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationAgeBucketFieldEnumTypeTransformer] instance.
  static TargetingSpecOperationAgeBucketFieldEnumTypeTransformer? _instance;
}



class TargetingSpecOperationAgeBucketOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationAgeBucketOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SET = TargetingSpecOperationAgeBucketOperationEnum._(r'SET');

  /// List of all possible values in this [enum][TargetingSpecOperationAgeBucketOperationEnum].
  static const values = <TargetingSpecOperationAgeBucketOperationEnum>[
    SET,
  ];

  static TargetingSpecOperationAgeBucketOperationEnum? fromJson(dynamic value) => TargetingSpecOperationAgeBucketOperationEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationAgeBucketOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAgeBucketOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAgeBucketOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationAgeBucketOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationAgeBucketOperationEnum].
class TargetingSpecOperationAgeBucketOperationEnumTypeTransformer {
  factory TargetingSpecOperationAgeBucketOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationAgeBucketOperationEnumTypeTransformer._();

  const TargetingSpecOperationAgeBucketOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationAgeBucketOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationAgeBucketOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationAgeBucketOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationAgeBucketOperationEnum.SET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationAgeBucketOperationEnumTypeTransformer] instance.
  static TargetingSpecOperationAgeBucketOperationEnumTypeTransformer? _instance;
}


