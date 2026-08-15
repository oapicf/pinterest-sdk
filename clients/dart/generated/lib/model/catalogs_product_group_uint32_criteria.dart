//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupUint32Criteria {
  /// Returns a new [CatalogsProductGroupUint32Criteria] instance.
  CatalogsProductGroupUint32Criteria({
    this.negated = false,
    required this.operator_,
    required this.value,
  });

  bool negated;

  CatalogsProductGroupUint32CriteriaOperator_Enum operator_;

  /// Minimum value: 0
  /// Maximum value: 4294967295
  int value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupUint32Criteria &&
    other.negated == negated &&
    other.operator_ == operator_ &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (negated.hashCode) +
    (operator_.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'CatalogsProductGroupUint32Criteria[negated=$negated, operator_=$operator_, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'negated'] = this.negated;
      json[r'operator'] = this.operator_;
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [CatalogsProductGroupUint32Criteria] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupUint32Criteria? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsProductGroupUint32Criteria[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsProductGroupUint32Criteria[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsProductGroupUint32Criteria(
        negated: mapValueOfType<bool>(json, r'negated') ?? false,
        operator_: CatalogsProductGroupUint32CriteriaOperator_Enum.fromJson(json[r'operator'])!,
        value: mapValueOfType<int>(json, r'value')!,
      );
    }
    return null;
  }

  static List<CatalogsProductGroupUint32Criteria> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupUint32Criteria>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupUint32Criteria.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupUint32Criteria> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupUint32Criteria>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupUint32Criteria.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupUint32Criteria-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupUint32Criteria>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupUint32Criteria>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupUint32Criteria.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'operator',
    'value',
  };
}


class CatalogsProductGroupUint32CriteriaOperator_Enum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsProductGroupUint32CriteriaOperator_Enum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const GREATER_THAN = CatalogsProductGroupUint32CriteriaOperator_Enum._(r'GREATER_THAN');
  static const GREATER_THAN_OR_EQUALS = CatalogsProductGroupUint32CriteriaOperator_Enum._(r'GREATER_THAN_OR_EQUALS');
  static const LESS_THAN = CatalogsProductGroupUint32CriteriaOperator_Enum._(r'LESS_THAN');
  static const LESS_THAN_OR_EQUALS = CatalogsProductGroupUint32CriteriaOperator_Enum._(r'LESS_THAN_OR_EQUALS');

  /// List of all possible values in this [enum][CatalogsProductGroupUint32CriteriaOperator_Enum].
  static const values = <CatalogsProductGroupUint32CriteriaOperator_Enum>[
    GREATER_THAN,
    GREATER_THAN_OR_EQUALS,
    LESS_THAN,
    LESS_THAN_OR_EQUALS,
  ];

  static CatalogsProductGroupUint32CriteriaOperator_Enum? fromJson(dynamic value) => CatalogsProductGroupUint32CriteriaOperator_EnumTypeTransformer().decode(value);

  static List<CatalogsProductGroupUint32CriteriaOperator_Enum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupUint32CriteriaOperator_Enum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupUint32CriteriaOperator_Enum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsProductGroupUint32CriteriaOperator_Enum] to String,
/// and [decode] dynamic data back to [CatalogsProductGroupUint32CriteriaOperator_Enum].
class CatalogsProductGroupUint32CriteriaOperator_EnumTypeTransformer {
  factory CatalogsProductGroupUint32CriteriaOperator_EnumTypeTransformer() => _instance ??= const CatalogsProductGroupUint32CriteriaOperator_EnumTypeTransformer._();

  const CatalogsProductGroupUint32CriteriaOperator_EnumTypeTransformer._();

  String encode(CatalogsProductGroupUint32CriteriaOperator_Enum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsProductGroupUint32CriteriaOperator_Enum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsProductGroupUint32CriteriaOperator_Enum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'GREATER_THAN': return CatalogsProductGroupUint32CriteriaOperator_Enum.GREATER_THAN;
        case r'GREATER_THAN_OR_EQUALS': return CatalogsProductGroupUint32CriteriaOperator_Enum.GREATER_THAN_OR_EQUALS;
        case r'LESS_THAN': return CatalogsProductGroupUint32CriteriaOperator_Enum.LESS_THAN;
        case r'LESS_THAN_OR_EQUALS': return CatalogsProductGroupUint32CriteriaOperator_Enum.LESS_THAN_OR_EQUALS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsProductGroupUint32CriteriaOperator_EnumTypeTransformer] instance.
  static CatalogsProductGroupUint32CriteriaOperator_EnumTypeTransformer? _instance;
}


