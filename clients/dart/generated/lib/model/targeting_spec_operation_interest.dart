//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationInterest {
  /// Returns a new [TargetingSpecOperationInterest] instance.
  TargetingSpecOperationInterest({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  TargetingSpecOperationInterestFieldEnum field;

  TargetingSpecListOperation operation;

  List<String> values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationInterest &&
    other.field == field &&
    other.operation == operation &&
    _deepEquality.equals(other.values, values);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (field.hashCode) +
    (operation.hashCode) +
    (values.hashCode);

  @override
  String toString() => 'TargetingSpecOperationInterest[field=$field, operation=$operation, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operation'] = this.operation;
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [TargetingSpecOperationInterest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationInterest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'field'), 'Required key "TargetingSpecOperationInterest[field]" is missing from JSON.');
        assert(json[r'field'] != null, 'Required key "TargetingSpecOperationInterest[field]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "TargetingSpecOperationInterest[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "TargetingSpecOperationInterest[operation]" has a null value in JSON.');
        assert(json.containsKey(r'values'), 'Required key "TargetingSpecOperationInterest[values]" is missing from JSON.');
        assert(json[r'values'] != null, 'Required key "TargetingSpecOperationInterest[values]" has a null value in JSON.');
        return true;
      }());

      return TargetingSpecOperationInterest(
        field: TargetingSpecOperationInterestFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecListOperation.fromJson(json[r'operation'])!,
        values: json[r'values'] is Iterable
            ? (json[r'values'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<TargetingSpecOperationInterest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationInterest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationInterest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationInterest> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationInterest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationInterest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationInterest-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationInterest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationInterest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationInterest.listFromJson(entry.value, growable: growable,);
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


enum TargetingSpecOperationInterestFieldEnum {
  INTEREST._(r'INTEREST'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationInterestFieldEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationInterestFieldEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationInterestFieldEnum? fromJson(dynamic value) => TargetingSpecOperationInterestFieldEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationInterestFieldEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationInterestFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationInterestFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationInterestFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationInterestFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationInterestFieldEnum].
class TargetingSpecOperationInterestFieldEnumTypeTransformer {
  factory TargetingSpecOperationInterestFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationInterestFieldEnumTypeTransformer._();

  const TargetingSpecOperationInterestFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationInterestFieldEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationInterestFieldEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationInterestFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationInterestFieldEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'INTEREST': return TargetingSpecOperationInterestFieldEnum.INTEREST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationInterestFieldEnumTypeTransformer? _instance;
}


