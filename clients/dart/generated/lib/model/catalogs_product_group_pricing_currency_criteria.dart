//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupPricingCurrencyCriteria {
  /// Returns a new [CatalogsProductGroupPricingCurrencyCriteria] instance.
  CatalogsProductGroupPricingCurrencyCriteria({
    required this.currency,
    this.negated = false,
    required this.operator_,
    required this.value,
  });

  NonNullableCatalogsCurrency currency;

  bool negated;

  CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum operator_;

  /// Minimum value: 0
  num value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupPricingCurrencyCriteria &&
    other.currency == currency &&
    other.negated == negated &&
    other.operator_ == operator_ &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (currency.hashCode) +
    (negated.hashCode) +
    (operator_.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'CatalogsProductGroupPricingCurrencyCriteria[currency=$currency, negated=$negated, operator_=$operator_, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'currency'] = this.currency;
      json[r'negated'] = this.negated;
      json[r'operator'] = this.operator_;
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [CatalogsProductGroupPricingCurrencyCriteria] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupPricingCurrencyCriteria? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsProductGroupPricingCurrencyCriteria[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsProductGroupPricingCurrencyCriteria[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsProductGroupPricingCurrencyCriteria(
        currency: NonNullableCatalogsCurrency.fromJson(json[r'currency'])!,
        negated: mapValueOfType<bool>(json, r'negated') ?? false,
        operator_: CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum.fromJson(json[r'operator'])!,
        value: num.parse('${json[r'value']}'),
      );
    }
    return null;
  }

  static List<CatalogsProductGroupPricingCurrencyCriteria> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupPricingCurrencyCriteria>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupPricingCurrencyCriteria.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupPricingCurrencyCriteria> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupPricingCurrencyCriteria>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupPricingCurrencyCriteria.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupPricingCurrencyCriteria-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupPricingCurrencyCriteria>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupPricingCurrencyCriteria>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupPricingCurrencyCriteria.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'currency',
    'operator',
    'value',
  };
}


class CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const GREATER_THAN = CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum._(r'GREATER_THAN');
  static const GREATER_THAN_OR_EQUALS = CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum._(r'GREATER_THAN_OR_EQUALS');
  static const LESS_THAN = CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum._(r'LESS_THAN');
  static const LESS_THAN_OR_EQUALS = CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum._(r'LESS_THAN_OR_EQUALS');

  /// List of all possible values in this [enum][CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum].
  static const values = <CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum>[
    GREATER_THAN,
    GREATER_THAN_OR_EQUALS,
    LESS_THAN,
    LESS_THAN_OR_EQUALS,
  ];

  static CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum? fromJson(dynamic value) => CatalogsProductGroupPricingCurrencyCriteriaOperator_EnumTypeTransformer().decode(value);

  static List<CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum] to String,
/// and [decode] dynamic data back to [CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum].
class CatalogsProductGroupPricingCurrencyCriteriaOperator_EnumTypeTransformer {
  factory CatalogsProductGroupPricingCurrencyCriteriaOperator_EnumTypeTransformer() => _instance ??= const CatalogsProductGroupPricingCurrencyCriteriaOperator_EnumTypeTransformer._();

  const CatalogsProductGroupPricingCurrencyCriteriaOperator_EnumTypeTransformer._();

  String encode(CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'GREATER_THAN': return CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum.GREATER_THAN;
        case r'GREATER_THAN_OR_EQUALS': return CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum.GREATER_THAN_OR_EQUALS;
        case r'LESS_THAN': return CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum.LESS_THAN;
        case r'LESS_THAN_OR_EQUALS': return CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum.LESS_THAN_OR_EQUALS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsProductGroupPricingCurrencyCriteriaOperator_EnumTypeTransformer] instance.
  static CatalogsProductGroupPricingCurrencyCriteriaOperator_EnumTypeTransformer? _instance;
}


