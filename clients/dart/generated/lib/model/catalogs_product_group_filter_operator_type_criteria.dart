//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupFilterOperatorTypeCriteria {
  /// Returns a new [CatalogsProductGroupFilterOperatorTypeCriteria] instance.
  CatalogsProductGroupFilterOperatorTypeCriteria({
    this.filterOperatorType = const CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum._('IS'),
    this.negated = false,
    this.values = const [],
  });

  CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum filterOperatorType;

  bool negated;

  List<String> values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupFilterOperatorTypeCriteria &&
    other.filterOperatorType == filterOperatorType &&
    other.negated == negated &&
    _deepEquality.equals(other.values, values);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (filterOperatorType.hashCode) +
    (negated.hashCode) +
    (values.hashCode);

  @override
  String toString() => 'CatalogsProductGroupFilterOperatorTypeCriteria[filterOperatorType=$filterOperatorType, negated=$negated, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'filter_operator_type'] = this.filterOperatorType;
      json[r'negated'] = this.negated;
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [CatalogsProductGroupFilterOperatorTypeCriteria] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupFilterOperatorTypeCriteria? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsProductGroupFilterOperatorTypeCriteria[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsProductGroupFilterOperatorTypeCriteria[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsProductGroupFilterOperatorTypeCriteria(
        filterOperatorType: CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum.fromJson(json[r'filter_operator_type']) ?? 'IS',
        negated: mapValueOfType<bool>(json, r'negated') ?? false,
        values: json[r'values'] is Iterable
            ? (json[r'values'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsProductGroupFilterOperatorTypeCriteria> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupFilterOperatorTypeCriteria>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupFilterOperatorTypeCriteria> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupFilterOperatorTypeCriteria>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupFilterOperatorTypeCriteria-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupFilterOperatorTypeCriteria>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupFilterOperatorTypeCriteria>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupFilterOperatorTypeCriteria.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'values',
  };
}


class CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const IS = CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum._(r'IS');
  static const CONTAINS = CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum._(r'CONTAINS');

  /// List of all possible values in this [enum][CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum].
  static const values = <CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum>[
    IS,
    CONTAINS,
  ];

  static CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum? fromJson(dynamic value) => CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnumTypeTransformer().decode(value);

  static List<CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum].
class CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnumTypeTransformer {
  factory CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnumTypeTransformer() => _instance ??= const CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnumTypeTransformer._();

  const CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnumTypeTransformer._();

  String encode(CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'IS': return CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum.IS;
        case r'CONTAINS': return CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnum.CONTAINS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnumTypeTransformer] instance.
  static CatalogsProductGroupFilterOperatorTypeCriteriaFilterOperatorTypeEnumTypeTransformer? _instance;
}


