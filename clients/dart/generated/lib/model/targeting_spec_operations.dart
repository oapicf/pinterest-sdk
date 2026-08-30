//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperations {
  /// Returns a new [TargetingSpecOperations] instance.
  TargetingSpecOperations({
    required this.field,
    required this.operation,
    this.values = const [],
    required this.value,
  });

  TargetingSpecOperationsFieldEnum field;

  TargetingSpecOperationsOperationEnum operation;

  List<TargetingSpecShoppingRetargeting> values;

  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperations &&
    other.field == field &&
    other.operation == operation &&
    _deepEquality.equals(other.values, values) &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (field.hashCode) +
    (operation.hashCode) +
    (values.hashCode) +
    (value == null ? 0 : value!.hashCode);

  @override
  String toString() => 'TargetingSpecOperations[field=$field, operation=$operation, values=$values, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operation'] = this.operation;
      json[r'values'] = this.values;
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingSpecOperations] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperations? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'field'), 'Required key "TargetingSpecOperations[field]" is missing from JSON.');
        assert(json[r'field'] != null, 'Required key "TargetingSpecOperations[field]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "TargetingSpecOperations[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "TargetingSpecOperations[operation]" has a null value in JSON.');
        assert(json.containsKey(r'values'), 'Required key "TargetingSpecOperations[values]" is missing from JSON.');
        assert(json[r'values'] != null, 'Required key "TargetingSpecOperations[values]" has a null value in JSON.');
        assert(json.containsKey(r'value'), 'Required key "TargetingSpecOperations[value]" is missing from JSON.');
        return true;
      }());

      return TargetingSpecOperations(
        field: TargetingSpecOperationsFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecOperationsOperationEnum.fromJson(json[r'operation'])!,
        values: TargetingSpecShoppingRetargeting.listFromJson(json[r'values']),
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<TargetingSpecOperations> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperations>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperations.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperations> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperations>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperations.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperations-objects as value to a dart map
  static Map<String, List<TargetingSpecOperations>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperations>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperations.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'field',
    'operation',
    'values',
    'value',
  };
}


enum TargetingSpecOperationsFieldEnum {
  MINIMUM_AGE._(r'MINIMUM_AGE'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationsFieldEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationsFieldEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationsFieldEnum? fromJson(dynamic value) => TargetingSpecOperationsFieldEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationsFieldEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationsFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationsFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationsFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationsFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationsFieldEnum].
class TargetingSpecOperationsFieldEnumTypeTransformer {
  factory TargetingSpecOperationsFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationsFieldEnumTypeTransformer._();

  const TargetingSpecOperationsFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationsFieldEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationsFieldEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationsFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationsFieldEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'MINIMUM_AGE': return TargetingSpecOperationsFieldEnum.MINIMUM_AGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationsFieldEnumTypeTransformer? _instance;
}



enum TargetingSpecOperationsOperationEnum {
  SET._(r'SET'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationsOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationsOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationsOperationEnum? fromJson(dynamic value) => TargetingSpecOperationsOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationsOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationsOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationsOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationsOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationsOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationsOperationEnum].
class TargetingSpecOperationsOperationEnumTypeTransformer {
  factory TargetingSpecOperationsOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationsOperationEnumTypeTransformer._();

  const TargetingSpecOperationsOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationsOperationEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationsOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationsOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationsOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationsOperationEnum.SET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationsOperationEnumTypeTransformer? _instance;
}


