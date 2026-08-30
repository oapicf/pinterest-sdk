//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationAudienceExclude {
  /// Returns a new [TargetingSpecOperationAudienceExclude] instance.
  TargetingSpecOperationAudienceExclude({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  TargetingSpecOperationAudienceExcludeFieldEnum field;

  TargetingSpecListOperation operation;

  List<String> values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationAudienceExclude &&
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
  String toString() => 'TargetingSpecOperationAudienceExclude[field=$field, operation=$operation, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operation'] = this.operation;
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [TargetingSpecOperationAudienceExclude] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationAudienceExclude? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'field'), 'Required key "TargetingSpecOperationAudienceExclude[field]" is missing from JSON.');
        assert(json[r'field'] != null, 'Required key "TargetingSpecOperationAudienceExclude[field]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "TargetingSpecOperationAudienceExclude[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "TargetingSpecOperationAudienceExclude[operation]" has a null value in JSON.');
        assert(json.containsKey(r'values'), 'Required key "TargetingSpecOperationAudienceExclude[values]" is missing from JSON.');
        assert(json[r'values'] != null, 'Required key "TargetingSpecOperationAudienceExclude[values]" has a null value in JSON.');
        return true;
      }());

      return TargetingSpecOperationAudienceExclude(
        field: TargetingSpecOperationAudienceExcludeFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecListOperation.fromJson(json[r'operation'])!,
        values: json[r'values'] is Iterable
            ? (json[r'values'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<TargetingSpecOperationAudienceExclude> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAudienceExclude>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAudienceExclude.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationAudienceExclude> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationAudienceExclude>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationAudienceExclude.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationAudienceExclude-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationAudienceExclude>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationAudienceExclude>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationAudienceExclude.listFromJson(entry.value, growable: growable,);
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


enum TargetingSpecOperationAudienceExcludeFieldEnum {
  AUDIENCE_EXCLUDE._(r'AUDIENCE_EXCLUDE'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationAudienceExcludeFieldEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationAudienceExcludeFieldEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationAudienceExcludeFieldEnum? fromJson(dynamic value) => TargetingSpecOperationAudienceExcludeFieldEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationAudienceExcludeFieldEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationAudienceExcludeFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAudienceExcludeFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAudienceExcludeFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationAudienceExcludeFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationAudienceExcludeFieldEnum].
class TargetingSpecOperationAudienceExcludeFieldEnumTypeTransformer {
  factory TargetingSpecOperationAudienceExcludeFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationAudienceExcludeFieldEnumTypeTransformer._();

  const TargetingSpecOperationAudienceExcludeFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationAudienceExcludeFieldEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationAudienceExcludeFieldEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationAudienceExcludeFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationAudienceExcludeFieldEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AUDIENCE_EXCLUDE': return TargetingSpecOperationAudienceExcludeFieldEnum.AUDIENCE_EXCLUDE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationAudienceExcludeFieldEnumTypeTransformer? _instance;
}


